package ModificadoresDeAcceso;

public class Clase2 {

    public static void main(String[] args) {
        
        Clase1 op = new Clase1();
        
        op.setEdad(13);
        op.getEdad();
        
        System.out.println("La edad es = "+op.getEdad());
        
        op.setNombre("Alejandro");
        System.out.println("El nombre es = "+op.getNombre());
        
        
    }

}
