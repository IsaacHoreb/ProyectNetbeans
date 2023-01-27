
package PraciticaHerencia;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "EMPLEADO NO.1","MENSAJE",JOptionPane.INFORMATION_MESSAGE);
        
        String nom = JOptionPane.showInputDialog(null,"Ingrese el nombre =\n",JOptionPane.INFORMATION_MESSAGE);
        int ed = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad =\n",JOptionPane.INFORMATION_MESSAGE));
        int sue = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el sueldo =\n",JOptionPane.INFORMATION_MESSAGE));
        String tel = JOptionPane.showInputDialog(null,"Ingese el No. Tel =\n",JOptionPane.INFORMATION_MESSAGE);
        String dir = JOptionPane.showInputDialog(null,"Ingrese la direccion =\n",JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "EMPLEADO NO.2","MENSAJE",JOptionPane.INFORMATION_MESSAGE);
        
        String nom2 = JOptionPane.showInputDialog(null,"Ingrese el nombre =\n",JOptionPane.INFORMATION_MESSAGE);
        int ed2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad =\n",JOptionPane.INFORMATION_MESSAGE));
        int sue2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el sueldo =\n",JOptionPane.INFORMATION_MESSAGE));
        String tel2 = JOptionPane.showInputDialog(null,"Ingese el No. Tel =\n",JOptionPane.INFORMATION_MESSAGE);
        String dir2 = JOptionPane.showInputDialog(null,"Ingrese la direccion =\n",JOptionPane.INFORMATION_MESSAGE);   
        
        JOptionPane.showMessageDialog(null, "EMPLEADO NO.3","MENSAJE",JOptionPane.INFORMATION_MESSAGE);
        
        String nom3 = JOptionPane.showInputDialog(null,"Ingrese el nombre =\n",JOptionPane.INFORMATION_MESSAGE);
        int ed3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad =\n",JOptionPane.INFORMATION_MESSAGE));
        int sue3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el sueldo =\n",JOptionPane.INFORMATION_MESSAGE));
        String tel3 = JOptionPane.showInputDialog(null,"Ingese el No. Tel =\n",JOptionPane.INFORMATION_MESSAGE);
        String dir3 = JOptionPane.showInputDialog(null,"Ingrese la direccion =\n",JOptionPane.INFORMATION_MESSAGE);   
        
        
        Empleo ep1 = new Empleo(nom,ed,sue,tel,dir);
        Empleo ep2 = new Empleo(nom2,ed2,sue2,tel2,dir2);
        Empleo ep3 = new Empleo(nom3,ed3,sue3,tel3,dir3);
            
        
        ep1.verDatos();
        ep2.verDatos();
        ep3.verDatos();
        
        
    }
    
}
