
package Polimorfismo;

public class vehiculoDeportivo extends Vehiculo {

    private int cilindrada = 0;

    public vehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);

        this.cilindrada = cilindrada;

    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String mostrarDatos() {
        return "VEHICULO DEPORTIVO\n" + "Matricula = " + matricula + "\nMarca = " + marca + "\nModelo = " + modelo
                + "\nCilindrada = " + cilindrada + "\n";
    }

}
