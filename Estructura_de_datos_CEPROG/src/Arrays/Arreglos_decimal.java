
package Arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author ISAAC
 */
public class Arreglos_decimal {
   
    public static void main(String args[]){
        //Declarar el arreglo
        double num[];
        //Crear el arreglo
        num = new double[6];
        
        //Llenar el arreglo

        for(int i=0; i<num.length; i++){
            num[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa un valor:"));
        }
        
        //Imprimir el arreglo

        for(int i=0; i<num.length; i++){
            JOptionPane.showMessageDialog(null, "La posicion "+i+" del arreglo es: "+num[i]);
        }
        
        double media = obtieneMedia(num);
        
        JOptionPane.showMessageDialog(null, "El promedio de los valores ingresados es: "+media);
    }
    
    public static double obtieneMedia(double a[]){
        double sumaT=0.0; //Variable que obtendra la suma total de valores
        
        for(int i=0; i<a.length; i++){
            sumaT+=a[i];
        }
        
        double media = sumaT / a.length;
        
        return media;
    }
}