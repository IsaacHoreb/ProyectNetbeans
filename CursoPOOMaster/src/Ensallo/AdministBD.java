package Ensallo;

public class AdministBD {

    //Utilizando Polimorfismo Overload 
    public void sueldo(double pago) {
        System.out.println("El pago es: " + pago);
    }

    public void datos(String nombre) {
        System.out.println("Nombre: " + nombre);
    }

    public void labores(String labor) {
        System.out.println("El administrado BD\nTiene su labor de: " + labor);
    }

}
