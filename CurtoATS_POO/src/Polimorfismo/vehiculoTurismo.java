
package Polimorfismo;

public class vehiculoTurismo extends Vehiculo {

    private int nPuertas = 0;

    //Constructor
    public vehiculoTurismo(int nPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo); //Para decirle a Java que ya esta inicializadas

        this.nPuertas = nPuertas;

    }

    //Metodo getter
    public int getnPuertas() {
        return nPuertas;
    }

    @Override
    public String mostrarDatos() {
        return "VEHICULO TURISMO\n" + "Matricula = " + matricula + "\nMarca = " + marca + "\nModelo = " + modelo
                + "\nNumeros de puertas = " + nPuertas + "\n";
    }

}
