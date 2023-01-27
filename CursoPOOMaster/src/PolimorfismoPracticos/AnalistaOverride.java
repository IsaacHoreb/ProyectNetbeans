
package PolimorfismoPracticos;

import javax.swing.JOptionPane;

public class AnalistaOverride extends InformaticoOverride {
    
    @Override
    public void sueldo(double pago){
        JOptionPane.showMessageDialog(null,"El pago de un Analista es =\n" + pago);
    }
    @Override
    public void datos(String nom){
        JOptionPane.showMessageDialog(null,"El nombre del Analista es =\n"+nom);
    }
    @Override
    public void labores(String labor){
        JOptionPane.showMessageDialog(null,"El labor del Analista es =\n"+labor);
        
    }

    
    
    
    
}
