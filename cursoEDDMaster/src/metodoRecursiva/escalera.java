package metodoRecursiva;

import java.util.logging.Level;
import java.util.logging.Logger;

public class escalera {

    public static void main(String[] args) {
        escalera objEsc = new escalera();
        objEsc.bajarEscalera(10);
    }

    //Creando un metodo para bajar una escalera
    public void bajarEscalera(int escalones) {
        if (escalones == 0) {
            //Caso base, respuesta Explicita
            System.out.println("Has terminado!");
        } else {

            //Agergamos un Try-Carch para evitar errores
            try {
                //Funcion para hacer esperar en milisegundo para la ejecucion del programa
                //SE LLAMA HILO PONE A DORMIR AL PROCESO
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(escalera.class.getName()).log(Level.SEVERE, null, ex);
            }

            //Dominio, divicion del problema original (problema - 1)
            System.out.println("Bajando la Escalera " + escalones);
            //Haciendo uso de la recursividad
            bajarEscalera(escalones - 1);

        }

    }

}
