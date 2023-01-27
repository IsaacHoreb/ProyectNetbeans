package Colas;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author ISAAC HOREB
 */
public class Principal {

    public static void main(String[] args) {

        int opcion = 0;
        int elemento = 0;

        Cola colita = new Cola();

        do {

            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                        + "1.- Insertar un elemento en la Cola\n"
                        + "2.- Quitar un elemento de la Cola\n"
                        + "3.- ¿La cola esta vacia?\n"
                        + "4.- Elemento unicado al inicio de la Cola\n"
                        + "5.- Tamaño de la Cola\n"
                        + "6.- Salir\n"
                        + "¿Que deseas realizar?", "MENÚ", 3));

                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a insertar", "Insertando en la cola", JOptionPane.INFORMATION_MESSAGE));
                        colita.Insertar(elemento);
                        break;
                    case 2:
                        if (!colita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento Atendido es: " + colita.Quitar(), "Quitando elemento", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola esta vacia", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (colita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La cola esta vacia", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola no esta vacia", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!colita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento ubicado al inicio es " + colita.InicioCola(), "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola está vacia", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "El tamaño de la cola es " + colita.tamanioCola(), "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Programa Finalizado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion No Valida\nVuelva a Intentar", "Mensaje", JOptionPane.WARNING_MESSAGE);
                        break;
                }

            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error de datos", "Mensaje", 2);
            }

        } while (opcion != 6);

    }

}
