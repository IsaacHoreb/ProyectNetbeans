package CalcularAreaDePologono;

public abstract class Poligono {

    protected int numeroLados;

    //Constructor
    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    //Metodo Getter
    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "Numero de Lados=" + numeroLados;
    }

    //Declaramos el metodo area como abstracto
    public abstract double area();

}
