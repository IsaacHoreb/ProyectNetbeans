package paquete;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    //16.- Creamos un constructor
    public Conexion(){
        
    }
    
    //2.- Creamos una variable en la cual vamos a guardar el estado de la concexion 
    //a nuestra BDD
    private static Connection conexion;

    //3.- Creamos una variable para crear una instancia
    private static Conexion instancia;

    //4.- Creamos las variable para poder conectarnos a la BD
    private static final String URL = "jdbc:mysql://localhost/bd_tienda";

    //5.- Creamos la variable para que guarde el nombre del usuario
    private static final String USERNAME = "root";

    //6.- Creamos la variable para que guarde la constraseña
    private static final String PASSWORD = "";

    //7.- Creamos un metodo para conectarnos a la BDD
    public Connection conectar() {

        //8.- Creamos un Try Catch  
        try {
            //9.- creamos para el nombre del Driver
            Class.forName("com.mysql.jdbc.Driver");

            //10.- Con esto guardamoc los datos de URL,ETC en la variable conexion.
            conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            //12.- Retornamo la conexion
            return conexion;

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR", "MENSAJE", 2);

        }

        return conexion;

    }

    //13.- Creamos el metodo para cerrar la conexion
    public void cerrarConexion() throws SQLException {

        try {
            //14 Cerramos
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR", "MENSAJE", 2);
            conexion.close(); //Añadimos el throws en los foquitos de error
        } finally {
            conexion.close();
        }

    }

    //15.- Creamos el metodo Patron Singleton
    public static Conexion getInstance() {

        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

}
