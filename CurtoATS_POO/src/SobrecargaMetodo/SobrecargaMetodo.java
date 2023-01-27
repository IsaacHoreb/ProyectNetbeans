package SobrecargaMetodo;

public class SobrecargaMetodo {

    public static void main(String[] args) {

        SobrecargaMetodo persona = new SobrecargaMetodo("Alejanda", 56);
        SobrecargaMetodo persona2 = new SobrecargaMetodo("33242");

        persona.Correr();
        persona2.Correr(34);

    }

    //Atributos
    String nombre;
    int edad;
    String dni;

    //Metodos
    public SobrecargaMetodo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public SobrecargaMetodo(String dni) {
        this.dni = dni;
    }

    public void Correr() {
        //Metodo StringBuilder
        StringBuilder op = new StringBuilder();

        op.append("Mi nombre es ");
        op.append(nombre);
        op.append(".\nTengo una edad de ");
        op.append(edad).append(" y estoy corriendo en un Maraton.");

        System.out.println(op);

    }

    public void Correr(int kms) {
        System.out.println("He corrido " + kms + " Kilimetros.");
    }

}
