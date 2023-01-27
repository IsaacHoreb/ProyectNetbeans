package Arrays;

import javax.swing.JOptionPane;

public class insertarNum_Ordenado {

    public static void main(String[] args) {

        int x = Integer.parseInt(JOptionPane.showInputDialog("Inserte el tamaño del Array ="));
        int arr[] = new int[x];
        boolean creciente = true;
        int num, sitio_num = 0, j = 0;

        JOptionPane.showMessageDialog(null, "LLENAR EL ARRAY");

        do {

            //Llenamos el Array
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Datos\nArray #" + i));
            }

            //Comprobar si el array esta ordenado en forma creciente
            for (int i = 0; i < 4; i++) {
                if (arr[i] < arr[i + 1]) { //Creciente
                    creciente = true;
                }

                if (arr[i] > arr[i + i]) { //Decreciente
                    creciente = false;
                    break;
                }

            }
            //Si no esta ordenado
            if (creciente == false) {
                JOptionPane.showMessageDialog(null, "El array no esta ordenado en foma creciente\nVuelva a intentae\n");
            }

        } while (creciente == false);

        //Numero que desea insertar al Array
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero a insertar ="));

        //Para saber en que posicion va el numero
        while (arr[j] < num && j < 5) {
            sitio_num++;
            j++;
        }

        //Por ultimo,trasladamos una posicion en el arreglo a los elementos que 
        //van detras de numeros
        for (int i = 4; i >= sitio_num; i--) {
            arr[i + 1] = arr[i];
            
        }
        
        //Insertamos el numero que el usuario puso
        arr[sitio_num] = num;

        //Impriir
        String arregloF = "[ ";
        for (int i = 0; i < 6; i++) {
            arregloF += arr[i] + ", ";
        }
        arregloF += " ]";
        
        JOptionPane.showMessageDialog(null,"El arreglo queda de la siguiente manera\n"+arregloF,"ARREGLO LISTO",3);
        
        
        
    }

}
