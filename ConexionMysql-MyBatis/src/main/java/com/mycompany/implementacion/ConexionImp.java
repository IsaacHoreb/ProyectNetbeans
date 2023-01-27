package com.mycompany.implementacion;

import com.mycompany.dao.ConexionDAO;
import com.mycompany.dao.MySessionFactory;
import org.apache.ibatis.session.SqlSession;

//Implementamo la ConexionDao
public class ConexionImp implements ConexionDAO {

    //Agregamos el patron Singleton
    private final MySessionFactory instancia = MySessionFactory.getInstancia();

    @Override
    public String getVersionMysql() {
        String version = "";
        
        SqlSession session = null;

        try {
            session = instancia.getFactory().openSession();
            version = session.selectOne("mysqlVersion");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return version;
    }

}
