
package otro;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author ISAAC HOREB
 */
public class ArrayList_Objet extends javax.swing.JFrame {

    /**
     * Creates new form ArrayList_Objet
     */
    ArrayList< carro> Coche = new ArrayList();

    carro coche;

    public ArrayList_Objet() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoMatricula = new javax.swing.JTextField();
        campoMarca = new javax.swing.JTextField();
        campoModelo = new javax.swing.JTextField();
        campoKilometraje = new javax.swing.JTextField();
        campoSalida = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        btIngresa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaResultado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 51, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BASE DE DATOS DE AUTOMOVILES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 320, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("MATRICULA: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 110, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("MARCA:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 80, 20));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("MODELO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("KILOMETRAJE:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        campoMatricula.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        getContentPane().add(campoMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 250, 30));

        campoMarca.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        getContentPane().add(campoMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 250, 30));

        campoModelo.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        getContentPane().add(campoModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 250, 30));

        campoKilometraje.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        getContentPane().add(campoKilometraje, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 250, 30));

        campoSalida.setBackground(new java.awt.Color(0, 102, 204));
        campoSalida.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        campoSalida.setForeground(new java.awt.Color(255, 255, 255));
        campoSalida.setText("SALIR");
        campoSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSalidaActionPerformed(evt);
            }
        });
        getContentPane().add(campoSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 100, 40));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo_1.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 300, 220));

        btIngresa.setBackground(new java.awt.Color(0, 51, 153));
        btIngresa.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btIngresa.setForeground(new java.awt.Color(255, 255, 255));
        btIngresa.setText("INGRESAR");
        btIngresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngresaActionPerformed(evt);
            }
        });
        getContentPane().add(btIngresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 110, 40));

        areaResultado.setColumns(20);
        areaResultado.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        areaResultado.setRows(5);
        jScrollPane1.setViewportView(areaResultado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 340, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSalidaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_campoSalidaActionPerformed

    private void btIngresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngresaActionPerformed

        //Captura de valores del automovil
        String matricula, modelo, marca;
        int kms;

        matricula = campoMatricula.getText();
        marca = campoMarca.getText();
        modelo = campoModelo.getText();
        kms = Integer.parseInt(campoKilometraje.getText());

        //Crear el objeto tipo coche
        coche = new carro(matricula, modelo, marca, kms);

        //Añadir el coche a la Array List
        Coche.add(coche);

        areaResultado.setText(Coche.toString());


    }//GEN-LAST:event_btIngresaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ArrayList_Objet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArrayList_Objet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArrayList_Objet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArrayList_Objet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArrayList_Objet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaResultado;
    private javax.swing.JButton btIngresa;
    private javax.swing.JTextField campoKilometraje;
    private javax.swing.JTextField campoMarca;
    private javax.swing.JTextField campoMatricula;
    private javax.swing.JTextField campoModelo;
    private javax.swing.JButton campoSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}