package com.mycompany.bd_cargartablas;

//1.- Importamos todas las librerias de SQL
import java.sql.*;

public class Conexion {
    //Constructor
    public Conexion() {

    }

    //2.- Creamos una variable en la cual vamos a guardar el estado de la concexion 
    //a nuestra BDD
    private static Connection conexion;

    //3.- Creamos una variable para crear una instancia
    private static Conexion instancia;

    //4.- Creamos las variable para poder conectarnos a la BD
    private static final String URL = "jdbc:mysql://localhost/bd_institucion";

    //5.- Creamos la variable para que guarde el nombre del usuario
    private static final String USERNAME = "root";

    //6.- Creamos la variable para que guarde la constraseña
    private static final String PASSWORD = "";

    //7.- Creamos un metodo para conectarnos a la BDD
    public Connection conectar() {

        try {
            //9.- creamos para el nombre del Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //10.- Con esto guardamo los datos de URL,ETC en la variable conexion.
            conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            return conexion;

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

        return conexion;

    }

    //13.- Creamos el metodo para cerrar la conexion
    public void desconectar() throws SQLException {

        try {
            conexion.close();
        } catch (SQLException e) {
            conexion.close();
            System.out.println(e);
        } finally {
            conexion.close();
        }
        
    }
    
    //15.- Creamos el metodo Patron Singleton 
    public static Conexion getInstance(){
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }
    
}