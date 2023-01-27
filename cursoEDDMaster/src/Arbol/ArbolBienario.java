package Arbol;

public class ArbolBienario {

    NodoArbol raiz;

    public ArbolBienario() {
        raiz = null;
    }

    //Metodo para insertar un Nodo en el Árbol
    public void agregarNodo(int d) {
        NodoArbol nuevo = new NodoArbol(d);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            NodoArbol auxiliar = raiz;
            NodoArbol padre;
            while (true) {
                padre = auxiliar;
                if (d < auxiliar.dato) {
                    auxiliar = auxiliar.hijoIzquierdo;
                    if (auxiliar == null) {
                        padre.hijoIzquierdo = nuevo;
                        return;
                    }
                } else {
                    auxiliar = auxiliar.hijoDerecho;
                    if (auxiliar == null) {
                        padre.hijoDerecho = nuevo;
                        return;
                    }
                }
            }
        }
    }

    //Metodo pasa saber cuando el arbol esta vacio
    public boolean estaVacio() {
        return raiz == null;
    }

    //Metodo para recorrer el arbol InOrden
    public void inOrden(NodoArbol r) {
        if (r != null) {
            inOrden(r.hijoIzquierdo);
            System.out.print(r.dato + ", ");
            inOrden(r.hijoDerecho);
        }
    }

    //Metodo para recorrer el arbol PreOrden
    public void preOrden(NodoArbol r) {
        if (r != null) {
            System.out.print(r.dato + ", ");
            preOrden(r.hijoIzquierdo);
            preOrden(r.hijoDerecho);
        }
    }

    //Metodo para recorrer el arbol PosOrden
    public void posOrden(NodoArbol r) {
        if (r != null) {
            posOrden(r.hijoIzquierdo);
            posOrden(r.hijoDerecho);
            System.out.print(r.dato + ", ");
        }
    }

    //Metodo para buscar un Nodo en el Arbo
    public NodoArbol buscar(int d) {
        NodoArbol aux = raiz;
        while (aux.dato != d) {
            if (d < aux.dato) {
                aux = aux.hijoIzquierdo;
            } else {
                aux = aux.hijoDerecho;
            }
            if (aux == null) {
                return null;
            }
        }
        return aux;
    }

    //Metodo para eliminar un Nodo del Arbol 
    public boolean eliminar(int d) {
        NodoArbol auxiliar = raiz;
        NodoArbol padre = raiz;
        boolean esHijoIzquierdo = true;
        while (auxiliar.dato != d) {
            padre = auxiliar;
            if (d < auxiliar.dato) {
                esHijoIzquierdo = true;
                auxiliar = auxiliar.hijoIzquierdo;
            } else {
                esHijoIzquierdo = false;
                auxiliar = auxiliar.hijoDerecho;
            }
            if (auxiliar == null) {
                return false;
            }
        }//Fin del while
        if (auxiliar.hijoIzquierdo == null && auxiliar.hijoDerecho == null) {
            if (auxiliar == raiz) {
                raiz = null;
            } else if (esHijoIzquierdo) {
                padre.hijoIzquierdo = null;
            } else {
                padre.hijoDerecho = null;
            }
        } else if (auxiliar.hijoDerecho == null) {
            if (auxiliar == raiz) {
                raiz = auxiliar.hijoIzquierdo;
            } else if (esHijoIzquierdo) {
                padre.hijoIzquierdo = auxiliar.hijoIzquierdo;
            } else {
                padre.hijoDerecho = auxiliar.hijoIzquierdo;
            }
        } else if (auxiliar.hijoIzquierdo == null) {
            if (auxiliar == raiz) {
                raiz = auxiliar.hijoDerecho;
            } else if (esHijoIzquierdo) {
                padre.hijoIzquierdo = auxiliar.hijoDerecho;
            } else {
                padre.hijoDerecho = auxiliar.hijoIzquierdo;
            }
        } else {
            NodoArbol reemplazo = obtenerNodoReemplazo(auxiliar);
            if (auxiliar == raiz) {
                raiz = reemplazo;
            } else if (esHijoIzquierdo) {
                padre.hijoIzquierdo = reemplazo;
            } else {
                padre.hijoDerecho = reemplazo;
            }
            reemplazo.hijoIzquierdo = auxiliar.hijoIzquierdo;
        }
        return true;
    }

    //Metodo encargado devolverno reemplazo
    public NodoArbol obtenerNodoReemplazo(NodoArbol nodoReemp) {
        NodoArbol reemplazarPadre = nodoReemp;
        NodoArbol reemplazo = nodoReemp;
        NodoArbol auxiliar = nodoReemp.hijoDerecho;
        while (auxiliar != null) {
            reemplazarPadre = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.hijoIzquierdo;
        }
        if (reemplazo != nodoReemp.hijoDerecho) {
            reemplazarPadre.hijoIzquierdo = reemplazo.hijoDerecho;
            reemplazo.hijoDerecho = nodoReemp.hijoDerecho;
        }
        System.out.println("El nodo del reemplazo es: " + reemplazo);
        return reemplazo;
    }
}
