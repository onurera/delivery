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
import Datos.Comida;
import Datos.Conexion;
import java.awt.HeadlessException;
import static java.lang.Character.UnicodeBlock.of;
import java.sql.Connection;
//import Datos.Usuarios;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import static java.lang.Character.UnicodeBlock.of;

public class modificarCadete extends javax.swing.JFrame {

    /**
     * Creates new form agregarEmpleado
     */
    public modificarCadete() {
   
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
        jTextField1Id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1Nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1Apellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField1Domicilio = new javax.swing.JTextField();
        jButton1Cancelar = new javax.swing.JButton();
        jButton2Aceptar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField1DNI1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel7.setText("ModificarCadete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jButton1Cancelar)
                .addGap(34, 34, 34)
                .addComponent(jButton2Aceptar)
                .addGap(115, 115, 115))
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
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1Id)
                            .addComponent(jTextField1Domicilio, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jTextField1Apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jTextField1Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jTextField1DNI1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1DNI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jTextField1Domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jTextField1Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
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

    private boolean validarCampos() {
        try {
            //Long.parseLong(jTextFieldTelefono.getText());
            if (jTextField1Nombre.getText().length() <= 0) {
                JOptionPane.showMessageDialog(this, "ERROR: El Nombre No Debe Ser Vacio", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if (jTextField1Apellido.getText().length() <= 0) {
                JOptionPane.showMessageDialog(this, "ERROR: El Apellido No Debe Ser Vacio", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if (Integer.parseInt(jTextField1Id.getText()) <= 0) {
                JOptionPane.showMessageDialog(this, "ERROR: El Documento No Debe Ser Vacio", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            //VER ESTO NO FUNCIONA
//            if ((jComboBoxTipoDoc.getSelectedIndex())<0 ){
//                JOptionPane.showMessageDialog(this, "-. ERROR: Debe seleccionar una opcion de tipo documento", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
//                return false;        
//            }

            if (jTextField1Domicilio.getText().length() <= 0) {
                JOptionPane.showMessageDialog(this, "ERROR: El Domicilio No Debe Ser Vacio", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
                return false;
            }
//            if (jTextField1Email.getText().length() <= 0) {
//                JOptionPane.showMessageDialog(this, "ERROR: El Email No Debe Ser Vacio", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
//                return false;
//            }
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ERROR: El Telefono No debe ser vacio", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }


    private void jButton2AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2AceptarActionPerformed
       
        int dni;
        dni = (Integer.parseInt(jTextField1DNI1.getText()));
        String nombre = jTextField1Nombre.getText();
        String apellido = jTextField1Apellido.getText();
        String domicilio = jTextField1Domicilio.getText();     
        String Idcadete = jTextField1Id.getText(); 
        //Cadete cadete = new Cadete();     
         
        //String SQL = "Select * from Cadete where dni = '" + dni + "' and estadoCadete= 1";
        
//      int adni=cadete.getDni();
//      String a=String.valueOf(adni);
    // if(dni!=a){
//            
      // if(validarCampos()){     
try{
//        Cadete cadete = new Cadete();
        if(verifcarCampos()){
             Cadete Co = new Cadete();
            Co.modificar2(Idcadete,dni,nombre,apellido,domicilio);          
            
           // jTextField1DNI.requestFocus();
            limpiarVariables();
        }
        }catch (NumberFormatException | HeadlessException ex) 
        {                 
            JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR!!", JOptionPane.ERROR_MESSAGE);       
        }       
     //} 
     
        //} 
        
    }//GEN-LAST:event_jButton2AceptarActionPerformed

    private void jButton1CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CancelarActionPerformed
        // TODO add your handling code here:
        JFrame volverABMCadete = new interfazABMCadete();
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
                new modificarCadete().setVisible(true);
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
    public javax.swing.JTextField jTextField1DNI1;
    public javax.swing.JTextField jTextField1Domicilio;
    public javax.swing.JTextField jTextField1Id;
    public javax.swing.JTextField jTextField1Nombre;
    // End of variables declaration//GEN-END:variables

    private boolean verifcarCampos() {
        if (!"".equals(jTextField1Id.getText())) {
            if (!"".equals(jTextField1Nombre.getText())) {
                if (!"".equals(jTextField1Apellido.getText())) {
                    if (!"".equals(jTextField1Domicilio.getText())) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void limpiarVariables() {
        idCadete = 0;
        jTextField1Id.setText("");
        jTextField1Nombre.setText("");
        jTextField1Apellido.setText("");
        jTextField1Domicilio.setText("");
        jTextField1DNI1.setText("");
    }

}
