package ensallo;

public class triangulo extends poligono {

    private final double lado1;
    private final double lado2;
    private final double lado3;

    public triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    @Override
    public String toString() {
        return "\nTriangulo: \n" + super.toString() + "\nlado1 = " + lado1 + ", lado2 = " + lado2 + ", lado3 = " + lado3;
    }

    @Override
    public double area() {
        double p = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt((p * (p - lado1) * (p - lado2) * (p - lado3)));
    }

}
