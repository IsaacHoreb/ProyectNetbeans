package ModificadoresDeAcceso2;

//Importar paquete para poder acceder a la inormacion
import ModificadoresDeAcceso.Clase1;

public class Clase3 {

    public static void main(String[] args) {
        Clase1 op = new Clase1();

        op.setEdad(12);
        System.out.println("La edad es = " + op.getEdad());

    }

}
