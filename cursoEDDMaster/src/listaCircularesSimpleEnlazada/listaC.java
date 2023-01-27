package listaCircularesSimpleEnlazada;

public class listaC {

    NodoC ultimo;

    //Constructor
    public listaC() {
        ultimo = null;
    }

    //Método para saber cuando la lista esta Vacia
    public boolean estaVacia() {
        return ultimo == null;
    }

    //Metodo para insertar Nodo
    public listaC insertar(int elemento) {
        NodoC nuevo = new NodoC(elemento);
        if (ultimo != null) {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        } else {
            ultimo = nuevo;
        }

        return this;
    }

    //Metodo para eliminar Nodo
    public boolean eliminar(int elemento) {
        NodoC actual;
        boolean encontrado = false;
        actual = ultimo;
        while (actual.siguiente != ultimo && !encontrado) {
            encontrado = (actual.siguiente.datos == elemento);
            if (!encontrado) {
                actual = actual.siguiente;
            }
        }
        encontrado = (actual.siguiente.datos == elemento);
        if (encontrado) {
            NodoC auxiliar = actual.siguiente;
            if (ultimo == ultimo.siguiente) {
                ultimo = null;
            } else {
                if (auxiliar == ultimo) {
                    ultimo = actual;
                }
                actual.siguiente = auxiliar.siguiente;
            }
            auxiliar = null;
        }
        return encontrado == true;
    }

    //Metodo para mostrarLista
    public void mostarLista() {
        NodoC auxiliar = ultimo.siguiente;
        String cadena = "";

        do {
            cadena += " [ " + auxiliar.datos + " ] --- > ";
            auxiliar = auxiliar.siguiente;
        } while (auxiliar != ultimo.siguiente);

        System.out.println(cadena);
        //JOptionPane.showMessageDialog(null, cadena, "Mostrando la Lista Circular", JOptionPane.INFORMATION_MESSAGE);
    }

}
