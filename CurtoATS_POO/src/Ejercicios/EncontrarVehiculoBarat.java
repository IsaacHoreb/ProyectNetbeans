package Ejercicios;

import java.util.Scanner;

public class EncontrarVehiculoBarat {

    public static int indeceCocheMBarato(EncontrarVehiculoBarat coches[]) {
        float precio;
        int indice = 0;

        precio = coches[0].getPrecio();
        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        //Objeto tipo Scanner
        Scanner entrada = new Scanner(System.in);

        //Variables
        String marca;
        String modelo;
        float precio;
        int numVehiculos, IndiceBaratos;

        System.out.println("Digite la cantidad de vehiculos = ");
        numVehiculos = entrada.nextInt();

        //Declaro las variables como arreglo
        EncontrarVehiculoBarat coches[] = new EncontrarVehiculoBarat[numVehiculos];

        //Pedir los datos
        for (int i = 0; i < coches.length; i++) {
            entrada.nextLine();
            
            System.out.print("\nDigite las caracteristicas del coche #" + (i + 1));
            System.out.println("\nDigite la Marca = ");
            marca = entrada.nextLine();

            System.out.println("Digite el Modelo = ");
            modelo = entrada.nextLine();

            System.out.println("Digite el Precio = ");
            precio = entrada.nextFloat();
            
            //Crear objeto coche para cuando itere cada vez
            coches[i] = new EncontrarVehiculoBarat(modelo, marca, precio);

        }
        
        IndiceBaratos = indeceCocheMBarato(coches);
        System.out.println("\nEl Cohes mas varatos es = ");
        System.out.println(coches[IndiceBaratos].mostrarDatos());
    }

    
    //Atributos
    private String modelo;
    private String marca;
    private float precio;

    //Metodos
    //Metodos Constructores
    public EncontrarVehiculoBarat(String modelo, String marca, float precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String mostrarDatos() {
        return "Marca = " + marca + "\nModelo = " + modelo + "\nPrecio = " + precio + "\n";
    }

}
