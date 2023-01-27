/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacsPro;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author ISAAC HOREB
 */
public class InterfazPro extends javax.swing.JFrame {

    /**
     * Creates new form InterfazPro
     */
    public InterfazPro() {
        initComponents();
        //1.- Mostrar en medio la ventana
        this.setLocationRelativeTo(null);
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logohp.png"));
        return retValue; 
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFielUser = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jButtonSeccion = new javax.swing.JButton();
        Salirda = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 90, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 153));
        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 80, 30));

        jTextFielUser.setBackground(new java.awt.Color(0, 0, 153));
        jTextFielUser.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jTextFielUser.setForeground(new java.awt.Color(255, 255, 255));
        jTextFielUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielUserActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFielUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 190, 30));

        jPassword.setBackground(new java.awt.Color(0, 0, 153));
        jPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPassword.setForeground(new java.awt.Color(255, 255, 255));
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 190, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 250, 250));

        jButtonSeccion.setBackground(new java.awt.Color(0, 51, 153));
        jButtonSeccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSeccion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSeccion.setText("Iniciar Sección");
        jButtonSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeccionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, -1, -1));

        Salirda.setBackground(new java.awt.Color(0, 51, 153));
        Salirda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Salirda.setForeground(new java.awt.Color(255, 255, 255));
        Salirda.setText("Salir");
        Salirda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirdaActionPerformed(evt);
            }
        });
        getContentPane().add(Salirda, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 368, 545));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFielUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielUserActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void SalirdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirdaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirdaActionPerformed

    private void jButtonSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeccionActionPerformed
        JOptionPane.showMessageDialog(null, "Has iniciado Secion");
    }//GEN-LAST:event_jButtonSeccionActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salirda;
    private javax.swing.JButton jButtonSeccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextFielUser;
    // End of variables declaration//GEN-END:variables
}