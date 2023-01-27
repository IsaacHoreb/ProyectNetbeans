package com.mycompany.restauracion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Restauracion {

    private static Restauracion instancia;

    //Creamos el metodo para generar la Restauracion
    public void crearRestauracion() throws IOException {

        //mysqldump -u user -ppassword name database
        Process proceso = Runtime.getRuntime().exec(
                "C:\\Program Files\\MySQL\\MySQL Server 5.7\\bin\\mysql -u root -pDragon1234 restauracionCliente"); //Here pones tu ruta de Mysql

        OutputStream salida = proceso.getOutputStream();
        FileInputStream archivo = new FileInputStream("respaldoBD-alumnos.sql"); //Poner nombre al respaldo

        //Buffer es una memoria temporal
        byte[] buffer = new byte[1000];
        int byteLeido = archivo.read(buffer);

        while (byteLeido > 0) {
            salida.write(buffer, 0, byteLeido);
            byteLeido = archivo.read(buffer);
        }

        //archivo.close();
        salida.flush(); //Para que se limpie
        salida.close();
        archivo.close();
    }

    public static Restauracion getInstance() {
        if (instancia == null) {
            instancia = new Restauracion();
        }
        return instancia;
    }

}
