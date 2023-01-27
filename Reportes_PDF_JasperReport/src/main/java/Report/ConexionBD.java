package Report;

import java.sql.*; //1.- Importar paqueteria SQL

public class ConexionBD {

    //2.- Constructor vacio
    public ConexionBD() {

    }

    //3.- Creamos una variable en la cual vamos a guardar el estado de la concexion a nuestra BDD
    private static Connection conexion;

    //4.- Creamos una variable para crear una instancia
    private static ConexionBD instancia;

    //5.- Creamos las variable para poder conectarnos a la BD
    private static final String URL = "jdbc:mysql://localhost/ilib";

    //6.- Creamos la variable para que guarde el nombre del usuario
    private static final String USER = "root"; //Si no tiene nombre de usuario poner "root".

    //7.-  Creamos la variable para que guarde la constraseña
    private static final String PASSWORD = "Dragon1234";

    //8.- Creamos un metodo para conectarnos a la BDD
    public Connection abrirConexion() throws ClassNotFoundException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //9.- creamos para el nombre del Driver

            //10.- Con esto guardamo los datos de URL,ETC en la variable conexion.
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);

            //11.- Retornar
            return conexion;

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        //11.- Retornar
        return conexion;
    }

    //12.- Creamos el metodo para cerrar la conexion
    public void cerrarConexion() throws SQLException {
        try {
            //12.1- Cerrar conexion
            conexion.close();
        } catch (SQLException e) {
            System.out.println("2\n" + e.getMessage());
            conexion.close(); //12.2- Cerrar conexion si pasa el error, pa´que no se quede abierta
        } finally {
            conexion.close(); //12.3- Cerrar conexion, siempre sin importar el caso, pa´que no se quede abierta
        }
    }

    public void desconectar(Connection conexion) {
        try {
            conexion.close();
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

    public void cerrarResultado(ResultSet resultado) {
        try {
            resultado.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    //13.- Creamos el metodo Patron Singleton 
    public static ConexionBD getInstance() {
        if (instancia == null) {
            instancia = new ConexionBD();
        }
        return instancia;
    }

}
