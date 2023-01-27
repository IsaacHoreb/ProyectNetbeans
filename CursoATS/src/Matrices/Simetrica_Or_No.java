package Matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Simetrica_Or_No {

    public static void main(String[] args) {

        //Declaro la variable
        boolean simetrica = true; //Declarar variable para la simetria
        int nFila, nCol;    //Variables para en No. filas y columnas.
        String respuesta = "";

        try {

            do {
                //Variables
                nFila = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de filas ="));
                nCol = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de columnas ="));

                //Declaracion de la Matriz e Inicializando.
                int Matriz[][] = new int[nFila][nCol];

                //Bucles aninados para poder guardar los datos de filas y columnas.
                for (int i = 0; i < nFila; i++) {
                    for (int j = 0; j < nCol; j++) {
                        Matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Matriz [ " + i + " ] [ " + j + " ] = ", "Digite una Matiz =", 3));
                    }
                }

                //Mostrar Resultados
                String MatrizResul = "";
                for (int i = 0; i < nFila; i++) {
                    for (int j = 0; j < nCol; j++) {
                        MatrizResul += "[ " + Matriz[i][j] + " ]";
                        MatrizResul += "  ";
                    }
                    MatrizResul += "\n";
                }
                JOptionPane.showMessageDialog(null, MatrizResul, "MATRIZ RESULTADO", JOptionPane.WARNING_MESSAGE);

                //Condicional para saber si es simetrico.
                if (nFila == nCol) {    //Si son iguales
                    int i, j;   //Variables

                    i = 0;
                    while (i < nFila && simetrica == true) {
                        j = 0;
                        while (j < i && simetrica == true) {
                            if (Matriz[i][j] != Matriz[j][i]) { //Si son simetricas o no
                                simetrica = false;
                            }
                            j++;
                        }
                        i++;
                    }

                    if (simetrica == true) {
                        JOptionPane.showMessageDialog(null, "La matriz es simetrica");
                        System.out.println("");
                    } else {
                        JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
                        System.out.println("");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
                    System.out.println("");
                }

                //Variables para volver a intentar
                respuesta = JOptionPane.showInputDialog(null, "¿Desea volverlo a intentarlo?");
                respuesta = respuesta.toUpperCase();    //Convertir a mayuscula

            } while (!respuesta.equals("NO"));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Datos", "Mensaje", JOptionPane.WARNING_MESSAGE);
        }

    }

}
