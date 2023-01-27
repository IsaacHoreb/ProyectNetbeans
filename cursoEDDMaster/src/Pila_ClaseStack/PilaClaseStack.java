package Pila_ClaseStack;

//1.- Importar la libreria
import java.util.Stack;

public class PilaClaseStack {

    public static void main(String[] args) {

        //2.- Creamos la instancia
        Stack pilita = new Stack();

        //Agregar elemento
        pilita.add(10);
        pilita.add(20);
        pilita.add(30);
        pilita.add(40);
        pilita.add(50);

        //Sacar el Tamaño de la pila
        System.out.println("Tamaño de la pila: " + pilita.size());

        //Devuelve la cima
        System.out.println("La Cima es: " + pilita.peek());
        
        //SACAR ELEMENTO DE LA PILA
        System.out.println("Sacando un elemento de la pila: " + pilita.pop());
        System.out.println("Sacando un elemento de la pila: " + pilita.pop());
        System.out.println("Sacando un elemento de la pila: " + pilita.pop());

        //Sacar el Tamaño de la pila
        System.out.println("Tamaño de la pila: " + pilita.size());
        System.out.println("La pila esta llena: " + pilita.isEmpty());

    }

}
