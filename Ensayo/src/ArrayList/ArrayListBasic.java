package ArrayList;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ISAAC HOREB
 */
public class ArrayListBasic {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList();

        al.add(10);
        al.add(230);
        al.add(1340);
        al.add(4);
        al.add(50);
        al.add(12);
        al.add(132);

        JOptionPane.showMessageDialog(null, "ARRAYLIST ESTABLECIDOS", "Mensaje", JOptionPane.WARNING_MESSAGE);

        JOptionPane.showMessageDialog(null, "AL es=\n" + al);

        JOptionPane.showMessageDialog(null, "VACIO O NO VACIO");

        boolean estaVacia = al.isEmpty();

        if (estaVacia) {
            JOptionPane.showMessageDialog(null, "Esta vacia");
        } else {
            JOptionPane.showMessageDialog(null, "No esta vacia");
        }

        JOptionPane.showMessageDialog(null, "SABER EL VALOR DE UNA POSICION", "Mensaje", JOptionPane.WARNING_MESSAGE);

        int z = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la posicion que desea obtener\nsu valor ="));

        if (z > al.size()) {
            JOptionPane.showMessageDialog(null, "No se puede pasar de la longitud");
            z = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la posicion que desea obtener\nsu valor ="));
            JOptionPane.showMessageDialog(null, "El elemento " + z + " contiene el valor =\n" + al.get(z));
        } else {
            JOptionPane.showMessageDialog(null, "El elemento " + z + " contiene el valor =\n" + al.get(z));
        }

        JOptionPane.showMessageDialog(null, "COMPROBAR EXISTENCIA", "Mensaje", JOptionPane.WARNING_MESSAGE);

        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor que desea saber si existe =\n"));

        al.contains(a);

        if (estaVacia) {
            JOptionPane.showMessageDialog(null, "El elemento " + a + "si existe");
        } else {
            JOptionPane.showMessageDialog(null, "El elemento " + a + "no existe");
        }

        JOptionPane.showMessageDialog(null, "AGREGAR ELEMENTO EN UNA POSICIO QUE DESEA", "Mensaje", JOptionPane.WARNING_MESSAGE);

        int L = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la posicio para agregar nuevo elemento"));
        int LL = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor"));

        al.add(L, LL);

        JOptionPane.showMessageDialog(null, "La nuerva Al con los cambios correspondiente =\n" + al);

        JOptionPane.showMessageDialog(null, "ELIMINAR UN ELEMENTO QUE SE DESEA", "Mensaje", JOptionPane.WARNING_MESSAGE);

        int zx = Integer.parseInt(JOptionPane.showInputDialog(null, "Eliga el elemento a eliminar\nIngresa el Index ="));
        al.remove(zx);

        JOptionPane.showMessageDialog(null, "La nuerva Al con los cambios correspondiente =\n" + al);

    }

}
