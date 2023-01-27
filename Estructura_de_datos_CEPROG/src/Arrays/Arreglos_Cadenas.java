
package Arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author ISAAC
 */
public class Arreglos_Cadenas {

    public static String[] llenaArreglo (int x){
        String palabras[]; 
        palabras = new String[x];
        
        for(int i = 0; i < palabras.length; i++){
            palabras[i] = JOptionPane.showInputDialog(null, "Ingresa una frase o palabra:");
        }
        
        return palabras;
    }
    
    public static void imprimeArreglo(String a[]){
        String arregloF = "[";
        for(int i = 0; i<a.length; i++){
            arregloF+=a[i]+", ";
        }
        arregloF+="]";
        
        JOptionPane.showMessageDialog(null,arregloF );
    }

    public static void main(String args[]){ 
        int op=0;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("1.-Llenar e Imprimir arreglo\n2.-Salir\ningresa una opcion"));
            switch(op){
                case 1:
                    int tamanio2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa una longitud"));
                    String arr2[] = llenaArreglo(tamanio2); 
                    imprimeArreglo(arr2);
                    break;
                case 2:
                    System.exit(0);
                    break;
            }
        } while(op != 2);  
    }
    

   
}
    
