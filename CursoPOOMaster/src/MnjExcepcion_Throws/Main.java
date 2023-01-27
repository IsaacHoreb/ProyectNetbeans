package MnjExcepcion_Throws;

import javax.swing.JOptionPane;

public class Main {

    static int x, y;

    public static void main(String[] args) {

        try {
            sumar();
            
            int r = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese 1er dato =","Dividir",1));
            int rt = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese 2do dato =","Dividir",1));
            
            dividir(r, rt);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException as) {
            System.out.println(as.getMessage());
        }

    }

    public static void sumar() throws NumberFormatException {

        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa x: ", "Solicitando Datos", 3));
        y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa y: ", "Solicitando Datos", 3));

        JOptionPane.showMessageDialog(null, "El resultado de " + x + "+" + y + " es: " + (x + y), "Mostrando Resultados", 1);

    }

    public static void dividir(int x, int y) throws ArithmeticException {

        if (y == 0) {
            throw new ArithmeticException("Error, no se puede dividir entre 0");
        } else {
            JOptionPane.showMessageDialog(null, "La divicion de " + x + "/" + y + " es: " + (x / y), "Mostrando Resultado", 1);
        }

    }

}
