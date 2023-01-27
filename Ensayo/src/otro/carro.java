package otro;

public class carro {
    
    //Variables de instancia
    String matricula;
    String marca;
    String modelo;
    int kms;
    
    //Metodo constructor vacio
    public carro(){
        matricula = "";
        marca = "";
        modelo = "";
        kms = 0;
    }
    
    //Metodo constructor parametrizado
    public carro(String matricula,String modelo,String marca,int kms){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.kms = kms;
    }
    
    //Metodos accesores y mutadores 
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public int getKms(){
        return kms;
    }
    
    public void setKms(int kms){
        this.kms = kms;
    }
    
    //Metodo toString
    public String toString(){
        
    //Se crea la herramienta StringBuilder
    StringBuilder sp = new StringBuilder();
    
    sp.append("\nMatricula = ");
    sp.append(matricula);
    sp.append("\nMarca = ");
    sp.append(marca);
    sp.append("\nModelo = ");
    sp.append(modelo);
    sp.append("\nKiloetraje = ");
    sp.append(kms);
    sp.append("\n");
    
    return sp.toString();
    
    }

   
    
}











