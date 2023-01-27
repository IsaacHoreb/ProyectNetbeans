package Arrays;

import javax.swing.JOptionPane;

public class BusquedaSecuencial {

    public static void main(String[] args) {

        int arreglo[] = {1, 4, 2, 5, 3};
        int dato;
        boolean ban = false;
        dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero a buscar ="));

        //Busqueda Secuencial
        int i = 0;
        while (i < 5 && ban == false) {
            if (arreglo[i] == dato) {
                ban = true;
            }
            i++;
        }
        
        if (ban==false) {
            JOptionPane.showMessageDialog(null,"No se encontre el numero en el Array");
        }else{
            JOptionPane.showMessageDialog(null,"Hemos encontre el numero en el Array");
        }
        
        
    }

}
