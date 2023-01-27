package BDD;

import java.sql.Connection;
import java.sql.DriverManager;

public class Concexion {

    //1.-Declarar en forma de objeto la herramienta que
    //permite establecer la conexion entre NetBeans y la base de dato Xammpp
    Connection cn = null;

    //2.-Definir un metodo que se encarge, por medio del objeto Connection de establecer 
    //propiamente de NetBeans con la BD Xammpp
    public Connection concexionBD() {

        try {
            //2.1.1 Definir el tipo de lenguaje que tiene la BD junto con la que
            //se va a trabajar desde NetBeans
            Class.forName("com.mysql.jdbc.Driver");

            //2.2 Difinir la ruta donde se encuentra la BD con la que se conetara
            cn = DriverManager.getConnection("jdbc:mysql://localhost/pdv", "root", "");

            //2.3 verificar que la conexion fue exictosa  
            System.out.println("¡¡Concexion Establecida!!");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        //2.4.- Devolver la conexion a la base mediante le objeto Connection
        return cn;
    }

}
