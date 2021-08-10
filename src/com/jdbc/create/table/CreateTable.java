
package com.jdbc.create.table;

import java.sql.*;

public class CreateTable 
{

    public static void main(String[] args) 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            
//            String q = ;
            
            Statement stmt = con.createStatement();
            
            stmt.executeUpdate("create table student(id int primary key not null, name varchar(200) not null, branch varchar(200) not null, fee int not null)");
            
            System.out.print("Table Created...");
        } 
        catch (Exception e) 
        {     
           e.printStackTrace();
        }
    }
    
}
