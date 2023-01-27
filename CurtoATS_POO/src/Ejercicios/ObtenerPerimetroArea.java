package Ejercicios;

import javax.swing.JOptionPane;

public class ObtenerPerimetroArea {

    //Metodo Main
    public static void main(String[] args) {

        ObtenerPerimetroArea c1;
        float lado1, lado2;

        lado1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el lado1 ="));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el lado2 ="));

        if (lado1 == lado2) {
            c1 = new ObtenerPerimetroArea(lado1);
        } else {
            c1 = new ObtenerPerimetroArea(lado1, lado2);
        }

        System.out.println("El perimetro es = " + c1.getPerimetro());
        System.out.println("El area es = " + c1.getArea());
    }

    //Atributos
    private float lado1;
    private float lado2;

    //Metodos
    //Metodo Construcotor1 (Cuadrilatero)
    public ObtenerPerimetroArea(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Metodo Construcotor2 (Cuadraddo)
    public ObtenerPerimetroArea(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }

    public float getPerimetro() {
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }

    public float getArea() {
        float area = (lado1 * lado2);
        return area;
    }

}
