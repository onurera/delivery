/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BELEN
 */
public class Factura {

    private Statement sentencia;
    private ResultSet rsDatos;
    private PreparedStatement psPrepSencencias;

    private int id;
    private int idCliente;
    private Date fecha;
    private Time hora;
    private String lugarEnvio;
    private int zona;
    private int anulada;
    private int idCadete;
    private float total;
    private int pagada;
   

    public int getAnulada() {
        return anulada;
    }

    public void setAnulada(int anulada) {
        this.anulada = anulada;
    }



    public float getTotal() {
        return total;
    }

    public int getPagada() {
        return pagada;
    }

    public void setPagada(int pagada) {
        this.pagada = pagada;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getEstadoFactura() {
        return anulada;
    }

    public void setEstadoFactura(int estadoFactura) {
        this.anulada = estadoFactura;
    }

    public int getIdCadete() {
        return idCadete;
    }

    public void setIdCadete(int idCadete) {
        this.idCadete = idCadete;
    }

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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getLugarEnvio() {
        return lugarEnvio;
    }

    public void setLugarEnvio(String lugarEnvio) {
        this.lugarEnvio = lugarEnvio;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public int Insertar() throws SQLException {
        int idFactura = 0;
        
        anulada = 0;
        // Inserta un contacto y devuelve su id 
        try {
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = cn.prepareStatement("insert into Factura (idCliente,lugarEnvio, zona,anulada,total,pagada, fecha, hora) values (?,?, ?, ?, ?, ?," + "CURDATE(), curTime())",
                    PreparedStatement.RETURN_GENERATED_KEYS);
            // cargo parametros
            psPrepSencencias.setInt(1, idCliente);
            
            psPrepSencencias.setString(2, lugarEnvio);
            psPrepSencencias.setInt(3, zona);
            psPrepSencencias.setInt(4, anulada);
            psPrepSencencias.setFloat(5, total);
            psPrepSencencias.setInt(6, pagada);
        
            //ejecuto sentencia
            psPrepSencencias.executeUpdate();
            //obtengo el id del registro recien insertado
            rsDatos = psPrepSencencias.getGeneratedKeys();
            rsDatos.first();
            idFactura = rsDatos.getInt(1);

        } catch (SQLException e) {
            throw e;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idFactura;
    }

    public ResultSet buscarActivos() throws ClassNotFoundException {
        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from Factura where anulada like 0";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);

            //cn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsDatos;

    }
    public ResultSet buscarFechas(Date inicial, Date fin) throws ClassNotFoundException {
        try {
            Connection cn = Conexion.Cadena();
            String SQL = "SELECT * FROM Factura WHERE fecha BETWEEN '"+inicial+"' AND '"+ fin+"' ";

           
            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);

            //cn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsDatos;

    }
    public ResultSet buscarmes() throws ClassNotFoundException {
        try {
            Connection cn = Conexion.Cadena();
            String SQL = "SELECT * FROM Factura WHERE fecha BETWEEN DATE_SUB(curdate(),INTERVAL 1 MONTH) AND CURDATE()";

           
            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);

            //cn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsDatos;

    }

    public ResultSet buscarNoPagadas() throws ClassNotFoundException {
        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from Factura where pagada like 0 ";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);

            //cn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsDatos;

    }

    public int anulada(int ide) throws SQLException {
        anulada = 1;
        try {
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = cn.prepareStatement("UPDATE Factura SET anulada=? where idFactura=?");

            psPrepSencencias.setInt(1, anulada);
            psPrepSencencias.setInt(2, ide);

            //ejecuto sentencia
            ide = psPrepSencencias.executeUpdate();
            //obtengo el id del registro recien insertado
            // rsDatos.first();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ide;
    }

    public ResultSet BuscarX(int ide) throws ClassNotFoundException {
        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from Factura where idFactura like '" + ide + "'";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);
            rsDatos.first();
            if (rsDatos.getRow() != 0) {
                id = ide;
                idCliente = rsDatos.getInt("idCliente");
                lugarEnvio = rsDatos.getString("lugarEnvio");
                idCadete = rsDatos.getInt("idCadete");
                fecha = rsDatos.getDate("fecha");
                hora = rsDatos.getTime("hora");
                zona = rsDatos.getInt("zona");
                total = rsDatos.getFloat("total");
                pagada = rsDatos.getInt("pagada");
                anulada = rsDatos.getInt("anulada");
            }
            //cn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsDatos;

    }

    public int Pagada(int ide) throws SQLException {
        pagada = 1;
        try {
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = cn.prepareStatement("UPDATE Factura SET pagada=? where idFactura=?");
            // cargo parametros
            // psPrepSencencias.setString(1, nombreUsuario);
            psPrepSencencias.setInt(1, pagada);
            psPrepSencencias.setInt(2, ide);

            //ejecuto sentencia
            ide = psPrepSencencias.executeUpdate();
            //obtengo el id del registro recien insertado
            // rsDatos.first();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ide;
    }

}
