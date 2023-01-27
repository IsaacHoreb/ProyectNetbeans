
package PolimorfismoPracticos;

import javax.swing.JOptionPane;

public class ProgramadorOverride extends InformaticoOverride{
    
    @Override
    public void sueldo(double pago){
        JOptionPane.showMessageDialog(null,"El pago de un programador es =\n" + pago);
    }
    @Override
    public void datos(String nom){
        JOptionPane.showMessageDialog(null,"El nombre del programador es =\n"+nom);
    }
    @Override
    public void labores(String labor){
        JOptionPane.showMessageDialog(null,"El labor del programador es =\n"+labor);
        
    }
    
}
