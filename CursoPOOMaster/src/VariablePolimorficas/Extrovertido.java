
package VariablePolimorficas;

import javax.swing.JOptionPane;

public class Extrovertido extends Personalidad{
    
    @Override
    public void hablar(){
        JOptionPane.showMessageDialog(null, "Hola que gusto verte,ya te exttrañaban no sabes que bien me ha ido...",
                "Soy Extrovertido",1);
    }
    
    
}
