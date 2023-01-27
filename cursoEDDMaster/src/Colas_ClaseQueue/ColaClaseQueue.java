package Colas_ClaseQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ColaClaseQueue {

    public static void main(String[] args) {

        Queue<Integer> colita = new LinkedList<>();

        colita.add(10);
        colita.add(20);
        colita.add(30);
        colita.add(40);
        colita.add(50);

        //Para saber el inicio de la cola
        System.out.println("El inicio de la Cola es " + colita.peek());

        while (!colita.isEmpty()) {
            System.out.println("Despachando al elemento " + colita.remove());
        }

    }

}
