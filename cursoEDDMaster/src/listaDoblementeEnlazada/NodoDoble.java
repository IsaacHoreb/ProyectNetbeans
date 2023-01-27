package listaDoblementeEnlazada;

public class NodoDoble {

    public int dato;  //Datos del Nodo
    NodoDoble siguiente, anterior; //Puntos de enlaces

    //Constructor cuando no hay Nodo
    public NodoDoble(int d) {
        this(d, null, null);
    }

    //Contructor cuando hay nodo
    public NodoDoble(int d, NodoDoble s, NodoDoble a) {
        dato = d;
        siguiente = s;
        anterior = a;
    }

}
