package domain;

public class Clientes {

    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private double saldo;

    //Este constructor sirve para poder eliminar algun cliente sera por su id
    public Clientes(int id) {
        this.id = id;
    }

    public Clientes(String nombre, String apellido, String email, String telefono, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    public Clientes(int id, String nombre, String apellido, String email, String telefono, double saldo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    public Clientes() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\nid: " + id + "\nNombre: " + nombre + "\nApellido: "
                + apellido + "\nEmail: " + email + "\nTelefono: " + telefono
                + "\nSaldo: " + saldo + "\n";
    }

}
