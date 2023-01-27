package listaSimplementeEnlazada;

//PRIMERO
public class Nodo {

    public int dato;
    public Nodo siguiente;  //Puntero Enlace

//Constructor para Insertar al Inicio
    public Nodo(int d, Nodo n) {
        dato = d;
        siguiente = n;
    }

//Constructor para insertar al Final
    public Nodo(int d) {
        this.dato = d;
        this.siguiente = null;
    }

}
