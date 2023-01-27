
package Arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author ISAAC
 */
public class arreglosConEnteros {
    
    public static void main(String args[]){
        //Declaracion del arreglo
        int arrEnteros[];
        
        //Inicializacion del arreglo
        arrEnteros = new int[3];
        
        //Llenar manualmente el arreglo
        arrEnteros[0] = 5;
        arrEnteros[1] = 50;
        arrEnteros[2] = 75;
        
        //imprimir manualmente el arreglo
        JOptionPane.showMessageDialog(null, "El primer valor del arreglos es: "+arrEnteros[0]);
        JOptionPane.showMessageDialog(null, "El segundo valor del arreglos es: "+arrEnteros[1]);
        JOptionPane.showMessageDialog(null, "El tercer valor del arreglos es: "+arrEnteros[2]);
        
        //2do ejemplo
        int arrEnteros2[] = {0, 1, 2};
        JOptionPane.showMessageDialog(null, "El primer valor del arreglos es: "+arrEnteros2[0]);
        JOptionPane.showMessageDialog(null, "El segundo valor del arreglos es: "+arrEnteros2[1]);
        JOptionPane.showMessageDialog(null, "El tercer valor del arreglos es: "+arrEnteros2[2]);
     
        //3er ejemplo
        //Crear arreglos e inicializarlo
        int arrEnteros3[] = new int[5];
        //Llenar automaticamente el arreglo
        for (int i=0; i<arrEnteros3.length; i++){
            arrEnteros3[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor:"));
        }
        
        //imprimir automaticamente el arreglo
        for (int i=0; i<arrEnteros3.length; i++){
            JOptionPane.showMessageDialog(null,"El valor de la posicion "+i+" del arreglo es:"+arrEnteros3[i]);   
        }
        
        //caso practico
        //Obtener un promedio
        //Declarar una variable que obtenga la suma de las variable de arreglo
        int suma = 0;
        //Recorrer el arreglo para tomar cada valor  y sumarlo a la variable
        for (int i=0; i<arrEnteros3.length; i++){
           suma+=arrEnteros3[i];
        }
        
        //Realizar el promedio
        double promedio = suma/arrEnteros3.length;
        
        //imprimir el resultado del promedio
        JOptionPane.showMessageDialog(null, "El promedio es: "+promedio);
    }
}
