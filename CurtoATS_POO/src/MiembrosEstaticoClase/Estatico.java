package MiembrosEstaticoClase;

/*
    Los metodos estatico sirven para ya no crear objeto
    todos los datos o metodo le pertenecen a la clase
    no a los objetos
 */
public class Estatico {

    //Metodos estatico de la clase
    private static String frase = "Primera Frase";

    public static int suma(int n1, int n2) {
        int suma = n1 + n2;
        return suma;
    }

    //Metodo Main o Principal
    public static void main(String[] args) {
        System.out.println(Estatico.frase);
        System.out.println("La suma es = " + Estatico.suma(45, 2));
    }

}
