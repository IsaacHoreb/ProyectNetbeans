package listaEnlazada;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class AppListaligada {

    public static void main(String[] args) {

        Lista listita = new Lista();
        int el, opcion = 0;

        do {

            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Opciones de lista\n"
                        + "1.- Agregar un elemento al inicio la Lista\n"
                        + "2.- Agregar un elemento al final la Lista\n"
                        + "3.- Borrar Datos del inicio la Listas\n"
                        + "4.- Borrar Datos del final la Listas\n"
                        + "5.- Mostrar Datos de la Listas\n"
                        + "6.- Salir", "Menu de opciones", 3));

                switch (opcion) {
                    case 1:
                        el = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento: "));
                        listita.agregarInicio(el);
                        break;
                    case 2:
                        el = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento: "));
                        listita.agregarFinal(el);
                        break;
                    case 3:
                        listita.borrarInicio();
                        break;
                    case 4:
                        listita.borrarFinal();
                        break;
                    case 5:
                        listita.mostrarLista();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No existe la opcion\nIntenta de nuevo");
                }

            } catch (HeadlessException | NumberFormatException e) {
                System.out.println("Error");
            }

        } while (opcion != 6);

    }

}
