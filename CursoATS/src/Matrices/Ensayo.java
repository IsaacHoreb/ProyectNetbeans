package Matrices;

import javax.swing.JOptionPane;

public class Ensayo {

    public static void main(String[] args) {

        int nFilas = 0;
        int nCol = 0;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las filas ="));
        nCol = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa las columnas ="));

        int Matriz[][] = new int[nFilas][nCol];

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                Matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la Matriz =\n"
                        + "Matriz [ " + i + " ] [ " + j + " ] "));
            }
        }

        String MatrizF = "";
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                MatrizF += " [ " + Matriz[i][j] + " ] ";
                MatrizF += " ";
            }
            MatrizF += "\n";
        }

        JOptionPane.showMessageDialog(null, MatrizF, "Matriz", 3);

    }

}
