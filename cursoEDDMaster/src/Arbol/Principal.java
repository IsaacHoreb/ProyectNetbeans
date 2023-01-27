package Arbol;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int opcion = 0, elementos;

        ArbolBienario arbolito = new ArbolBienario();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.- Agregar un Nodo\n"
                        + "2.- Recorrer el Arbol InOrden\n"
                        + "3.- Recorrer el Arbol PreOrden\n"
                        + "4.- Recorrer el Arbol PosOrden\n"
                        + "5.- Buscar un Nodo en el Arbol\n"
                        + "6.- Eliminar un Nodo del Arbol\n"
                        + "7.- Salir\n"
                        + "Elige una opcion:", "Arboles Binarios", 3));

                switch (opcion) {
                    case 1:
                        elementos = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Agrega elemento", "Agregar Nodo", 1));
                        arbolito.agregarNodo(elementos);
                        break;
                    case 2:
                        if (arbolito.estaVacio()) {
                            JOptionPane.showMessageDialog(null, "El Arbol InOrden esta vacio", "Error de recorrido", 3);
                        } else {
                            System.out.println("");
                            arbolito.inOrden(arbolito.raiz);
                        }
                        break;
                    case 3:
                        if (arbolito.estaVacio()) {
                            JOptionPane.showMessageDialog(null, "El Arbol PreOrden esta vacio", "Error de recorrido", 3);
                        } else {
                            System.out.println("");
                            arbolito.preOrden(arbolito.raiz);
                        }
                        break;
                    case 4:
                        if (arbolito.estaVacio()) {
                            JOptionPane.showMessageDialog(null, "El Arbol PosOrden esta vacio", "Error de recorrido", 3);
                        } else {
                            System.out.println("");
                            arbolito.posOrden(arbolito.raiz);
                        }
                        break;
                    case 5:
                        if (arbolito.estaVacio()) {
                            JOptionPane.showMessageDialog(null, "El Arbol esta vacio", "Error de recorrido", 3);
                        } else {
                            elementos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor del Nodo", "Buscando Nodo", 1));
                            if (arbolito.buscar(elementos) == null) {
                                JOptionPane.showMessageDialog(null, "Nodo no encontrado", "Mensaje", 2);
                            } else {
                                System.out.println("Nodo encontrado, sus elementos son: " + arbolito.buscar(elementos));
                            }
                        }
                        break;
                    case 6:
                        if (arbolito.estaVacio()) {
                            JOptionPane.showMessageDialog(null, "El Arbol esta vacio", "Error de recorrido", 3);
                        } else {
                            elementos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor del Nodo a eliminar", "Eliminando Nodo", 1));
                            if (arbolito.eliminar(elementos) == false) {
                                JOptionPane.showMessageDialog(null, "Nodo no encontrado", "Mensaje", 2);
                            } else {
                                JOptionPane.showMessageDialog(null, "El Nodo ha sido eliminado", "Mensaje", 2);
                            }
                        }
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Programa Finalizado", "Mensaje", 3);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No existe opción", "Mensaje de Error", 2);
                        break;
                }

            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error de datos", "Mensaje", 2);
            }
        } while (opcion != 7);

    }

}
