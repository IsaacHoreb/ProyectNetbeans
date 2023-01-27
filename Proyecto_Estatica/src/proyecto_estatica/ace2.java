package proyecto_estatica;

import javax.swing.JOptionPane;

public class ace2 extends javax.swing.JFrame {

    public ace2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_calcul = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_aceleracion = new javax.swing.JTextField();
        txt_tiempoFinal = new javax.swing.JTextField();
        txt_tiempoInicial = new javax.swing.JTextField();
        txt_velocidadInici = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_resultado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btn_sali = new javax.swing.JButton();
        btn_regres = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel1.setText("MRUA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 11, -1, -1));

        btn_calcul.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btn_calcul.setText("Calculate");
        btn_calcul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calculActionPerformed(evt);
            }
        });
        getContentPane().add(btn_calcul, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 22)); // NOI18N
        jLabel3.setText("vo");

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 22)); // NOI18N
        jLabel4.setText("a");

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 22)); // NOI18N
        jLabel5.setText("to");

        txt_aceleracion.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N

        txt_tiempoFinal.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N

        txt_tiempoInicial.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N

        txt_velocidadInici.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel7.setText("m/s");

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel8.setText(" m/s²");

        jLabel9.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel9.setText("seg");

        jLabel10.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel10.setText("seg");

        jLabel12.setFont(new java.awt.Font("Gill Sans MT", 1, 22)); // NOI18N
        jLabel12.setText("tf");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_velocidadInici, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txt_aceleracion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_tiempoInicial))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(12, 12, 12)
                        .addComponent(txt_tiempoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_velocidadInici, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_aceleracion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_tiempoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_tiempoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 51, 300, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setInheritsPopupMenu(true);

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 22)); // NOI18N
        jLabel6.setText("vf");

        txt_resultado.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel11.setText(" m/s");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txt_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 260, 300, -1));

        btn_sali.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btn_sali.setText("Exit");
        btn_sali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saliActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sali, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        btn_regres.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btn_regres.setText("Return");
        btn_regres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresActionPerformed(evt);
            }
        });
        getContentPane().add(btn_regres, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saliActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_saliActionPerformed

    private void btn_calculActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calculActionPerformed

        try {
            int velocidadInici = Integer.parseInt(txt_velocidadInici.getText());
            int aceleracion = Integer.parseInt(txt_aceleracion.getText());
            int tiempoFinal = Integer.parseInt(txt_tiempoFinal.getText());
            int tiempoInicial = Integer.parseInt(txt_tiempoInicial.getText());

            int velocidadFinal = ((velocidadInici + aceleracion * (tiempoFinal - tiempoInicial)));

            txt_resultado.setText(" " + velocidadFinal);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error de datos", "Error", 2);
        }

    }//GEN-LAST:event_btn_calculActionPerformed

    private void btn_regresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresActionPerformed

        try {
            App aplica = new App();
            this.setVisible(false);
            aplica.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de datos", "Error", 2);
        }

    }//GEN-LAST:event_btn_regresActionPerformed

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
            java.util.logging.Logger.getLogger(ace2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ace2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ace2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ace2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ace2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcul;
    private javax.swing.JButton btn_regres;
    private javax.swing.JButton btn_sali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_aceleracion;
    private javax.swing.JTextField txt_resultado;
    private javax.swing.JTextField txt_tiempoFinal;
    private javax.swing.JTextField txt_tiempoInicial;
    private javax.swing.JTextField txt_velocidadInici;
    // End of variables declaration//GEN-END:variables

}
