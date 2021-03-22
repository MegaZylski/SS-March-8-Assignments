package com.shinra.utopia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Programmer: Damian Zylski
 * Project:    UtopiaProject
 * Date:       03/20/2021
 * System:     Windows 7 Enterprise - Netbeans 12
 * 
 * Purpose:    To read and write to the utopia user table from the sql server
 */
public class readUser
{
    //Database connection properties
        private static final String driver = "com.mysql.cj.jdbc.Driver";
        private static final String url = "jdbc:mysql://localhost:3305/utopia";
        private static final String username = "zylski"; //Maybe set it up so it asks for this from input
        private static final String password = "maple123";
    
    public static void main(String[] args)
    {
        //Setup database connection
        try
        {
            //Register sql driver
            Class.forName(driver);
            //Create connection
            Connection conn = DriverManager.getConnection(url, username, password);
            //Create statement for handling queries
            String sql = "3785564";
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM user WHERE id = ?");
            stmt.setString(1, sql);
            //execute query
            ResultSet rs = stmt.executeQuery();
            
            //print database members
            while(rs.next())
            {
                System.out.println(rs.getString("family_name"));
            }
            
        }
        catch(SQLException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
