
package com.jdbc.delete.query;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {
    public static void main(String[] args) 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            
            PreparedStatement pstmt = con.prepareStatement("delete from student where id=?");
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Your ID ");
            int id = Integer.parseInt(br.readLine());
            pstmt.setInt(1, id);
            
            int res = pstmt.executeUpdate();  
            
            System.out.println("Record Delete...");
            
            con.close();
        }
        catch (Exception e) 
        {     
           e.printStackTrace();
        }
    }    
    
}
