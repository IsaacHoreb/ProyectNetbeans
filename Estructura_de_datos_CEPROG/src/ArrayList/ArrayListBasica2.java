package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class ArrayListBasica2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();

        //1.- AÑADIR ELEMENTOS A AL
        String dato, respuesta;
        int intResp = 0;
        try {

            do {

                dato = JOptionPane.showInputDialog(null, "Ingresa alguna frase o nombre:");

                if (!validardatos(dato)) {
                    JOptionPane.showMessageDialog(null, "No es correcto ingresar numeros");
                    dato = JOptionPane.showInputDialog(null, "Ingresa alguna frase o nombre:");
                }

                //Convertir lo ingresado a Matuscula
                dato = dato.toUpperCase();

                //Agregando la frase a la lista
                al.add(dato);

                intResp = JOptionPane.showConfirmDialog(null, "¿Deseas agregar otra frase?", "Mensaje", JOptionPane.YES_NO_OPTION);

                //respuesta = JOptionPane.showInputDialog(null, "¿Deseas agragar otra frase (SI/NO)?",
                //        "MENSAJE IMPORTANTE", JOptionPane.WARNING_MESSAGE);
                //Convertir x cadena a mayuscula
                //respuesta = respuesta.toUpperCase();
            } while (intResp != 1);

            //Imprimir datos
            JOptionPane.showMessageDialog(null, "Los elementros ingresados son = \n" + al);

            //2.- Obtener valor de una posicion
            int p1 = 0;
            String decision = "";

            do {
                p1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese posicision deseada =\n"));

                //SI P1 ES MAYOR A LA LONGITUD
                if (p1 > al.size()) {
                    JOptionPane.showMessageDialog(null, "No se encontro la posicion\nIntentelo de nuevo");
                    p1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese posicision deseada =\n"));
                    JOptionPane.showMessageDialog(null, "La posicion " + p1 + " es =\n" + al.get(p1));
                } else {
                    JOptionPane.showMessageDialog(null, "La posicion " + p1 + " es =\n" + al.get(p1));
                }

                decision = JOptionPane.showInputDialog(null, "¿Deseas saber otra posicion?\n(SI/NO)");
                decision = decision.toUpperCase();

            } while (!decision.equals("NO"));

            //3.- Saber si la lista está vacia
            JOptionPane.showMessageDialog(null, "¿La lista está vacia?\n" + al.isEmpty());

            boolean alVacia = al.isEmpty();
            if (alVacia) {
                JOptionPane.showMessageDialog(null, "La lista está Vacia");
            } else {
                JOptionPane.showMessageDialog(null, "La lista No está vacia");
            }

            //4.- Verificar la longitud
            JOptionPane.showMessageDialog(null, "La dimencion del AL es de " + al.size() + "  Elementos");

            //5.- Verificar si un elemento existe dentro de la Array List
            String palabra = JOptionPane.showInputDialog(null, "Ingresa una frase\na buscar =");
            palabra = palabra.toUpperCase();

            //6.1- Verifica si el elemento ingresado no es un String
            if (validardatos(palabra)) {    //Si se cumple con los valores establecido hara los sig.

                //Verifica si el elemnto existe
                alVacia = al.contains(palabra);

                //Comparar dos cadenas y determinar si son iguales
                if (palabra.equals(palabra)) {
                    palabra = palabra;
                }

                if (alVacia) {
                    JOptionPane.showMessageDialog(null, "El elemento " + palabra + " SI existen en la Al");
                } else {
                    JOptionPane.showMessageDialog(null, "El elemento " + palabra + " NO existen en la Al");
                }

            } else {    //SI NO cumple con los valores establecido hara los sig.

                JOptionPane.showMessageDialog(null, "No se permite caracteres o numeros");
                palabra = JOptionPane.showInputDialog(null, "Ingresa una frase\na buscar =");
                palabra = palabra.toUpperCase();

                //Comparar dos cadenas y determinar si son iguales
                if (palabra.equals(palabra)) {
                    palabra = palabra;
                }

                if (alVacia) {
                    JOptionPane.showMessageDialog(null, "El elemento " + palabra + " SI existen en la Al");
                } else {
                    JOptionPane.showMessageDialog(null, "El elemento " + palabra + " NO existen en la Al");
                }

            }

            JOptionPane.showMessageDialog(null, "Los elemento siguen siendo = \n" + al);

            //7.- Insertar un elemento en una posicion en especifico de la Array List
            JOptionPane.showMessageDialog(null, "Insertar un elemento en una posicion en especifico de la Array List",
                    "Mensaje", JOptionPane.WARNING_MESSAGE);

            //Creo variables
            int pos = 0;
            String newdate, respuesta3;

            do {
                //Almacene los valores [Indice] establecido que se desea ccambiar
                pos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la posicion que desea modificar =\n",
                        "Mensaje", JOptionPane.ERROR_MESSAGE));

                //Almacena la frase dada
                newdate = JOptionPane.showInputDialog(null, "Ingresa la frase o dato =");
                //Convierte a mayuscul
                newdate = newdate.toUpperCase();
                //Agrega todos los datos al AL
                al.add(pos, newdate);
                //Decicion del Usuario si desea continuar    
                respuesta3 = JOptionPane.showInputDialog(null, "¿Desea agregar otra frase?\n(SI/NO)", "ERROR IMENSO",
                        JOptionPane.WARNING_MESSAGE);
                respuesta3 = respuesta3.toUpperCase(); //Mayuscula convertido

            } while (!respuesta3.equals("NO"));

            JOptionPane.showMessageDialog(null, "Te presento la nueva Al\n" + al);

            //8.- Metodo Remove un dato del AL
            JOptionPane.showMessageDialog(null, "Apartado para remover un elemento de un AL");

            int T = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el indice del elemento que desea eliminar"));

            al.remove(T);

            JOptionPane.showMessageDialog(null, "El nuevo AL con el Index seleccionado " + T + "\n para elimiar es = \n" + al);

            //10.- Insertar varios elementos adicionales a Arrays List
            List<String> lista = new ArrayList();
            JOptionPane.showMessageDialog(null, "Este apartado nuevo\nInsertar varios elementos adicionales a Arrays List", "Mensaje de Advertencia", JOptionPane.WARNING_MESSAGE);

            String dato2, respuesta2;

            do {
                dato2 = JOptionPane.showInputDialog(null, "Ingresa alguna frase o nombre:");

                //Convertir lo ingresado a Matuscula
                dato2 = dato2.toUpperCase();

                //Agregando la frase a la lista
                lista.add(dato2);
                respuesta2 = JOptionPane.showInputDialog(null, "¿Deseas agragar otra frase (SI/NO)?", "MENSAJE IMPORTANTE", JOptionPane.WARNING_MESSAGE);

                //Convertir x cadena a mayuscula
                respuesta2 = respuesta2.toUpperCase();

            } while (!respuesta2.equals("NO"));

            al.addAll(lista);

            JOptionPane.showMessageDialog(null, "La nueva AL es:\n" + al);

            //9.- Intercabiar dos elementos en la Array List
            JOptionPane.showMessageDialog(null, "Apartado para Intercambiar dos\nelementos especifico en nuestra AL", "Mensaje de Advertencia", JOptionPane.WARNING_MESSAGE);
            int T1, T2;

            T1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Eliga la 1ra posicion para intercambiar"));
            T2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Eliga la 2da posicion para intercambiar"));

            Collections.swap(al, T1, T2);

            JOptionPane.showMessageDialog(null, "Array List sorteado(Intercambiada de posicion) es = \n" + al);

            //11.- Obtener varios elementos de la Array List
            JOptionPane.showMessageDialog(null, "Este apartado es para obtener una Sublista del AL", "Mensaje Importante", JOptionPane.WARNING_MESSAGE);

            int pos1, pos2;

            pos1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la 1ra posicion de donde iniciara = \n"));
            pos2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la 2da posicion de donde terminara = \n"));

            lista = al.subList(pos1, pos2);

            JOptionPane.showMessageDialog(null, "La Sublista del AL es = \n" + lista);

