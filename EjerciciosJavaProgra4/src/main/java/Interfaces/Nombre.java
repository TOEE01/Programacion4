/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Interfaces;

import java.awt.JobAttributes;
import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author apriz
 */
public class Nombre extends javax.swing.JInternalFrame {

    /**
     * Creates new form Nombre
     */
    public Nombre() {
        initComponents();
        this.setSize(400,300);
        this.setTitle("Nombre mas fecha actual");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        jblNOmbre = new javax.swing.JLabel();
        jblApellido = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 117, -1));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 117, -1));

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jblNOmbre.setText("Nombre");
        getContentPane().add(jblNOmbre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jblApellido.setText("Apellido");
        getContentPane().add(jblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String nombrecompleto;
        
        Date fecha = new Date();
        nombrecompleto = nombre +" "+ apellido +" "+ fecha;
        
        //fecha = System.out.print(new Date());//
        
        JOptionPane.showMessageDialog(null, "Tu nombre es: " + nombrecompleto ," ",JOptionPane.PLAIN_MESSAGE);
        
    }//GEN-LAST:event_btnGenerarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JLabel jblApellido;
    private javax.swing.JLabel jblNOmbre;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private String Date() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}