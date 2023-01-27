package listaDoblementeEnlazada;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class AppMenu {

    public static void main(String[] args) {

        //Crear Objeto
        ListaDoble listita = new ListaDoble();
        int opcion = 0, el = 0;

        do {

            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                        + "---MENÚ DE OPCIONES A REALIZAR---\n"
                        + "1.- Agregar un Nodo al Inicio\n"
                        + "2.- Agregar un Nodo al Final\n"
                        + "3.- Eliminar un Nodo al Inicio\n"
                        + "4.- Eliminar un Nodo al Final\n"
                        + "5.- Mostar la Lista de Inicio a Fin\n"
                        + "6.- Mostar la Lista de Fin a Inicio\n"
                        + "7.- Salir\n"
                        + "¿Qué Deaseas Hacer?", "Menu de Opciones", JOptionPane.INFORMATION_MESSAGE));

                switch (opcion) {
                    case 1:
                        el = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el elemento del Nodo", "Agregado Nodo al Inicio", JOptionPane.INFORMATION_MESSAGE));
                        listita.agregarAlInicio(el);
                        break;
                    case 2:
                        el = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el elemento del Nodo", "Agregado Nodo al Final", JOptionPane.INFORMATION_MESSAGE));
                        listita.agregarAlFinal(el);
                        break;
                    case 3:
                        el = listita.eliminarInicio();
                        System.out.print("\nEl elemento eliminado es: " + el);
                        break;
                    case 4:
                        el = listita.eliminarFinal();
                        System.out.print("\nEl elemento eliminado es: " + el);
                        break;
                    case 5:
                        if (!listita.estaVacia()) {
                            listita.mostrarListaInicioFin();
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay Nodo", "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        if (!listita.estaVacia()) {
                            listita.mostrarListaFinInicio();
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay Nodo", "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Operacion Finalizada", "Operacion Finalizada", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Operacion Invalida");
                        break;

                }

            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error de Sistemas", "Mensaje", JOptionPane.WARNING_MESSAGE);
            }

        } while (opcion != 7);

    }
}
