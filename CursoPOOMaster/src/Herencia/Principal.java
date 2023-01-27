
package Herencia;

import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
        
        ClasePadre cp = new ClasePadre();
        ClaseHija ch = new ClaseHija();
        
        cp.hagoGalleta();
        JOptionPane.showMessageDialog(null, "Oficio Clase Hija: " + ch.oficio);
        ch.hagoGalleta();
        
        
    }
    
}
