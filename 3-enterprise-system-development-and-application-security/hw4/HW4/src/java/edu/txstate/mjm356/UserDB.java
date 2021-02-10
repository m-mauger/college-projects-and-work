/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.txstate.mjm356;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Owner
 */
public class UserDB {
    public static User getUser(String uid){
        User aUser = null;
        Connection connection = null;
        try {
            connection = DBConnection.getConnection();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        
        try {
            String SQL = "select * from users where id=?";
            PreparedStatement statement = connection.prepareStatement(SQL);
            statement.setString(1, uid);
            ResultSet users = statement.executeQuery();
            if (users.next()){
                aUser = new User(users.getString(1),  users.getString(2));
            }
            
        } catch (Exception ex){
            ex.printStackTrace();
        }
        
        return aUser;
    }     
}
