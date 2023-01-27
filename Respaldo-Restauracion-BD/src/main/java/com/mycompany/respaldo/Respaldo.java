package com.mycompany.respaldo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Respaldo {

    private static Respaldo instancia;

    //Creamos el metodo para generar la copy
    public void crearBackup() throws IOException { //Puede llamarse CrearRespaldo
        //mysqldump -u user -ppassword name database
        Process proceso = Runtime.getRuntime().exec("C:\\Program Files\\MySQL\\MySQL Server 5.7\\bin\\mysqldump -u root -pDragon1234 escuela");
        InputStream entrada = proceso.getInputStream();
        FileOutputStream archivo = new FileOutputStream("respaldoBD-alumnos.sql"); //Poner nombre al respaldo

        //Buffer es una memoria temporal
        byte[] buffer = new byte[1000];
        int byteLeido = entrada.read(buffer);

        while (byteLeido > 0) {
            archivo.write(buffer, 0, byteLeido);
            byteLeido = entrada.read(buffer);
        }

        archivo.close();
    }

    public static Respaldo getInstance() {
        if (instancia == null) {
            instancia = new Respaldo();
        }
        return instancia;
    }

}
