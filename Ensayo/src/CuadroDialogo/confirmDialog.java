package CuadroDialogo;

import javax.swing.JOptionPane;

public class confirmDialog {

    public static void main(String[] args) {

        //Este metodo nos puede servir para que elige alguna opcion(si&no/cancelar) 
        int salida = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas salir?", "Mensaje", JOptionPane.YES_NO_OPTION);
        System.out.println(salida);

        //Solo si y no
        int sali = JOptionPane.showConfirmDialog(null, "Eres gey?", "Mensaje de saber...", JOptionPane.YES_NO_OPTION);
        System.out.println(sali);

    }

}
