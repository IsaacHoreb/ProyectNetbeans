package Pila_DinamicaMemoria;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        //Creamos variables
        int opciones = 0;
        int elemento = 0;

        int opc = 0;
        String arreglo[] = {"Si", "No"}; //Para confirmar eliminacion de los elementos de la pila

        try {

            Pila pilita = new Pila();

            do {

                opciones = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                        + "-------MENÚ DE OPERACIONES-------\n"
                        + "1.- Empujar un elemento en la Pila\n"
                        + "2.- Sacar un elemento en la Pila\n"
                        + "3.- ¿La pila esta vacia?\n"
                        + "4.- Cima de la Pila\n"
                        + "5.- Tamaño de la Pila\n"
                        + "6.- Vaciar la Pila\n"
                        + "7.- Salir\n"
                        + "¿Qué deseas hacer?", "Menu de Operaciones", 3));

                switch (opciones) {

                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el elemento a empujar en la Pila", "Apilando Datos", JOptionPane.INFORMATION_MESSAGE));
                        pilita.empujar(elemento);
                        break;

                    case 2:
                        if (!pilita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento obtenido es " + pilita.sacar(),
                                    "Obteniendo datos de la Pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta Vacia",
                                    "Pila Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 3:
                        if (!pilita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila No esta vacia", "Pila con datos", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia", "Pila sin datos", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 4:
                        if (!pilita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento que se encuentra en la cima es: " + pilita.cima(), "Cima de Pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia", "Pila sin datos", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 5:
                        JOptionPane.showMessageDialog(null, "El tamaño de la pila es " + pilita.tamanioPila(), "Tamaño de Pila", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 6:
                        opc = JOptionPane.showOptionDialog(null, "¿Estas seguro de eliminar\ntoda la pila?", "Elige",
                                0, JOptionPane.WARNING_MESSAGE, null, arreglo, "No");
                        if (opc == 0) {
                            if (!pilita.estaVacia()) {
                                pilita.limpiarPila();
                                JOptionPane.showMessageDialog(null, "La pila se ha Vaciado", "Pila Limpia", 1);
                            } else {
                                JOptionPane.showMessageDialog(null, "Pila Vacia, nada que vaciar\nBye", "Sin elementos", 2);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Correcto, no hay problema", "Mensaje", 3);
                        }
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Aplicacion Finalizada", "Mensaje", 3);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Aplicacion Finalizada", "Mensaje", 3);
                        break;
                }

            } while (opciones != 7);

        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error de Datos", "Mensaje", 2);
        }

    }

}
