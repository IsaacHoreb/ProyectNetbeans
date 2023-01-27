
package recursividadModuloDos;

public class sucesionFibonacci {

    public static void main(String[] args) {

        sucesionFibonacci objfibo = new sucesionFibonacci();

        System.out.println("La sucecion Fibonaccio por ciclo de 4 es: "
                + objfibo.fibonacciCiclo(4));

        System.out.println("La Susecion Fibonacci de 4 mediante recursividad es: "
                + objfibo.fibonacciRecursivo(4));

    }

    //Creando el metodo recursivo para la Sucesión Fibonacci
    public int fibonacciRecursivo(int n) {
        if (n == 1 || n == 2) {
            //Caso Base (Respuesta Explicita)
            return 1;
        } else {
            //Dominio(Problema -1)
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }

    }

    //Creando el metodo con un ciclo para la susecion fibonacci
    public int fibonacciCiclo(int n) {
        int fibo = 0, primero = 1, segundo = 0;
        while (n > 0) {
            fibo = primero + segundo;
            primero = segundo;
            segundo = fibo;
            n--;
        }
        return fibo;
        
        /*
            EJEMPLO
            n=4=3=2=1   fibo=0=1=1=2=3     primero=1=0=1=1=2     segundo=0=1=1=2=3
            
            
            
            
            
            
            
            
        */
        
        
    }
}
