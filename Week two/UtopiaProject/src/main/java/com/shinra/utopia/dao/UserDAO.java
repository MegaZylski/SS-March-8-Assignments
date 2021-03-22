package com.shinra.utopia.dao;

import com.shinra.utopia.entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * Programmer: Damian Zylski
 * Project:    UtopiaProject
 * Date:       03/20/2021
 * System:     Windows 7 Enterprise - Netbeans 12
 * 
 * Purpose:    The UserRole DAO for the utopia project, corresponds to user_role in the database
 */
public class UserDAO extends BaseDAO
{
    //connection constructor
    public UserDAO(Connection conn)
    {
        super(conn);
    }
    
    //Add operation
    public void addUser(User user) throws ClassNotFoundException, SQLException
    {
        crud("INSERT INTO user(id, role_id, given_name, family_name, username, email, password, phone) VALUES(?,?,?,?,?,?,?,?);", new Object[] {user.getUserID(), 
            user.getRole(), user.getFirstName(), user.getLastName(), user.getUserName(), user.getEmail(), user.getPassword(), user.getPhone()});
        //Create statement for handling queries
        //PreparedStatement stmt = getConnection().prepareStatement("INSERT INTO user(id, role_id, given_name, family_name, username, email, password, phone) VALUES(?,?,?,?,?,?,?,?);");
        //set values
        /*
        stmt.setInt(1, user.getUserID());
        stmt.setInt(2, user.getRole());
        stmt.setString(3, user.getFirstName());
        stmt.setString(4, user.getLastName());
        stmt.setString(5, user.getUserName());
        stmt.setString(6, user.getEmail());
        stmt.setString(7, user.getPassword());
        stmt.setString(8, user.getPhone());
        //execute query
        stmt.executeUpdate();
        */
        
    }
    //update operation
    public void updateUser(User user, int oldID) throws ClassNotFoundException, SQLException
    {
        crud("UPDATE user SET id=?,role_id=?,given_name=?,family_name=?,username=?,email=?,password=?,phone=? WHERE id=?;", new Object[] {user.getUserID(), 
            user.getRole(), user.getFirstName(), user.getLastName(), user.getUserName(), user.getEmail(), user.getPassword(), user.getPhone(), oldID});
    }
    //delete operation
    public void deleteUser(User user) throws ClassNotFoundException, SQLException
    {
        crud("DELETE FROM user WHERE id = ?;", new Object[] {user.getUserID()});
    }
    
    //check for valid login operation
    public boolean checkLogin(Integer id, String password) throws ClassNotFoundException, SQLException
    {
        //Create statement for handling queries
        PreparedStatement stmt = UserDAO.conn.prepareStatement("SELECT * FROM user WHERE id = ? AND password = ?");
        //set values
        stmt.setInt(1,id);
        stmt.setString(2,password);
        //execute query
        ResultSet rs = stmt.executeQuery();
        System.out.println("" + id + " " + password);
        //Return true if result set exists
        if(rs.next())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //Read all operation
    @Override
    public List<User> readData() throws ClassNotFoundException, SQLException
    {
        //Create new list
        List<User> userList = new ArrayList <User>();
        
        //Create statement for handling queries
        PreparedStatement stmt = UserDAO.conn.prepareStatement("SELECT * FROM user");
        //execute query
        ResultSet rs = stmt.executeQuery();

        //get database members
        while(rs.next())
        {
            //add user to list
            userList.add(new User(rs.getInt("id"), rs.getInt("role_id"), rs.getString("username"), rs.getString("password"), rs.getString("given_name"), rs.getString("family_name"),
            rs.getString("email"), rs.getString("phone")));
        }
        return userList;
    }
}
