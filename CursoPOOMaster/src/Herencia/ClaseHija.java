
package Herencia;

import javax.swing.JOptionPane;

public class ClaseHija extends ClasePadre{
    
    
    @Override
    public void hagoGalleta(){
        JOptionPane.showMessageDialog(null, "Hola soy la subclase hago galletas pero con KCH");
    }
    
}
