package Arrays;

// Ejercicion No.2
// Crea un array de números de un tamaño ingresado por el teclado, se deberá realizar 
// un método que se encargue de
// multiplicar todos los valores y se devuelva el resultado.


import javax.swing.JOptionPane;

public class Arreglo_Multiplicacion {
    
    public static void main(String args[]) {

        int multi = 1;
        int arrEntero[] = new int[3];

        for (int i = 0; i < arrEntero.length; i++) {
            arrEntero[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa valores al Array #" + i));

            multi *= arrEntero[i];
        }

        for (int i = 0; i < arrEntero.length; i++) {

            System.out.println("El Array #" + i + " contiene el valor = " + arrEntero[i]);

        }

        System.out.println("La multiplicacion Total del Array es = " + multi);

    }
    
        
}
