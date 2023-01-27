package Arrays;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Ensayo {

    public static void main(String[] args) {

        int aux = 0;
        String[] arregloOpc = {"Yes", "No"};
        int opc = 0;

        try {
            do {
                int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la longitud del array"));
                int arr[] = new int[x];

                for (int i = 0; i < arr.length; i++) {
                    arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese valor\nArray #" + i));
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
                arregloF += "] ";

                System.out.println(arregloF);

                opc = JOptionPane.showOptionDialog(null,
                        "¿Desea hacer otro intento?", "Mensaje", 0, JOptionPane.QUESTION_MESSAGE, null, arregloOpc, "Yes");

            } while (opc != 1);

        } catch (HeadlessException | NumberFormatException Q) {
            JOptionPane.showMessageDialog(null, "Error de datos", "Mensaje", 1);
        }

    }

}
