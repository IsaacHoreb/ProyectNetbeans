package proyecto_estatica;

import javax.swing.JOptionPane;

public class App extends javax.swing.JFrame {

    public App() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("MRU");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_ace1 = new javax.swing.JButton();
        btn_ace2 = new javax.swing.JButton();
        btn_ace3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_salir.setText("EXIT");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 150, 30));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MRUA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        btn_ace1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ace1.png"))); // NOI18N
        btn_ace1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ace1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ace1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, 40));

        btn_ace2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ace2.png"))); // NOI18N
        btn_ace2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ace2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ace2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 150, 40));

        btn_ace3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ace3.png"))); // NOI18N
        btn_ace3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ace3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ace3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 110, 30));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fórmula de la Aceleración");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        JOptionPane.showMessageDialog(null, "Finished Program", "Mensage", 2);
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_ace1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ace1ActionPerformed

        try {
            ace1 aceleracion1 = new ace1(); //Creo Objeto
            this.setVisible(false);
            aceleracion1.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de datos", "Error", 2);
        }

    }//GEN-LAST:event_btn_ace1ActionPerformed

    private void btn_ace2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ace2ActionPerformed
        try {
            //Creamos el Objeto de ace2
            ace2 aceleracion2 = new ace2();
            this.setVisible(false);
            aceleracion2.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de datos", "Error", 2);
        }

    }//GEN-LAST:event_btn_ace2ActionPerformed

    private void btn_ace3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ace3ActionPerformed
        try {
            ace3 aceleracio3 = new ace3(); //Creo Objeto
            this.setVisible(false);
            aceleracio3.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de datos", "Error", 2);
        }
    }//GEN-LAST:event_btn_ace3ActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ace1;
    private javax.swing.JButton btn_ace2;
    private javax.swing.JButton btn_ace3;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
