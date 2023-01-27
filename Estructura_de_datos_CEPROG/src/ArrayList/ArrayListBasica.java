package ArrayList;

/**
 *
 * @author ISAAC
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import javax.swing.JOptionPane;

public class ArrayListBasica {

    public static void main(String args[]) {
        //Crear y declarae la ArrayList
        ArrayList<String> al = new ArrayList();

        //1.- Añadir elementos a la ArrayList
        al.add("JAVA");
        al.add("C#");
        al.add("C");
        al.add("C++");
        al.add("PHP");

//        String op = "";
//        op = JOptionPane.showInputDialog(null, "¿Desea ingresar un dato?\n SI / NO?");
//        
//        do{
//            al.add(JOptionPane.showInputDialog(null,"Ingresa un lenguaje de programacion:"));
//            op = JOptionPane.showInputDialog(null,"¿Desea ingresar un dato?\n SI / NO?");
//        }while(!op.equalsIgnoreCase("no"));
        //FUNCIONES DENTRO O PARTE DE UNA ARRAYLIST
        //1.- Imprimir la ArrayList
        JOptionPane.showMessageDialog(null, al);

        //2.- Obtener un elementos de una pocision en especifico
        JOptionPane.showMessageDialog(null, "El elemento en la pocision 4 es:\n" + al.get(4));

        //3.- Verificar si el Array List esta vacia
        JOptionPane.showMessageDialog(null, "¿La lista esta Vacia? " + al.isEmpty());

        boolean alVacia = al.isEmpty();
        if (alVacia) {
            JOptionPane.showMessageDialog(null, "La lista esta Vacia");
        } else {
            JOptionPane.showMessageDialog(null, "La lista No esta Vacia");
        }

        //4.- Verificar la longitud de la Array List
        JOptionPane.showMessageDialog(null, "La dimensión de la AL es: " + al.size() + " elementos");

        //5.- Verificar si un elemento existe dentro de la Array List
        String palabra = JOptionPane.showInputDialog(null, "ingresa un lenguaje a buscar");

        //comparar dos cadenas y determinar si son iguales
        if (palabra.equals("c++")) {
            palabra = "C++";
        }

        alVacia = al.contains(palabra);
        if (alVacia) {
            JOptionPane.showMessageDialog(null, "El elemento C++ si exite  en la AL");
        } else {
            JOptionPane.showMessageDialog(null, "El elemento C++ NO exite en la AL");
        }

        //6.- Insertar un elemento en una posicion en especifico de la Array List
        al.add(1, "JAVA SCRIPT");
        JOptionPane.showMessageDialog(null, al);

        //7.- Insertar varios elementos adicionales a Arrays List 
        List<String> lista = new ArrayList();
        lista.add("HTML");
        lista.add("CSS");
        lista.add("PYTHON");

        al.addAll(lista);

        JOptionPane.showMessageDialog(null, "La nueva AL es:\n" + al);

        //8.- Obtener varios elementos de la Array List
        lista = al.subList(2, 5);
        JOptionPane.showMessageDialog(null, "Una sublista de la AL es:\n" + lista);

//     //9.- Invertir el orden de elementos en el ArrayList
//       
//       Collections.reverse(al);
//       
//       JOptionPane.showMessageDialog(null, "Array List invertida:\n"+al);
//       
//     //10.- Sortear los elementos en el Array List
//       
//       Collections.shuffle(al);
//       
//       JOptionPane.showMessageDialog(null, "Array List sorteado:\n"+al);
        //11.- Intercabiar dos elementos en la Array List
        Collections.swap(al, 1, 5);
        JOptionPane.showMessageDialog(null, "Array List sorteado:\n" + al);

        //12.- verificar la existencia de varios elemento en un ArraList   
        List<String> lista2 = new ArrayList();
        lista2.add("JAVA");
        lista2.add("PHP");

        boolean elementos = al.containsAll(lista2);

        if (elementos) {
            JOptionPane.showMessageDialog(null, "Los elementos si estan");
        } else {
            JOptionPane.showMessageDialog(null, "Los elementos NO estan");
        }
//       
//       
//     //13.- Clonacion de una Array List
        ArrayList<String> alClon = (ArrayList<String>) al.clone();

        JOptionPane.showMessageDialog(null, "La AL clonada es:\n" + alClon);

    }
}
