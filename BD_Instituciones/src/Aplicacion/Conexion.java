package Aplicacion;

//Importamo la libreria de SQL
import java.sql.*;

public class Conexion {

    //2.- Creamos el constructor vacion
    public Conexion() {
        
    }

    //3.- Creamos una variable en la cual vamos a guardar el 
    // estado de la conexion a nuestra BDD
    private static Connection conexion;

    //4.- Creamos una variable para crear una instancia
    private static Conexion instancia;

    //5.- Creamos las variable para poder conectarnos a la BD
    private static final String URL = "jdbc:mysql://localhost/bd_institucion";

    //6.- Creamos las variable para que guarde el nombre del usuario
    private static final String USER = "root";

    //7.- Creamos las variables para que guarde la contraseña
    private static final String PASSWORD = "";

    //8.- Creamos un metodo para conectarnos a la BDD
    public Connection conectar() {

        //9.- Creamos el Try-cach
        try {

            //10.- creamos para el nombre del Driver
            Class.forName("com.mysql.jdbc.Driver");

            //11.- Con esto guardamoc los datos de URL,ETC en la variable conexion.
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);

            //12.- Retornamo la conexion
            return conexion;

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error\n" + e.getMessage());
        }
        return conexion;
    }

    //13.- Creamos el metodo para cerrar la conexion
    public void cerrarConexion() throws SQLException {

        try {
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error\n" + e.getMessage());
            conexion.close();
        } finally {
            conexion.close();
        }

    }

    //14.- Creamos el metodo Patron Singleton
    public static Conexion getInstance() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

}
