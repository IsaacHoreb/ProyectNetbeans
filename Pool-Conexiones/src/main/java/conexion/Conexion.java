package conexion;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.*;

public class Conexion {

    private Conexion(){
        
    }
    
    //1.- Creamos las variables
    private static final String URL = "jdbc:mysql://localhost/control_cliente";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static Conexion instancia;

    public DataSource obtenerFuenteDeDatos() {
        BasicDataSource datos = new BasicDataSource();
        datos.setUrl(URL);
        datos.setUsername(USER);
        datos.setPassword(PASSWORD);
        datos.setInitialSize(50); //Tamaño de conexiones a la BD
        return datos;
    }

    public Connection conectar() throws SQLException {
        return obtenerFuenteDeDatos().getConnection();
    }

    public void desconectar(Connection conexion) {
        try {
            conexion.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void cerrarResulSet(ResultSet resultado) {
        try {
            resultado.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void cerrarStatement(PreparedStatement statement) {
        try {
            statement.close();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static Conexion getInstance() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

}
