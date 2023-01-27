
package metoddoGet_Set;

import Constructores.*;

public class Alumnos {
    //Atributos
    int noControl;
    String nombre,apellidos;
    
    //Metodo Constructor
    public Alumnos(int nc,String nm, String ap) {
        //Inicializando los atributos
//        noControl = nc;
//        nombre = nm;
//        apellidos = ap;
        //Otra forma
        this.noControl = nc;
        this.nombre = nm;
        this.apellidos = ap;
        
    }
    
    //Metodos
    void verDatos(){
        System.out.println("NO. Control: "+ noControl);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellido "+ apellidos);
        System.out.println("");
    }
    
    //Creando los metodos Get and Set
    //Get -----> Obtener
    
    int getControl(){
       return   this.noControl; 
    }
    
    String getNombre(){
        return this.nombre;
    }
    
    String getApellido(){
        return this.getApellido();
    }
    
    //Set -----> Asignar
    void setControl(int NC){
        this.noControl = NC;
    }
    
    void setNombre(String NOM){
        this.nombre = NOM;
    }
    
    void setApellidos(String APE){
        this.apellidos = APE;
    }

}







