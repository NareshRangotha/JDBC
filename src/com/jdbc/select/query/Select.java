
package com.jdbc.select.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {
    public static void main(String[] args) 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            
            PreparedStatement pstmt = con.prepareStatement("select * from student");
            
            ResultSet res = pstmt.executeQuery();
            
            while(res.next())
            {
                int id = res.getInt(1);
                String name = res.getString(2);
                String branch = res.getString(3);
                int fee = res.getInt(4);
                
                System.out.println(id+" : "+name+" : "+branch+" : "+fee);
            }
            
            con.close();      
        }
        catch (Exception e) 
        {     
           e.printStackTrace();
        }
    }    
}
