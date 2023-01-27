package ensallo;

public class rectangulo extends poligono {

    private final double lado1;
    private final double lado2;

    public rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo: \n" + super.toString()
                + "\nLado1: " + lado1 + ", Lado2: " + lado2;
    }

    @Override
    public double area() {
        return lado1 * lado2;
    }
}
