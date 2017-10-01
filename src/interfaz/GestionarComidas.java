/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;


import Datos.Comida;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maximiliano
 */

public class GestionarComidas extends javax.swing.JFrame {

    /**
     * Creates new form GestionarComidas
     */
    public GestionarComidas() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBuscarComida = new javax.swing.JPanel();
        jLabelDescripcion = new javax.swing.JLabel();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonAgregarComida = new javax.swing.JButton();
        jButtonModificarComida = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableComidas = new javax.swing.JTable();
        jButton1VolverMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBuscarComida.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Comida"));

        jLabelDescripcion.setText("Descripcion");

        jTextFieldDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescripcionActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBuscarComidaLayout = new javax.swing.GroupLayout(jPanelBuscarComida);
        jPanelBuscarComida.setLayout(jPanelBuscarComidaLayout);
        jPanelBuscarComidaLayout.setHorizontalGroup(
            jPanelBuscarComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarComidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonBuscar)
                .addContainerGap())
        );
        jPanelBuscarComidaLayout.setVerticalGroup(
            jPanelBuscarComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarComidaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelBuscarComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescripcion)
                    .addComponent(jTextFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonAgregarComida.setText("Agregar Comida");
        jButtonAgregarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarComidaActionPerformed(evt);
            }
        });

        jButtonModificarComida.setText("Modificar Comida");
        jButtonModificarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarComidaActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar Comida");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jTableComidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableComidas);

        jButton1VolverMenu.setText("Volver al Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBuscarComida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAgregarComida)
                        .addGap(53, 53, 53)
                        .addComponent(jButtonModificarComida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jButtonEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jButton1VolverMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanelBuscarComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregarComida)
                    .addComponent(jButtonModificarComida)
                    .addComponent(jButtonEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1VolverMenu)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescripcionActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldDescripcionActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        mostrartabla();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonAgregarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarComidaActionPerformed
        // TODO add your handling code here:
        AgregarComida abrir = new AgregarComida();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAgregarComidaActionPerformed

    private void jButtonModificarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarComidaActionPerformed
        // TODO add your handling code here:
        ModificarComida MC = new ModificarComida();
        
        
        int fila = jTableComidas.getSelectedRow();
        
       if(fila>=0){
       MC.setVisible(true);
       this.setVisible(false);
       MC.jTextFieldCodigo.setText(jTableComidas.getValueAt(fila, 0).toString());
       MC.jTextFieldDescipcion.setText(jTableComidas.getValueAt(fila, 1).toString());
       MC.jTextFieldPrecio.setText(jTableComidas.getValueAt(fila, 2).toString());
       MC.jTextFieldEstado.setText(jTableComidas.getValueAt(fila, 3).toString());
       
       }else{
       JOptionPane.showMessageDialog(null, "fila no seleccionada");}
    }//GEN-LAST:event_jButtonModificarComidaActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        Comida Co = new Comida();
        int fila = jTableComidas.getSelectedRow();
        String valor=jTableComidas.getValueAt(fila, 0).toString();
        if(fila>=0){
        Co.eliminar2(valor);
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    void mostrartabla() {
    Comida CO = new Comida();
    String cabecera[]={"Codigo","Descripcion","Precio","Estado"};
    String datos[][]={};
    DefaultTableModel modelo = new DefaultTableModel(datos,cabecera);
    jTableComidas.setModel(modelo);
    
    try {
            
            ResultSet comida = CO.buscarX(jTextFieldDescripcion.getText());//buscarX(Integer.parseInt(jTextField1Buscar.getText()));
            
            if( comida.first()/*cadete.first()*/){
              int idcomida = comida.getInt("idcomida");//cadete.getInt("idcadete");
              String Descripcion = comida.getString("Descripcion");
              float Precio = comida.getFloat("Precio");
              Boolean estado = comida.getBoolean("estadoComida");
              Object fila[]= {idcomida,Descripcion,Precio,estado};
              modelo.addRow(fila);
              }
            else
            {
                
                JOptionPane.showMessageDialog(this, "La comida no existe ", "Error!!", JOptionPane.INFORMATION_MESSAGE);
//                jLabelMensajeError.setText("Cadete Inexistente - Para Agregar presione nuevo cadedete");
//                jButtonEliminar.setEnabled(false);
//                jButtonModificar.setEnabled(false);
                
            }
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionarComidas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GestionarComidas.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
    
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
            java.util.logging.Logger.getLogger(GestionarComidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarComidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarComidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarComidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarComidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1VolverMenu;
    private javax.swing.JButton jButtonAgregarComida;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonModificarComida;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JPanel jPanelBuscarComida;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableComidas;
    private javax.swing.JTextField jTextFieldDescripcion;
    // End of variables declaration//GEN-END:variables
}
