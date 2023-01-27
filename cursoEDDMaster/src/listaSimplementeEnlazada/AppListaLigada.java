//TERCERO
package listaSimplementeEnlazada;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class AppListaLigada {

    public static void main(String[] args) {

        Lista listita = new Lista();
        int opcion = 0, el;

        do {

            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                          "1.- Agregar un Elemento al Inicio de la Lista\n"
                        + "2.- Agregar un Elemento al Final de la Lista\n"
                        + "3.- Eliminar un Elemento al Inicio de la Lista\n"
                        + "4.- Eliminar un Elemento al Final de la Lista\n"
                        + "5.- Eliminar un Elemento Especifico de la Lista\n"
                        + "6.- Buscar un elemento en la Lista\n"
                        + "7.- Mostar los Datos de la Lista\n"
                        + "8.- Salir", "MENÚ DE OPCIONES", 3));

                switch (opcion) {

                    case 1:
                        //Agregar nodo al inicio
                        try {

                            el = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento:",
                                    "Insertando al inicio", 3));
                            //Agregando al Nodo
                            listita.agregarAlInicio(el);

                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                        }
                        break;

                    case 2:
                        //Agrega nodo al Final
                        try {

                            el = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento:",
                                    "Insertando al Final", 3));
                            //Agregando al Nodo
                            listita.agregarAlfinal(el);

                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                        }

                        break;

                    case 3:
                        el = listita.borrarInicio();
                        JOptionPane.showMessageDialog(null, "El elemento eliminado es = " + el,
                                "Eliminando Nodo Inicio", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 4:
                        el = listita.borrarFinal();
                        JOptionPane.showMessageDialog(null, "El elemento eliminado es = " + el,
                                "Eliminando Nodo Final", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 5:

                        el = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a eliminar",
                                "Eliminando Nodo Especifico", JOptionPane.INFORMATION_MESSAGE));
                        
                        //Verificar si el elemento a eliminar si de verdad existe
                        if (listita.estaEnLaLista(el)) {
                            listita.borrardoEpc(el);
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es = " + el,
                                    "Eliminando Nodo especifico", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "El elemento " + el + " No está en la Lista",
                                    "NODO NO ENCONTRADO", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 6:
                        //Buscar un nodo en Especifico
                        el = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a buscar",
                                "Buscar Nodo Especifico", JOptionPane.INFORMATION_MESSAGE));
                        //Condicion
                        if (listita.estaEnLaLista(el) == true) {
                            JOptionPane.showMessageDialog(null, "El elemento " + el + " Si está en la Lista",
                                    "NODO ENCONTRADO", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "El elemento " + el + " No está en la Lista",
                                    "NODO NO ENCONTRADO", JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;
                    case 7:
                        //Mostramos los datos
                        listita.mostrarLista();

                        break;

                    case 8:
                        //Salimos
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                }

            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
            }

        } while (opcion != 8);

    }

}
