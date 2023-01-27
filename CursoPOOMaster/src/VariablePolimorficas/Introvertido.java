
package VariablePolimorficas;

import javax.swing.JOptionPane;

public class Introvertido extends Personalidad {
    
    @Override
    public void hablar(){
        JOptionPane.showMessageDialog(null, "Hola","Soy Introvertido",1);
    }
    
    
    
    
}
