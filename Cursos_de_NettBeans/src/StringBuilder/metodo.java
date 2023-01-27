package StringBuilder;

/**
 *
 * @author ISAAC HOREB
 */
public class metodo {

    public static void main(String[] args) {

        //Metodo Conquetenacion
        String texto = "Hola Mundo";
        texto += " My friends";

        System.out.println(texto);

        System.out.println();

        //Metodo StringBuilder
        StringBuilder sp = new StringBuilder();

        sp.append("Hola").append(" Mundo").append(" My").append(" Friends");
        System.out.println(sp);
        System.out.println();

        ///////////////////////////////////////////////
        //El StringBuilder es mejor por su rendimiento
        long tiempo_inicio = System.nanoTime();

        StringBuilder xx = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            xx.append(i);
        }

        long tiempo_final = System.nanoTime();
        double diferencia = (tiempo_inicio - tiempo_final);

        System.out.println(diferencia);

        //-----------------------------------------------
        long tiempo_inicio2 = System.nanoTime();

        String texto2 = "";
        for (int i = 0; i < 1000; i++) {
            texto2 += i;
        }

        long tiempo_final2 = System.nanoTime();
        double diferencia2 = (tiempo_inicio2 - tiempo_final2);

        System.out.println(diferencia2);

    }

}
