package ModificadoresDeAcceso;
//Modificadores de Acceso

public class Clase1 {

    //Atributos
    private int edad;
    private String nombre;

    //Metodo Setter: Establecer.
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodo Getter: Obtener
    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}
