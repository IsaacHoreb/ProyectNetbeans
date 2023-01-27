package Matrices;

public class MarcoWith_0_1 {

    public static void main(String[] args) {

        int Matriz[][] = new int[5][5];

        //Rellenando la Matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4) {
                    Matriz[i][j] = 1;
                } else if (j == 0 || j == 4) {
                    Matriz[i][j] = 1;
                } else {
                    Matriz[i][j] = 0;
                }
            }
        }

        System.out.println("La Matriz es: \n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

}
