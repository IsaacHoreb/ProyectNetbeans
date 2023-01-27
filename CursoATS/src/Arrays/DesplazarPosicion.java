package Arrays;

import javax.swing.JOptionPane;

public class DesplazarPosicion {

    public static void main(String[] args) {

        try {
            
            //Pido a Usuario la longitud del Array
            int x = Integer.parseInt(JOptionPane.showInputDialog("Digite la longitud ="));
            int arr[] = new int[x]; //Iniializ el array

            //El usuario llena el array
            JOptionPane.showMessageDialog(null, "Llena el Array", "Mensje", 3);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa los datos\nArray #" + i));
            }

            int ultimo = arr[9]; //Declaro que el ultimo elemento lo guardo en una nueva variable

            //Hacer que Array Avance
            for (int i = 8; i >= 0; i--) {
                arr[i + 1] = arr[i];
            }
            //
            
            //Decalro que el ultimo sera el primero del array
            arr[0] = ultimo;

            //Moldeo el array
            String arregloF = "[ ";
            for (int i = 0; i < arr.length; i++) {
                arregloF += arr[i] + ", ";
            }
            arregloF += " ]";

            //Imprimo
            JOptionPane.showMessageDialog(null, "El arreglo despazado es =\n" + arregloF);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Introduccir Datos");
        }

    }

}
