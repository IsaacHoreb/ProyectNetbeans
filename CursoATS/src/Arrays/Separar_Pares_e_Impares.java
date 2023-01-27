package Arrays;

import javax.swing.JOptionPane;

public class Separar_Pares_e_Impares {

    public static void main(String[] args) {

        //Variable para el tamaño del Array
        int x = Integer.parseInt(JOptionPane.showInputDialog(null,"Digita el tamaño del Array ="
                ,"Mensaje",JOptionPane.WARNING_MESSAGE));
        
        //Inicializo el Array
        int arr[] = new int[x];
        int conteo_par = 0, conteo_impar = 0; //Declaro variables para el conteo de Pares e Impares

        JOptionPane.showMessageDialog(null, "Llenar el Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Datos\nArray #" + i));
            
            //Condicional de par o impar
            if (arr[i] % 2 == 0) { //Si el numero es par
                conteo_par++;
            } else {
                conteo_impar++; //Si el numero es impara
            }
        }
        
        //Para moldear el Array original
        String arregloOri = "[ ";
        for (int i = 0; i < arr.length; i++) {
            arregloOri += arr[i] + ", ";
        }
        arregloOri += " ]";

        //Creamos los array siguiente
        int par[] = new int[conteo_par];    //Creamos el Array para almacena los numeros parse
        int impar[] = new int[conteo_impar];//Creamos el Array para almacenr los numeros impares

        //Los utiliso como iteradore
        conteo_par = 0;
        conteo_impar = 0;

        //Almacenamos los numeros pares en un Array y los impares igual
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                par[conteo_par] = arr[i];
                conteo_par++;
            } else {
                impar[conteo_impar] = arr[i];
                conteo_impar++;
            }
        }

        //AREGLO PARES
        String arregloF = "[ ";
        for (int i = 0; i < conteo_par; i++) {
            arregloF += par[i] + ", ";
        }
        arregloF += " ]";

        //AREGLO IMPARES
        String arregloF1 = "[ ";
        for (int i = 0; i < conteo_impar; i++) {
            arregloF1 += impar[i] + ", ";
        }
        arregloF1 += " ]";
        
        //Metodo para imprimir los daots
        StringBuilder ip = new StringBuilder();
        ip.append("ARREGLO PARES\n");
        ip.append(arregloF);
        ip.append("\nArreglos IMPARES\n");
        ip.append(arregloF1);
        ip.append("\nArreglo Original\n");
        ip.append(arregloOri);
        
        JOptionPane.showMessageDialog(null,ip,"AREGLOS PARA E IMPARES",3);
        
    
    }

}
