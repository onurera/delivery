/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author LucianoG
 */
import Datos.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public final  class modificarDatosCliente extends javax.swing.JFrame {

    /**
     * Creates new form modificarDatosCliente
     */
    public  int telefonoAnterior ;
    public  String nombre;
    public  String apellido ;
    public  float precioZona;
    public  int zona;
    public int idcliente;

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }
      ///CONSTRUCTOR 
    public modificarDatosCliente() {
        initComponents();
        setLocationRelativeTo(null);
        jTextFieldAuxIdCliente.setVisible(false);
        this.setTitle("Modificar Cliente");
        
    }

    public int getTelefono() {
        return telefonoAnterior;
    }

    public void setTelefono(int telefono) {
        this.telefonoAnterior = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getPrecioZona() {
        return precioZona;
    }

    public void setPrecioZona(float precioZona) {
        this.precioZona = precioZona;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1modfNombCli = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2modfApellCli = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3modfZona = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4modficiarTelef = new javax.swing.JTextField();
        jButton1volverAModificar = new javax.swing.JButton();
        jButton2AceptarModificar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1modDomicilio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldAuxIdCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre Cliente:");

        jLabel2.setText("Apellido Cliente:");

        jLabel3.setText("Zona:");

        jLabel4.setText("Telefono:");

        jButton1volverAModificar.setText("Volver");

        jButton2AceptarModificar.setText("Aceptar");
        jButton2AceptarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2AceptarModificarActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(204, 102, 0));
        jLabel6.setText("Modificar datos del Cliente");

        jLabel7.setText("Domicilio: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jButton1volverAModificar))
                            .addComponent(jLabel5))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField4modficiarTelef, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jTextField3modfZona, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(jTextField2modfApellCli)
                            .addComponent(jTextField1modfNombCli)
                            .addComponent(jTextField1modDomicilio)
                            .addComponent(jButton2AceptarModificar)
                            .addComponent(jTextFieldAuxIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4modficiarTelef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1modfNombCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2modfApellCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField1modDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3modfZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldAuxIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1volverAModificar)
                    .addComponent(jButton2AceptarModificar))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jButton2AceptarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2AceptarModificarActionPerformed
        Cliente cli = new Cliente();
        Telefonos tel = new Telefonos();
        String apellido,nombre,domicilio;
        int zonas=0;
      int  idCli=Integer.parseInt(jTextFieldAuxIdCliente.getText());
      int anttelefono;
        apellido=jTextField2modfApellCli.getText();
        nombre= jTextField1modfNombCli.getText(); 
        domicilio= jTextField1modDomicilio.getText();
        
        if(verificar()){
        int telefono= Integer.parseInt(jTextField4modficiarTelef.getText());
         JOptionPane.showMessageDialog(null,telefono);
        try {
              
           ResultSet buscarTele = tel.BuscarX(Integer.parseInt(jTextField4modficiarTelef.getText()));
           
              if( !buscarTele.first()){
                 
                  
                  ResultSet buscarCli;
                  //idCli = buscarTele.getInt("idCliente");
               
              // JOptionPane.showMessageDialog(null,getIdcliente());
                      
                  buscarCli = cli.BuscarXConId(idCli);
                 
                 
                 if(buscarCli.first()){
                     
                 
                     anttelefono= buscarCli.getInt("telefono");
                     ResultSet  Tele = tel.BuscarX(anttelefono);
                     if(Tele.first()){
                     int idTelDeeseCLi = Tele.getInt("idTel");
                       JOptionPane.showMessageDialog(null,idTelDeeseCLi);
                     if(jTextField3modfZona.getText().equals("centrica")){
                         zonas=1;
                      JOptionPane.showMessageDialog(this, "nuevo teleeee", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                      
                     cli.modificarDatos(idCli,apellido,nombre,domicilio,zonas,telefono);
                     tel.modificarTelefono(idTelDeeseCLi,telefono);
                     JOptionPane.showMessageDialog(this, "La modificacion fue un exito", "Advertencia", JOptionPane.INFORMATION_MESSAGE);          
                     }
                     else {
                  cli.modificarDatos(idCli,apellido,nombre,domicilio,zonas,telefono);
                 JOptionPane.showMessageDialog(this, "La modificacion fue un exito", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                     }
                     }
                 }else{
                 JOptionPane.showMessageDialog(this, "entreeeeeeeeeeeeeee", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                      
                 }
               
              }
              else if(telefono==telefonoAnterior){
                                JOptionPane.showMessageDialog(this, "mismo teleeee", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                      
                      
                 ResultSet buscarCli = cli.BuscarXConId(buscarTele.getInt("idCliente"));
                 if(buscarCli.first()){
                     if(jTextField3modfZona.getText().equals("centrica"))
                         zonas=1;
                     cli.modificarDatos(buscarTele.getInt("idCliente"),apellido,nombre,domicilio,zonas,telefono);
                     tel.modificarTelefono(buscarTele.getInt("idCliente"),telefono);
                     JOptionPane.showMessageDialog(this, "La modificacion fue un exito", "Advertencia", JOptionPane.INFORMATION_MESSAGE);          
                 }
                 else {
                  cli.modificarDatos(buscarTele.getInt("idCliente"),apellido,nombre,domicilio,zonas,telefono);
                 JOptionPane.showMessageDialog(this, "La modificacion fue un exito", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                 }
              }
              else{
              JOptionPane.showMessageDialog(this, "EL TELEFONO INGRESADO YA EXISTE", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
              }
          } catch (ClassNotFoundException | SQLException ex) {
              Logger.getLogger(modificarDatosCliente.class.getName()).log(Level.SEVERE, null, ex);
          }
        }
        else {
        JOptionPane.showMessageDialog(this, "Por favor complete los campos restantes", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        }
        this.dispose();
    }//GEN-LAST:event_jButton2AceptarModificarActionPerformed
//    public void mostrarParamodificar(){
//        
//       
//        jTextField4modficiarTelef.setText(String.valueOf(getTelefono()));
//        jTextField1modfNombCli.setText(getNombre());
//        jTextField2modfApellCli.setText(getApellido());
//        jTextField3modfZona.setText(String.valueOf(getZona()));
//        
//    
//    }
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
            java.util.logging.Logger.getLogger(modificarDatosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modificarDatosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modificarDatosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modificarDatosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modificarDatosCliente().setVisible(true);
            }
        });
    }
    public boolean verificar(){
        
        
        try{
            //Long.parseLong(jTextFieldTelefono.getText());
            if(Integer.parseInt(jTextField4modficiarTelef.getText()) <= 0){
                JOptionPane.showMessageDialog(this, "ERROR: El telefono No Debe Ser Vacio", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if(jTextField1modfNombCli.getText().length() <= 0){
                JOptionPane.showMessageDialog(this, "ERROR: El nombre No Debe Ser Vacio", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if(jTextField2modfApellCli.getText().length() <=0 ){
                JOptionPane.showMessageDialog(this, "ERROR: El apellido No Debe Ser Vacio", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            //VER ESTO NO FUNCIONA
//            if ((jComboBoxTipoDoc.getSelectedIndex())<0 ){
//                JOptionPane.showMessageDialog(this, "-. ERROR: Debe seleccionar una opcion de tipo documento", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
//                return false;        
//            }
            
            if(jTextField1modDomicilio.getText().length() <= 0){
                JOptionPane.showMessageDialog(this, "ERROR: El Domicilio No Debe Ser Vacio", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
                return false;
            }
          
            return true;
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "ERROR: El Telefono No debe ser vacio", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
//    if(jTextField4modficiarTelef.getText().equals(""))
//    {
//        if(jTextField1modfNombCli.getText().equals("")){
//            if(jTextField2modfApellCli.getText().equals(""))
//            {
//                if(jTextField1modDomicilio.getText().equals("")){
//                    if(jTextField3modfZona.getText().equals("")){
//                    
//                    }
//                }
//            }
//        }
//    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1volverAModificar;
    private javax.swing.JButton jButton2AceptarModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JTextField jTextField1modDomicilio;
    public static javax.swing.JTextField jTextField1modfNombCli;
    public static javax.swing.JTextField jTextField2modfApellCli;
    public static javax.swing.JTextField jTextField3modfZona;
    public static javax.swing.JTextField jTextField4modficiarTelef;
    public javax.swing.JTextField jTextFieldAuxIdCliente;
    // End of variables declaration//GEN-END:variables
}
