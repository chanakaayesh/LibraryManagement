/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ayesh
 */
public class DBConnection {
    
      private static DBConnection dBConnection;
    
    private static Connection connection ;
    
    private DBConnection() throws ClassNotFoundException,SQLException{
        
        Class.forName("com.mysql.cj.jdbc.Driver");
         
        connection   = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement", "root", "root");
       
    }
    
    
    public static  DBConnection getInstance() throws ClassNotFoundException, SQLException{
    
        return dBConnection ==null? dBConnection=new DBConnection():dBConnection;
    }
    
    
    public Connection getConnection(){
    
        return connection;
    }
    
}
