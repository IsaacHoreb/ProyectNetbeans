
package Arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author ISAAC
 */
public class Arreglos_Enteros {
   
    public static void main(String args[]){
        //Declarar el arreglo
        int num[];
        //Crear el arreglo
        num = new int[6];
        
        //Llenar el arreglo
//        num[0] = 4;
//        num[1] = 8;
//        num[2] = 16;
//        num[3] = 32;
//        num[4] = 64;
//        num[5] = 128;

        for(int i=0; i<num.length; i++){
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor:"));
        }

//        num[0] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor:"));
//        num[1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor:"));
//        num[2] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor:"));
//        num[3] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor:"));
//        num[4] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor:"));
//        num[5] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor:"));
        
        //Imprimir el arreglo
//        JOptionPane.showMessageDialog(null, "La posicion 1 del arreglo es: "+num[0]);
//        JOptionPane.showMessageDialog(null, "La posicion 2 del arreglo es: "+num[1]);
//        JOptionPane.showMessageDialog(null, "La posicion 3 del arreglo es: "+num[2]);
//        JOptionPane.showMessageDialog(null, "La posicion 4 del arreglo es: "+num[3]);
//        JOptionPane.showMessageDialog(null, "La posicion 5 del arreglo es: "+num[4]);
//        JOptionPane.showMessageDialog(null, "La posicion 6 del arreglo es: "+num[5]);

        for(int i=0; i<num.length; i++){
            JOptionPane.showMessageDialog(null, "La posicion "+i+" del arreglo es: "+num[i]);
        }
        
//        int i=0;
//        while(i<num.length){
//            JOptionPane.showMessageDialog(null, "La posicion "+i+" del arreglo es: "+num[i]);
//            i++;
//        }

        int media = obtieneMedia(num);
        
        JOptionPane.showMessageDialog(null, "El promedio de los valores ingresados es: "+media);
    }
    
    public static int obtieneMedia(int a[]){
        int sumaT=0; //Variable que obtendra la suma total de valores
        
        for(int i=0; i<a.length; i++){
            sumaT+=a[i];
        }
        
        int media = sumaT / a.length;
        
        return media;
    }
}
    
    
                                                                                                       