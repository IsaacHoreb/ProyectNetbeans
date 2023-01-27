
package Polimorfismo;

public class vehiculoFurgoneta extends Vehiculo {

    private int carga = 0;

    public vehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public String mostrarDatos() {
        return "VEHICULO FURGONETA\n" + "Matricula = " + matricula + "\nMarca = " + marca + "\nModelo = " + modelo
                + "\nCarga = " + carga + "\n";
    }

}
