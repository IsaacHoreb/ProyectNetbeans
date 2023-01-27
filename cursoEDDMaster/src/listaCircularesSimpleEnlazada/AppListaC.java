package listaCircularesSimpleEnlazada;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class AppListaC {

    public static void main(String[] args) {

        listaC listita = new listaC();
        int opcion = 0, el = 0;
        boolean eliminado = false;

        do {

            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                        + "---MENÚ DE OPCIONES A REALIZAR---\n"
                        + "1.- Agregar un Nodo a la Lista Circular\n"
                        + "2.- Eliminar un Nodo a la Lista Circular\n"
                        + "3.- Mostrar los datos de la Lista Circular\n"
                        + "4.- Salir\n"
                        + "¿Qué Deaseas Hacer?", "Menu de Opciones", 3));

                switch (opcion) {
                    case 1:
                        el = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el elemento del Nodo", "Agregado Nodo al Inicio", JOptionPane.INFORMATION_MESSAGE));
                        listita.insertar(el);
                        break;
                    case 2:
                        if (!listita.estaVacia()) {
                            el = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingrese el elemento del Nodo a Eliminar", "Eliminar Nodo del Nodo Circular", JOptionPane.INFORMATION_MESSAGE));
                            eliminado = listita.eliminar(el);
                            if (eliminado) {
                                JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + el);
                            } else {
                                JOptionPane.showMessageDialog(null, "No existe el Nodo");
                            }
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Lista vacia", "Mensaje", 2);
                        }
                    case 3:
                        if (!listita.estaVacia()) {
                            listita.mostarLista();
                        } else {
                            System.out.println("No existen Nodos");
                        }
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Operacion Finalizada", "Mensaje", 1);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Operacion Invalida");
                        break;
                }

            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error de Sistemas", "Mensaje", JOptionPane.WARNING_MESSAGE);
            }

        } while (opcion != 4);

    }

}
