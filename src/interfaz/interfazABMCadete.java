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
import Datos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class interfazABMCadete extends javax.swing.JFrame {
    
    private Statement sentencia;
    private ResultSet rsDatos;
    private DefaultTableModel modelo;
   // private TableRowSorter trsFiltro;
    private PreparedStatement psPrepSencencias;

    /**
     * Creates new form interfazUsuarioAdmi
     */
    public interfazABMCadete() {
   
        initComponents();
        this.setTitle("Gestionar Cadetes");
        try {
            cargarTablaCadetes();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(interfazABMCadete.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(interfazABMCadete.class.getName()).log(Level.SEVERE, null, ex);
        }
        jButton1AgregarEmpleado.setEnabled(false);
        
        this.setLocationRelativeTo(null);
        this.setTitle("Gestionar Cadete");
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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "IdCadete", "Nombre", "Apellido", "dni", "domicilio"
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
        jLabel2.setText("GESTION CADETES");

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
                                .addGap(17, 17, 17)
                                .addComponent(jButton3EliminarEmpleado)
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
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
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
        
        agregarCadete view = new agregarCadete();
        view.setDni(jTextField1Buscar.getText());
        view.desabilitar();
        view.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1AgregarEmpleadoActionPerformed
public void cargarTablaCadetes() throws ClassNotFoundException, SQLException {
        String datos[] = new String[5];
        DefaultTableModel dtm = (DefaultTableModel) jTable1DatosPersonalesEmp.getModel();
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        
            Connection conex = Conexion.Cadena();            
            String ConsultaSQL = "SELECT * FROM Cadete WHERE estadoCadete = '"+1+"' ";
            sentencia = conex.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(ConsultaSQL);
            while (rsDatos.next()) {
                datos[0] = rsDatos.getString(1);
                datos[1] = rsDatos.getString(3);
                datos[2] = rsDatos.getString(4);
                datos[3] = rsDatos.getString(2);
                datos[4] = rsDatos.getString(5);
                dtm.addRow(datos);
            }
        
            
        
    }

    private void jTextField1BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1BuscarActionPerformed
        // TODO add your handling code here:
         //ESTOY AQUIIIIIIIIIIIIIII        

        Cadete CA = new Cadete();
   
        String cabecera[]={"idcadete","Nombre","Apellido","DNI","domicilio"};
        String datos[][]={};
        DefaultTableModel modelo = new DefaultTableModel(datos,cabecera);
        jTable1DatosPersonalesEmp.setModel(modelo);
        try {
    if( verifcarCampos()){         
            ResultSet cadete = CA.buscarX(Integer.parseInt(jTextField1Buscar.getText()));
           
            if( cadete.first()){
              int idcadete = cadete.getInt("idcadete");
              String nombre = cadete.getString("nombre");
              String apellido = cadete.getString("apellido");
              int doc = cadete.getInt("dni");
              String domicilio = cadete.getString("domicilio");
              Object fila[]= {idcadete,nombre,apellido,doc,domicilio};
              modelo.addRow(fila);     
              jButton1AgregarEmpleado.setEnabled(false);
              jButton2Modificar.setEnabled(true);
              jButton3EliminarEmpleado.setEnabled(true);
            }
            else
            {
                jButton1AgregarEmpleado.setEnabled(true);
                JOptionPane.showMessageDialog(this, "El cadete no existe ", "Error!!", JOptionPane.INFORMATION_MESSAGE);
                jButton2Modificar.setEnabled(false);
                jButton3EliminarEmpleado.setEnabled(false);
            }
    }else{
        JOptionPane.showMessageDialog(this, "Escriba un DNI para Buscar o seleccione de la tabla ", "Error!!", JOptionPane.INFORMATION_MESSAGE);
        cargarTablaCadetes();
    }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(interfazABMCadete.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(interfazABMCadete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextField1BuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        principalInterfazEncargado volverMenu = new principalInterfazEncargado();
        volverMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ModificarActionPerformed

         // TODO add your handling code here:
        Cadete CA = new Cadete();
       modificarCadete MC = new modificarCadete();
       int filaseleccionada = jTable1DatosPersonalesEmp.getSelectedRow();

        if(filaseleccionada >= 0){
       
       MC.setVisible(true);
       this.setVisible(false);
       jTextField1Buscar.setText(jTable1DatosPersonalesEmp.getValueAt(filaseleccionada, 3).toString());
       MC.jTextField1DNI1.setText(jTable1DatosPersonalesEmp.getValueAt(filaseleccionada, 3).toString());
       MC.jTextField1Nombre.setText(jTable1DatosPersonalesEmp.getValueAt(filaseleccionada, 1).toString());
       MC.jTextField1Apellido.setText(jTable1DatosPersonalesEmp.getValueAt(filaseleccionada, 2).toString());
       MC.jTextField1Domicilio.setText(jTable1DatosPersonalesEmp.getValueAt(filaseleccionada, 4).toString());
//                           
    
        ResultSet cadete = null;
            try {
                cadete = CA.buscarX(Integer.parseInt(jTextField1Buscar.getText()));
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(interfazABMCadete.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            try {
                if( cadete.first()){
                    int idcadete = cadete.getInt("idcadete");
                    int doc = cadete.getInt("dni");
                       MC.dniant = Integer.parseInt(MC.jTextField1DNI1.getText());
                       MC.idcade=idcadete;
//                       JOptionPane.showMessageDialog(null,Integer.toString(MC.dniant));
//                       JOptionPane.showMessageDialog(null,Integer.toString(MC.idcade));
  
                       //MC.idcade=Integer.parseInt(MC.jTextField1DNI1.getText());

                    }
            } catch (SQLException ex) {
                Logger.getLogger(interfazABMCadete.class.getName()).log(Level.SEVERE, null, ex);
            }
             
  
        }else{
      JOptionPane.showMessageDialog(this,  " No Seleccionó ningun cadete", "", JOptionPane.ERROR_MESSAGE);
        }  
       
  

    }//GEN-LAST:event_jButton2ModificarActionPerformed
//
//     DefaultTableModel modelo = (DefaultTableModel) jTable1DatosPersonalesEmp.getModel();
//        int fila = jTable1DatosPersonalesEmp.getSelectedRow();
//        if(jTable1DatosPersonalesEmp.getSelectedRows().length > 0){
//         modificarCadete MC = new modificarCadete();        
//        MC.dniant=(int) jTable1DatosPersonalesEmp.getValueAt(fila, 3);
//        MC.idcade=(int) jTable1DatosPersonalesEmp.getValueAt(fila, 0);
////       JOptionPane.showMessageDialog(null, Integer.toString(MC.idcade));
//       //if(fila>=0){
//       MC.setVisible(true);
//       this.setVisible(false);           
//              
//       MC.jTextField1DNI1.setText(jTable1DatosPersonalesEmp.getValueAt(fila, 3).toString());
//       MC.jTextField1Nombre.setText(jTable1DatosPersonalesEmp.getValueAt(fila, 1).toString());
//       MC.jTextField1Apellido.setText(jTable1DatosPersonalesEmp.getValueAt(fila, 2).toString());
//       MC.jTextField1Domicilio.setText(jTable1DatosPersonalesEmp.getValueAt(fila, 4).toString());
//                 
////       }else{
////       JOptionPane.showMessageDialog(null, "fila no seleccionada");}   
//        }     else{
//      JOptionPane.showMessageDialog(null, "fila no seleccionada");}   
    
    private void jButton3EliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3EliminarEmpleadoActionPerformed

        Cadete CA = new Cadete();
        int filaseleccionada = jTable1DatosPersonalesEmp.getSelectedRow();
         
        if(filaseleccionada >= 0){           
       
        try {
            jTextField1Buscar.setText(jTable1DatosPersonalesEmp.getValueAt(filaseleccionada, 3).toString());
            CA.eliminardni(Integer.parseInt(jTextField1Buscar.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(interfazABMCadete.class.getName()).log(Level.SEVERE, null, ex);
        }
        //} catch (ClassNotFoundException ex) {
          //  Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
       // }
        JOptionPane.showMessageDialog(this, "El Cliente se Elimino Correctamente", "FastFoodSystem", JOptionPane.OK_OPTION);
            try {
                cargarTablaCadetes();
                jTextField1Buscar.setText("");
//        int cantidadfilas=jTable1DatosPersonalesEmp.getSelectedRowCount();
//        while(i<=cantidadfilas)  for(int i=cantidadfilas-1;i>=0;i--){
//        modelo.removeRow(i);
//        }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(interfazABMCadete.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(interfazABMCadete.class.getName()).log(Level.SEVERE, null, ex);
            }
        
                          
    }else{
           
           JOptionPane.showMessageDialog(this,  " No Seleccionó ningun cadete", "", JOptionPane.ERROR_MESSAGE);
       }
//             cargarTablaCadetes();
    //TRABAJAR CREAR UN OBJETO DE LA CLASE TABLA PARA MODIICAR LOS CAMPOS EXPUESTOS EN LA TABLA
    }//GEN-LAST:event_jButton3EliminarEmpleadoActionPerformed
    
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
    private javax.swing.JButton jButton2Modificar;
    private javax.swing.JButton jButton3EliminarEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1DatosPersonalesEmp;
    private javax.swing.JTextField jTextField1Buscar;
    // End of variables declaration//GEN-END:variables

    private int setText(Object valueAt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    private boolean verifcarCampos() 
    {
     if(!"".equals(jTextField1Buscar.getText())){
         return true;
     }
     else{ return false;
     }  
}
}