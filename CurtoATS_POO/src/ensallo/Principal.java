package ensallo;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {

    //ArrayList Dinamico
    static ArrayList<poligono> Poligono = new ArrayList<poligono>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            llenarPoligono();
            mostrarDatos();
        } catch (Exception e) {
            System.out.println("Error de Datos");
        }

    }

    public static void llenarPoligono() {
        int op = 0;
        String[] arreglo = {"Yes", "NO", "Cancel"};
        int respuesta;

        try {
            do {
                do {
                    System.out.println("");
                    System.out.println("Digite el poligono deseado");
                    System.out.println("1.- Triangulo");
                    System.out.println("2.- Rectangulo");
                    System.out.println("Opcion: ");
                    op = entrada.nextInt();
                } while (op < 1 || op > 2);

                switch (op) {
                    case 1:
                        llenarTriangulo();
                        break;
                    case 2:
                        llenarRectangulo();
                        break;
                    default:
                        System.out.println("No existe opcion");
                }

                respuesta = JOptionPane.showOptionDialog(null, "¿Desea introduccir otro poligono?", "Mensaje", 0,
                        JOptionPane.QUESTION_MESSAGE, null, arreglo, "Cancel");

            } while (respuesta < 1 || respuesta > 2);

        } catch (HeadlessException e) {
            System.out.println("Error de datos");
        }

    }

    public static void llenarTriangulo() {
        try {
            double lado1, lado2, lado3;

            System.out.println("\nDigite lado #1");
            lado1 = entrada.nextDouble();

            System.out.println("\nDigite lado #2");
            lado2 = entrada.nextDouble();

            System.out.println("\nDigite lado #3");
            lado3 = entrada.nextDouble();

            //Creamos el objeto de Triangulo
            triangulo Triangulo = new triangulo(lado1, lado2, lado3);

            Poligono.add(Triangulo);

        } catch (Exception e) {
            System.out.println("Error de datos");
        }
    }

    public static void llenarRectangulo() {
        try {
            double lado1, lado2;

            System.out.println("\nDigite lado #1");
            lado1 = entrada.nextDouble();

            System.out.println("\nDigite lado #2");
            lado2 = entrada.nextDouble();

            //Creamos el objeto
            rectangulo Rectangulo = new rectangulo(lado1, lado2);
            Poligono.add(Rectangulo);

        } catch (Exception e) {
            System.out.println("Error de datos");
        }
    }

    public static void mostrarDatos() {
        Poligono.stream().map((poli) -> {
            System.out.println(poli.toString());
            return poli;
        }).map((poli) -> {
            System.out.println("Area = " + poli.area());
            return poli;
        }).forEachOrdered((_item) -> {
            System.out.println("");
        });
    }

}