//      //12- Invertir el orden de elementos en el ArrayList
//      Collections.reverse(al);
//      JOptionPane.showMessageDialog(null, "Array List invertida(Dereha-Izquierda):\n"+al);
            //13.- Sortear los elementos en el Array List
//       Collections.shuffle(al);       
//       JOptionPane.showMessageDialog(null, "Array List sorteado:\n"+al);        
            //14.- Verificar la existencia de varios elemento en un ArraList  
            List<String> lista2 = new ArrayList();
            JOptionPane.showMessageDialog(null, "Apartdao para Verificar la existencia\nde varios elemento en un ArraList", "Mensaje", JOptionPane.WARNING_MESSAGE);

            String x1 = "";

            x1 = JOptionPane.showInputDialog(null, "Ingresa un elemento que deseas buscar\npara saber si existe");

            x1 = x1.toUpperCase();

            lista2.add(x1);

            boolean elementos = al.containsAll(lista2);

            if (elementos) {
                JOptionPane.showMessageDialog(null, "Los elementos si estan");
            } else {
                JOptionPane.showMessageDialog(null, "Los elementos NO estan");
            }

            //13.- Clonacion de una Array List
            ArrayList<String> alClon = (ArrayList<String>) al.clone();

            JOptionPane.showMessageDialog(null, "La AL clonada es:\n" + alClon);

        } catch (Exception n) {
            JOptionPane.showMessageDialog(null, "Error de entradas de datos\nIntentelo mas tarde",
                    "ERROR IMENSO", JOptionPane.WARNING_MESSAGE);

        }

    }

//6.- Validar el dato para saber si es tipo String y no Numerico
    public static boolean validardatos(String datos) {
        return datos.matches("[a-zA-Z]*");
    }

}
