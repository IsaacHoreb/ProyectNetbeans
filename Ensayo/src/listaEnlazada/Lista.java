package listaEnlazada;

public class Lista {

    protected Nodo inicio, fin;

    //Constructor
    public Lista() {
        inicio = null;
        fin = null;
    }

    //Metodo para saber si esta vacio
    public boolean estaVacio() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    //Metodo para agregar un nodo al inicio de la lista
    public void agregarInicio(int elemento) {
        //Crear el Nodo
        inicio = new Nodo(elemento, inicio);
        if (inicio == null) {
            fin = inicio;
        }
    }

    //Metodo para agregar un nodo al final de la lista
    public void agregarFinal(int elemento) {
        //Si eno esta vacia checar
        if (!estaVacio()) {
            fin.siguiente = new Nodo(elemento);
            fin = fin.siguiente;
        } else {
            inicio = fin = new Nodo(elemento);
        }
    }

    //Metodo de borrado Nodo inicio
    public int borrarInicio() {

        int elemento = inicio.dato;

        if (inicio == fin) {
            inicio = fin = null;
        } else {
            inicio = inicio.siguiente;
        }
        return elemento;
    }

    //Metodo de borrado Nodo inicio
    public int borrarFinal() {
        int elemento = fin.dato;

        if (inicio == fin) {
            inicio = fin = null;
        } else {
            Nodo temporal = inicio;
            while (temporal.siguiente != fin) {
                temporal = temporal.siguiente;
            }
            fin = temporal;
            fin.siguiente = null;
        }

        return elemento;

    }

    //Metodos para mostrar los datos
    public void mostrarLista() {
        Nodo recorrer = inicio;

        System.out.println("");

        while (recorrer != null) {
            System.out.print("[" + recorrer.dato + "]--------> ");
            recorrer = recorrer.siguiente;
        }

    }

}
