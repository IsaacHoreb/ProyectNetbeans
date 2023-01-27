package Ensallo;

public class analista extends informatico {

    //Utilizando Polimorfismo Overload  con sobrecarga
    public void sueldo(int horas, double pagoH, double incentibo) {
        System.out.println("El pago es: " + ((horas * pagoH) + incentibo));
    }

    public void datos(String nombre, String apellido, String direccion) {
        System.out.println("Nombres: " + nombre);
        System.out.println("Apellidos: " + apellido);
        System.out.println("Dirección: " + direccion);
    }

    public void labores(String labor, int horas) {
        System.out.println("Soy analista y me dedico a " + labor + " " + horas + " hrs.");
    }

}
