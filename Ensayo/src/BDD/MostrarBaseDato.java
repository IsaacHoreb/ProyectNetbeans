package BDD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class MostrarBaseDato extends javax.swing.JFrame {

    //Objetos y variables que conecta con la BD y manipula su informacion
    //1.-Objeto de la clase conexion para que esta interfaz grafica pueda conectarse 
    //con la BD que fue definida en dicha clase
    Concexion miConexion = new Concexion();

    //2.Objeto tipo Connetion para que una vez se a hecho la conexion con la BD, 
    //vesta interfaz pueda trabajar que existe en la BD
    Connection cn = miConexion.concexionBD();

    //3.-Crear el metodo que trabajara con la tabla grafica de la ventana
    //para mostrar los datos que se obtengan de la BD en Xampp
    public void MostarDatos() {

        //3.1.- Definir el modelo de tabla que tendra los datos a mostrar
        DefaultTableModel miModeloTabla = new DefaultTableModel();

        //Establecer los encabezados de la tabla
        miModeloTabla.addColumn("PRODUCTO");
        miModeloTabla.addColumn("PRECIO");
        miModeloTabla.addColumn("EXISTENCIA");

        miTabla.setModel(miModeloTabla);

        //3.2.- Definir variables que permitan recibir los datos individuales
        //de cada registro proveniente de la BD
        String producto = "";
        double precio = 0.0;
        int existencia = 0;

        //3.3.- Definir un arreglo para colocar las variables que estan recibiendo
        //los datos provenientes de una BD en Xampp
        Object arr[] = new Object[3];

        //3.4.- Traer los datos desde la BD en Xampp
        //3.4.1.- Definir mediante una variable de tipo String la instruccion
        //que permite traer los datos desde una BD
        String sql = "SELECT * from productos";

        try {
            //3.4.2.- Establecer la apertura de base para ejecutar la instruccion
            //en la variable String sql
            Statement st = cn.createStatement();

            //3.4.3.- Ejecutar la orden para traer los datos desde la BD
            ResultSet rs = st.executeQuery(sql);
            //3.4.4.- Preparar la informacion que se trajo de la BD para que se
            //pueda presentar en la tabla de esta interfaz grafica
            while (rs.next()) {
                arr[0] = producto = rs.getString(2);
                arr[1] = precio = rs.getDouble(3);
                arr[2] = existencia = rs.getInt(4);

                //3.4.5.- Pasar el arreglo con informacion a la tabla
                miModeloTabla.addRow(arr);

            }
            //3.4.6.- Pasar el modelo tabla completo a la tabla grafica
            miTabla.setModel(miModeloTabla);

        } catch (SQLException ex) {
            Logger.getLogger(MostrarBaseDato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    public MostrarBaseDato() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        miTabla = new javax.swing.JTable();
        btnMostarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        miTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(miTabla);

        btnMostarDatos.setText("Mostrar Datos");
        btnMostarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(btnMostarDatos)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(btnMostarDatos)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostarDatosActionPerformed
        
        MostarDatos();
        
    }//GEN-LAST:event_btnMostarDatosActionPerformed

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
            java.util.logging.Logger.getLogger(MostrarBaseDato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarBaseDato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarBaseDato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarBaseDato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarBaseDato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostarDatos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable miTabla;
    // End of variables declaration//GEN-END:variables
}
