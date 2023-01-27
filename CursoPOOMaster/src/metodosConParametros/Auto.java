
package metodosConParametros;

import javax.swing.JOptionPane;


public class Auto {
    
        
    void arrancarAuto(String Marca,String Color,int Modelo,double Precio){
        
        StringBuilder al = new StringBuilder();
        
        al.append("Marca = ");
        al.append(Marca);
        al.append("\nColor = ");
        al.append(Color);
        al.append("\nModelo = ");
        al.append(Modelo);
        al.append("\nPrecio = ");
        al.append(Precio);
        
        JOptionPane.showMessageDialog(null, al,"PRIMER AUTO",JOptionPane.WARNING_MESSAGE);
    }

}
