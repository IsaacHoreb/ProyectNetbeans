package com.mycompany.bd_cargartablas;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;

public class Tabla extends javax.swing.JFrame {

    Conexion conexion = Conexion.getInstance();

    //Lo importanos despues de poner la dependencia para las graficas
    JFreeChart grafico;
    DefaultCategoryDataset datos = new DefaultCategoryDataset();

    public Tabla() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("GRAFICOS DE BASE DE DATOS");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablasNegocio = new javax.swing.JTable();
        btn_CargarDatos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_graficar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablasNegocio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Matricula", "Nombre", "Edad", "Semestre", "Carrera", "Grupo", "Turno"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablasNegocio);

        btn_CargarDatos.setText("Cargar Datos");
        btn_CargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CargarDatosActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_graficar.setText("Graficar");
        btn_graficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_graficarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(btn_CargarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btn_graficar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addGap(245, 245, 245))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_graficar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_CargarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CargarDatosActionPerformed

        try {
            //Sirve para modificar y personalizar nuestra tablas
            DefaultTableModel modelo = new DefaultTableModel();
            TablasNegocio.setModel(modelo);

            Connection conexionMysql = conexion.conectar();
            PreparedStatement seleccion = conexionMysql.prepareStatement("SELECT * FROM datos");
            ResultSet consulta = seleccion.executeQuery();

            //Obtener las caracteristicas mas importantes
            ResultSetMetaData datos = consulta.getMetaData();
            int cantidadColumnas = datos.getColumnCount();

            modelo.addColumn("Matricula");
            modelo.addColumn("Nombre");
            modelo.addColumn("Edad");
            modelo.addColumn("Semestre");
            modelo.addColumn("Carrera");
            modelo.addColumn("Grupo");
            modelo.addColumn("Turno");

            //Establecemos anchos a las columnas del modelo
            int anchos[] = {60, 170, 80, 300, 200, 80, 100};
            for (int i = 0; i < cantidadColumnas; i++) {
                TablasNegocio.getColumnModel().getColumn(i).setPreferredWidth(i);
            }

            //Cargamos los datos
            while (consulta.next()) {
                Object arreglo[] = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    arreglo[i] = consulta.getObject(i + 1);
                }
                modelo.addRow(arreglo);
            }

            conexion.desconectar();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_btn_CargarDatosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            System.exit(0);
            JOptionPane.showMessageDialog(null, "Programa Finalizado", "Mensaje", 3);
        } catch (HeadlessException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_graficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_graficarActionPerformed

        try {
            for (int i = 0; i < TablasNegocio.getRowCount(); i++) {
                datos.addValue(Integer.parseInt(TablasNegocio.getValueAt(i, 0).toString()), TablasNegocio.getValueAt(i, 3).toString(), TablasNegocio.getValueAt(i, 5).toString());
            }
                                                                                                                        
            grafico = ChartFactory.createBarChart("Grafica de visitas", "Visitas", "Dias", datos, PlotOrientation.VERTICAL, true, true, false);
            
            ChartPanel panel = new ChartPanel(grafico);
            this.add(panel);
            panel.setBounds(500, 40, 400, 250);
            
            
            
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_btn_graficarActionPerformed

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
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablasNegocio;
    private javax.swing.JButton btn_CargarDatos;
    private javax.swing.JButton btn_graficar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
