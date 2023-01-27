package Arrays;

import javax.swing.JOptionPane;

public class convinarDosArray {

    public static void main(String[] args) {
        
        //Declaramos 3 array
        int a[], b[], c[];

        //Inicilisamos los array
        a = new int[10];
        b = new int[10];
        c = new int[20];

        //Pedimos el arreglo a
        JOptionPane.showMessageDialog(null, "Digite el primer Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero = " + i));
        }

        //Modelamos el array a
        String arregloF1 = "[ ";
        for (int i = 0; i < a.length; i++) {
            arregloF1 += a[i] + ", ";
        }
        arregloF1 += " ]";

        //Pedimos el arreglo b
        JOptionPane.showMessageDialog(null, "Digite el segundo Array");
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero = " + i));
        }

        //Modelando el array b
        String arregloF2 = "[ ";
        for (int i = 0; i < b.length; i++) {
            arregloF2 += b[i] + ", ";
        }
        arregloF2 += " ]";

        //Convinamos el array  a y b
        int j = 0;
        for (int i = 0; i < 10; i++) {
            c[j] = a[i]; //1*A, 2*A
            j++;
            c[j] = b[i]; //1*B, 2*B
            j++;
        }

        //Modelando el array C
        String arregloF3 = "[ ";
        for (int i = 0; i < c.length; i++) {
            arregloF3 += c[i] + ", ";
        }
        arregloF3 += " ]";

        //Imprimir con un StringBuilder
        StringBuilder arr = new StringBuilder();

        arr.append("El arreglo convinado es =\n");
        arr.append("Array a =\n");
        arr.append(arregloF1);
        arr.append("\nArray b =\n");
        arr.append(arregloF2);
        arr.append("\nArray c =\n");
        arr.append(arregloF3);

        //Imprimir ya con un JOtionPane
        JOptionPane.showMessageDialog(null, arr);

        //JOptionPane.showMessageDialog(null, "El arreglo C convinado es =\n" + arregloF1 + "\n" + arregloF2
        //        + "\n" + arregloF3, "Arreglo convinado", 3);
    
    }

}
