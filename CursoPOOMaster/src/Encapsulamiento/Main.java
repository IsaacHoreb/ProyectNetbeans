package Encapsulamiento;

public class Main {

    public static void main(String[] args) {
        
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno();
        
        alu1.setnoControl(123);
        alu1.nombre = "Juan";
        alu1.apellidos = "Ulio";
        alu1.setEmailg("grato1123@gmail.com\n");
        
        alu1.verDatos();
        
        alu2.setnoControl(565);
        alu2.nombre = "Karla";
        alu2.apellidos = "Gomez salmos";
        alu2.setEmailg("Yuca45m@gmail.com");
        
        alu2.verDatos();
        
        
    }
    
}
