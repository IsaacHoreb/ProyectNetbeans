package animal;
/**
 * Clase animal
 * Clase que modela de forma simple un objeto tipo automivil 
 * @author Isaac Horeb Gonzalez Gamas
 * @version 1.0
 */

public class animal {
 //Variables de instancia del objeto -> Atributos del objeto   
 String nombre;
 String especie;
 String sexo;
 String color;
 int edad;
 
 //Metodo constructor -> Permite que el objeto sea utilizado por otra clase o interfas
 public animal () { 
     nombre = ""; 
     especie = "";
     sexo = "";
     color = "";
     edad = 0; 
 }
 
// metodo constructor parametrizado -> metodo con valores desde otra clase
 public animal (String nombre2, String especie2, String sexo2, String color2, int edad2){
     nombre = nombre2;  
     especie = especie2; 
     sexo = sexo2;
     color = color2;
     edad = edad2;  
 }

//metodo accesores y mutadores -> obtener o modificar el valor de los atributos 

//nombre
 public void setNombre (String nombre3){
     nombre = nombre3; 
 }
 public String getNombre(){
     return nombre;
 } 
 
 //especie
 public void setEspecie (String especie3){
     especie = especie3; 
 }
 public String getEspecie(){
     return especie;
 }

 //sexo
 public void setSexo (String sexo3){
     sexo = sexo3; 
 }
 public String getSexo(){
     return sexo;
 }

  //color
 public void setColor (String color3){
     color = color3; 
 }
 public String getColor(){
     return color;
 }

//edad
 public void setEdad(int edad3){
     edad = edad3;
 }
 public int getEdad(){
     return edad;
 }

 

 //metodo tostring -> imprime la informacion del objeto de forma simple
 public String toString (){
     return "En la veterinaria, se ha recibido una mascota que tiene por nombre "+nombre+" es una especie de animal "+especie+
            " de sexo "+sexo+", con un color "+color+" que tiene una edad aproximada de "+edad+" de la cual tenemos registro para atenderlo.";
 } 
  
}