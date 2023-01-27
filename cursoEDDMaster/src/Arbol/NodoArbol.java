package Arbol;

public class NodoArbol {

    int dato;
    NodoArbol hijoIzquierdo, hijoDerecho;

    public NodoArbol(int dato) {
        this.dato = dato;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

}
