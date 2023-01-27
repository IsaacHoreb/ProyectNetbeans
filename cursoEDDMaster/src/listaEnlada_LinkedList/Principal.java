package listaEnlada_LinkedList;

import java.util.LinkedList;

public class Principal {

    public static void main(String[] args) {
        //Importamos
        LinkedList listita = new LinkedList();

        //Añadimos datos
        listita.add(10);
        listita.add(20);
        listita.add(30);
        listita.add(40);
        listita.add(50);
        listita.add(60);

        int tamanio = listita.size();
        int i = 0;
        while (i < tamanio) {
            System.out.print(" [ " + listita.get(i) + " ] -->");
            i++;
        }

        listita.remove(2);
        i = 0;
        tamanio = listita.size();
        System.out.println("");
        while (i < tamanio) {
            System.out.print(" [ " + listita.get(i) + " ] -->");
            i++;
        }

    }

}
