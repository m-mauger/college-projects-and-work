/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.txstate.mjm356;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Owner
 */
public class DBConnection {
        public static Connection getConnection () throws SQLException{
        Connection connection = null;
        //Register for the driver.
        try {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
        }catch (SQLException ex){
            throw ex;
        }
            
        //Get a connection
        try{
            connection = DriverManager.getConnection("jdbc:sqlserver://sql.mccoy.txstate.edu;" + 
                                "databaseName=cis4318_students;user=bobcat4318;password=Ci$404404");
        } catch (SQLException ex){
           throw ex;
        }
        return connection;
    }
}
