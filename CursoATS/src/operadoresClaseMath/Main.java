package operadoresClaseMath;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);
        double T = 0;
        System.out.println("Ingresa un numero para saber su raiz =");
        T = op.nextDouble();

        //Metodo para sacar raiz cuadradas
        double raiz = Math.sqrt(T); //Si desea convertirse a int se pone = (int) Math.sqrt(T) y tendras en entero        
        System.out.println("La raiz cuadrada de " + T + " es =\n" + raiz);
        System.out.println();

        //Metodo para elevar en potencias
        System.out.println("Ingrese el 1re numero que sea base =\n");
        int a = op.nextInt();
        System.out.println("Ingrese el 2do numero que sea el exponente =\n");
        int b = op.nextInt();
        double base = a, exponente = b;
        
        double resultado = Math.pow(base, exponente);
        System.out.println("El resultado es =\n" + resultado);

        //Mettodo para redondear un numero
        System.out.println("Ingrese un numero que desea redondear =\n");
        double num = op.nextDouble();
        long resultado1 = Math.round(num);
        System.out.println("El resultado es =\n" + resultado1);
    }

}
