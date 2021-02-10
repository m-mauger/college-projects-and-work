/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.txstate.mjm356;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Owner
 */
public class DBDonation {
    public static void submitDonationInDB(Donation aDonation){
                        
        Connection connection = null;
        try {
            connection = DBConnection.getConnection();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
                
        String SQL = "insert into donation_mjm356 values(?, ?, ?, ?)";        
        
        try {
            PreparedStatement statement = connection.prepareStatement(SQL);
            statement.setString(1, aDonation.getDonorName());
            statement.setDouble(2, aDonation.getAmount());                        
            statement.setString(3, aDonation.getEmail());
            statement.setInt(4, aDonation.getFundraiserId());
            statement.executeUpdate();           
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }    
}
