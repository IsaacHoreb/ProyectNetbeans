package Ensallo;

import java.util.Scanner;

public class Pricipal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        AdministBD ABD = new AdministBD();
        analista ALT = new analista();
        programador PGM = new programador();

        //Llanar datos de Analista
        System.out.println("Labores: ");
        String labor = entrada.nextLine();

        System.out.println("Ingrese los datos correspondiente");
        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Sueldo: ");
        double sueldo = entrada.nextDouble();

        ABD.datos(nombre);
        ABD.sueldo(sueldo);
        ABD.labores(labor);

    }

}
