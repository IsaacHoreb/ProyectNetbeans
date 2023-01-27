
package Objeto;

/**
 * Clase automovil
 * Clase que modela de forma simple un objeto tipo automivil 
 * @author Isaac Horeb Gonzalez Gamas
 * @version 1.0
 */

public class automovil {
 //Variables de instancia del objeto -> Atributos del objeto   
 String matricula;
 int modelo;
 int potencia;
 String color;
 String marca;
 
 //Metodo constructor -> Permite que el objeto sea utilizado por otra clase o interfas
 public automovil () { 
     matricula = ""; 
     modelo = 0;
     potencia = 0; 
     color = "";
     marca = "";
 }
 
// metodo constructor parametrizado -> metodo con valores desde otra clase
 public automovil (String matricula2, int modelo2, int potencia2, String color2, String marca2){
     matricula = matricula2;  
     modelo = modelo2; 
     potencia = potencia2;
     color = color2;
     marca = marca2;  
 }

//metodo accesores y mutadores -> obtener o modificar el valor de los atributos 

//matricula
 public void setMATRICULA (String matricula3){
     matricula = matricula3; 
 }
 public String getMatricula(){
     return matricula;
 } 

//modelo
 public void setModelo(int modelo3){
     modelo = modelo3;
 }
 public int getModelo(){
     return modelo;
 }

 //potencia
 public void setPotencia(int potencia3){
     potencia = potencia3;
 }
 public int getPotencia(){
     return potencia;
 }

//color
 public void setColor (String color3){
     color = color3; 
 }
 public String getColor(){
     return color;
 }  

//marca
 public void setMarca (String marca3){
     marca = marca3; 
 }
 public String getMarca(){
     return marca;
 } 

 //metodo tostring -> imprime la informacion del objeto de forma simple
 public String toString (){
    return "El auto con matricula "+matricula+" es la marca "+marca+
            " modelo "+modelo+", es de color "+color+
            " y tiene una potencia de "+potencia+" caballos de fuerzas.";
     
     
 } 
  
}