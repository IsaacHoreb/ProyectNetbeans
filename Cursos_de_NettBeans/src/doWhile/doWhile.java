package doWhile;

import javax.swing.JOptionPane;

public class doWhile {

    public static void main(String args[]) {

        //Menu de opciones 
        int x;
        String respuesta = "";

        do {
            do {
                x = Integer.parseInt(JOptionPane.showInputDialog(null, "Elige alguna opcion a realizar\n"
                        + "1.- Mostrar por pantalla alguna frase por el usuario\n"
                        + "2.- Calcular operaciones basica[Suma,Resta,Multiplicacion,division]\n"
                        + "3- Numeros pares e impares"));
            } while (x > 3 || x < 1);

            //Mostrar o Hacer las operaciones que se nesecita
            switch (x) {
                case 1:
                    //MOSTRAR FRASE
                    String palabra = (JOptionPane.showInputDialog(null, "Escribe alguna frase"));
                    JOptionPane.showMessageDialog(null, palabra);
                    break;

                case 2:
                    //CALCULAR OPERACIONES BASICAS
                    int c;
                    do {
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "1.-Suma\n2.-Resta\n3-Multiplicació\n4.-Divición", "Mensaje", JOptionPane.WARNING_MESSAGE));
                    } while (c > 4);

                    //OPERACIONES
                    switch (c) {
                        case 1:
                            //SUMA
                            int n1,
                             n2,
                             suma;
                            n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el primer numero"));
                            n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el segundo numero"));

                            suma = n1 + n2;

                            JOptionPane.showMessageDialog(null, "La suma es: " + suma);
                            break;

                        case 2:
                            //RESTA
                            n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el primer numero"));
                            n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el segundo numero"));

                            int resta = n1 - n2;

                            JOptionPane.showMessageDialog(null, "La resta es: " + resta);
                            break;
                        case 3:
                            //MULTIPLICACION
                            n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el primer numero"));
                            n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el segundo numero"));

                            int mul = n1 * n2;

                            JOptionPane.showMessageDialog(null, "La resta es: " + mul);
                            break;
                        case 4:
                            //DIVICIÓN
                            n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el primer numero"));
                            n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el segundo numero"));

                            int div = n1 / n2;

                            JOptionPane.showMessageDialog(null, "La resta es: " + div);
                            break;
                    }
                case 3:
                    //Declaro la varible que tipo de datos
                    int numero;

                    //Almaceno los datos en numero
                    numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero"));

                    //Creo el ciclo mientra 
                    while (numero != 0) {
                        //Creo una condicional para saber si es par o impar
                        if (numero % 2 == 0) {
                            JOptionPane.showMessageDialog(null, "El numero " + numero + " es Par");

                        } else {
                            JOptionPane.showMessageDialog(null, "El numero " + numero + " es Impar");
                        }

                        //Volvera a repetir al salir de evaluar
                        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa otro numero: "));
                    }
                    break;

            }

            respuesta = JOptionPane.showInputDialog(null, "¿Deseas volver a repetir? (SI/NO)");
            respuesta = respuesta.toUpperCase();

        } while (!respuesta.equals("NO"));

    }

}
