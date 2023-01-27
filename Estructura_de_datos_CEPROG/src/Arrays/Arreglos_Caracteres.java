
package Arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author ISAAC
 */
public class Arreglos_Caracteres {
    
    public static void main(String args[]){
        // Declaro el Arreglo
        String palabra = "";
        
        // Pido que ingrese su nombre y lo almaceno el una variable(palabra)
        palabra = JOptionPane.showInputDialog(null, "Ingresa tu primer nombre:");
        
        // Declaro una variable(deletreado) donde le digo que almacene 
        // los datos y longitud del dato nombre(palabra.length).
        char deletreado[] = new char[palabra.length()];
        
        // Con el ciclo obtendre las letras de almacené y 
        // lo guardo en el deletreado que ya tiene la longitud de la palabra
        for(int i=0; i<deletreado.length; i++){
            deletreado[i] = palabra.charAt(i); 
        }
        
        //Imprimo
        JOptionPane.showMessageDialog(null, "Tu nombre deletreado es:");
         for(int i=0; i<deletreado.length; i++){
           JOptionPane.showMessageDialog(null, deletreado[i]);
        }
    
        //Convertir los char a String(deletreado a cadena) 
        JOptionPane.showMessageDialog(null,"Tu nombre deletreado a String is:");
        String valorCadena = String.valueOf(deletreado);
        JOptionPane.showMessageDialog(null,valorCadena);
    }
}




















