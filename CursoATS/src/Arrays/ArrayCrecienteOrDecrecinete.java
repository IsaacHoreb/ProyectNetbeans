package Arrays;

import javax.swing.JOptionPane;

public class ArrayCrecienteOrDecrecinete {

    public static void main(String[] args) {

        //Declaro la variable
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del Array ="));
        //Inicializo el Array
        int arr[] = new int[x];
        //Creo un metodo
        boolean creciente = false, decreciente = false;
        //Pido al usuario que ingrese los datos
        JOptionPane.showMessageDialog(null, "Llena el Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el array #" + i));
        }

        //Condicional para saber si es creciente o decreciente
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) { //Creciente
                creciente = true;
            }

            if (arr[i] > arr[i + 1]) {   //Decreciente
                decreciente = true;
            }

        }

        //Condicion para saber que tipo de arreglo es!!
        if (creciente == true && decreciente == false) {
            JOptionPane.showMessageDialog(null, "El arreglo esta en forma creciente");

        } else if (creciente == false && decreciente == true) {
            JOptionPane.showMessageDialog(null, "El arreglo esta en forma decreciente");

        } else if (creciente = true && decreciente == true) {
            JOptionPane.showMessageDialog(null, "El arreglo esta en forma desordenada");

        } else if (creciente == false && decreciente == false) {
            JOptionPane.showMessageDialog(null, "El arreglo es igual");
        }
    }

}
