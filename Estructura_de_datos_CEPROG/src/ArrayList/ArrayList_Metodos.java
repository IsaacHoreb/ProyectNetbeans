package ArrayList;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayList_Metodos {

    //Creamos el ArrayList
    static ArrayList<String> al = new ArrayList<>();

    public static void main(String[] args) {
        int menu;

        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese Opcion\n"
                    + "1.- Llenar arreglo\n"
                    + "2.- Obtener Posicion\n"
                    + "3.- Imprimir Lista\n"
                    + "4.- Salir", "Menu", 1));

            switch (menu) {
                case 1:
                    llenarArray();
                    break;
                case 2:
                    obtenerposicion();
                    break;
                case 3:
                    verDatos();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Proceso terminado", "Salor", 3);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No existe opcion", "Error", 2);
                    break;
            }
        } while (menu != 4);

    }

    public static void llenarArray() {
        //Declaramos las variables
        String frase = "";
        String[] Op = {"Yes", "No"};
        int respuesta = 1;

        do {
            //Variable para guardar los datos
            frase = JOptionPane.showInputDialog(null, "Ingrese la frase", "Mensajes", 3);
            //Convirte a mayuscula
            frase = frase.toUpperCase();
            //Añadimo el dato al ArrayList
            al.add(frase);

            respuesta = JOptionPane.showOptionDialog(null, "¿Agregar alguno mas?", "Mensaje", 0, JOptionPane.QUESTION_MESSAGE, null, Op, Op[0]);

        } while (respuesta != 1);
    }

    public static void obtenerposicion() {
        String[] Op = {"Yes", "No"};
        int respuesta = 1;
        int p1 = 0;

        do {
            p1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese posicision deseada =\n"));

            //SI P1 ES MAYOR A LA LONGITUD
            if (p1 > al.size()) {
                JOptionPane.showMessageDialog(null, "No se encontro la posicion\nIntentelo de nuevo");
                p1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese posicision deseada =\n"));
                JOptionPane.showMessageDialog(null, "La posicion " + p1 + " es =\n" + al.get(p1));
            } else {
                JOptionPane.showMessageDialog(null, "La posicion " + p1 + " es =\n" + al.get(p1));
            }

            respuesta = JOptionPane.showOptionDialog(null, "¿Desea saber mas posicion?", "Mensaje", 0, JOptionPane.QUESTION_MESSAGE, null, Op, Op[0]);

        } while (respuesta != 1);

    }

    public static void verDatos() {
        JOptionPane.showMessageDialog(null, al);
    }

}
