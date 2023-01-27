package recursividadModuloDos;

public class Recursividad_torresHanoi {

    public static void main(String[] args) {

        Recursividad_torresHanoi objhanoi = new Recursividad_torresHanoi();

        objhanoi.torreshanoi(5, 1, 2, 3);
        System.out.println("Gamer Over");

    }

    //Implementando el metodo recursivo para solucionar las Torres de Hanoi
    public void torreshanoi(int disco, int torre1, int torre2, int torre3) {
        //Caso Base
        if (disco == 1) {
            System.out.println("Mover disco de torre " + torre1 + " a Torre " + torre3);
        } else {
            //Caso Dominio
            torreshanoi(disco - 1, torre1, torre3, torre2);
            System.out.println("Mover disco de torre " + torre1 + " a Torre " + torre3);
            torreshanoi(disco - 1, torre2, torre1, torre3);

        }
    }
}
