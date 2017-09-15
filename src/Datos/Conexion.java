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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
    public static Connection  Cadena() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver"); 
        String conStr = "jdbc:mysql://localhost/deliveri?autoReconnect=true&useSSL=false";
           Connection cn=DriverManager.getConnection(conStr, "root", "root"); 
    return cn;
    }
}
