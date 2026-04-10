/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gf.ejercicios.almacen;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author delcenjo
 */
public class GUIAlmacen extends javax.swing.JFrame {

    public static final String url = "jdbc:mysql://localhost:3306/almacen";
    public static final String user = "root";
    public static final String pssw = "";

    public Connection conn;

    private DefaultComboBoxModel<TipoProducto> modeloCombo;
    private DefaultListModel<Producto> modeloLista;
    
    public GUIAlmacen() {
        initComponents();
        setFrame();
        cargarCombo();  // Consulta a la BD para traer (SELECT) todos los tipos de producto
    }
    
    private void setFrame(){  
        this.setTitle("Almacen");
        this.setPreferredSize(new Dimension(500, 300));
        this.pack();
        this.setLocationRelativeTo(null);
        
        modeloCombo = new DefaultComboBoxModel<>();
        this.jComboBox1.setModel(modeloCombo);
        
        modeloLista = new DefaultListModel<>();
        this.jList1.setModel(modeloLista);
    }

    private void cargarCombo(){
        
        // Elemento por elemento
        
        TipoProducto tipoDefault = new TipoProducto();
        tipoDefault.setTipo("(elige uno)");
        modeloCombo.addElement(tipoDefault);
        
        try{
            conn = DriverManager.getConnection(url, user, pssw);
            String sql = "SELECT * FROM tipos_producto";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                TipoProducto tipoProducto = new TipoProducto(rs.getInt("id_tipo"),
                        rs.getString("tipo"));
                modeloCombo.addElement(tipoProducto);
            }
            
        } catch (SQLException e){
            System.out.println(e.getMessage());
        } finally{
            try{
                conn.close();
            } catch (SQLException e){
                System.err.println(e.getMessage());
            }
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tipo producto:");
        jPanel1.add(jLabel1);

        jPanel1.add(jComboBox1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de productos"));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setViewportView(jList1);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GUIAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAlmacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<TipoProducto> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<Producto> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
