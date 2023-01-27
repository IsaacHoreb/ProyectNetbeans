package Encapsulamiento;

public class Alumno {
    
    //Atributos
    private int noContro;
    private String email;
    
    public String nombre,apellidos;
    
    //Creando Metodos Get and Set para poder acceder a nuestros atributtos de tipo Private
    void setnoControl(int NC){
        this.noContro = NC;
    }
    
    int getnoControl(){
        return noContro;
    }
    
    void setEmailg(String EM){
        this.email = EM;
    }
    
    String getEmailg(){
        return email;
    }
    
    //Creando los metodos para mostrar datos
    void verDatos(){
        
        StringBuilder al = new StringBuilder();
        
        al.append("No. Cntrol = ");
        al.append(noContro);
        al.append("\nNombre = ");
        al.append(nombre);
        al.append("\nApellidos = ");
        al.append(apellidos);
        al.append("\nGmail = ");
        al.append(email);
        
        System.out.println(al);
    }
    
    
    
    
}
