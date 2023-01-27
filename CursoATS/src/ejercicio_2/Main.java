package ejercicio_2;

/*  Guillermo tiene N dolares. Luis tiene la mitad de lo que poseen Guillermo,
    Juan tiene la mistad de lo que poseen Luis y Guillermo juntos.
    Hacer un programa que calcule e imprima la cantidad de dinero que tiene 
    entre los tres. */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float guillermo, luis, juan, total;

        System.out.println("Digite la cantidad de dinero que tiene Guillermo =");
        guillermo = entrada.nextFloat();

        luis = guillermo / 2;   //Luis tiene la mitad de los de Guillermo
        juan = (guillermo + luis) / 2;

        total = guillermo + luis + juan;
        System.out.println("El total es =\n" + total);
    }

}
