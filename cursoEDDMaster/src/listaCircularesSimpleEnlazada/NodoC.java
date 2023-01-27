package listaCircularesSimpleEnlazada;

public class NodoC {

    int datos;
    NodoC siguiente;

    //Constructor
    public NodoC(int d) {
        datos = d;
        siguiente = this;
    }

}
