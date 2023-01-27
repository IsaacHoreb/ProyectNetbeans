package Arbol_AVL;
  
public class ArbolAVL {

    protected NodoArbolAVL raiz;

    //Constructor de Raiz
    public ArbolAVL() {
        this.raiz = null;
    }

    //Obtener Nodo Raiz
    public NodoArbolAVL obtenerRaiz() {
        return raiz;
    }

    //Buscar
    public NodoArbolAVL buscar(int d, NodoArbolAVL r) {
        if (raiz == null) {
            return null;
        } else if (r.dato == d) {
            return r;
        } else if (r.dato < d) {
            return buscar(d, r.hijoDerecho);
        } else {
            return buscar(d, r.hijoIzquierdo);
        }
    }

    //Obtener el factor de equilibrio
    public int obtenerFE(NodoArbolAVL x) {
        if (x == null) {
            return -1;
        } else {
            return x.FE;
        }
    }

    //Rotacion simple Izquierda
    public NodoArbolAVL rotacionIzquierda(NodoArbolAVL c) {
        NodoArbolAVL aux = c.hijoIzquierdo;
        c.hijoIzquierdo = aux.hijoDerecho;
        aux.hijoDerecho = c;
        c.FE = Math.max(obtenerFE(c.hijoIzquierdo), obtenerFE(c.hijoDerecho)) + 1;
        aux.FE = Math.max(obtenerFE(aux.hijoIzquierdo), obtenerFE(aux.hijoDerecho)) + 1;
        return aux;
    }

    //Rotacion simple Derecha
    public NodoArbolAVL rotacionDerecha(NodoArbolAVL d) {
        NodoArbolAVL aux = d.hijoDerecho;
        d.hijoDerecho = d.hijoIzquierdo;
        aux.hijoIzquierdo = d;
        d.FE = Math.max(obtenerFE(d.hijoIzquierdo), obtenerFE(d.hijoDerecho)) + 1;
        aux.FE = Math.max(obtenerFE(aux.hijoIzquierdo), obtenerFE(aux.hijoDerecho)) + 1;
        return aux;
    }

    //Rotacion Doble a la Derecha
    public NodoArbolAVL rotacionDobleIzquierda(NodoArbolAVL c) {
        NodoArbolAVL temporal;
        c.hijoIzquierdo = rotacionDerecha(c.hijoIzquierdo);
        temporal = rotacionIzquierda(c);
        return temporal;
    }

    //Rotacion Doble a la Izquierda
    public NodoArbolAVL rotacionDobleDerecha(NodoArbolAVL c) {
        NodoArbolAVL temporal;
        c.hijoDerecho = rotacionDobleIzquierda(c.hijoDerecho);
        temporal = rotacionDerecha(c);
        return temporal;
    }

    //Metodo para insertar AVL
    public NodoArbolAVL insetarAVL(NodoArbolAVL nuevo, NodoArbolAVL subArb) {
        NodoArbolAVL nuevoPadre = subArb;
        if (nuevo.dato < subArb.dato) {
            if (subArb.hijoIzquierdo == null) {
                subArb.hijoIzquierdo = nuevo;
            } else {
                subArb.hijoIzquierdo = insetarAVL(nuevo, subArb.hijoIzquierdo);
                if ((obtenerFE(subArb.hijoIzquierdo) - obtenerFE(subArb.hijoDerecho) == 2)) {
                    if (nuevo.dato < subArb.hijoIzquierdo.dato) {
                        nuevoPadre = rotacionIzquierda(subArb);
                    } else {
                        nuevoPadre = rotacionDobleIzquierda(subArb);
                    }
                }
            }
        } else if (nuevo.dato > subArb.dato) {
            if (subArb.hijoDerecho == null) {
                subArb.hijoDerecho = nuevo;
            } else {
                subArb.hijoDerecho = insetarAVL(nuevo, subArb.hijoDerecho);
                if ((obtenerFE(subArb.hijoDerecho) - obtenerFE(subArb.hijoIzquierdo) == 2)) {
                    if (nuevo.dato > subArb.hijoDerecho.dato) {
                        nuevoPadre = rotacionDerecha(subArb);
                    } else {
                        nuevoPadre = rotacionDobleDerecha(subArb);
                    }
                }
            }
        } else {
            System.out.println("Nodo Duplicado");
        }

        //Actualizando la altura
        if (((subArb.hijoIzquierdo == null) && (subArb.hijoDerecho != null))) {
            subArb.FE = subArb.hijoDerecho.FE + 1;
        } else if (((subArb.hijoDerecho == null) && (subArb.hijoIzquierdo != null))) {
            subArb.FE = subArb.hijoIzquierdo.FE + 1;
        } else {
            subArb.FE = Math.max(obtenerFE(subArb.hijoIzquierdo), obtenerFE(subArb.hijoDerecho)) + 1;
        }
        return nuevoPadre;
    }

    //Metodo para insertar
    public void insertar(int d) {
        NodoArbolAVL nuevo = new NodoArbolAVL(d);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            raiz = insetarAVL(nuevo, raiz);
        }
    }

    //Recorrido
    //Metodo para recorrer el arbol InOrden
    public void inOrden(NodoArbolAVL r) {
        if (r != null) {
            inOrden(r.hijoIzquierdo);
            System.out.print(r.dato + ", ");
            inOrden(r.hijoDerecho);
        }
    }

    //Metodo para recorrer el arbol PreOrden
    public void preOrden(NodoArbolAVL r) {
        if (r != null) {
            System.out.print(r.dato + ", ");
            preOrden(r.hijoIzquierdo);
            preOrden(r.hijoDerecho);
        }
    }

    //Metodo para recorrer el arbol PosOrden
    public void posOrden(NodoArbolAVL r) {
        if (r != null) {
            posOrden(r.hijoIzquierdo);
            posOrden(r.hijoDerecho);
            System.out.print(r.dato + ", ");
        }
    }
}
