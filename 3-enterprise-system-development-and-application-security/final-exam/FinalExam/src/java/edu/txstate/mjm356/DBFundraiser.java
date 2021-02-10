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
import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class DBFundraiser {
    public static ArrayList<Fundraiser> getFundraisers(){
        ArrayList<Fundraiser> fundraiserList = new ArrayList<Fundraiser> ();
        Connection connection = null;
        try {
            connection = DBConnection.getConnection();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        
        try {
            Statement statement = connection.createStatement();
            ResultSet fundraisers = statement.executeQuery("select * from fundraiser");
            while (fundraisers.next()){
                Fundraiser aFundraiser = new Fundraiser(fundraisers.getInt(1), fundraisers.getString(2), 
                                            fundraisers.getString(3), fundraisers.getDouble(4));
                fundraiserList.add(aFundraiser);
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        
        return fundraiserList;
        
    }
    
    public static Fundraiser getAFundraiserById(int id){
        Fundraiser aFundraiser = null;
        
        Connection connection = null;
        try {
            connection = DBConnection.getConnection();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
         try {
            String SQL = "select * from fundraiser where id=?";
            PreparedStatement statement = connection.prepareStatement(SQL);
            statement.setInt(1, id);
            ResultSet fundraisers = statement.executeQuery();
            if (fundraisers.next()){
                aFundraiser = new Fundraiser(fundraisers.getInt(1), fundraisers.getString(2), 
                                             fundraisers.getString(3), fundraisers.getDouble(4));
            }
            
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return aFundraiser;
    }        
}
