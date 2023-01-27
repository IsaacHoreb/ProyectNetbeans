package PolimorfismoPracticos;

import javax.swing.JOptionPane;

public class AdministradorBD {

    //Utilizando Polimorfismo Overload   
    public void sueldo(double pago) {
        JOptionPane.showMessageDialog(null, "El pago es: " + pago);
    }

    public void datos(String nom) {
        JOptionPane.showMessageDialog(null, "Nombre: " + nom);
    }

    public void labores(String lab) {
        JOptionPane.showMessageDialog(null, "Soy AdministradorBD y me dedico a " + lab);
    }

}
