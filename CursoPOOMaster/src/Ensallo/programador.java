package Ensallo;

public class programador extends informatico {

    public void sueldo(int horas, int pagoH, int incentibo) {
        System.out.println("Su pago es de: " + ((horas * pagoH) + incentibo));
    }

    public void datos(String nombre, String apellido, String telefono) {
        System.out.println("Nombres: " + nombre);
        System.out.println("Apellidos: " + apellido);
        System.out.println("Telefono: " + telefono);
    }

    public void labores(String labor, int horas, String experiencia) {
        System.out.println("Soy Ing. en sistemas, mi labor es: " + labor
                + "\ncon una jornada laboral de " + horas
                + "hrs\ncuenta con una experienca de " + experiencia);
    }

}
