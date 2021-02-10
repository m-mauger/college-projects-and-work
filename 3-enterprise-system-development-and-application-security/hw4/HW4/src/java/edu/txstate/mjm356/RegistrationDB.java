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
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class RegistrationDB {
    public static void registerForClassInDB(Registration aRegistration, String duration){
        
        int durationInt = Integer.parseInt(duration);
        
        Connection connection = null;
        try {
            connection = DBConnection.getConnection();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
                
        String SQL = "insert into registration values(?, ?, ?, ?)";        
        
        try {
            PreparedStatement statement = connection.prepareStatement(SQL);
            statement.setString(1, aRegistration.getUserId());
            statement.setInt(2, aRegistration.getCourseNumber());
            Timestamp now = new Timestamp(System.currentTimeMillis());
            statement.setTimestamp(3, now);
            statement.setInt(4, durationInt);
            statement.executeUpdate();           
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }    
}
