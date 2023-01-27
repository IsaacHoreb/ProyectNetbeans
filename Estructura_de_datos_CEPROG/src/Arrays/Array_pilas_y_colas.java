package Arrays;

/**
 * Ejercicio 1
 *
 * Desarrollar un programa en Java que mediante arreglos realice la misma
 * función de las siguientes utilidades sobre Array List:
 *
 */
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author ISAAC
 */
public class Array_pilas_y_colas {

    public static void main(String[] args) {
        // Declara el Array
        int Y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Tamaño para el Array\n"));
        int num[] = new int[Y];

//-------------------------------------------------------------------------------------------------------------------------------------------------             
        //Llenar el arreglo        
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa valores para para asignar al Array\nArray #" + i + ": "));
        }
//---------------------------------------------------------------------------------------------------------------------------------------------------------     

        //Imprimir los Array que tenemos         
        String arreglo = "[";
        for (int i = 0; i < num.length; i++) {
            arreglo += num[i] + ", ";
        }
        arreglo += "]";

        JOptionPane.showMessageDialog(null, "The Arrays are:\n" + arreglo);

//-----------------------------------------------------------------------------------------------------------------------------------------     
        // 1.- Obtener el elemento de una determinada posición en el arreglo. 
        // El valor de la posición debe ser ingresado por el usuario.
        int pos = -1;
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Ingrese un valor cualquiera que\n asigno al Array para saber su pocision:\n"));

        for (int i = 0; i < num.length; i++) {
            if (num[i] == n) {
                pos = i;
            }
        }

        if (pos == -1) {
            JOptionPane.showMessageDialog(null, "No se encontro la posicion");
        } else {
            JOptionPane.showMessageDialog(null, 
                    "El Array " + n + " esta en la pocision" + ": " + pos);
        }

//------------------------------------------------------------------------------------------------------------------------------------------------------     
        //2.- Inserte un elemento en una posición determinada por el usuario. 
        //Tanto la posición como el nuevo valor deben ser ingresados por el usuario.
        int pos1, pos2, aux1, aux2;

        JOptionPane.showMessageDialog(null, "Cambiar 2 posiciones del Array");
        pos1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa su primera posicion para cambiar:\n"));

        pos2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa su segunda posicion para cambiar:\n"));

        aux1 = num[pos1];

        aux2 = num[pos2];

        num[pos1] = aux2;

        num[pos2] = aux1;

        //Mostrar los cambios de posicion de los arreglos
        arreglo = "[";
        for (int i = 0; i < num.length; i++) {
            arreglo += num[i] + ", ";
        }
        arreglo += "]";

        JOptionPane.showMessageDialog(null, "El arreglo con cambios es:\n" + arreglo);

        //------------------------------------------------------------------------------------------------------------------     
        // 3.- Obtenga un sub arreglo de las posiciones indicadas por el usuario
        int x, z;

        JOptionPane.showMessageDialog(null, "Obtenga un sub arreglo de las posiciones indicadas");

        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Desde que posicion desea saber del Array\n Eliga una primera pocision"));

        z = Integer.parseInt(JOptionPane.showInputDialog(null, "Desde que pocision desea que termine del Array\n Eliga una segunda pocision"));

//        int[] b = Arrays.copyOfRange(num, x, z);
//         for (int i : b)
        //JOptionPane.showMessageDialog(null,"The SubArray is: +i + "  ");
        int[] b = Arrays.copyOfRange(num, x, z);
        arreglo = "[";
        for (int i : b) {
            arreglo += i + ", ";
        }
        arreglo += "]";

        JOptionPane.showMessageDialog(null, "La Sublista del Array es:\n" + arreglo);

//----------------------------------------------------------------------------------------------------------------------------------         
    }
}
