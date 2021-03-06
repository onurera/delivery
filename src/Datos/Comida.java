/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import interfaz.GestionarComidas;
import interfaz.ModificarComida;
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
public class Comida {

    private Statement sentencia;
    private ResultSet rsDatos;
    private PreparedStatement psPrepSencencias;

    private int id;
    private String descripcion;
    private float precio;
    private boolean estado;

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

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
     public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void modificar2(String desc, String prec/*, Boolean estado*/, String id){
        ModificarComida MC = new ModificarComida();
        

        //Connection cn = Conexion.Cadena();
        //psPrepSencencias = cn.prepareStatement("UPDATE Comida SET descripcion='"+MC.jTextFieldDescipcion.getText()+"',precio='"+MC.jTextFieldPrecio.getText()+"',estadoComida='"+MC.jTextFieldEstado.getText()+"' WHERE idComida='"MC.jTextFieldCodigo.getText()"'");﻿
        try {    
            Connection cn = Conexion.Cadena();
            
            psPrepSencencias = cn.prepareStatement("UPDATE Comida SET descripcion='"+desc+"',precio='"+prec+"' WHERE idComida='"+id+"'");//,estadoComida='"+estado+"' esta sentancia no me deja poner porque no me funciona
            psPrepSencencias.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos Actualizados");
            MC.limpiarVariables();//esta funcion no me lo anda

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Comida.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Comida.class.getName()).log(Level.SEVERE, null, ex);
        } 
}
    
 
    public int modificar(int ide) throws SQLException {
        try {
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = cn.prepareStatement("UPDATE Comida SET descripcion=?, precio=?, estadoComida=? where idComida=?");
            // cargo parametros
            psPrepSencencias.setString(1, descripcion);
            // psPrepSencencias.setString(2, nombre);
            // psPrepSencencias.setString(3, apellido);
            psPrepSencencias.setFloat(2, precio);
           // psPrepSencencias.setBoolean(3, estadoComida);

            psPrepSencencias.setInt(3, ide);

            //ejecuto sentencia
            ide = psPrepSencencias.executeUpdate();
            //obtengo el id del registro recien insertado
            // rsDatos.first();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Comida.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ide;
    }
    public void eliminar2 (String valor){   
        
        try {    
            Connection cn = Conexion.Cadena();
            psPrepSencencias = cn.prepareStatement("DELETE FROM Comida WHERE idComida='"+valor+"'");
            psPrepSencencias.executeUpdate();
            JOptionPane.showMessageDialog(null,"Eliminacion con exito");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Comida.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Comida.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    public int eliminar(int ide) throws SQLException {
        try {
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = cn.prepareStatement("UPDATE Comida SET estadoComida=? where idComida=?");

            psPrepSencencias.setBoolean(1, isEstado());
            psPrepSencencias.setInt(2, ide);

            //ejecuto sentencia
            ide = psPrepSencencias.executeUpdate();
            //obtengo el id del registro recien insertado
            // rsDatos.first();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Comida.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ide;
    }

    public int Insertar() throws SQLException {
        int idUsuario = 0;        // Inserta un contacto y devuelve su id 
        try {
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = cn.prepareStatement("insert into Comida (descripcion,precio,estadoComida) values (?, ?, ?)",
                    PreparedStatement.RETURN_GENERATED_KEYS);
            // cargo parametros
            psPrepSencencias.setString(1, descripcion);
            psPrepSencencias.setFloat(2, precio);
            psPrepSencencias.setBoolean(3, isEstado());

            //ejecuto sentencia
            psPrepSencencias.executeUpdate();
            //obtengo el id del registro recien insertado
            rsDatos = psPrepSencencias.getGeneratedKeys();
            rsDatos.first();
            idUsuario = rsDatos.getInt(1);

        } catch (SQLException e) {
            throw e;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Comida.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return idUsuario;
    }

    public ResultSet buscar() throws ClassNotFoundException {
        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from Comida where estadoComida like 1";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);

            //cn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(Comida.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsDatos;

    }

    public ResultSet buscarX(String des) throws ClassNotFoundException {
        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from Comida where descripcion like '" + des + "'";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);
            rsDatos.first();

            id = rsDatos.getInt("idComida");
            descripcion = rsDatos.getString("descripcion");
            precio = rsDatos.getFloat("precio");
            estado = rsDatos.getBoolean("estadoComida");
            //cn.commit();

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsDatos;

    }

    public ResultSet buscarConId(int ide) throws ClassNotFoundException {
        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from Comida where idComida = '" + ide + "'";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);
            rsDatos.first();

            id = ide;
            descripcion = rsDatos.getString("descripcion");
            precio = rsDatos.getFloat("precio");
            //cn.commit();

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsDatos;

    }

    public boolean first() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    /**
     * @return the estado
     */
   

}
