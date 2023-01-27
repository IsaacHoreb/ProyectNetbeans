package Colas;

/**
 *
 * @author ISAAC HOREB
 */

public class Cola {

    NodoCola inicio, fin;
    int tamanio;

    public Cola() {
        inicio = null;
        fin = null;
        tamanio = 0;
    }

    //SABER SI ESTA VACIA
    public boolean estaVacia() {
        return inicio == null;
    }

    //INSERTAR 
    public void Insertar(int elemento) {
        NodoCola nuevo = new NodoCola(elemento);
        if (estaVacia()) {
            inicio = nuevo;
        } else {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tamanio++;
    }
    
    //Quitar
    public int Quitar(){
        int aux = inicio.dato;
        inicio = inicio.siguiente;
        tamanio--;
        return aux;
    }
    
    //Saber quien esta al inicio
    public int InicioCola(){
        return inicio.dato;
    }
    
    //Tamaño
    public int tamanioCola(){
        return tamanio;
    }
    
    
    
    
    

}
