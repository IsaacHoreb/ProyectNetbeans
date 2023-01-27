package ClasesY_MetodosAbstractos;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "EMPLEADO NO.1","MENSAJE",JOptionPane.INFORMATION_MESSAGE);
        
        String nom1 = JOptionPane.showInputDialog
        (null,"Ingrese el nombre =\n","NOMBRE",JOptionPane.INFORMATION_MESSAGE);
        
        int ed1 = Integer.parseInt
        (JOptionPane.showInputDialog
        (null,"Ingrese la edad =\n","EDAD",JOptionPane.INFORMATION_MESSAGE));
        
        int sue1 = Integer.parseInt
        (JOptionPane.showInputDialog(null,"Ingrese el sueldo =\n","SUELDO",JOptionPane.INFORMATION_MESSAGE));
        String tel1 = JOptionPane.showInputDialog
        
        (null,"Ingese el No. Tel =\n","TELEFONO",JOptionPane.INFORMATION_MESSAGE);
        
        String dir1 = JOptionPane.showInputDialog
        (null,"Ingrese la direccion =\n","DIRECCION",JOptionPane.INFORMATION_MESSAGE);   
        
        //OBJECTO
        Empleo ep1 = new Empleo(nom1,ed1,sue1,tel1,dir1);
        
        ep1.verDatos();
        
        
    }

}
