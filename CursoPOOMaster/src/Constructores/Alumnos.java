package Constructores;

public class Alumnos {

    //Atributos
    int noControl;
    String nombre, apellidos;

    //Metodo Constructor
    public Alumnos(int nc, String nm, String ap) {
        //Inicializando los atributos
//        noControl = nc;
//        nombre = nm;
//        apellidos = ap;
        //Otra forma
        this.noControl = nc;
        this.nombre = nm;
        this.apellidos = ap;

    }

    //Metodos
    void verDatos() {
        System.out.println("NO. Control: " + noControl);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido " + apellidos);
        System.out.println("");
    }

}
