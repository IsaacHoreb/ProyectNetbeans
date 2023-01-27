package Arrays;

import javax.swing.JOptionPane;

public class OrdenarInsercion {

    public static void main(String[] args) {

        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño ="));
        int arr[] = new int[x];
        
        int aux,pos; 

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "IGRESE DATOS\nArray #" + i));
        }
        
        //Metodo por Inseccion
        for (int i = 0; i < arr.length; i++) {
            pos=i;
            aux = arr[i];
        
            while((pos > 0) && (arr[pos-1] > aux)){
                arr[pos] = arr[pos-1];
                pos--;
            }
            arr[pos] = aux;
        }
        
        String arregloF = "[ ";
        for (int i = 0; i < arr.length; i++) {
            arregloF += arr[i] + ", ";
        }
        arregloF += " ]";
        
        JOptionPane.showMessageDialog(null,"Arreglo Ordenado\n"+arregloF,"Orden Ascendente",3);

        String arregloF2 = "[ ";
        for (int i = arr.length-1; i >= 0; i--) {
            arregloF2 += arr[i] + ", ";
        }
        arregloF2 += " ]";
        
        JOptionPane.showMessageDialog(null,"Arreglo Ordenado\n"+arregloF2,"Orden Deccendente",3);
        
    }
    

}
