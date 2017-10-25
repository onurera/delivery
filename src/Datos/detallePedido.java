/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author BELEN
 */
public class detallePedido {

    public detallePedido() {

        this.idPedido = 0;
        this.numLinea = 0;
        this.idComida = 0;
        this.cantidad = 0;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public void setNumLinea(int numLinea) {
        this.numLinea = numLinea;
    }
    private Statement sentencia;
    private ResultSet rsDatos;
    private PreparedStatement psPrepSencencias;
    private int idPedido;
    private int numLinea;
    private int idComida;
    private int cantidad;

    public Statement getSentencia() {
        return sentencia;
    }

    public void setSentencia(Statement sentencia) {
        this.sentencia = sentencia;
    }

    public ResultSet getRsDatos() {
        return rsDatos;
    }

    public void setRsDatos(ResultSet rsDatos) {
        this.rsDatos = rsDatos;
    }

    public PreparedStatement getPsPrepSencencias() {
        return psPrepSencencias;
    }

    public void setPsPrepSencencias(PreparedStatement psPrepSencencias) {
        this.psPrepSencencias = psPrepSencencias;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public int getNumLinea() {
        return numLinea;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.cantidad = Cantidad;
    }

    public int Insertar() throws SQLException {
        // Inserta un contacto y devuelve su id 
        try {
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = cn.prepareStatement("insert into detallePedido (idPedido, numLinea, idComida,cantidad) values ( ?, ?, ?, ?)",
                    PreparedStatement.RETURN_GENERATED_KEYS);
            // cargo parametros
            psPrepSencencias.setInt(1, idPedido);
            psPrepSencencias.setInt(2, numLinea);
            psPrepSencencias.setInt(3, idComida);
            psPrepSencencias.setInt(4, cantidad);

            //ejecuto sentencia
            psPrepSencencias.executeUpdate();
            //obtengo el id del registro recien insertado
            rsDatos = psPrepSencencias.getGeneratedKeys();
            rsDatos.first();

        } catch (SQLException e) {
            throw e;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(detallePedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idPedido;
    }

    public ResultSet BuscarDetalles(int idPe) throws ClassNotFoundException {

        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from detallePedido where idPedido = '" + idPe + "'";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);
            rsDatos.first();
            
            
            //cn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(detallePedido.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rsDatos;
    }
    public ResultSet BuscarDetalles2(String idPe) throws ClassNotFoundException {

        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from detallePedido where idPedido = '" + idPe + "'";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);
            rsDatos.first();
            
            
            //cn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(detallePedido.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rsDatos;
    }
    
    
     public ResultSet ObtenerCantidad(int idPedido) throws ClassNotFoundException {

        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select COUNT(*) from detallePedido where idPedido = '" + idPedido + "'";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);
            rsDatos.first();
            
            
            //cn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(detallePedido.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rsDatos;
    }
 public ResultSet BuscarComida(int idComida) throws ClassNotFoundException {

        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from Comida where idComida = '" + idComida + "'";
            

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);
            rsDatos.first();
            
            
            //cn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(detallePedido.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rsDatos;
    }
  public ResultSet BuscarComida2(int idComida) throws ClassNotFoundException {

        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from detallePedido where idComida = '" + idComida + "'";
            

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);
            rsDatos.first();
            
            
            //cn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(detallePedido.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rsDatos;
    }
 
     public void modificar2(int idped,int idcom, int cant){

///ESTOY AQUIIIIIIIIIIIIIIIIIIIIIII
        
              
        try {    
            Connection cn = Conexion.Cadena();            
            psPrepSencencias = cn.prepareStatement("UPDATE detallePedido SET cantidad='"+cant+"' WHERE idPedido='"+idped+"' and idComida='"+idcom+"' "); //,estadoComida='"+estado+"' esta sentancia no me deja poner porque no me funciona
            psPrepSencencias.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos Actualizados");   
            //JOptionPane.showMessageDialog(null,doc);   

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Cadete.class.getName()).log(Level.SEVERE, null, ex);
        } 
}
  
}
