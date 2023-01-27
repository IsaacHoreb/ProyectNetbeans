
package Arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author Isaac
 */

public class Arreglos_Intercambio {
    
    public static void main(String args[]){
        
        //Ingresar la longitud del arreglo por medio del usuario
        int l = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la longitud para el Arreglo:\n"));
        
        //Declarar e inicializar el Array
        int arr[] = new int[l];
        
        //Dar valores al Array por el Usuario
        for (int i = 0; i < l; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor\nArray #" + i + ":\n"));
        }

        //Moldear los datos para que aparesca en tipo cadena
        String arregloF1 = "[";
        for (int i = 0; i < l; i++) {
            arregloF1 += arr[i] + ", ";
        }
        arregloF1 += "]";

        //Imprimir Array
        JOptionPane.showMessageDialog(null, "El arreglo es:\n" + arregloF1);

        //Saber Posicion es especifico
        int pos = -1;
        //Variable para que almacene el valor que se desea 
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el valor del Array para saber su pocision\n"+arregloF1,"MENSAJE DE ADVERTENCIA",JOptionPane.WARNING_MESSAGE));
        
        //Variable para saber madamos el indice para encontra su valor
        int H;
        H = arr[n];
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == H) {
                pos=i;
            }
        }
        
        if (pos == -1) {
            JOptionPane.showMessageDialog(null,"No se encontro la posicion.\n"
                    + "Recuerda que es valor ingresado\nno indice");
        }else{
            JOptionPane.showMessageDialog(null,"El Array que tecleo fue: "+n+"\n Y el valor que contiene es = \n"+H);
        }

        //Para evitar perder los arreglos y se puedan guardar
        //Declarar Variables para guardar las posiciones
        int pos1, pos2, aux1, aux2;

        JOptionPane.showMessageDialog(null, " Decide 2 posiciones para intercambiar entre sí.\n"
                + "Recurda la 1ra posicion tiene que ser Mayor al 2do","Mensaje Advertencia",JOptionPane.WARNING_MESSAGE);

        //Ingrese las posicioes a intercambiar
        pos1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa 1ra posicion:\n"));

        pos2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa 2da posicion:\n"));
        
        //Mostramos mensaje de los datos(Indice) que ingresó
        JOptionPane.showMessageDialog(null,"Las posiciones tecleadas son =\n"+pos1+", "+pos2);

        //Llamo Array delcarandole la posicion y dando el valor a las variable que tendran los valores
        aux1 = arr[pos1];

        aux2 = arr[pos2];

        //Cambiar la pocision de un Array 
        if (decideIntercambio(arr, pos1, pos2)) {
            //Asignamos los valores para el intercambio
            arr[pos1] = aux2;
            arr[pos2] = aux1;
            
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo hacer el intercambo.\nSu 1ra posicion no es Mayor.");
        }

        // Mostrar los arreglos Cambiados de posicion(Invertidos)
        String arregloF2 = "[";
        for (int i = 0; i < l; i++) {
            arregloF2 += arr[i] + ", ";
        }
        arregloF2 += "]";
        
        //Imprimir
        JOptionPane.showMessageDialog(null,"El intercambio de la posiciones son=\n"
                +"Antes:\n"+arregloF1+"\nDespues:\n"+arregloF2);

    }

    public static boolean decideIntercambio(int a[], int x, int y) {

        //Cambiar la posicion decidida por el usuario si es mayor que el arreglo deseado
        if (a[x] > a[y]) {
            return true;
        } else {
            return false;
        }

    }
}



