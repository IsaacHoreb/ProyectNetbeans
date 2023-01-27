package Arrays;

/**
 * EJERCICIO 2.
 *
 * Desarrola un programa en Java que mediante arreglos realice la misma función
 * de las siguientes utilidades sobre Array List:
 *
 * #: Invertir los valores de un arreglo de atras hacia adelante por adelante
 * hacia atras.
 *
 *
 */
import javax.swing.JOptionPane;

/**
 *
 * @author ISAAC
 */
public class Array_Lista_Enlazada {

    public static void main(String[] args) {

        //1.- Rellenar el arreglo
        //Ingresar la longitud del arreglo por medio del usuario 
        int l = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la longitud del arreglo:\n"));
        int arr[] = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor para el Array #"+i+":\n"));
        }

        String arreglo = "[ ";
        for (int i = 0; i < l; i++) {
            arreglo += arr[i] + ", ";
        }
        arreglo += " ]";
//        
        //Imprimir Array
        System.out.println("El arreglo es:\n" + arreglo);
//----------------------------------------------------------------------------------------------------------------------------------    

        //2.- Mostrar los arreglos invertido       
        arreglo = "[";
        for (int i = arr.length - 1; i >= 0; i--) {
            arreglo += arr[i] + ", ";
        }
        arreglo += " ]";

        //Imprimir Array
        System.out.println("");
        System.out.println("El arreglo invertidos es:\n" + arreglo);

    }
}
                    

//Archivo: InvertirArreglo.java

/**
 * public class Array_Lista_Enlazada{
 * 
 *
 *    public static void main(String args[]){
 *           
 *      int numeros[] = {10, 20, 30, 40, 50};
 *           
 *         //Bloque 1: Impresion de nuestro arreglo.
 *          System.out.println("Indice\tValor");
 *            for(int contador=0; contador<numeros.length; contador++)
 *               System.out.println(contador+"\t"+numeros[contador]);
 *           
 *         //Bloque 2: Impresión invertida del arreglo.
 *          System.out.println();
 *          System.out.println("Indice\tValor");
 *            for(int contador=numeros.length-1; contador>=0; contador--)
 *               System.out.println(contador+"\t"+numeros[contador]);
 *      }
 *   }
 *
 **/









