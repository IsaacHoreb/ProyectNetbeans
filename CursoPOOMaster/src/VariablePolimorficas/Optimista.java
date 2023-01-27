
package VariablePolimorficas;

import javax.swing.JOptionPane;

public class Optimista extends Personalidad {
    
    @Override
    public void hablar(){
        JOptionPane.showMessageDialog(null, "Seguro que hoy tendre un excelente dia","Que optimista soy",1);
    }
    
    
    
}
