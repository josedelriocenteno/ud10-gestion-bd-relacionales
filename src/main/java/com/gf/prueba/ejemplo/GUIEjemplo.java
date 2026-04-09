package com.gf.prueba.ejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author delcenjo
 */
public class GUIEjemplo extends javax.swing.JFrame {

    public static final String url = "jdbc:mysql://localhost:3306/ejemplo";
    public Connection conn;
    
    public GUIEjemplo() {
        initComponents();
        setFrame();
    }

    private void setFrame(){
        this.setTitle("Prueba Conexión BD");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuBD = new javax.swing.JMenu();
        jMenuItemSELECT = new javax.swing.JMenuItem();
        jMenuItemINSERT = new javax.swing.JMenuItem();
        jMenuItemUPDATE = new javax.swing.JMenuItem();
        jMenuItemDELETE = new javax.swing.JMenuItem();
        jMenuAplicacion = new javax.swing.JMenu();
        jMenuItemSALIR = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jMenuBD.setText("BD");

        jMenuItemSELECT.setText("Consultar todos");
        jMenuItemSELECT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSELECTActionPerformed(evt);
            }
        });
        jMenuBD.add(jMenuItemSELECT);

        jMenuItemINSERT.setText("Insertar");
        jMenuBD.add(jMenuItemINSERT);

        jMenuItemUPDATE.setText("Modificar");
        jMenuBD.add(jMenuItemUPDATE);

        jMenuItemDELETE.setText("Borrar");
        jMenuBD.add(jMenuItemDELETE);

        jMenuBar1.add(jMenuBD);

        jMenuAplicacion.setText("Aplicación");

        jMenuItemSALIR.setText("Salir");
        jMenuItemSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSALIRActionPerformed(evt);
            }
        });
        jMenuAplicacion.add(jMenuItemSALIR);

        jMenuBar1.add(jMenuAplicacion);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSELECTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSELECTActionPerformed
        
        try{
            // 1. Abrir conexion
            conn = DriverManager.getConnection(url, "root", "");
            
            // 2. Ejecutar consulta --> SELECT
            String sql = "SELECT * FROM tabla1";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            // Proceso el conjunto de filas
            while(rs.next()){
                // Accedo a las columnas en la fila en la que estoy
                String fila = rs.getInt("id") + "i" + rs.getString("columna1") +
                        rs.getDouble("columna2");
                this.jTextArea1.append(fila + "\n");
            }
            
        } catch (SQLException e){
            System.out.println(e.getMessage());
        } finally{
            // 3. Cerrar conexion
            try{
                conn.close();
            } catch (SQLException e){
                System.err.println(e.getMessage());
            } finally{
                
            }
        }
        
    }//GEN-LAST:event_jMenuItemSELECTActionPerformed

    private void jMenuItemSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSALIRActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItemSALIRActionPerformed

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
            java.util.logging.Logger.getLogger(GUIEjemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIEjemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIEjemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIEjemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIEjemplo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAplicacion;
    private javax.swing.JMenu jMenuBD;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemDELETE;
    private javax.swing.JMenuItem jMenuItemINSERT;
    private javax.swing.JMenuItem jMenuItemSALIR;
    private javax.swing.JMenuItem jMenuItemSELECT;
    private javax.swing.JMenuItem jMenuItemUPDATE;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
