package PolimorfismoPracticos;

import javax.swing.JOptionPane;

public class Programador extends Informatico {

    //Utilizando Polimorfismo Overload   
    public void sueldo(int horas, double pagoH) {
        JOptionPane.showMessageDialog(null, "El pago es: " + (horas * pagoH));
    }

    public void datos(String nom, String apellidos) {
        JOptionPane.showMessageDialog(null, "Nombre: " + nom
                + "\nApellidos: " + apellidos);
    }
    
    public void labores(String lab){
        JOptionPane.showMessageDialog(null,"Soy programador y me dedico a " + lab);
    }

}
