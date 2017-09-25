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
public class Cadete {

    private Statement sentencia;
    private ResultSet rsDatos;
    private PreparedStatement psPrepSencencias;

    private int id;
    private int dni;
    private String nombre;
    private String apellido;
    private String domicilio;
    private int estadoCadete;
    private int Ocupado = 0;
    private float totalPagar;

    public float getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(float totalPagar) {
        this.totalPagar = totalPagar;
    }

    public int getEstadoCadete() {
        return estadoCadete;
    }

    public void setEstadoCadete(int estadoCadete) {
        this.estadoCadete = estadoCadete;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public int getEstado() {
        return estadoCadete;
    }

    public void setEstado(int estado) {
        this.estadoCadete = estado;
    }
    
       public int ocuparCadete(int ide) throws SQLException {

        try {
            Connection cn = Conexion.Cadena();
            psPrepSencencias = cn.prepareStatement("UPDATE Cadete SET ocupado=1 where idCadete=?");
            psPrepSencencias.setInt(1, ide);

            //ejecuto sentencia
            ide = psPrepSencencias.executeUpdate();
            //obtengo el id del registro recien insertado
            // rsDatos.first();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadete.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ide;
    }

      public int desocuparCadete(int ide) throws SQLException {
        try {
            Connection cn = Conexion.Cadena();
            psPrepSencencias = cn.prepareStatement("UPDATE Cadete SET ocupado=0 where idCadete=?");
            psPrepSencencias.setInt(1, ide);

            //ejecuto sentencia
            ide = psPrepSencencias.executeUpdate();
            //obtengo el id del registro recien insertado
            // rsDatos.first();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadete.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ide;
    }

    public int modificar(int ide) throws SQLException {

        try {
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = cn.prepareStatement("UPDATE Cadete SET nombre=?, apellido=?, domicilio=?, totalPaga=? where idCadete=?");
            // cargo parametros
            // psPrepSencencias.setString(1, nombreUsuario);
            psPrepSencencias.setString(1, nombre);
            psPrepSencencias.setString(2, apellido);
            // psPrepSencencias.setInt(3, tipo);
            //psPrepSencencias.setInt(1, contraseña);
            // psPrepSencencias.setString(2, mail);
            psPrepSencencias.setString(3, domicilio);
            psPrepSencencias.setFloat(4, totalPagar);
            //psPrepSencencias.setInt(8, estadoCadete);
            psPrepSencencias.setString(5, Integer.toString(ide));

            //ejecuto sentencia
            ide = psPrepSencencias.executeUpdate();
            //obtengo el id del registro recien insertado
            // rsDatos.first();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadete.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ide;
    }
    public ResultSet traerCadetes()throws SQLException{
        try {
        Connection cn= Conexion.Cadena();
            String sql= "Select * from Cadete";
            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(sql);
        }catch(ClassNotFoundException ex){
            }
        return rsDatos;
    }
    public int eliminar(int ide) throws SQLException {

        try {
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = cn.prepareStatement("UPDATE Cadete SET estadoCadete=? where idCadete=?");

            psPrepSencencias.setInt(1, estadoCadete);
            psPrepSencencias.setString(2, Integer.toString(ide));

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
        int idCadete = 0;
        Ocupado = 0;
        estadoCadete = 1;
        totalPagar=0;
        
        // Inserta un contacto y devuelve su id 
        try {
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = cn.prepareStatement("insert into Cadete (dni, nombre, apellido, domicilio, estadoCadete, ocupado, totalPaga) values (?, ?, ?, ?, ?, ?,?)",
                    PreparedStatement.RETURN_GENERATED_KEYS);
            // cargo parametros
            psPrepSencencias.setInt(1, dni);
            psPrepSencencias.setString(2, nombre);
            psPrepSencencias.setString(3, apellido);
            psPrepSencencias.setString(4, domicilio);
            psPrepSencencias.setInt(5, estadoCadete);
            psPrepSencencias.setInt(6, Ocupado);
             psPrepSencencias.setFloat(7, totalPagar);
            //ejecuto sentencia
            psPrepSencencias.executeUpdate();
            //obtengo el id del registro recien insertado
            rsDatos = psPrepSencencias.getGeneratedKeys();
            rsDatos.first();
            idCadete = rsDatos.getInt(1);

        } catch (SQLException e) {
            throw e;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadete.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idCadete;
    }

    public ResultSet buscar() throws ClassNotFoundException {
        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from Cadete where estadoCadete like 1";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);

            //cn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(Cadete.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsDatos;

    }

    public ResultSet buscarDisponible() throws ClassNotFoundException {
        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from Cadete where estadoCadete like 1 and ocupado like 0";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);
            
            
           
            //cn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(Cadete.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsDatos;

    }

    public ResultSet buscarX(int dnic) throws ClassNotFoundException {
        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from Cadete where dni like '" + dnic + "'";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);
            while (rsDatos.next()) {
                id = rsDatos.getInt("idCadete");
                dni = rsDatos.getInt("dni");
                nombre = rsDatos.getString("nombre");
                apellido = rsDatos.getString("apellido");
                domicilio = rsDatos.getString("domicilio");
                estadoCadete = rsDatos.getInt("estadoCadete");
                 totalPagar = rsDatos.getFloat("totalPaga");
                //cn.commit();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cadete.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsDatos;

    }
        public ResultSet buscarParaFiltrar(String valor) throws ClassNotFoundException {
        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from Cadete where CONCAT(nombre,'',apellido ) = '" + valor + "'";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);
            while (rsDatos.next()) {
                id = rsDatos.getInt("idCadete");
                dni = rsDatos.getInt("dni");
                nombre = rsDatos.getString("nombre");
                apellido = rsDatos.getString("apellido");
                domicilio = rsDatos.getString("domicilio");
                estadoCadete = rsDatos.getInt("estadoCadete");
                 totalPagar = rsDatos.getFloat("totalPaga");
                //cn.commit();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cadete.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsDatos;
    }
    public ResultSet buscarXID(int ide) throws ClassNotFoundException {
        try {
            Connection cn = Conexion.Cadena();

            String SQL = "Select * from Cadete where idCadete like '" + ide + "'";

            sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);
            while (rsDatos.next()) {
                id = rsDatos.getInt("idCadete");
                dni = rsDatos.getInt("dni");
                nombre = rsDatos.getString("nombre");
                apellido = rsDatos.getString("apellido");
                domicilio = rsDatos.getString("domicilio");
                estadoCadete = rsDatos.getInt("estadoCadete");
                 totalPagar = rsDatos.getFloat("totalPaga");
                //cn.commit();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cadete.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsDatos;

    }
    
    public int Liquidar(int ide) throws SQLException {
     totalPagar=0;
        try {
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = cn.prepareStatement("UPDATE Cadete SET  totalPaga=? where idCadete=?");
           
            psPrepSencencias.setFloat(1, totalPagar);
            
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

}
