package ensallo;

public abstract class poligono {

    protected int numLados;

    //Constructor
    public poligono(int ladosPoli) {
        this.numLados = ladosPoli;
    }

    //Metodo Getter
    public int getNumeroLados() {
        return numLados;
    }

    @Override
    public String toString() {
        return "Numero de Lados: " + numLados;
    }

    public abstract double area();

}
