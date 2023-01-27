
package PolimorfismoPracticos;

import javax.swing.JOptionPane;

public class AdministradorBDOverride extends InformaticoOverride{
    
    @Override
    public void sueldo(double pago){
        JOptionPane.showMessageDialog(null,"El pago de un AdministradorBD es =\n" + pago);
    }
    @Override
    public void datos(String nom){
        JOptionPane.showMessageDialog(null,"El nombre del AdministradorBD es =\n"+nom);
    }
    @Override
    public void labores(String labor){
        JOptionPane.showMessageDialog(null,"El labor del AdministradorBD es =\n"+labor);
        
    }
    
    
    
}
