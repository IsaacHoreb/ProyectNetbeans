
package VariablePolimorficas;

public class Main {

    public static void main(String[] args) {
        
        //La variable polimorficas es aquella que contien un objeto 
        Optimista objOptimista = new Optimista();
        Pesimista objPesimiste = new Pesimista();
        Introvertido objIntrovertido = new Introvertido();
        Extrovertido objExtrovertido = new Extrovertido();
        
        //Creando mi variable Polimorfica
        Personalidad objPersonalidad[]= new Personalidad[4];
        
        objPersonalidad[0] = objOptimista;
        objPersonalidad[1] = objPesimiste;
        objPersonalidad[2] = objIntrovertido;
        objPersonalidad[3] = objExtrovertido;
        
        //Poniendo a rabajar a nuestra variable polimorfica
        objPersonalidad[0].hablar();
        objPersonalidad[1].hablar();
        objPersonalidad[2].hablar();
        objPersonalidad[3].hablar();
        
    }
    
}
