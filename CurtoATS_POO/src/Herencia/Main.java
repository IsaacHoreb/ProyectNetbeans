package Herencia;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        //Declaro las variables
        String nombre = "";
        String apellidos = "";
        int edad = 0;
        int codigoEstudiante = 0;
        float notaFinal = 0.0f;

        //Pido los datos al usuario
        nombre = JOptionPane.showInputDialog(null,"Ingresa tus nombre =");
        apellidos = JOptionPane.showInputDialog(null,"Ingresa tus apellidos =");
        edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa tu edad ="));
        codigoEstudiante = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el codigo del estudiante ="));
        notaFinal = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingresa la nota final ="));
        
        //Creo el objepto
        Estudiante estudiante = new Estudiante(nombre, apellidos, edad, codigoEstudiante, notaFinal);

        //Llamo al metodo
        estudiante.mostradDatos();

    }

}
