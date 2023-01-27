package Arrays;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Ensallo {

    public static void main(String[] args) {
        //Declaramos el valor para el arreglo
        int Y = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingrese el valor del Arreglo"));

        //Declaramos el entero
        int arr[] = new int[Y];

        try {
            //Manera de llenar
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(JOptionPane.showInputDialog(
                        "Ingresa valor para el arreglo #" + i));
            }

            String arregloF = " [";
            for (int i = 0; i < arr.length; i++) {
                arregloF += arr[i] + ", ";
            }
            arregloF += " ]";

            JOptionPane.showMessageDialog(null, "The array is =\n" + arregloF);

            // 1.- Obtener el elemento de una determinada posición en el arreglo. 
            // El valor de la posición debe ser ingresado por el usuario.
            int pos = -1;
            int n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese la posicion del arreglo \npara saber su valor"));

            int n2 = arr[n];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == n2) {
                    pos = i;
                }
            }

            if (pos == -1) {
                JOptionPane.showMessageDialog(null, "No se encontre el arreglo");
            } else {
                JOptionPane.showMessageDialog(null,
                        "La posicion del arreglo " + pos + " tiene el valor " + n2);
            }
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Error");
        }

    }

}
