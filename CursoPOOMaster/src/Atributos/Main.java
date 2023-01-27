package Atributos;


public class Main {
    
    //Declaramos los Atribustos de la clase y asignamos valores inciales
        String Marca = "Nissan";
        String Color = "Blanco";
        String MOdelo = "2020";
        
        double Precio = 124.3423;
        

    public static void main(String[] args) {
        
        //Declaramos una istancia, o mejor dicho un Objecto
        Main instancia = new Main();
        
        
        //Accediendo a los atributos
        System.out.println("Marca = "+instancia.Marca);
        System.out.println("Color = "+instancia.Color);
        System.out.println("Modelo = "+instancia.MOdelo);
        System.out.println("Precio = "+instancia.Precio);
        
        System.out.println();
        
        //Otra forma de imprimir(Mejor)
        StringBuilder sp = new StringBuilder();
        
        sp.append("Marca = "+instancia.Marca+"\n");
        sp.append("Color = "+instancia.Color+"\n");
        sp.append("Modelo = "+instancia.MOdelo+"\n");
        sp.append("Precio = "+instancia.Precio+"\n");
        
        System.out.println(sp);
    }
    
}
