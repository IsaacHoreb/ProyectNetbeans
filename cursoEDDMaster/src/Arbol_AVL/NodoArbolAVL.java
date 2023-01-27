package Arbol_AVL;

public class NodoArbolAVL {

    int dato, FE;
    NodoArbolAVL hijoIzquierdo, hijoDerecho;

    public NodoArbolAVL(int d) {
        this.dato = d;
        this.FE = 0;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

}
