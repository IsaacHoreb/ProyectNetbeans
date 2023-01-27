package Pila_EstaticaMemoria;

/**
 *
 * @author ISAAC HOREB
 */

public class Pilas {

    int vectorPila[];
    int cima;

    //Constructor
    public Pilas(int tamanio) {
        vectorPila = new int[tamanio];
        cima = -1;
    }

    //Metodo push
    public void empujar(int dato) {
        cima++;
        vectorPila[cima] = dato;
    }

    //Metodo pop
    public int sacar() {
        int fuera = vectorPila[cima];
        cima--;
        return fuera;
    }

    //Metodo saber pilaVacia
    public boolean estaVacia() {
        return cima == -1;
    }

    //Metodo saber pilaLlena
    public boolean pillaLlena() {
        return vectorPila.length - 1 == cima;
    }

    //Metodo para saber que el elemento se encuentra en la cima
    public int cimaPila() {
        return vectorPila[cima];
    }

    //Metodo saber tamaño
    public int tamanioPila() {
        return vectorPila.length;
    }

}
