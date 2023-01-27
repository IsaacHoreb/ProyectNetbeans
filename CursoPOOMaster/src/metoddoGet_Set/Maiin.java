
package metoddoGet_Set;


public class Maiin {

    public static void main(String[] args) {
        //Creando Objeto
        Alumnos alu1 = new Alumnos(123,"Isaac","Gonzalez");
        Alumnos alu2 = new Alumnos(321,"Harco","Gonzalez");
        
        alu1.verDatos();
        alu2.verDatos();
        
        
        //Llamando a los metodos Get
        System.out.println("Obteniendo nombre de alumno 2 =\n"+alu2.getNombre());
        System.out.println();
        
        //Asignandole al que antes era Julano
        alu2.setControl(3424);
        alu2.setNombre("Karla Vanesa");
        alu2.setApellidos("Villareal Gomez");
        System.out.println("Obteniendo nombre de alumno 2\nque antes era Julanito =\n"+alu2.getNombre());
        alu2.verDatos();
        
        
        
    }
    
}
