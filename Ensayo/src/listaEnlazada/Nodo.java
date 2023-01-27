package listaEnlazada;

public class Nodo {

    public int dato;
    public Nodo siguiente; //punto enlace

    //Nodo del inicio
    public Nodo(int d, Nodo n) {
        this.dato = d;
        this.siguiente = n;
    }

    //Nodo del final
    public Nodo(int d) {
        this.dato = d;
        this.siguiente = null;
    }

}
