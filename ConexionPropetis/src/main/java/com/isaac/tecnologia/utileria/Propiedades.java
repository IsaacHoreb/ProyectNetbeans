package com.isaac.tecnologia.utileria;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Propiedades {

    //Creamos el metodo para cargar el archivo properties
    public Properties cargarArchivosPropeties() throws FileNotFoundException, IOException {
        Properties propiedades = new Properties(); //Creamos el archivo properties
        InputStream archivo = new FileInputStream("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\ConexionPropetis\\src\\main\\resources\\conexionBD.properties");
        propiedades.load(archivo);
        return propiedades;
    }

}
