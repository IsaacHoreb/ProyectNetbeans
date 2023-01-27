package ClasesY_MetodosAbstractos;

//SUPER CLASE
//UNA CLASE ABSTRACTA CONTIENE AL MENOS UN METODO QUE NO HA SIDO 
//ESPESIFICADO, ES DECIR, ESTE SERÁ HEREDADO PARA SOBREESCRIBIRSE.

//Haciendo la clase abstracta para evitar que sea Instanciada
public abstract class Persona {

    String nombre;
    int edad;

    public Persona(String nom, int ed) {
        this.nombre = nom;
        this.edad = ed;
    }

    //Creando el metodo abstracto
    abstract public void verDatos();
    
    
}
