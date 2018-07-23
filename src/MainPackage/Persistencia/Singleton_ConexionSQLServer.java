/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.Persistencia;

import java.sql.*;

/**
 *
 * @author Franco
 */
public class Singleton_ConexionSQLServer {
    
    //CONSTANTE QUE INSTANCIA UNA NUEVA VERSION DE LA CONEXION CON SQL SERVER
    private static final Singleton_ConexionSQLServer INSTANCE = new Singleton_ConexionSQLServer();
    
    //CONSTRUCTOR PRIVADO
    private Singleton_ConexionSQLServer(){
    
    }
    /*
    ****************************************************************************
    */
    //METODO QUE DEVUELVE LA UNICA INSTANCIA DE LA CLASE
    public static Singleton_ConexionSQLServer getInstance(){
    return INSTANCE;
    }
    /*
    ****************************************************************************
    */
    //METODO PARA CONECTAR CON SQL SERVER
    public Connection getConexionSQL() throws SQLException{
        
        Connection con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-FRANCO:1433;databaseName=JavaPizzaCode", "sa", "110254");
        
        try{
            Statement stmt = con.createStatement();
            ResultSet rst = stmt.executeQuery("SELECT * FROM PEDIDOS");
            
        }catch(SQLException sqlException){
            
            sqlException.getMessage();
        }
        return con;
    }
    
}
