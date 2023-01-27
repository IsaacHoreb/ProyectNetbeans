package Pila_EstaticaMemoria;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        //Creamos variables
        int opciones = 0;
        int elemento = 0;
        int tamanio = 0;

        try {

            tamanio = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "¿De que tamaño quieres la pila?", "Solicitad Tamaño", JOptionPane.INFORMATION_MESSAGE));

            Pilas pilita = new Pilas(tamanio);

            do {

                opciones = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                        + "-------MENÚ DE OPERACIONES-------\n"
                        + "1.- Empujar un elemento en la Pila\n"
                        + "2.- Sacar un elemento en la Pila\n"
                        + "3.- ¿La pila esta vacia?\n"
                        + "4.- ¿La pila esta llena?\n"
                        + "5.- Cima de la Pila\n"
                        + "6.- Tamaño de la Pila\n"
                        + "7.- Salir\n"
                        + "¿Qué deseas hacer?", "Menu de Operaciones", 3));

                switch (opciones) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el elemento a empujar en la Pila", "Apilando Datos",
                                JOptionPane.INFORMATION_MESSAGE));
                        if (!pilita.pillaLlena()) {
                            pilita.empujar(elemento);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta llena", "Mensaje", 3);
                        }
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
                            JOptionPane.showMessageDialog(null, "La pila No esta vacia", "Pila con datos",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia", "Pila sin datos",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 4:
                        if (!pilita.pillaLlena()) {
                            JOptionPane.showMessageDialog(null, "La pila No esta llena", "Pila llena",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta llena", "Pila vacia",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 5:
                        if (!pilita.estaVacia()) {
                            JOptionPane.showMessageDialog(null,
                                    "El elemento que se encuentra en la cima es: " + pilita.cimaPila(),
                                    "Cima de Pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "La pila esta vacia", "Pila sin datos", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 6:
                        JOptionPane.showMessageDialog(null,
                                "El tamaño de la pila es " + pilita.tamanioPila(), "Tamaño de Pila",
                                JOptionPane.INFORMATION_MESSAGE);
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
