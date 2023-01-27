package PolimorfismoPracticos;

import javax.swing.JOptionPane;

public class Analista extends Informatico {

    //Utilizando Polimorfismo Overload  con sobrecarga
    public void sueldo(int horas, double pagoH, double incentibos) {
        JOptionPane.showMessageDialog(null, "El pago es: " + ((horas * pagoH) + incentibos));
    }

    public void datos(String nom, String apellidos, String direccion) {
        JOptionPane.showMessageDialog(null, "Nombre: " + nom
                + "\nApellidos: " + apellidos + "\nDireccion: " + direccion);
    }

    public void labores(String lab, int horas) {
        JOptionPane.showMessageDialog(null, "Soy Analista y me dedico a " + lab +" "+ horas + " horas");
    }

}
