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
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class interfazABMCadete extends javax.swing.JFrame {

    /**
     * Creates new form interfazUsuarioAdmi
     */
    public interfazABMCadete() {
       
        initComponents();
        jButton1AgregarEmpleado.setEnabled(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1AgregarEmpleado = new javax.swing.JButton();
        jTextField1Buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2BuscarEmpleado = new javax.swing.JButton();
        jButton2Modificar = new javax.swing.JButton();
        jButton3EliminarEmpleado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1DatosPersonalesEmp = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jButton1AgregarEmpleado.setText("Agregar ");
        jButton1AgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AgregarEmpleadoActionPerformed(evt);
            }
        });

        jTextField1Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1BuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario");

        jButton2BuscarEmpleado.setText("Buscar");
        jButton2BuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2BuscarEmpleadoActionPerformed(evt);
            }
        });

        jButton2Modificar.setText("Modiicar ");
        jButton2Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ModificarActionPerformed(evt);
            }
        });

        jButton3EliminarEmpleado.setText("Eliminar ");
        jButton3EliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3EliminarEmpleadoActionPerformed(evt);
            }
        });

        jTable1DatosPersonalesEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "IdCadete", "Nombre", "Apellido", "dni"
            }
        ));
        jScrollPane1.setViewportView(jTable1DatosPersonalesEmp);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("VENTANA ABM DE CADETES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1AgregarEmpleado))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jButton2Modificar)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jButton3EliminarEmpleado))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2BuscarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(186, 186, 186))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2BuscarEmpleado))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1AgregarEmpleado)
                    .addComponent(jButton2Modificar)
                    .addComponent(jButton3EliminarEmpleado))
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1AgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AgregarEmpleadoActionPerformed
        // TODO add your handling code here:
        // ocultarr la interaz general y luego visualizar la ventana agregar empleado
        JFrame view = new agregarCadete();
        view.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1AgregarEmpleadoActionPerformed

    private void jTextField1BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1BuscarActionPerformed
        // TODO add your handling code here:
         //ESTOY AQUIIIIIIIIIIIIIII        

        Cadete CA = new Cadete();
   
        String cabecera[]={"idcadete","Nombre","Apellido","DNI"};
        String datos[][]={};
        DefaultTableModel modelo = new DefaultTableModel(datos,cabecera);
        jTable1DatosPersonalesEmp.setModel(modelo);
        try {
            
            ResultSet cadete = CA.buscarX(Integer.parseInt(jTextField1Buscar.getText()));
           
            if( cadete.first()){
              int idcadete = cadete.getInt("idcadete");
              String nombre = cadete.getString("nombre");
              String apellido = cadete.getString("apellido");
              int doc = cadete.getInt("dni");
              Object fila[]= {idcadete,nombre,apellido,doc};
              modelo.addRow(fila);     
              jButton1AgregarEmpleado.setEnabled(false);

            }
            else
            {
                jButton1AgregarEmpleado.setEnabled(true);
                JOptionPane.showMessageDialog(this, "El cadete no existe ", "Error!!", JOptionPane.INFORMATION_MESSAGE);

                
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(interfazABMCadete.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(interfazABMCadete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextField1BuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ModificarActionPerformed

        

        // TRABAJAR CREAR UN OBJETO DE LA CLASE TABLA PARA MODIICAR LOS CAMPOS EXPUESTOS EN LA TABLA
        // 
    }//GEN-LAST:event_jButton2ModificarActionPerformed

    private void jButton3EliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3EliminarEmpleadoActionPerformed
    if(jTable1DatosPersonalesEmp.getSelectedRows().length > 0){
              
        Cadete CA = new Cadete();
        try {
           
            CA.eliminardni(Integer.parseInt(jTextField1Buscar.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(interfazABMCadete.class.getName()).log(Level.SEVERE, null, ex);
        }
        //} catch (ClassNotFoundException ex) {
          //  Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
       // }
        JOptionPane.showMessageDialog(this, "El Cliente se Elimino Correctamente", "FastFoodSystem", JOptionPane.OK_OPTION);
       
                        
       
    }
else{
           JOptionPane.showMessageDialog(this,  " No Seleccionó ningun cadete", "AlToque Fast Food", JOptionPane.ERROR_MESSAGE);
       }
    
    //TRABAJAR CREAR UN OBJETO DE LA CLASE TABLA PARA MODIICAR LOS CAMPOS EXPUESTOS EN LA TABLA
    }//GEN-LAST:event_jButton3EliminarEmpleadoActionPerformed

    private void jButton2BuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2BuscarEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2BuscarEmpleadoActionPerformed
    
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
            java.util.logging.Logger.getLogger(interfazABMCadete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazABMCadete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazABMCadete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazABMCadete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new interfazABMCadete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1AgregarEmpleado;
    private javax.swing.JButton jButton2BuscarEmpleado;
    private javax.swing.JButton jButton2Modificar;
    private javax.swing.JButton jButton3EliminarEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1DatosPersonalesEmp;
    private javax.swing.JTextField jTextField1Buscar;
    // End of variables declaration//GEN-END:variables
}
