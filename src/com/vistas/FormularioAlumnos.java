/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vistas;

import com.colegio.Alumno;
import javax.swing.JOptionPane;

/**
 *
 * @author Hernandez Fernando
 */
public class FormularioAlumnos extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public FormularioAlumnos() {
        initComponents();
        setSize(800, 600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSouth = new javax.swing.JPanel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jPanelCenter = new javax.swing.JPanel();
        jLabelLegajo = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldLegajo = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(800, 600));
        setVisible(true);

        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setPreferredSize(new java.awt.Dimension(120, 100));
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanelSouth.add(jButtonGuardar);

        jButtonNuevo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.setPreferredSize(new java.awt.Dimension(120, 100));
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });
        jPanelSouth.add(jButtonNuevo);

        jButtonSalir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.setPreferredSize(new java.awt.Dimension(120, 100));
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanelSouth.add(jButtonSalir);

        getContentPane().add(jPanelSouth, java.awt.BorderLayout.PAGE_END);

        jPanelCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLegajo.setFont(new java.awt.Font("Segoe Print", 0, 36)); // NOI18N
        jLabelLegajo.setText("Legajo:");
        jPanelCenter.add(jLabelLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabelApellido.setFont(new java.awt.Font("Segoe Print", 0, 36)); // NOI18N
        jLabelApellido.setText("Apellido:");
        jPanelCenter.add(jLabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabelNombre.setFont(new java.awt.Font("Segoe Print", 0, 36)); // NOI18N
        jLabelNombre.setText("Nombre:");
        jPanelCenter.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jTextFieldNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextFieldNombre.setPreferredSize(new java.awt.Dimension(141, 65));
        jPanelCenter.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 550, -1));

        jTextFieldLegajo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldLegajo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextFieldLegajo.setPreferredSize(new java.awt.Dimension(141, 65));
        jPanelCenter.add(jTextFieldLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 550, -1));

        jTextFieldApellido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextFieldApellido.setPreferredSize(new java.awt.Dimension(141, 65));
        jPanelCenter.add(jTextFieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 550, -1));

        getContentPane().add(jPanelCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        // TODO add your handling code here:
        jTextFieldApellido.setText("");
        jTextFieldNombre.setText("");
        jTextFieldLegajo.setText("");
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        int legajo = Integer.parseInt(jTextFieldLegajo.getText());
        String apellido = jTextFieldApellido.getText();
        String nombre = jTextFieldNombre.getText();
        
        Alumno alumno = new Alumno(legajo, apellido, nombre);
        VistaPrincipal.alumnosSet.add(alumno);
        JOptionPane.showMessageDialog(null, "Alumno guardado exitosamente.");
        
        jTextFieldApellido.setText("");
        jTextFieldLegajo.setText("");
        jTextFieldNombre.setText("");
    }//GEN-LAST:event_jButtonGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelLegajo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanelCenter;
    private javax.swing.JPanel jPanelSouth;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldLegajo;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
