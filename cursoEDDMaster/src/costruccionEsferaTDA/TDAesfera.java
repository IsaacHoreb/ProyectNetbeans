package costruccionEsferaTDA;

//ESTO ES LA IMPLEMENTACION DE MI TIPO DE DATO ABSTRATO
public class TDAesfera {

    private final double radio;

    //Constructor
    public TDAesfera(double radioInicial) {

        if (radioInicial > 0) {
            this.radio = radioInicial;
        } else {
            this.radio = 0.0;
        }
    }

    //Creamos los métodos u operaciones del TDAesfera
    public double getRadio() {
        return this.radio;
    }

    //Obtener diametro
    public double getDiametro() {
        return (radio * 2);
    }

    //Obtener circunferencia
    public double getCircunferencia() {
        return (Math.PI * getDiametro());
    }

    public double getArea() {
        return (4 * Math.PI * radio * radio);
    }

    public double getVolumen() {
        return (4 * Math.PI * Math.pow(radio, 3)) / 3;
    }

}
