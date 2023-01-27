package ManejoExcepcion;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        //Excepciones: Son problemas y errores que pueden ocurrir
        //mientras se ejecuta nuestra app
        int x, y, i = 0;
        int vector[] = {23, 4, 12, 34, 123, 12, 2};
        boolean errores = false;

        try {
            errores = true;

            x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa  un numero =", "Solicitando datos", 3));
            y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa  un numero =", "Solicitando datos", 3));

            JOptionPane.showMessageDialog(null, "La Divicion de " + x + "/" + y + " es = " + (x / y), "Mostrando resultados", 1);

            for (i = 0; i < 8; i++) {
                System.out.print("[ " + vector[i] + " ]");
            }
        } catch (NumberFormatException m) {

            errores = true;
            JOptionPane.showMessageDialog(null, "No es entero");

        } catch (ArithmeticException a) {

            errores = true;
            JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");

        } catch (ArrayIndexOutOfBoundsException s) {

            errores = true;
            JOptionPane.showMessageDialog(null, "El Index " + i + " No Existe");

        } finally {

            if (errores == false) {
                System.out.println();
                System.out.println("Todo concluyo ok");
            } else {
                System.out.println("Todo concluyo con errores");
            }

        }

    }

}
