package Arrays;

import javax.swing.JOptionPane;

public class Buscar_Elementos {

    public static void main(String[] args) {

        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño ="));
        int arr[] = new int[x];
        int numero = 0;
        boolean creciente = true;

        do {

            //Pedimos el Arreglos
            JOptionPane.showMessageDialog(null, "Rellena el Array =");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Datos\nArrays #" + i));
            }

            //Verificar si el arreglo esta ordenada
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {//Creciente
                    creciente = true;
                }
                if (arr[i] > arr[i + 1]) {//Decreciente
                    creciente = false;
                    break;
                }

            }

            if (creciente == false) {
                JOptionPane.showMessageDialog(null, "El array esta desordenado\ndigite nuevamente");
            }

        } while (creciente == false);

        //Moldea el Array
        String arregloF = "[ ";
        for (int i = 0; i < arr.length; i++) {
            arregloF += arr[i] + ", ";
        }
        arregloF += " ]";

        //Pedimos el numero a buscar
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a buscar =\n" + arregloF));

        //Buscar el numero en el Array
        int i = 0;
        while (i < 10 && arr[i] < numero) {
            i++;
        }

        if (i == 10) {    //Se recorre todo el Array y no se encontro
            JOptionPane.showMessageDialog(null, "Numero no encontrado");
        } else {
            if (arr[i] == numero) {
                JOptionPane.showMessageDialog(null, "Numero encontrado en la posicion " + i);
            } else {
                JOptionPane.showMessageDialog(null, "Numero no encontrado");
            }
        }

    }

}
