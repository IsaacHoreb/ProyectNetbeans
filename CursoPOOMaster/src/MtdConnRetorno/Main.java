package MtdConnRetorno;

public class Main {

    public static void main(String[] args) {

        int resultado;
        int r = 5;
        boolean estadoHebrio;

        Operaciones op = new Operaciones();

        resultado = op.suma(5, 12);

        System.out.println("La suma es =\n" + resultado);

        System.out.println("La resta es =\n" + op.resta(34, 12));

        System.out.println("El area del circulo con radio " + r + " es =\n" + op.areaCirculo(r));

        estadoHebrio = op.estadoHebrio(1);

        if (estadoHebrio == true) {
            System.out.println("Que mal estás borracho");
        } else {
            System.out.println("Que Buen No estás borracho");
        }

    }

}
