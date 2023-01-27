package Constante;

public class Persona {

    private final String nombre;    //El Final es para crear una constante en el programa
    private int edad;

    //Constructores
    public Persona(String Nombre, int Edad) {
        this.nombre = Nombre;
        this.edad = Edad;
    }

    public void mostrarDatos() {
        System.out.println("El nombre es = " + nombre);
        System.out.println("La edad es = " + edad);
    }

    //Metodos Get and Set
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    
    
    
    
    
}
