package Arrays;

import javax.swing.JOptionPane;

public class OrdenamientoMtdBurbuja {

    public static void main(String[] args) {

        String respuesta = "";
        int aux;

        do {
            int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Igresa la longitud ="));
            int arr[] = new int[x];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "IGRESA DATOS\nArray #" + i));
            }

            //METODO BURBUJA PARA MOSTRARLO DE FORMA CRECIENTE
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        aux = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = aux;
                    }

                }
            }

            //Moldea el Array
            String arregloF = "[ ";
            for (int i = 0; i < arr.length; i++) {
                arregloF += arr[i] + ", ";
            }
            arregloF += " ]";

            JOptionPane.showMessageDialog(null, "Arreglo Ordenado de Forma Creciente\n" + arregloF);

            //Imprimir el array
            String arregloF1 = "[ ";
            for (int i = arr.length - 1; i >= 0; i--) {
                arregloF1 += arr[i] + ", ";
            }
            arregloF1 += " ]";

            JOptionPane.showMessageDialog(null, "Arreglo Ordenado de Forma Creciente\n" + arregloF1);

            respuesta = JOptionPane.showInputDialog(null, "¿DESEAS VOLVE A INTENTARLO?");
            respuesta = respuesta.toUpperCase();

        } while (!respuesta.equals("NO"));

    }

}
