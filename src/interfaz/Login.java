/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import Datos.Usuarios;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author NICOLAS
 */
public class Login extends javax.swing.JFrame {
JFrame wiev;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        jTextFieldUsuario.setText("");
        jPasswordFieldContraseña.setText("");
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        setLocationRelativeTo(null);

        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3Titulo = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jLabel1Usuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1Aceptar = new javax.swing.JButton();
        jButton2Cancelar = new javax.swing.JButton();
        jLabel1Fondo = new javax.swing.JLabel();

        jLabel3Titulo.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel3Titulo.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3Titulo.setText("Bienvenido");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(240, 240));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldUsuario.setBackground(new java.awt.Color(255, 255, 204));
        jTextFieldUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 130, -1));

        jPasswordFieldContraseña.setBackground(new java.awt.Color(255, 255, 204));
        jPasswordFieldContraseña.setText("1234");
        jPasswordFieldContraseña.setToolTipText("");
        jPasswordFieldContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPasswordFieldContraseña.setMaximumSize(new java.awt.Dimension(111, 20));
        jPasswordFieldContraseña.setMinimumSize(new java.awt.Dimension(111, 20));
        jPasswordFieldContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldContraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 130, -1));

        jLabel1Usuario.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1Usuario.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        jLabel1Usuario.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1Usuario.setText("Usuario");
        getContentPane().add(jLabel1Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 70, 20));

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 90, 20));

        jButton1Aceptar.setBackground(new java.awt.Color(255, 255, 204));
        jButton1Aceptar.setForeground(new java.awt.Color(153, 0, 0));
        jButton1Aceptar.setText("Ingresar");
        jButton1Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, 90, 32));

        jButton2Cancelar.setBackground(new java.awt.Color(255, 255, 204));
        jButton2Cancelar.setForeground(new java.awt.Color(153, 0, 0));
        jButton2Cancelar.setText("Salir");
        getContentPane().add(jButton2Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 89, 32));

        jLabel1Fondo.setForeground(new java.awt.Color(204, 153, 0));
        jLabel1Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/loginn.png"))); // NOI18N
        getContentPane().add(jLabel1Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed
Usuarios user = new Usuarios();

    private void jButton1AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AceptarActionPerformed
        // TODO add your handling code here:
        //REALIZAR EL CONTROL DE LOS DATOS
        
        try {
            if (camposNoVacios()) {

                user.setNombreUsuario(jTextFieldUsuario.getText());
                boolean resp = user.verificarPass(user.getNombreUsuario(), Integer.parseInt(jPasswordFieldContraseña.getText()));
                if (resp == true) {
                    
                  //  ResultSet rs = user.BuscarX(user.getNombreUsuario());
                    
                    if(user.getNombreUsuario().equals("admin")){
                        JFrame view = new interfazAdmin(this, user);
                        view.setVisible(true);
                        setVisible(false);
                    }
                    else
                    if(user.getNombreUsuario().equals("empleado")){
                        JFrame view = new principalInterfazEncargado(this, user);
                        view.setVisible(true);
                        setVisible(false);
                    }
                    else if(user.getNombreUsuario().equals("cocina")){
                        JFrame view = new interazDetalleComidas(this, user);
                        view.setVisible(true);
                        setVisible(false);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "La contraseña ingresada es incorrecta", "ERROR!!", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Los Campos no pueden ser ", "ERROR!!", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1AceptarActionPerformed

    private void jPasswordFieldContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldContraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
public boolean camposNoVacios() {
        if (jTextFieldUsuario.getText().length() != 0) {
            if (jPasswordFieldContraseña.getText().length() != 0) {
                return true;
            }
        }
        return false;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Aceptar;
    private javax.swing.JButton jButton2Cancelar;
    private javax.swing.JLabel jLabel1Fondo;
    private javax.swing.JLabel jLabel1Usuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3Titulo;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}


//--------------------------------------------------------------------------------------------------------
//-----/

//package Presentacion;
//import Datos.Usuario;
//import java.awt.Dimension;
//import java.awt.Toolkit;
//import java.sql.ResultSet;
//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;
