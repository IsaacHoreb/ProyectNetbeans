package Matrices;

import java.util.Scanner;

public class SumarFilaAndColum {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);   //Declaro para la consola

        //Variables para el conteo de filas,columnas y sus sumas.
        int nFilas = 0, nCol = 0;
        int sumaF, sumaC;

        //Para guardar los datos
        System.out.print("Ingresa el numero de filas = ");
        nFilas = entrada.nextInt();

        System.out.print("Ingresa el numero de columnas = ");
        nCol = entrada.nextInt();

        //Declaracion e inicializacion de la Matriz
        int Matriz[][] = new int[nFilas][nCol];

        //Rellenar la Matriz
        System.out.println("\nDigite la Matriz: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("Matriz [ " + i + " ] [ " + j + " ] = ");
                Matriz[i][j] = entrada.nextInt();
            }

        }

        //Imprime la Matriz
        System.out.println("\nLa Matriz Es = ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print(Matriz[i][j]);
            }
            System.out.println("");
        }

        //Proeso para sumar la Filas
        for (int i = 0; i < nFilas; i++) {
            sumaF = 0;
            for (int j = 0; j < nCol; j++) {
                sumaF += Matriz[i][j];
            }
            System.out.print("\nLa suma de las Filas [ " + i + " ] es = " + sumaF);
        }
        System.out.println("");

        //Proeso para sumar la Columnas
        for (int j = 0; j < nCol; j++) {
            sumaC = 0;
            for (int i = 0; i < nFilas; i++) {
                sumaC += Matriz[i][j];
            }
            System.out.print("\nLa suma de las Columnas [ " + j + " ] es = " + sumaC);
        }
        System.out.println("");

    }

}


