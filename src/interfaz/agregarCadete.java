/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author NICOLAS
 */

import Datos.Cadete;
//import Datos.Usuarios;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class agregarCadete extends javax.swing.JFrame {

    /**
     * Creates new form agregarEmpleado
     */
    public agregarCadete() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    int idCadete = 0;
//    public agregarCadete(JFrame Padre){
//    
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1DNI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1Nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1Apellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField1Email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField1Domicilio = new javax.swing.JTextField();
        jButton1Cancelar = new javax.swing.JButton();
        jButton2Aceptar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DNI");

        jLabel2.setText("Nombre");

        jTextField1Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1NombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido");

        jLabel5.setText("E-mail");

        jLabel6.setText("Domicilio");

        jButton1Cancelar.setText("Cancelar");
        jButton1Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CancelarActionPerformed(evt);
            }
        });

        jButton2Aceptar.setText("Aceptar");
        jButton2Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2AceptarActionPerformed(evt);
            }
        });

        jLabel7.setText("Alta Cadete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1DNI)
                            .addComponent(jTextField1Domicilio, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jTextField1Apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jTextField1Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jTextField1Email, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))))
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1Cancelar)
                .addGap(34, 34, 34)
                .addComponent(jButton2Aceptar)
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1Domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1Cancelar)
                    .addComponent(jButton2Aceptar))
                .addGap(110, 110, 110))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1NombreActionPerformed

    private void jButton2AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2AceptarActionPerformed
        // agregar empleado(registrar en BD) y luego limpiar los campos
        // 
try{
        Cadete cadete = new Cadete();
        if(verifcarCampos()){
            cadete.setDni(Integer.parseInt(jTextField1DNI.getText()));
            cadete.setNombre(jTextField1Nombre.getText());
            cadete.setApellido(jTextField1Apellido.getText());
            cadete.setDomicilio(jTextField1Domicilio.getText());
            idCadete= cadete.Insertar();
            
            JOptionPane.showMessageDialog(this, "Se cargó un Cadete ", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            jTextField1DNI.requestFocus();
            limpiarVariables();
        }
        }catch (Exception ex) 
        {                 
            JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR!!", JOptionPane.ERROR_MESSAGE);       
        }       
        
    }//GEN-LAST:event_jButton2AceptarActionPerformed

    private void jButton1CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1CancelarActionPerformed

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
            java.util.logging.Logger.getLogger(agregarCadete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregarCadete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregarCadete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregarCadete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregarCadete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Cancelar;
    private javax.swing.JButton jButton2Aceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1Apellido;
    private javax.swing.JTextField jTextField1DNI;
    private javax.swing.JTextField jTextField1Domicilio;
    private javax.swing.JTextField jTextField1Email;
    private javax.swing.JTextField jTextField1Nombre;
    // End of variables declaration//GEN-END:variables

private boolean verifcarCampos() 
    {
     if(!"".equals(jTextField1DNI.getText())){
         if(!"".equals(jTextField1Nombre.getText())){
             if(!"".equals(jTextField1Apellido.getText()))
             {
                if( !"".equals(jTextField1Domicilio.getText())){
                       return true;
                       }
                else return false;
                 }
             else return false;
         }                
         else return false;
     }
     else return false;
     }   

    private void limpiarVariables() {
        idCadete =0;
        jTextField1DNI.setText("");
        jTextField1Nombre.setText("");
        jTextField1Apellido.setText("");
        jTextField1Domicilio.setText("");
        jTextField1Email.setText("");
    }

}

