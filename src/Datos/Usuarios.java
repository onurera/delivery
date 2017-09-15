/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author NICOLAS
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Usuarios {
    private Statement sentencia;
    private ResultSet rsDatos;
    private PreparedStatement psPrepSencencias;

    private int id;
    private String nombreUsuario;

    private String nombre;
    private String apellido;
    private int tipo;
    private String domicilio;
    private int contraseña;
    private String mail;
    private int estado;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.nombreUsuario = NombreUsuario;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public int getId() {
        return id;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int modificar(int ide) throws SQLException {

        try {
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = cn.prepareStatement("UPDATE Usuario SET contraseña=?, mail=?,tipoUsuario=?, domicilio=? where idUsuario=?");
            // cargo parametros
            //  psPrepSencencias.setString(1, nombreUsuario);
            // psPrepSencencias.setString(2, nombre);
            // psPrepSencencias.setString(3, apellido);
            psPrepSencencias.setInt(3, tipo);
            psPrepSencencias.setInt(1, contraseña);
            psPrepSencencias.setString(2, mail);
            psPrepSencencias.setString(4, domicilio);
            //psPrepSencencias.setInt(8, estado);
            psPrepSencencias.setString(5, Integer.toString(ide));

            //ejecuto sentencia
            ide = psPrepSencencias.executeUpdate();
            //obtengo el id del registro recien insertado
            // rsDatos.first();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ide;
    }

    public int eliminar(int ide) throws SQLException {
        try {
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = cn.prepareStatement("UPDATE Usuario SET estadoUsuario=? where idUsuario=?");

            psPrepSencencias.setInt(1, estado);
            psPrepSencencias.setString(2, Integer.toString(ide));

            //ejecuto sentencia
            ide = psPrepSencencias.executeUpdate();
            //obtengo el id del registro recien insertado
            // rsDatos.first();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ide;
    }

    public int Insertar() throws SQLException {
        int idUsuario = 0;
        // Inserta un contacto y devuelve su id 
        try {
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = cn.prepareStatement("insert into Usuario (NombreUsuario, Nombre, Apellido,tipoUsuario, contraseña, mail,domicilio, estadoUsuario) values (?, ?, ?, ?, ?, ?, ?,?)",
                    PreparedStatement.RETURN_GENERATED_KEYS);
            // cargo parametros
            psPrepSencencias.setString(1, nombreUsuario);
            psPrepSencencias.setString(2, nombre);
            psPrepSencencias.setString(3, apellido);
            psPrepSencencias.setInt(4, tipo);
            psPrepSencencias.setInt(5, contraseña);
            psPrepSencencias.setString(6, mail);
            psPrepSencencias.setString(7, domicilio);
            psPrepSencencias.setInt(8, estado);

            //ejecuto sentencia
            psPrepSencencias.executeUpdate();
            //obtengo el id del registro recien insertado
            rsDatos = psPrepSencencias.getGeneratedKeys();
            rsDatos.first();
            idUsuario = rsDatos.getInt(1);

        } catch (SQLException e) {
            throw e;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idUsuario;
    }

    public ResultSet BuscarX(String Nombre) throws ClassNotFoundException {
        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from Usuario where nombreUsuario like '" + Nombre + "' and estadoUsuario like 1";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);
            while (rsDatos.next()) {
                tipo = rsDatos.getInt("tipoUsuario");
                domicilio = rsDatos.getString("domicilio");
                estado = rsDatos.getInt("estadoUsuario");

                //cn.commit();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsDatos;

    }

    public ResultSet buscar() throws ClassNotFoundException {
        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from Usuario where estadoUsuario like 1";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);

            //cn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsDatos;

    }

    public boolean verificarPass(String nombre, int contraseña) throws ClassNotFoundException {
        boolean resp = false;
        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from Usuario where ((nombreUsuario = '" + nombre + "')" + "and (contraseña = '" + contraseña + "'))";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

            rsDatos = sentencia.executeQuery(SQL);
            
            
            return rsDatos.first();
            
         /*   int x = 0;
            while (rsDatos.next()) {
                 return true;

            }*/
           
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resp;
    }

}
