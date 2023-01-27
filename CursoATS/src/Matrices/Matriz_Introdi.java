package Matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Matriz_Introdi {

    public static void main(String[] args) {
        //Entrada de datos por Consola
        Scanner entrada = new Scanner(System.in);

        //Declaramo variable para filas y columnas en la Matric
        int nFilas, nColumnas;

        //Pedimos al Usuario los Datos
        nFilas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de filas="));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de columnas="));

        //Declaramos la Matriz
        //int Matriz[][] = [[1,2,3],[4,5,6,],[7,8,9]];  //Por si nosotros declaramos el numero de filas y columnas
        int Matriz[][] = new int[nFilas][nColumnas];    //Por si no sabemos el numero de filas y columnas

        //El usuario Digite la Matriz
        System.out.println("El usuario Digite la Matric");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.println("Matriz [ " + i + "] " + "[ " + j + " ]: ");
                Matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\nImprimir la Matriz");
        for (int i = 0; i < nFilas; i++) {   //Numero de filas
            for (int j = 0; j < nColumnas; j++) {//Numero de columnas
                System.out.print(Matriz[i][j] + " ");

            }
            System.out.println("");
        }

        /*
            //Mostrar Resultados por Cuadro de Dialogo
            String MatrizF = "";
            for (int i = 0; i < nFilas; i++) {
                for (int j = 0; j < nCol; j++) {
                    MatrizF += "[ " + Matriz[i][j] + " ]";
                    MatrizF += "  ";
                }
                MatrizF += "\n";
            }
            JOptionPane.showMessageDialog(null, MatrizF);

         */
    }

}
