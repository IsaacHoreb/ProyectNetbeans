package Matrices;

import java.util.Scanner;

public class TranspornerAndMostrar {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Declarar e inicializar la Matriz.
        int Matriz[][] = new int[3][3];

        System.out.println("Digite la Matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz [ " + i + " ] [ " + j + " ] = ");
                Matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("");

        System.out.println("La Matriz Original");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Matriz[i][j]+" ");
            }
            System.out.println("");
        }

        //Transporniendo la Matriz
        int aux;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                aux = Matriz[i][j];
                Matriz[i][j] = Matriz[j][i];
                Matriz[j][i] = aux;
            }
        }
        
        System.out.println("\nLa Matriz Transpuerta es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
    }

}
