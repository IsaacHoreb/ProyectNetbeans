
package Interfaces;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
       
        JOptionPane.showMessageDialog(null, "EMPLEADO NO.1","MENSAJE",JOptionPane.INFORMATION_MESSAGE);
        
        String nom = JOptionPane.showInputDialog(null,"Ingrese el nombre =\n","NOMBRE",JOptionPane.INFORMATION_MESSAGE);
        int ed = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad =\n","EDAD",JOptionPane.INFORMATION_MESSAGE));
        int sue = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el sueldo =\n","SUELDO",JOptionPane.INFORMATION_MESSAGE));
        String tel = JOptionPane.showInputDialog(null,"Ingese el No. Tel =\n","TELEFONO",JOptionPane.INFORMATION_MESSAGE);
        String dir = JOptionPane.showInputDialog(null,"Ingrese la direccion =\n","DIRECCION",JOptionPane.INFORMATION_MESSAGE);
        
        Empleo ep1 = new Empleo(nom,ed,sue,tel,dir);
        
        ep1.verDatos();
        ep1.diarrea();
        ep1.tos();
        
    }
    
}
