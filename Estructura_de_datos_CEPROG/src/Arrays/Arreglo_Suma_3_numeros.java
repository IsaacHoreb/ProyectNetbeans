package Arrays;

// Ejercicio No.3
// Crea un array de números de un tamaño ingresado por el teclado, se deberá 
// realizar un método que se encargue de
// devolver la suma de 3 valores quwe sean solicitados por el usuario.
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ISAAC
 */
public class Arreglo_Suma_3_numeros {

    public static void main(String[] args) {

        int suma = 0;
        int arreglo[] = new int[3];
        //Scanner ent = new Scanner(System.in);

        for (int i = 0; i < arreglo.length; i++) {

            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el " + i + " numero:"));

            //     System.out.println("Ingresa el "+i+" numero:");
            //      arreglo[i] = ent.nextInt();
            suma += arreglo[i];
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("En la posicion " + (i) + " se guardo: " + arreglo[i]);
        }

        System.out.println("La suma total es: " + suma);

    }
}



    