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

/**
 *
 * @author BELEN
 */
public class Cliente {

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    private Statement sentencia;
    private ResultSet rsDatos;
    private PreparedStatement psPrepSencencias;

    private int id;
    private String nombreUsuario;

    private String nombre;
    private String apellido;
    private String domicilio;
    private int telefono;
    private int estado=3;
    private int zona;

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

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
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

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
public ResultSet buscar() throws ClassNotFoundException {
        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from Cliente where estadoCliente like 1";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);

            //cn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(Cadete.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsDatos;

    }
    public int Insertar() throws SQLException {
        int idCliente = 0;
        estado=1;
        // Inserta un contacto y devuelve su id 
        try {
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = cn.prepareStatement("insert into Cliente ( nombre, apellido,domicilio, zona, telefono ,estadoCliente) values ( ?, ?, ?, ?,?,?)",
                    PreparedStatement.RETURN_GENERATED_KEYS);
            // cargo parametros

            psPrepSencencias.setString(1, nombre);
            psPrepSencencias.setString(2, apellido);
 
            psPrepSencencias.setInt(4, zona);

            psPrepSencencias.setString(3, domicilio);
            psPrepSencencias.setInt(6, estado);
            psPrepSencencias.setInt(5, telefono);

            //ejecuto sentencia
            psPrepSencencias.executeUpdate();
            //obtengo el id del registro recien insertado
            rsDatos = psPrepSencencias.getGeneratedKeys();
            rsDatos.first();
            id = rsDatos.getInt(1);

        } catch (SQLException e) {
            throw e;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public ResultSet buscarPorTelefono(int telefono) throws ClassNotFoundException {
        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from Cliente where telefono = '" + telefono + "'";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);

            //cn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(Cadete.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsDatos;

    }
    
    
    public ResultSet BuscarXConId(int idc) throws ClassNotFoundException {
             try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from Cliente where idCliente = '" + idc + "' and estadoCliente = 1 ";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);
           rsDatos.first();
             if ( rsDatos.getRow() != 0 ){ 
                 do{
                 id = idc;
                 nombre = rsDatos.getString("nombre");
                 apellido = rsDatos.getString("apellido");
                 domicilio = rsDatos.getString("domicilio");
                  zona = rsDatos.getInt("zona");
                  estado = rsDatos.getInt("estadoCliente");
               // cn.commit();
        }while (rsDatos.next());
             }
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsDatos;

    }
    
    public int modificarDatos(int idCliente,String apellido,String nombre, String domicilio,int zonas) throws ClassNotFoundException{
    try {
            Connection cn = Conexion.Cadena();

      psPrepSencencias = cn.prepareStatement("UPDATE Cliente SET nombre=?,apellido=?,zona=?,domicilio=? where idCliente=? and estadoCliente=?");

           
//            psPrepSencencias.setInt(1, telefono);
            psPrepSencencias.setString(1, nombre);
            psPrepSencencias.setString(2, apellido);  
            psPrepSencencias.setInt(6,1);
// psPrepSencencias.setInt(3, tipo);
            //psPrepSencencias.setInt(1, contraseña);
            // psPrepSencencias.setString(2, mail);
            psPrepSencencias.setInt(3, zonas);
            psPrepSencencias.setString(4,domicilio );
            //psPrepSencencias.setInt(8, estadoCadete);
            psPrepSencencias.setInt(5, idCliente);

            //ejecuto sentencia
            idCliente = psPrepSencencias.executeUpdate();
             
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return idCliente;
    }
    public void eliminarCliente(int estadoCli,int idCli) throws ClassNotFoundException{
    
    try {
            Connection cn = Conexion.Cadena();

      psPrepSencencias = cn.prepareStatement("UPDATE Cliente SET estadoCliente=? where idCliente=?" );

           
//            psPrepSencencias.setInt(1, telefono);
            psPrepSencencias.setInt(1, estadoCli);
            
            psPrepSencencias.setInt(2, idCli);

            //ejecuto sentencia
            idCli = psPrepSencencias.executeUpdate();
             
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
    public ResultSet buscarActivos(int idCli) throws ClassNotFoundException {
        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from Cliente where idCliente = '"+idCli+"'and estadoCliente  = 1";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);

            //cn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(Cadete.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsDatos;

    }
     public void eliminarCliente(int idCli) throws ClassNotFoundException{
    
    try {
            Connection cn = Conexion.Cadena();
            
      psPrepSencencias = cn.prepareStatement("UPDATE Cliente SET estadoCliente= ? where idCliente= ?");

            estado=0;
//            psPrepSencencias.setInt(1, telefono);
            psPrepSencencias.setInt(1, estado);
            
            psPrepSencencias.setInt(2, idCli);

            //ejecuto sentencia
            idCli = psPrepSencencias.executeUpdate();
             
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
    
     public void modificarDatos(int idCliente,String apellido,String nombre, String domicilio,int zonas,int telefono) throws ClassNotFoundException{
    
            Connection cn;
        try {
            cn = Conexion.Cadena();
            psPrepSencencias = cn.prepareStatement("UPDATE Cliente SET nombre='"+nombre+"',apellido='"+apellido+"',zona='"+zonas+"',domicilio='"+domicilio+"', telefono = '"+telefono+"' where idCliente='"+idCliente+"'");
        psPrepSencencias.executeUpdate();
                      
            
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
       
    }
}
