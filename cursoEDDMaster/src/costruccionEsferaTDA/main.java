
package costruccionEsferaTDA;

//ESTO ES LA INTERFAZ PUBLICA

public class main {

    public static void main(String[] args) {
        
        TDAesfera esferita = new TDAesfera(7);
        
        System.out.println("Radio: "+esferita.getRadio());
        System.out.println("Diametro: "+esferita.getDiametro());
        System.out.println("Circunferencia: "+esferita.getCircunferencia());
        System.out.println("Área: "+esferita.getArea());
        System.out.println("Volumen: "+esferita.getVolumen());

    }
    
}
