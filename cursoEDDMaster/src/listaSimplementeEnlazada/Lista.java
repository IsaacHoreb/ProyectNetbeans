//SEGUNDO
package listaSimplementeEnlazada;

import javax.swing.JOptionPane;

public class Lista {

    protected Nodo inicio, fin; //Punteros para saber donde está el inicio y fin

    public Lista() {
        inicio = null;
        fin = null;
    }

    //Metodo para saber si la lista esta vacia
    public boolean estaVacia() {
        return inicio == null;
    }

    //Metodo para agregar un nodo al inicio de la lista
    public void agregarAlInicio(int elemento) {
        //Creando el Nodo
        inicio = new Nodo(elemento, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }

    //Metodo para agregar un nodo al final de la lista
    public void agregarAlfinal(int elemento) {
        //Si eno esta vacia checar
        if (!estaVacia()) {
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
            inicio = null;
            fin = null;
        } else {
            inicio = inicio.siguiente;
        }
        return elemento;
    }

    //Metodo de borrado Nodo Final
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

    //Metodo para eliminar un Nodo en especifico
    public void borrardoEpc(int elemento) {

        if (!estaVacia()) {

            if (inicio == fin && elemento == inicio.dato) {   //En caso de haber 1 solo Nodo
                inicio = fin = null;
            } else if (elemento == inicio.dato) {  //En caso de haber 2 o mas Nodo
                inicio = inicio.siguiente;
            } else {
                Nodo anterior, temporal;
                anterior = inicio;
                temporal = inicio.siguiente;

                while (temporal != null && temporal.dato != elemento) {
                    anterior = anterior.siguiente;
                    temporal = temporal.siguiente;
                }

                if (temporal != null) {
                    anterior.siguiente = temporal.siguiente;
                    if (anterior == fin) {
                        fin = anterior;
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No Existen Elementos");
        }
    }

    //Metodo para buscar un Elemento
    public boolean estaEnLaLista(int elemento) {
        Nodo temporal = inicio;
        while (temporal != null && temporal.dato != elemento) {
            temporal = temporal.siguiente;
        }
        return temporal != null;
    }

    //Metodos para mostrar los datos
    public void mostrarLista() {

        Nodo recorrer = inicio;

        System.out.println();

        while (recorrer != null) {
            System.out.print("[ " + recorrer.dato + " ]------->");
            recorrer = recorrer.siguiente;
        }

    }

}
