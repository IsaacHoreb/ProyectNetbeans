package CuadroDialogo;

import javax.swing.JOptionPane;

public class opcionDialog {

    public static void main(String[] args) {
        respuesta();
    }

    public static void respuesta() {
        String[] arreglo = {"Si", "No", "Cancelar"};

        int opc = JOptionPane.showOptionDialog(null, "Elige una palabra", "Elige",
                0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "Cancelar");

        System.out.println("Tu respuesta es: " + opc);
        System.out.println("Tu respuesta es: " + arreglo[opc]);
    }

}
