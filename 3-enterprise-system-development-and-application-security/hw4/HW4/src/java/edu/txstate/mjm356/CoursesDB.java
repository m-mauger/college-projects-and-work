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
public class CoursesDB {
    public static ArrayList<Course> getCourses(){
        ArrayList<Course> courseList = new ArrayList<Course> ();
        Connection connection = null;
        try {
            connection = DBConnection.getConnection();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        
        try {
            Statement statement = connection.createStatement();
            ResultSet courses = statement.executeQuery("select * from courses");
            while (courses.next()){
                Course aCourse = new Course(courses.getInt(1), courses.getString(2), 
                                            courses.getDouble(3));
                courseList.add(aCourse);
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        
        return courseList;
        
    }
    
    public static Course getACourseByNumber(int courseNumber){
        Course aCourse = null;
        
        Connection connection = null;
        try {
            connection = DBConnection.getConnection();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
         try {
            String SQL = "select * from courses where CourseNumber=?";
            PreparedStatement statement = connection.prepareStatement(SQL);
            statement.setInt(1, courseNumber);
            ResultSet courses = statement.executeQuery();
            if (courses.next()){
                aCourse = new Course(courses.getInt(1),courses.getString(2), 
                                                        courses.getDouble(3));
            }
            
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return aCourse;
    }    
}
