
package MtdConnRetorno;

public class Operaciones {
    
    int x,z;
    
    int suma(int x,int z){
        return (x+z);
    }
    
    int resta(int x,int z){
        return (x-z);
    }
    
    double areaCirculo(int radio){
        return (3.1416*(radio*radio));
    }
    
    boolean estadoHebrio(int tequila){
        int q = 0;
        boolean e = false;
        if (tequila >= 5) {
            e = true;
        }else{
            e = false;
        }
        
        return e;
    }
    
    
    
    
}
