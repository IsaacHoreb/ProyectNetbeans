package Pila_DinamicaMemoria;

public class Pila {

    private NodoPila cima;
    int tamanio;

    //Constructor
    public Pila() {
        cima = null;
        tamanio = 0;
    }

    //Metodo para saber si pila vacia
    public boolean estaVacia() {
        return cima == null;
    }

    //Metodo para insertar/empujar elemento
    public void empujar(int elemento) {
        NodoPila nuevo = new NodoPila(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamanio++;
    }

    //Metodo para sacar elemento
    public int sacar() {
        int auxiliar = cima.dato;
        cima = cima.siguiente;
        tamanio--;
        return auxiliar;
    }

    //Metodo para saber quien esta en la cima
    public int cima() {
        return cima.dato;
    }

    //Metodo para saber el tamaño de Pila
    public int tamanioPila() {
        return tamanio;
    }

    //Metodo para limpiar/vaciar
    public void limpiarPila() {
        while (!estaVacia()) {
            sacar();
        }
    }

}
