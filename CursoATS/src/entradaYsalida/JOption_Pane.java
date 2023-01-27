
package entradaYsalida;

import javax.swing.JOptionPane;

public class JOption_Pane {

    public static void main(String[] args) {
        //Declarando los valores
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        //Pedir los datos por el usuario
        cadena = JOptionPane.showInputDialog("Digite una cadena =");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero ="));
        letra = JOptionPane.showInputDialog("Digite una letra =").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal ="));
        
        //Imprimir
        JOptionPane.showMessageDialog(null,"La cadena es = " + cadena);
        JOptionPane.showMessageDialog(null,"La entero es = " + entero);
        JOptionPane.showMessageDialog(null,"La letra es = " + letra);
        JOptionPane.showMessageDialog(null,"La decimala es = " + decimal);
            
    }
    
}
