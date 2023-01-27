package Ejercicios;

import java.util.Scanner;

public class AreaPerimetTriangulo {
    //PARTE 1

    //Declaramos variables
    private double base;
    private double lado;

    //Metodo Constructor
    public AreaPerimetTriangulo(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    //Metodo para obtener el perimetro
    public double obtenerPerimetro() {
        double perimetro = 2 * lado * base;
        return perimetro;
    }

    //Maetodo para obtener el area
    public double obtenerArea() {
        double area = (base * Math.sqrt((lado * lado) - ((base * base) / 4))) / 2;
        return area;
    }
//___________________________________________________________________________________________________________________________________________________

    //PARTE 3
    //Clase estatica
    public static double mayorArea(AreaPerimetTriangulo triangulo[]) {
        double area;

        area = triangulo[0].obtenerArea();
        for (int i = 0; i < triangulo.length; i++) {
            if (triangulo[i].obtenerArea() > area) {
                area = triangulo[i].obtenerArea();
            }
        }
        return area;
    }

    //PARTE 2
    //Metodo Main
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double base;
        double lado;
        int nTriangulos;

        System.out.println("Digite el numero de triangulos que deseas ingresar = ");
        nTriangulos = entrada.nextInt();

        //Creas el objeto
        AreaPerimetTriangulo Triangulo[] = new AreaPerimetTriangulo[nTriangulos];

        //Rellenar los datos con un for
        for (int i = 0; i < Triangulo.length; i++) {

            System.out.println("Digite los valores para el triangulo #" + (i + 1));

            System.out.print("Introdusca la base = ");
            base = entrada.nextDouble();

            System.out.print("Introdusca el lado = ");
            lado = entrada.nextDouble();

            //Almacenos los datos en un objeto para cada triangulo
            Triangulo[i] = new AreaPerimetTriangulo(base, lado);

            System.out.println("\nEl perimetro del triangulo es = " + Triangulo[i].obtenerPerimetro());
            System.out.println("El area del triangulo es = " + Triangulo[i].obtenerArea());

        }

        System.out.println("\nEl area del triangulo de mayor superdicie es = \n" + mayorArea(Triangulo));

    }

}
