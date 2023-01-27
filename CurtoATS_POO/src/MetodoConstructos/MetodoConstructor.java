package MetodoConstructos;

import javax.swing.JOptionPane;

public class MetodoConstructor {

    //Creamos el metodo Main
    public static void main(String[] args) {
        //Declarar Variables
        String nombre;
        int edad;

        //Pedir los Datos
        nombre = JOptionPane.showInputDialog(null, "Ingrese un nombre = ", "Mensaje", 3);
        edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad =", "Mensaje", 3));

        //Crear el objeto
        MetodoConstructor op = new MetodoConstructor(nombre, edad);

        //Llamamos los metodos
        op.mostrarDatos();

    }

    //Atributos
    String Nombre;
    int edad;

    //Metodos
    //Metodos Contructores
    public MetodoConstructor(String _nombre, int _edad) {
        Nombre = _nombre;
        edad = _edad;
    }

    public void mostrarDatos() {
        System.out.println("El nombre es = " + Nombre);
        System.out.println("La edad es = " + edad);
    }

}
