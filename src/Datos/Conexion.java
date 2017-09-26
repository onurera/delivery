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
//import java.sql.Statement;
//import java.sql.*;



public class Conexion {
    
    public static Connection  Cadena() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver"); 
        String conStr = "jdbc:mysql://localhost/deliveri?autoReconnect=true&useSSL=false";
           Connection cn=DriverManager.getConnection(conStr, "root", "root"); 
    return cn;
    }
    
  /*  Connection cn;
    Statement st;
    
    public Connection conexion2(){
    try{
        Class.forName("com.mysql.jdbc.Driver"); 
        cn = DriverManager.getConnection("D:\\unse\\cursadas =p\\Ingenieria de Software\\codigo\\Base de datos", "root","root");
        System.out.println("Conexion exitosa");
    }catch(Exception e){
        System.out.println(e.getMessage());
    }return cn;
    }
    
    Statement createStatement(){
    throw new UnsupportedOperationException("no soportado");
    }*/
}
