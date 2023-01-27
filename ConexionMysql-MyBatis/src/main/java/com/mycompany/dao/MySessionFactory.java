package com.mycompany.dao;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySessionFactory {

    //Declaramos Variables
    private static MySessionFactory instancia;
    private SqlSessionFactory factory;

    private MySessionFactory() {
        String recurso = "mybatis-config.xml";
        Reader lector = null;

        try {
            lector = Resources.getResourceAsReader(recurso);
            factory = new SqlSessionFactoryBuilder().build(lector);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    //Patron de diseño SINGLETON
    public static MySessionFactory getInstancia() {
        if (instancia == null) {
            instancia = new MySessionFactory();
        }
        return instancia;
    }

    //Metodo para obtener la FACTORIA
    public SqlSessionFactory getFactory() {
        return factory;
    }
    
    

}
