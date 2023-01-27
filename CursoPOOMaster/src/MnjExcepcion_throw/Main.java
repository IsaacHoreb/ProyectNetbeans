package MnjExcepcion_throw;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int x, y;

        try {

            x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa  un numero =", "Solicitando datos", 3));
            y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa  un numero =", "Solicitando datos", 3));

            //Manejando excepciones medante throw
            if (y == 0) {
                //Crando una nueva exepcion de tipo throw
                throw new ArithmeticException("Error en Y = " + y);

            } else {
                JOptionPane.showMessageDialog(null, "La Divicion de " + x + "/" + y + " es = " + (x / y),
                        "Mostrando resultados", 1);
            }

        } catch (ArithmeticException er) {
            System.out.println(er.getMessage() + " No se puede dividir entre cero");

        } catch (Exception e) {    //Generaizando las excepciones, es decir cuando no sepas que excepcion ocurrira

            System.out.println(e.getMessage() + "Error");
        }

    }

}
