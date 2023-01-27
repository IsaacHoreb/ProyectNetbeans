//SUB CLASE
package Interfaces;

import javax.swing.JOptionPane;

public class Empleo extends Persona implements Enfermo {

    double sueldo;
    String telefono, direccion;

    public Empleo(String nom, int ed, double suel, String tel, String dir) {
        super(nom, ed);

        this.direccion = dir;
        this.sueldo = suel;
        this.telefono = tel;

    }

    @Override
    public void verDatos() {

        StringBuilder vd = new StringBuilder();

        vd.append("Nombre = ");
        vd.append(nombre);
        vd.append("\nEdad = ");
        vd.append(edad);
        vd.append("\nSueldo = ");
        vd.append(sueldo);
        vd.append("\nTelefono = ");
        vd.append(telefono);
        vd.append("\nDireccion = ");
        vd.append(direccion);

        JOptionPane.showMessageDialog(null, vd, "DATOS DEL EMPLEADO", JOptionPane.WARNING_MESSAGE);
    }

    @Override
    public void tos(){
        JOptionPane.showMessageDialog(null, "Hola estoy enfermo de tosm Cof Cof");
    }
    
    @Override
    public void diarrea(){
        JOptionPane.showMessageDialog(null, "Hola estoy enfermo de Diarrea, Snif Snif ");
    }
    
    
}
