
package CuadrodeDialogo;

import javax.swing.JOptionPane;

public class tiposcuadrosDialogo {

    public static void main(String[] args) {
        
//        //1.- Cuadros de diálogo [showMessageDialog]
//            //Con iconos diferente
//            
            //1.- ejemplo
            JOptionPane.showMessageDialog(null, "Hola","Mensaje de prueba",JOptionPane.INFORMATION_MESSAGE);
            
            //2.- ejemplo    
            JOptionPane.showMessageDialog(null, "Hola","Mensaje de prueba",JOptionPane.WARNING_MESSAGE);
            
            //3.- ejemplo
            JOptionPane.showMessageDialog(null, "Hola","Mensaje de prueba",JOptionPane.ERROR_MESSAGE);
            
            //4.- ejemplo
            JOptionPane.showMessageDialog(null, "Hola","Mensaje de prueba",JOptionPane.QUESTION_MESSAGE);
            
            //Sin icono alguno
            JOptionPane.showMessageDialog(null,"Hola", "Mensaje de prueba", JOptionPane.PLAIN_MESSAGE);
            
//-----------------------------------------------------------------------------------------------------------------   
        //2.- Cuadro de dialogo [showConfirmDialog]
        
            //1.- ejemplo
            JOptionPane.showConfirmDialog(null, "Eso desea usted");
            
            //2.- ejemplo
            JOptionPane.showConfirmDialog(null, "Eso desea usted","Mensaje de seleccion",JOptionPane.OK_CANCEL_OPTION);
            
            //3.- ejemplo
            JOptionPane.showConfirmDialog(null, "Eso desea usted","Mensaje de seleccion",JOptionPane.YES_NO_OPTION);
            
            //4.- ejemplo
            JOptionPane.showConfirmDialog(null, "Eso desea usted","Mensaje de seleccion",JOptionPane.YES_NO_CANCEL_OPTION);

//----------------------------------------------------------------------------------------------------------------------------            

    }

}
