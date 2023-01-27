package Grafos;

public class Principal {

    public static void main(String[] args) {
        long matrizA[][] = {{0, 3, 4, 999999999, 8, 999999999}, {999999999, 0, 999999999, 999999999, 4, 6}, {999999999, 0, 999999999, 999999999, 4, 6}, {999999999, 0, 999999999, 999999999, 4, 6}, {999999999, 0, 999999999, 999999999, 4, 6}, {999999999, 0, 999999999, 999999999, 4, 6}};
        caminoMinimo ruta = new caminoMinimo();
        System.out.println(ruta.algoritmoFloyd(matrizA));
    }

}
