package Herencia;

public class Estudiante extends Persona {

    private int codigoEstudiante;
    private float notaFinal;

    //Constructor de la clase hija
    public Estudiante(String nombre, String apellidos, int edad, int codigoEstudiante, float notaFinal) {
        //Esta palabra sirve para decirle que estas palabras
        //Ya estaban inicializado
        super(nombre, apellidos, edad);

        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public void mostradDatos() {

        StringBuilder op = new StringBuilder();

        op.append("Nombre = ");
        op.append(getNombre());
        op.append("\nApellidos = ");
        op.append(getApellidos());
        op.append("\nEdad = ");
        op.append(getEdad());
        op.append("\nCodigo estudiante = ");
        op.append(codigoEstudiante);
        op.append("\nNota final = ");
        op.append(notaFinal);

        System.out.println(op);
    }

}
