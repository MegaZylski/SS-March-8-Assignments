package com.shinra.utopia.service;

import com.shinra.utopia.dao.UserDAO;
import com.shinra.utopia.entity.User;
import java.sql.Connection;
import java.sql.SQLException;

/*
 * Programmer: Damian Zylski
 * Project:    UtopiaProject
 * Date:       03/20/2021
 * System:     Windows 7 Enterprise - Netbeans 12
 * 
 * Purpose:    The AdminService class handles all actions and logic associated with admin users, like adding
 * or deleting records
 */
public class AdminService
{
    //new util, and also connection
    Utility util = new Utility();
    
    //add user
    public void addUser(User user) throws SQLException
    {
        //the connection
        Connection conn = null;
        
        try
        {
            //get connection
            conn = util.getConnection();
            
            //create user object
            UserDAO udao = new UserDAO(conn);
            
            //PK
            Integer pk = null;
            
            //Add new user
            udao.addUser(user);
            
            //commit changes if no exceptions
            conn.commit();
            //Return success message
        }
        catch(SQLException | ClassNotFoundException | NullPointerException e)
        {   
            e.printStackTrace();            
            //rollback changes
            conn.rollback();
            //return error message
        }
        finally
        {
            if(conn != null)
            {
                //close connection
                conn.close();
            }
        }
    }
}
