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
    private String dni;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
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
        jLabel6 = new javax.swing.JLabel();
        jTextField1Domicilio = new javax.swing.JTextField();
        jButton1Cancelar = new javax.swing.JButton();
        jButton2Aceptar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("DNI");

        jLabel2.setText("Nombre");

        jTextField1Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1NombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido");

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
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1DNI)
                            .addComponent(jTextField1Domicilio, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jTextField1Apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jTextField1Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))))
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
                .addContainerGap(14, Short.MAX_VALUE)
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
                .addGap(73, 73, 73)
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

     private boolean validarCampos(){
        try{
            //Long.parseLong(jTextFieldTelefono.getText());
            if(jTextField1Nombre.getText().length() <= 0){
                JOptionPane.showMessageDialog(this, "ERROR: El Nombre No Debe Ser Vacio", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if(jTextField1Apellido.getText().length() <= 0){
                JOptionPane.showMessageDialog(this, "ERROR: El Apellido No Debe Ser Vacio", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if(Integer.parseInt(jTextField1DNI.getText()) <=0 ){
                JOptionPane.showMessageDialog(this, "ERROR: El Documento No Debe Ser Vacio", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            //VER ESTO NO FUNCIONA
//            if ((jComboBoxTipoDoc.getSelectedIndex())<0 ){
//                JOptionPane.showMessageDialog(this, "-. ERROR: Debe seleccionar una opcion de tipo documento", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
//                return false;        
//            }
            
            if(jTextField1Domicilio.getText().length() <= 0){
                JOptionPane.showMessageDialog(this, "ERROR: El Domicilio No Debe Ser Vacio", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
                return false;
            }
//            if(jTextField1Email.getText().length() <= 0){
//                JOptionPane.showMessageDialog(this, "ERROR: El Email No Debe Ser Vacio", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
//                return false;
//            }
            return true;
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "ERROR: El Telefono No debe ser vacio", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
    } 
     
    public void desabilitar() {
        jTextField1DNI.setText(dni);
        jTextField1DNI.setEditable(false);

    } 
   
    
        
    private void jButton2AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2AceptarActionPerformed
        // agregar empleado(registrar en BD) y luego limpiar los campos
        // 
   if(validarCampos()){     
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
     }
   
    interfazABMCadete volverABMCadete= new interfazABMCadete();
        volverABMCadete.setVisible(true);
          setVisible(false);
                             
    }//GEN-LAST:event_jButton2AceptarActionPerformed

    private void jButton1CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CancelarActionPerformed
        // TODO add your handling code here:
        interfazABMCadete volverABMCadete= new interfazABMCadete();
        volverABMCadete.setVisible(true);
          setVisible(false);
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JTextField jTextField1Apellido;
    public javax.swing.JTextField jTextField1DNI;
    public javax.swing.JTextField jTextField1Domicilio;
    public javax.swing.JTextField jTextField1Nombre;
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
        //jTextField1Email.setText("");
    }

}

