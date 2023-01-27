
package Curp;

/**
 *
 * @author ISAAC
 */
public class main {
    
    public static void main(String[] args) {
        //7.- Creamos el obketo de la ventana
        ventana1 principal = new ventana1();
        
        //8.- Ventana se muestre en medio de la pantalla
        principal.setLocationRelativeTo(null);
        //9.- Titulo del programa
        principal.setTitle("CURP");
        //10.- Se muestre la pantalla
        principal.setVisible(true);
    }
    
}
