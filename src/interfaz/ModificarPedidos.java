/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author maximiliano
 */
import Datos.Cliente;
import Datos.Comida;
import Datos.Pedido;
import Datos.detallePedido;
import Datos.Telefonos;
import Datos.Zona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ModificarPedidos extends javax.swing.JFrame {
    Telefonos tel = new Telefonos();
    Cliente cli = new Cliente();
    Zona zona = new Zona();
    Pedido ped = new Pedido();
    Comida com = new Comida();
    detallePedido detalleped = new detallePedido();
    DefaultTableModel tablaClienteyPedido;
    DefaultTableModel tablaDetalleComidas;
    /**
     * Creates new form ModificarPedidos
     */
    public ModificarPedidos() {
        
        initComponents();
        jButtonEliminar.setEnabled(false);
        jButtonModificar.setEnabled(false);
        jTextFieldNumerodePedido.setEditable(false);
        jTextFieldNumerodePedido.setEnabled(false);
        String cabecera [] ={"Telefono","Nombre Cliente ","Apellido Cliente","Fecha","Horas","Zona","Domicilio"};
        tablaClienteyPedido = new DefaultTableModel();
        tablaDetalleComidas = new DefaultTableModel();
        jTable1TablaClientePedido.setModel(tablaClienteyPedido);
        setLocationRelativeTo(null);
        tablaClienteyPedido.setColumnIdentifiers(cabecera);
        String cabecera2 [] ={"idComida","Descripcion","Cantidad","Precio Unitario","Precio Total"};
        jTable3TablaComidaCliente.setModel(tablaDetalleComidas);
        tablaDetalleComidas.setColumnIdentifiers(cabecera2);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabelNumerodePedido = new javax.swing.JLabel();
        jTextFieldNumerodePedido = new javax.swing.JTextField();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabelComentario = new javax.swing.JLabel();
        jButton1BuscarXTelefono = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButton1VolverAtras = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1TablaClientePedido = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3TablaComidaCliente = new javax.swing.JTable();
        jButton2EliminarPedido = new javax.swing.JButton();
        jButton1ModificarComida = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("BuscarPedido"));

        jLabelNumerodePedido.setText("Numero de Pedido:");

        jLabelTelefono.setText("Telefono:");

        jTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoActionPerformed(evt);
            }
        });

        jLabelComentario.setText("(*)Para Buscar el pedido ingrese el codigo del pedido o el telefono del cliente ");

        jButton1BuscarXTelefono.setText("buscar");
        jButton1BuscarXTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1BuscarXTelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNumerodePedido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNumerodePedido, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelTelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1BuscarXTelefono))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabelComentario)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumerodePedido)
                    .addComponent(jTextFieldNumerodePedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefono)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1BuscarXTelefono))
                .addGap(26, 26, 26)
                .addComponent(jLabelComentario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonModificar.setText("Modificar Cliente");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButton1VolverAtras.setText("volver");
        jButton1VolverAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1VolverAtrasActionPerformed(evt);
            }
        });

        jTable1TablaClientePedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Telefono Cliente", "Nombre Cliente", "Apellido Cliente", "fechas", "horas", "Zona", "precioZona"
            }
        ));
        jScrollPane1.setViewportView(jTable1TablaClientePedido);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel1.setText("Clientes solicitados");

        jTable3TablaComidaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idComida", "Descripcion", "Cantidad", "precioUnitario", "precioTotal"
            }
        ));
        jScrollPane3.setViewportView(jTable3TablaComidaCliente);

        jButton2EliminarPedido.setText("Eliminar Pedido");

        jButton1ModificarComida.setText("Modificar Comida");
        jButton1ModificarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ModificarComidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2EliminarPedido)
                    .addComponent(jButton1ModificarComida))
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton1ModificarComida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2EliminarPedido)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel2.setText("Comidas de los clientes ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButton1VolverAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButtonModificar)
                        .addGap(33, 33, 33)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButton1VolverAtras))
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1VolverAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1VolverAtrasActionPerformed
        GestionarPedidos volverAtras = new GestionarPedidos();
        volverAtras.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1VolverAtrasActionPerformed

    private void jButton1BuscarXTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1BuscarXTelefonoActionPerformed
       
        // Tengo que buscar el telefono, luego buscar al cliente, 
            // una ves que lo encuentor al cliente, traigo los datos personal para concer al cliente y
            // traer la zona y su precio. Despues ir a pedido, traer sus datos relacionado
            // con los datos de ése cliente. Luego para finalizar traer todos los detalle de sus pedidos
            // con sus Precio unitario y Total.
        // 2.- Tener en cuenta, que tendré que realizar 2 modulos,
        // a- modulo para cargar tabla Cliente y b-modulo cargar detalle comida
            String zonas="";
           float precioZona=0;
           
           try {
           ResultSet telefonos = tel.BuscarX(Integer.parseInt(jTextFieldTelefono.getText()));
           jButtonModificar.setEnabled(true);
            jButtonEliminar.setEnabled(true);
            if(telefonos.first()){
                 
              int idCli = telefonos.getInt("idCliente");
                  ResultSet clientes= cli.BuscarXConId(idCli);
                  if (clientes.first()){
                      ResultSet pedido= ped.BuscarXCliente(clientes.getInt("idCliente"));
                      if(pedido.first()){
                      int idPedido= pedido.getInt("idPedido");
                      jTextFieldNumerodePedido.setText(String.valueOf(idPedido));
                      cargarClientes(clientes, zonas,precioZona,idCli,telefonos,pedido);
                      ResultSet detallePed = detalleped.BuscarDetalles(idPedido);
                                            
                      cargarSuComida(detallePed, idPedido);
                      
//                      else{JOptionPane.showMessageDialog(this, "comida no existente ", "Advertencia", JOptionPane.INFORMATION_MESSAGE);}

//             else{JOptionPane.showMessageDialog(this, "detalle no existente ", "Advertencia", JOptionPane.INFORMATION_MESSAGE);}         
                      }
                                          
                            }
                          else{JOptionPane.showMessageDialog(this, "Id Cliente no son iguales ", "Advertencia", JOptionPane.INFORMATION_MESSAGE);}
                      }
                      else{
                JOptionPane.showMessageDialog(this, "Telefono no encontrado ", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
             jButtonModificar.setEnabled(false);
                jButtonEliminar.setEnabled(false);
            }
                      
                 } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModificarPedidos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ModificarPedidos.class.getName()).log(Level.SEVERE, null, ex);
            }
                  
            
           
                   
      
    }//GEN-LAST:event_jButton1BuscarXTelefonoActionPerformed
    public void cargarSuComida(ResultSet detallep,int idped) throws SQLException, ClassNotFoundException{
     if(detallep.first()){
         do{
          ResultSet comida = com.buscarConId(detallep.getInt("idComida"));
            if (idped==detallep.getInt("idPedido"))  
                
                   if(comida.first()) 

             do{                
                 if(comida.getInt("idComida")==detallep.getInt("idComida")){
               float precioTotal;
  tablaDetalleComidas.addRow(new Object []{comida.getInt("idComida"),comida.getString("descripcion"),detallep.getInt("cantidad"),comida.getFloat("precio"),precioTotal=detallep.getInt("cantidad")*comida.getFloat("precio")});           
                 
                 }                         
           }while(comida.next());
           }while(detallep.next());
         }
    
    }
    public void cargarClientes (ResultSet clie, String zonas,float precioZona,int idCli,ResultSet tele,ResultSet pedido) throws SQLException, ClassNotFoundException{
    if(clie.getInt("zona")==1){
                           zonas="centrica";
                           ResultSet zonaaa= zona.BuscarPorZona(zonas);
                           if(zonaaa.first()){
                               precioZona = zonaaa.getFloat("precio");
                           }
                       else{ zonas="no centrica"; 
                              precioZona=zona.getRsDatos().getFloat("precio");}
                           if(idCli== clie.getInt("idCliente")){
                       
   tablaClienteyPedido.addRow(new Object[]{tele.getInt("numero"),clie.getString("nombre"),clie.getString("apellido"),pedido.getDate("fecha"),pedido.getTime("hora"),zonas,clie.getString("domicilio")});
    
    }

}
}   
    private void jTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
                modificarDatosCliente modificarDtsClient = new modificarDatosCliente();
            
        int posicion= jTable1TablaClientePedido.getSelectedRow();
        if(jTable1TablaClientePedido.getSelectedRows().length > 0){
                 int i=0;
                 while(i <tablaClienteyPedido.getRowCount()){
                     if (i==posicion){
                         modificarDtsClient.jTextField4modficiarTelef.setText(tablaClienteyPedido.getValueAt(posicion, 0).toString());
                         modificarDtsClient.jTextField1modfNombCli.setText(tablaClienteyPedido.getValueAt(posicion, 1).toString());
                         modificarDtsClient.jTextField2modfApellCli.setText(tablaClienteyPedido.getValueAt(posicion, 2).toString());
                         modificarDtsClient.jTextField1modDomicilio.setText(tablaClienteyPedido.getValueAt(posicion, 6).toString());
                          
//                         modificarDtsClient.setTelefono((int)tablaClienteyPedido.getValueAt(posicion, 0));
//                          telefono =;
//                         modificarDtsClient.setNombre(tablaClienteyPedido.getValueAt(posicion, 1).toString());
//                          nombre= ;
//                         modificarDtsClient.setApellido(tablaClienteyPedido.getValueAt(posicion, 2).toString());
//                          apellido = ;
                         
                          if(tablaClienteyPedido.getValueAt(posicion, 5).equals("centrica")){
                              modificarDtsClient.jTextField3modfZona.setText("centrica");
                              
//                              modificarDtsClient.setPrecioZona((float)tablaClienteyPedido.getValueAt(posicion, 6));
//                              precioZona=;
//                             modificarDtsClient.setZona(1);
                          }
                          else
                          { 
//                              modificarDtsClient.setPrecioZona((float)tablaClienteyPedido.getValueAt(posicion, 6));
//                             modificarDtsClient.setZona(0);
                          }
                          i=i+1;
                         }                          }
                
        }
        else 
        {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione la fila que desa modificar", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        }
        modificarDtsClient.setVisible(true);
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
       Telefonos tel = new Telefonos();
       Cliente cli = new Cliente();
        int posicion= jTable1TablaClientePedido.getSelectedRow();
       
        if(jTable1TablaClientePedido.getSelectedRows().length > 0){
                 int i=0;
                 while(i <tablaClienteyPedido.getRowCount()){
                     if (i==posicion){
                         try {
                             ResultSet tele = tel.BuscarX((int) tablaClienteyPedido.getValueAt(posicion,0));
                             if(tele.first()){
                                 ResultSet buscCli = cli.BuscarXConId(tele.getInt("idCliente"));
                                 if(buscCli.first()){
                                     if(tele.getInt("idCliente")== buscCli.getInt("idCliente")){
                                    cli.eliminarCliente(0, tele.getInt("idCliente"));
                                    JOptionPane.showMessageDialog(this, "Eliminacion Realizada", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                                     }
                                 }
                                 else {
                                 JOptionPane.showMessageDialog(this, "Cliente Inexistente", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                                 }
                             } 
                             else {
                             JOptionPane.showMessageDialog(this, "Telefono Inexistente", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                             }
                         } catch (ClassNotFoundException ex) {
                             Logger.getLogger(ModificarPedidos.class.getName()).log(Level.SEVERE, null, ex);
                         } catch (SQLException ex) {
                             Logger.getLogger(ModificarPedidos.class.getName()).log(Level.SEVERE, null, ex);
                         }
                          }
                         
                          i=i+1;
                    }                          
        }
        else{
        JOptionPane.showMessageDialog(this, "Seleccione al cliente que desea Eliminar", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        }      
       
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButton1ModificarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ModificarComidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ModificarComidaActionPerformed
        
    
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
            java.util.logging.Logger.getLogger(ModificarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1BuscarXTelefono;
    private javax.swing.JButton jButton1ModificarComida;
    private javax.swing.JButton jButton1VolverAtras;
    private javax.swing.JButton jButton2EliminarPedido;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelComentario;
    private javax.swing.JLabel jLabelNumerodePedido;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1TablaClientePedido;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3TablaComidaCliente;
    private javax.swing.JTextField jTextFieldNumerodePedido;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
