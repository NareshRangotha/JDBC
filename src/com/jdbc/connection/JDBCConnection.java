package com.jdbc.connection;

import java.sql.*;

public class JDBCConnection {

    public static void main(String[] args) 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            
            if(con.isClosed())
            {
                System.out.println("Connection is Closed");
            }
            else
            {
                System.out.println("Connection Created...");
            }
             
        } 
        catch (Exception e) 
        {     
           e.printStackTrace();
        }
    }
    
}
