
package MemoriaEstaticaArrays;

//1.- Importamos
import java.util.Arrays;
import javax.swing.JOptionPane;

public class claseArrays {

    public static void main(String[] args) {
        
        int arrEntero[] = new int[3];
        
        for (int i = 0; i < arrEntero.length; i++) {
            arrEntero[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento del índice "+i));
        }
        
        //Mostrar los datos como l ingresamos
        System.out.println("Los datos sin ordenar son");
        for (int i = 0; i < arrEntero.length; i++) {
            System.out.print("[" + arrEntero[i] + "]");
        }
        System.out.println("\nLos datos ordenados son:");
        Arrays.sort(arrEntero);//Aqui Ordenamos al arrelo 
        //Mostrar los datos como l ingresamos
        for (int i = 0; i < arrEntero.length; i++) {
            System.out.print("[" + arrEntero[i] + "]");
        }
        System.out.println("");
    }
    
}
