package metodoRecursiva;

public class FactorialdeunNumeroRecursividad {

    public static void main(String[] args) {

        FactorialdeunNumeroRecursividad objfact = new FactorialdeunNumeroRecursividad();

        System.out.println("El factotiral de 4 mediante Metodo Recursivo es: "
                + objfact.factorialRecursivo(4));

        System.out.println("El factorial de 4 mediante Ciclo: " + objfact.factorialCiclo(4));

    }

    //Creamos el metodo factorial de manera recursiva
    public int factorialRecursivo(int n) {

        //Validacion 
        if (n < 0) {
            return 0;
        } else {
            //Caso Base
            if (n == 0) {
                return 1;
            } else {
                //Dominio(Problema-1)    
                return n * factorialRecursivo(n - 1);
            }
        }
    }

    //Creando metodo factorial mediante un ciclo
    public int factorialCiclo(int n) {
        int factor = 1;
        if (n < 0) {
            return 0;
        } else {
            while (n != 0) {
                factor = factor * n;
                n--;
            }
            return factor;
        }

    }

}
