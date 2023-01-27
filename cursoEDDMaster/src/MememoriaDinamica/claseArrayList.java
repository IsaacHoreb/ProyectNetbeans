package MememoriaDinamica;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class claseArrayList {
    
    public static void main(String[] args) {
        //ESTA ES OTRA MANERA DE ESCRIBIRLO
        //ArrayList <String> frase = new ArrayList<String>();
        
        ArrayList<String> cadena; //Creamos un objeto de instancia de tipo ArrayList

        cadena = new ArrayList<>();

        String frase,respuesta;

        do {
            frase = JOptionPane.showInputDialog(null,"Ingresa alguna frase crack:");
            //Agregando la frase a la lista
            cadena.add(frase);
            respuesta = JOptionPane.showInputDialog(null,"¿Deseas agragar otra frase (SI/NO)?");
            
            //Convertir x cadena a mayuscula
            respuesta = respuesta.toUpperCase();
            
        } while (!respuesta.equals("NO"));
        
        //Mostrando el contenido de las cadenas
        System.out.println("Frases originales");
        for (int i = 0; i < cadena.size(); i++) {
            System.out.println(cadena.get(i));
        }
        
        //Utilizando el metodo Set
        System.out.println("");
        cadena.set(1,"La que cambié");
        System.out.println("");
        
        //Mostrando el contenido de las cadenas Modificadas
        System.out.println("");
        System.out.println("Frases Modificadas");
        for (int i = 0; i < cadena.size(); i++) {
            System.out.println(cadena.get(i));
        }
        
        //Metodo Remove
        cadena.remove(0);
        //Mostrando el contenido de las cadenas Modificadas
        System.out.println("");
        System.out.println("Frases que quedan");
        for (int i = 0; i < cadena.size(); i++) {
            System.out.println(cadena.get(i));
        }
        
    }
    
}
