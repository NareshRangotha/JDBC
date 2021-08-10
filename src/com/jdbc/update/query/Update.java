package com.jdbc.update.query;

import java.sql.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Update 
{
    public static void main(String[] args) 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            
            PreparedStatement pstmt = con.prepareStatement("update student set name=?, branch=?, fee=? where id=?");
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Update Your Name ");
            String name = br.readLine();
            System.out.println("Update Your Branch ");
            String branch = br.readLine();
            System.out.println("Update Your Fee ");
            int fee = Integer.parseInt(br.readLine());
            System.out.println("Enter Your ID ");
            int id = Integer.parseInt(br.readLine());

            pstmt.setString(1, name);
            pstmt.setString(2, branch);
            pstmt.setInt(3, fee);
            pstmt.setInt(4, id);            
            
            pstmt.executeUpdate();
            
            System.out.println("Record Updated...");
            
            con.close();
        }
        catch (Exception e) 
        {     
           e.printStackTrace();
        }
    }
}
