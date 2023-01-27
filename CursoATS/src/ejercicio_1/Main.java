//Ejercicio 1: Hacer un programa que calcule e imprima la suma de tres
//calificaciones.
package ejercicio_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        float nota1, nota2, nota3, suma;

        System.out.println("Digite 3 numeros");
        nota1 = op.nextFloat();
        nota2 = op.nextFloat();
        nota3 = op.nextFloat();

        suma = nota1 + nota2 + nota3;

        System.out.println("\nLa suma es =\n"+suma);
    }

}
