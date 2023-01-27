package Login;

import java.sql.*;

/**
 *
 * @author ISAAC HOREB
 */
public class Conexion {

    //Metodo constructor vacio
    public Conexion() {

    }
    //Para guardar la conexio
    private static Connection conexion;

    //Creamos la instancia para el metodo Patrong Singleton
    private static Conexion instancia;

    //Para darle el url
    private static final String URL = "jdbc:mysql://localhost/bd_persona";

    //Creamos la constante para el usuario
    private static final String USERNAME = "root";

    //Cremaos para la contraseña
    private static final String PASSWORD = "";

    //Metodo para conectar
    public Connection conectar() {

        try {
            //El nombre del driver
            Class.forName("com.mysql.jdbc.Driver");
            //Guardamos los datos en la conexion
            conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //Retornamo la conexion
            return conexion;

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        //Retornaos
        return conexion;
    }

    //Metodo para desconectar
    public void cerrarConexion() throws SQLException {

        try {
            conexion.close();
        } catch (SQLException e) {
            conexion.close();
            System.out.println(e);
        } finally {
            conexion.close();
        }

    }

    //Creamos el metodo Patron Singletos
    public static Conexion getInstancia() {

        try {

            if (instancia == null) {
                instancia = new Conexion();
            }
            return instancia;
        } catch (Exception e) {
            System.out.println(e);
        }
        return instancia;
    }

}
