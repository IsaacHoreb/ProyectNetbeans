package CalcularAreaDePologono;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    //ArrayList Dinamico
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            //Llenar un Poligono
            llenarPoligono();

            //Mostrar los datos y el area de cada poligono.
            mostrarDatos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE DATOS", "MENSAJE", 2);
        }

    }

    public static void llenarPoligono() {
        char respuesta;
        int opcion = 0;

        try {
            do {

                do {

                    System.out.println("Digite que poligono desea = ");
                    System.out.println("1.- Triangulo = ");
                    System.out.println("2.- Rectangulo = ");
                    System.out.print("Opcion = ");
                    opcion = entrada.nextInt();

                } while (opcion < 1 || opcion > 2);

                switch (opcion) {

                    case 1:
                        llenarTriangulo();
                        break;
                    case 2:
                        llenarRectangulo();
                        break;

                }

                System.out.println("¿Desea introduccir otro poligono?(s/n) ");
                respuesta = entrada.next().charAt(0);

            } while (respuesta == 's' || respuesta == 'S');

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE DATOS", "MENSAJE", 2);
        }

    }

    public static void llenarTriangulo() {

        try {
            double lado1, lado2, lado3;

            System.out.println("\nDigite el lado 1 del Triangulo = ");
            lado1 = entrada.nextDouble();

            System.out.println("Digite el lado 2 del Triangulo = ");
            lado2 = entrada.nextDouble();

            System.out.println("Digite el lado 3 del Triangulo = ");
            lado3 = entrada.nextDouble();

            //Crear objecto
            Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

            //Guardamos nuestro triangulo dentro de numero arreglo de poligonos
            poligono.add(triangulo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE DATOS", "MENSAJE", 2);
        }
    }

    public static void llenarRectangulo() {
        try {
            double lado1, lado2;

            System.out.println("\nDigite le lado 1 del Rectangulo = ");
            lado1 = entrada.nextDouble();

            System.out.println("Digite le lado 2 del Rectangulo = ");
            lado2 = entrada.nextDouble();

            //Crear Objecto
            Rectangulo rectangulo = new Rectangulo(lado1, lado2);
            //Guardamos nuestro rectangulo dentro de numero arreglo de poligonos
            poligono.add(rectangulo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE DATOS", "MENSAJE", 2);
        }

    }

    public static void mostrarDatos() {

        for (Poligono poli : poligono) {
            System.out.println(poli.toString());
            System.out.println("Area = " + poli.area());
            System.out.println("");
        }

    }

}
