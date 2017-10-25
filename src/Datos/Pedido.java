/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import interfaz.modificarCadete;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author BELEN
 */
public class Pedido {

    private Statement sentencia;
    private ResultSet rsDatos;
    private PreparedStatement psPrepSencencias;

    private int id;
    private int idCliente;
    private Date fecha;
    private Time hora;
    private int emitida;
    private String lugarEnvio;
    private int zona;
    private float total;
    private int estadoPedido;
    private int terminado;

    public int getTerminado() {
        return terminado;
    }

    public void setTerminado(int terminado) {
        this.terminado = terminado;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(int estadoPedido) {
        this.estadoPedido = estadoPedido;
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

    public int getEmitida() {
        return emitida;
    }

    public void setEmitida(int emitida) {
        this.emitida = emitida;
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

    public int emitir(int ide) throws SQLException {

        try {
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = cn.prepareStatement("UPDATE Pedido SET emitido=? where idPedido=?");

            psPrepSencencias.setInt(1, emitida);
            psPrepSencencias.setInt(2, ide);
            //ejecuto sentencia
            ide = psPrepSencencias.executeUpdate();
            //obtengo el id del registro recien insertado
            // rsDatos.first();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadete.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ide;
    }
     public int terminar(int ide) throws SQLException {
         terminado=1;
        try {
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = cn.prepareStatement("UPDATE Pedido SET terminado=? where idPedido=?");

            psPrepSencencias.setInt(1, terminado);
            psPrepSencencias.setInt(2, ide);
            //ejecuto sentencia
            ide = psPrepSencencias.executeUpdate();
            //obtengo el id del registro recien insertado
            // rsDatos.first();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadete.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ide;
    }

    public int Insertar() throws SQLException {
        int idPedido = 0;
        emitida=1;
        estadoPedido = 1;
        terminado=0;
        // Inserta un contacto y devuelve su id 
        try {
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = cn.prepareStatement("insert into Pedido (idCliente, emitido, lugarEnvio, zona,estadoPedido,total,terminado, fecha, hora) values (?, ?, ?, ?, ?, ?, ?," + "CURDATE(), curTime())",
                    PreparedStatement.RETURN_GENERATED_KEYS);
            // cargo parametros
            psPrepSencencias.setInt(1, idCliente);
            psPrepSencencias.setInt(2, emitida);
            psPrepSencencias.setString(3, lugarEnvio);
            psPrepSencencias.setInt(4, zona);
            psPrepSencencias.setInt(5, estadoPedido);
            psPrepSencencias.setFloat(6, total);
            psPrepSencencias.setInt(7, terminado);
            //ejecuto sentencia
            psPrepSencencias.executeUpdate();
            //obtengo el id del registro recien insertado
            rsDatos = psPrepSencencias.getGeneratedKeys();
            rsDatos.first();
            idPedido = rsDatos.getInt(1);

        } catch (SQLException e) {
            throw e;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idPedido;
    }
//estado= 1 en cocina 2, listo

    public ResultSet buscarActivos() throws ClassNotFoundException {
        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from Pedido where estadoPedido = 1 and emitido = 1 and terminado = 2 ";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);
            rsDatos.first();
            //cn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsDatos;

    }
     public ResultSet buscarActivosTerminados() throws ClassNotFoundException {
        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from Pedido where estadoPedido like 1 and emitido like 0 and terminado like 1 ";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);
            rsDatos.first();
            //cn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsDatos;

    }

    public int eliminar(int ide) throws SQLException {
        estadoPedido = 0;
        try {
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = cn.prepareStatement("UPDATE Pedido SET estadoPedido=? where idPedido=?");

            psPrepSencencias.setInt(1, estadoPedido);
            psPrepSencencias.setInt(2, ide);

            //ejecuto sentencia
            ide = psPrepSencencias.executeUpdate();
            //obtengo el id del registro recien insertado
            // rsDatos.first();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ide;
    }

    public ResultSet BuscarX(int ide) throws ClassNotFoundException {
        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from Pedido where idPedido like '" + ide + "'";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);
            rsDatos.first();
            do {
                id = ide;
                idCliente = rsDatos.getInt("idCliente");
                lugarEnvio = rsDatos.getString("lugarEnvio");
                fecha = rsDatos.getDate("fecha");
                hora = rsDatos.getTime("hora");
                zona = rsDatos.getInt("zona");
                total = rsDatos.getFloat("total");
                emitida = rsDatos.getInt("estado");
                estadoPedido = rsDatos.getInt("estadoPedido");
                terminado = rsDatos.getInt("terminado");

                //cn.commit();
            } while (rsDatos.next());
        } catch (SQLException ex) {
            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsDatos;

    }
public ResultSet BuscarXCliente(int idCli) throws ClassNotFoundException {
        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from Pedido where idCliente = '" + idCli + "' and estadoPedido = 1 ";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);
            rsDatos.first();
            do {
                id= rsDatos.getInt("idPedido");
                idCliente = rsDatos.getInt("idCliente");
                lugarEnvio = rsDatos.getString("lugarEnvio");
                fecha = rsDatos.getDate("fecha");
                hora = rsDatos.getTime("hora");
                zona = rsDatos.getInt("zona");
                total = rsDatos.getFloat("total");
                emitida = rsDatos.getInt("emitido");
                estadoPedido = rsDatos.getInt("estadoPedido");
                terminado = rsDatos.getInt("terminado");

                //cn.commit();
            } while (rsDatos.next());
        } catch (SQLException ex) {
            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsDatos;

    }

// ESTO NECESITO COALI
 public void modificar(int idped,int coccion){

///ESTOY AQUIIIIIIIIIIIIIIIIIIIIIII
        
                
        try {    
            Connection cn = Conexion.Cadena();            
            psPrepSencencias = cn.prepareStatement("UPDATE pedido SET terminado='"+coccion+"' WHERE idPedido='"+idped+"'"); //,estadoComida='"+estado+"' esta sentancia no me deja poner porque no me funciona
            psPrepSencencias.executeUpdate();
             
            //JOptionPane.showMessageDialog(null,doc);   

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Cadete.class.getName()).log(Level.SEVERE, null, ex);
        } 
}
    public ResultSet traerPedido(int idCli,int idPed)throws SQLException{
        try {
        Connection cn= Conexion.Cadena();
            String sql= "Select * from Pedido where idCliente = '"+idCli+"'and idPedido= '"+idPed+" and estadoPedido = 1 and emitido = 1 and terminado = 2 '";
            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(sql);
        }catch(ClassNotFoundException ex){
            }
        return rsDatos;
    }

    public void modificarpedido(int idped){

///ESTOY AQUIIIIIIIIIIIIIIIIIIIIIII
        
              
        try {    
            Connection cn = Conexion.Cadena();            
            psPrepSencencias = cn.prepareStatement("UPDATE Pedido SET estadoPedido='"+0+"' WHERE idPedido='"+idped+"' and terminado = 0 "); //,estadoComida='"+estado+"' esta sentancia no me deja poner porque no me funciona
            psPrepSencencias.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos Actualizados");   
            //JOptionPane.showMessageDialog(null,doc);   

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Cadete.class.getName()).log(Level.SEVERE, null, ex);
        } 
}

    public ResultSet buscarPedidoId(int idped) throws ClassNotFoundException {
        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from Pedido where idPedido = '" + idped + "and estadoPedido = 1 and terminado = 0'";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);
            rsDatos.first();
            //cn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsDatos;

    }
    
}
