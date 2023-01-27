package datos;

import java.sql.*;

/**
 *
 * @author ISAAC HOREB
 */
public class Conexion {

    //Metodo constructor vacio
    public Conexion() {

    }

    //Creamos la instancia para el metodo Patrong Singleton
    private static Conexion instancia;

    //Para darle el url
    private static final String URL = "jdbc:mysql://localhost/control_cliente";

    //Creamos la constante para el usuario
    private static final String USERNAME = "root";

    //Cremaos para la contraseña
    private static final String PASSWORD = "Dragon1234";

    //Metodo para conectar
    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public void desconectar(Connection conexion) {
        try {
            conexion.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void cerrarResultado(ResultSet resultado) {
        try {
            resultado.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    //Metodo para desconectar
    public void cerrarConexion(Connection conexion) throws SQLException {

        try {
            conexion.close();
        } catch (SQLException e) {
            conexion.close();
            System.out.println(e);
        } finally {
            conexion.close();
        }

    }

    public void cerrarStatement(PreparedStatement statement) {
        try {
            statement.close();
        } catch (SQLException e) {
            System.out.println(e);
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
