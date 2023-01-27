package com.isaac.tecnologia.conexion;

import com.isaac.tecnologia.utileria.Propiedades;
import java.awt.HeadlessException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import javax.swing.JOptionPane;

public class Conexion {

    private Conexion() {

    }

    //Patron de diseño para controlar las instancia
    private static Conexion instancia = null;
    Propiedades properties = new Propiedades(); //Para cargar el archivo properties

    //Creamos el metodo para conectarnos a la BD
    public void conectar() throws SQLException {

        Connection conexion = null;

        try {
            Properties propiedades = properties.cargarArchivosPropeties();

            String user = propiedades.getProperty("conexion.user");
            String password = propiedades.getProperty("conexion.password");
            String url = propiedades.getProperty("conexion.url");

            System.out.println("User: " + user);
            System.out.println("Password: " + password);
            System.out.println("Url: " + url);

            conexion = DriverManager.getConnection(url, user, password);

            if (conexion != null) {
                JOptionPane.showMessageDialog(null, "Conexion exitosa", "Mensaje", 3);
            } else {
                JOptionPane.showMessageDialog(null, "Error de conexion", "Mensaje", 2);
            }

            conexion.close();
        } catch (HeadlessException | IOException | SQLException e) {
            System.out.println(e + " 2");
        } finally {
            conexion.close();
        }

    }

    public void desconectar(Connection conexion) throws SQLException {
        try {
            conexion.close();
        } catch (SQLException e) {
            conexion.close();
            System.out.println("3");
        } finally {
            conexion.close();
        }
    }

    public static Conexion getInstance() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

}
