package entradaYsalida;

import java.util.Scanner;

public class Consola {

    public static void main(String[] args) {
        //Declara el objeto para la entrada de datos
        
        //TIPO ENTERO
        Scanner entrada = new Scanner(System.in);
        int num;
        
        System.out.println("DIGITA UN NUMERO =");
        num = entrada.nextInt();
        
        System.out.println("El numero es = " + num);
        
        //TIPO CADENAS
        Scanner entrada2 = new Scanner(System.in);
        String cad;
        
        System.out.println("Digita una cadena =");
        cad = entrada2.nextLine();
        
        System.out.println("La cadena es = " + cad);
        
        //Tipo char
        Scanner entrada3 = new Scanner(System.in);
        char letra;
        
        System.out.println("Digita una cadena =");
        letra = entrada2.next().charAt(0);
        
        System.out.println("La cadena es = " + letra);
        
        
        
    }

}
