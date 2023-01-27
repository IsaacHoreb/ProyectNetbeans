
package Polimorfismo;

public class Main {

    public static void main(String[] args) {

        Vehiculo misVehiculos[] = new Vehiculo[4];

        misVehiculos[0] = new Vehiculo("G4A3", "Ferrary", "A53");
        //Desde aqui empieza el polimorfismos
        misVehiculos[1] = new vehiculoDeportivo(12, "SF3S", "Toyota", "R34");
        misVehiculos[2] = new vehiculoFurgoneta("DF32", "NASSI", "TT3", 45);
        misVehiculos[3] = new vehiculoTurismo(8, "FS31", "GOGO", "FA3");

        for (Vehiculo vehiculos : misVehiculos) {
            System.out.println(vehiculos.mostrarDatos());
        }

    }

}
