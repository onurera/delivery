/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Datos.Cadete;
import Datos.Pedido;
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
public class ConfirmarPedidos extends javax.swing.JFrame {
    
    /**
     * Creates new form ConfirmarPedidos
     * @param pedPadre
     */
    Pedido ped;     
    public ConfirmarPedidos() {
        initComponents();
        buscarParaFiltrar("");
        setLocationRelativeTo(null);
    }

//    private ConfirmarPedidos() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCadetes = new javax.swing.JLabel();
        jLabelNumerodePedido = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButtonVolver = new javax.swing.JButton();
        jButtonConfirmar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1Cadete = new javax.swing.JTable();
        jTextFieldDniCadete = new javax.swing.JTextField();
        jButton1BuscarAlCade = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelCadetes.setText("Dni o Nombre y apellido");

        jLabelNumerodePedido.setText("Numero de Pedido:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonConfirmar.setText("Confirmar");

        jTable1Cadete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idCadete", "Nombre", "Apellido", "DniCadete", "EstadoCadete"
            }
        ));
        jScrollPane1.setViewportView(jTable1Cadete);

        jTextFieldDniCadete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDniCadeteActionPerformed(evt);
            }
        });
        jTextFieldDniCadete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDniCadeteKeyReleased(evt);
            }
        });

        jButton1BuscarAlCade.setText("Buscar");
        jButton1BuscarAlCade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1BuscarAlCadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNumerodePedido)
                                    .addComponent(jLabelCadetes))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldDniCadete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1BuscarAlCade))
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonConfirmar)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumerodePedido)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadetes)
                    .addComponent(jTextFieldDniCadete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1BuscarAlCade))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolver)
                    .addComponent(jButtonConfirmar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
        DatosPedidos Volver = new DatosPedidos();
        Volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButton1BuscarAlCadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1BuscarAlCadeActionPerformed
                Cadete CA= new Cadete();
                String estadoCadete= "";
        String cabecera[]={"idcadete","Nombre","Apellido","DNI","EstadoCadete"};
        String datos[][]={};
        DefaultTableModel modelo = new DefaultTableModel(datos,cabecera);
        jTable1Cadete.setModel(modelo);
        try {
            ResultSet traer= CA.traerCadetes();
            if(traer.first())
            {
            do{
                int idcadete = traer.getInt("idcadete");
                String nombre = traer.getString("nombre");
                String apellido = traer.getString("apellido");
                int doc = traer.getInt("dni");
                if(traer.getInt("estadoCadete")==1){
                     estadoCadete= "Ocuado";
                }
                else
                {
                    estadoCadete = "Desocupado";
                }
                Object fila[]= {idcadete,nombre,apellido,doc,estadoCadete};
              modelo.addRow(fila);
            } while(traer.next());
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConfirmarPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ConfirmarPedidos.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }//GEN-LAST:event_jButton1BuscarAlCadeActionPerformed

    private void jTextFieldDniCadeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDniCadeteActionPerformed
        
    }//GEN-LAST:event_jTextFieldDniCadeteActionPerformed
    public void buscarParaFiltrar(String valor){
             Cadete CA = new Cadete();
        //Cadete CA = new Cadete();
        String cabecera[]={"idcadete","Nombre","Apellido","DNI","EstadoCadete"};
        String datos[][]={};
        DefaultTableModel modelo = new DefaultTableModel(datos,cabecera);
        jTable1Cadete.setModel(modelo);
        try {
            
            ResultSet cadete = CA.buscarParaFiltrar(valor);
            
            if( cadete.first()){
              int idcadete = cadete.getInt("idcadete");
              String nombre = cadete.getString("nombre");
              String apellido = cadete.getString("apellido");
              int doc = cadete.getInt("dni");
              Object fila[]= {idcadete,nombre,apellido,doc};
              modelo.addRow(fila);              
              
            }
            else
            {
                
                JOptionPane.showMessageDialog(this, "El cadete no existe ", "Error!!", JOptionPane.INFORMATION_MESSAGE);
//                jLabelMensajeError.setText("Cadete Inexistente - Para Agregar presione nuevo cadedete");
//                jButtonEliminar.setEnabled(false);
//                jButtonModificar.setEnabled(false);
                
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(interfazABMCadete.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(interfazABMCadete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jTextFieldDniCadeteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDniCadeteKeyReleased
        buscarParaFiltrar(jTextFieldDniCadete.getText());
    }//GEN-LAST:event_jTextFieldDniCadeteKeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        int id=ped.getId();
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConfirmarPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1BuscarAlCade;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelCadetes;
    private javax.swing.JLabel jLabelNumerodePedido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1Cadete;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldDniCadete;
    // End of variables declaration//GEN-END:variables
}
