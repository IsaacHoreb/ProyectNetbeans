package Aplicacion;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    Conexion conectar = Conexion.getInstance();

    public String getTurno() {
        if (rdbMaturino.isSelected()) {
            return "Matutino";
        } else {
            return "Vespertino";
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        turno = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Edad = new javax.swing.JTextField();
        ComboBoxCarrera = new javax.swing.JComboBox<>();
        ComboBoxSemestre = new javax.swing.JComboBox<>();
        ComboBoxGrupo = new javax.swing.JComboBox<>();
        rdbMaturino = new javax.swing.JRadioButton();
        rdbVespertino = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnVerificar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 204));
        jLabel2.setText("Registro a facultad");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Carrera:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Semestre:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Grupo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Turno:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        txt_Nombre.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        getContentPane().add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 250, 30));

        txt_Edad.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        getContentPane().add(txt_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 250, 30));

        ComboBoxCarrera.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        ComboBoxCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administración de Empresas", "Derecho", "Mercadotecnia", "Ingeniería en Sistemas", "Psicología", "Contaduría", "Arquitectura", "Ingeniería Industrial", "Diseño Gráfico", "Medicina", "Ciencias de la Comunicación", "Turismo", "Nutrición", "Ingeniería Mecatrónica", "Comercio Internacional" }));
        getContentPane().add(ComboBoxCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 250, 30));

        ComboBoxSemestre.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        ComboBoxSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        getContentPane().add(ComboBoxSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 80, 20));

        ComboBoxGrupo.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        ComboBoxGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z" }));
        getContentPane().add(ComboBoxGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 90, -1));

        rdbMaturino.setBackground(new java.awt.Color(51, 51, 51));
        turno.add(rdbMaturino);
        rdbMaturino.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        rdbMaturino.setForeground(new java.awt.Color(255, 255, 255));
        rdbMaturino.setText("Matutino");
        getContentPane().add(rdbMaturino, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 110, -1));

        rdbVespertino.setBackground(new java.awt.Color(51, 51, 51));
        turno.add(rdbVespertino);
        rdbVespertino.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        rdbVespertino.setForeground(new java.awt.Color(255, 255, 255));
        rdbVespertino.setText("Vespertino");
        getContentPane().add(rdbVespertino, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 120, -1));

        jPanel1.setBackground(new java.awt.Color(51, 0, 153));

        btnIngresar.setBackground(new java.awt.Color(255, 51, 0));
        btnIngresar.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        btnIngresar.setText("Ingrear");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(255, 51, 0));
        btnActualizar.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnConsultar.setBackground(new java.awt.Color(255, 51, 0));
        btnConsultar.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnVerificar.setBackground(new java.awt.Color(255, 51, 0));
        btnVerificar.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        btnVerificar.setText("Verificar BD");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(255, 51, 0));
        btnModificar.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 51, 0));
        btnEliminar.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 51, 0));
        btnBuscar.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 51, 0));
        btnSalir.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnVerificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 370, 180));

        jLabel9.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ingrese ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        txtID.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplicacion/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        JOptionPane.showMessageDialog(null, "Programa Finalizado", "Mensaje", 1);
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            Connection conexion = conectar.conectar();
            String ID = txtID.getText().trim();
            PreparedStatement modificar = conexion.prepareStatement(
                    "UPDATE datos SET nombre = ?, edad = ?, semestre = ?, carrera = ?, grupo = ?, turno = ? WHERE matricula = " + ID);

            modificar.setString(1, txt_Nombre.getText().trim());
            modificar.setString(2, txt_Edad.getText().trim());
            modificar.setString(3, ComboBoxSemestre.getSelectedItem().toString());
            modificar.setString(4, ComboBoxCarrera.getSelectedItem().toString());
            modificar.setString(5, ComboBoxGrupo.getSelectedItem().toString());
            modificar.setString(6, getTurno());

            modificar.executeUpdate();

            JOptionPane.showMessageDialog(null, "Modificacion exitosa!!", "Mensaje", 3);

            conectar.cerrarConexion();

        } catch (HeadlessException | SQLException e) {
            System.out.println("Error\n" + e.getMessage());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        try {
            Connection conexion = conectar.conectar();
            PreparedStatement ingresar = conexion.prepareStatement(
                    "INSERT INTO datos VALUES (?,?,?,?,?,?,?)");

            ingresar.setString(1, "0");
            ingresar.setString(2, txt_Nombre.getText().trim());
            ingresar.setString(3, txt_Edad.getText().trim());
            ingresar.setString(5, ComboBoxCarrera.getSelectedItem().toString());
            ingresar.setString(4, ComboBoxSemestre.getSelectedItem().toString());
            ingresar.setString(6, ComboBoxGrupo.getSelectedItem().toString());
            ingresar.setString(7, getTurno());

            //Para que actualice los datos,¡¡importante!!
            ingresar.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos registrados", "Mensaje", 3);

            conectar.cerrarConexion();

        } catch (HeadlessException | SQLException e) {
            System.out.println("Error\n" + e.getMessage());
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {

            Connection conexion = conectar.conectar();
            PreparedStatement eliminar = conexion.prepareStatement(
                    "DELETE FROM datos WHERE matricula = ?");

            eliminar.setString(1, txtID.getText().trim());
            eliminar.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro eliminado . ");

            conectar.cerrarConexion();

        } catch (HeadlessException | SQLException e) {
            System.out.println("Error\n" + e.getMessage());
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        try {
            Connection conexion = conectar.conectar();
            PreparedStatement verificar = conexion.prepareStatement(
                    "SELECT * FROM datos");
            ResultSet consulta = verificar.executeQuery();

            if (consulta.next()) {
                JOptionPane.showMessageDialog(null, "La BD si tiene elementos", "Menu", 3);
            } else {
                JOptionPane.showMessageDialog(null, "La BD NO tiene elementos", "Menu", 2);
            }

            conectar.cerrarConexion();

        } catch (HeadlessException | SQLException e) {
            System.out.println("Error\n" + e.getMessage());
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            Connection conexion = conectar.conectar();
            PreparedStatement buscar = conexion.prepareStatement(
                    "SELECT * FROM datos WHERE matricula = ?");
            buscar.setString(1, txtID.getText().trim());

            ResultSet consultar = buscar.executeQuery();

            while (consultar.next()) {
                txt_Nombre.setText(consultar.getString(2));
                txt_Edad.setText(consultar.getString(3));
                ComboBoxSemestre.setSelectedItem(consultar.getString(4));
                ComboBoxCarrera.setSelectedItem(consultar.getString(5));
                ComboBoxGrupo.setSelectedItem(consultar.getString(6));
            }

            JOptionPane.showMessageDialog(null, "Se encontraron los datos");

            conectar.cerrarConexion();

        } catch (HeadlessException | SQLException e) {
            System.out.println("Error\n" + e.getMessage());
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        txt_Nombre.setText("");
        txt_Edad.setText("");
        ComboBoxSemestre.setSelectedItem("1");
        ComboBoxCarrera.setSelectedItem("Administración de Empresas");
        ComboBoxGrupo.setSelectedItem("A");
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        tablaConsulta tablita = new tablaConsulta();
        this.setVisible(false);
        tablita.setVisible(true);
    }//GEN-LAST:event_btnConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxCarrera;
    private javax.swing.JComboBox<String> ComboBoxGrupo;
    private javax.swing.JComboBox<String> ComboBoxSemestre;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdbMaturino;
    private javax.swing.JRadioButton rdbVespertino;
    private javax.swing.ButtonGroup turno;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txt_Edad;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables
}
