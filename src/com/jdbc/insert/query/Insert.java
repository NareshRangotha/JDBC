package com.jdbc.insert.query;

import java.sql.*;

import java.io.*;

public class Insert 
{

    public static void main(String[] args) 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            
            PreparedStatement pstmt = con.prepareStatement("insert into student(id,name,branch,fee) values(?,?,?,?)");
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Your ID ");
            int id = Integer.parseInt(br.readLine());
            System.out.println("Enter Your Name ");
            String name = br.readLine();
            System.out.println("Enter Your Branch ");
            String branch = br.readLine();
            System.out.println("Enter Your Fee ");
            int fee = Integer.parseInt(br.readLine());

            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, branch);
            pstmt.setInt(4, fee);
            
            pstmt.executeUpdate();
            
            System.out.println("Record Inserted...");
            
            con.close();
        }
        catch (Exception e)
        {     
           e.printStackTrace();
        }
    }    
}
