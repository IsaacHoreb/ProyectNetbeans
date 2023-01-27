package Arrays;

// Ejercicio No.1 
// Crea un array de 10 posiciones de números con valores
// pedidos por teclado. Muestra por consola el índice y el
// valor al que corresponde. Haz dos métodos, uno para
// rellenar valores y otro para mostrar

import javax.swing.JOptionPane;

/**
 *
 * @author ISAAC
 */
public class Arreglo_de_posiciones_por_teclado {
   

    public static void main(String args[]){
        
        //Declarar el arreglo
        int num[];
        //Rellenar el arreglo por teclado
        num = new int [10];
        
        for(int i = 0;i<num.length; i++ ){
            num [i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el un valor:"));
        }
        
        //Mostrar/Imprimir el arreglo por la Consola
        
        for(int i = 0; i<num.length; i++ ){
            System.out.println("El indice es " +i+ " y su valor es:" +num[i]);
        }
   
    }
    
    
    
  
    
    
    
    
    
    
    
    
    
}
