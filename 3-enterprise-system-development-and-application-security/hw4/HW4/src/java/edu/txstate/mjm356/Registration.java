/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.txstate.mjm356;

/**
 *
 * @author Owner
 */
public class Registration {

    public Registration(String userId, int courseNumber, String courseName, String registrationDate, double totalPayment) {
        this.userId = userId;
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.registrationDate = registrationDate;
        this.totalPayment = totalPayment;
    }
    
    private String userId;

    /**
     * Get the value of userId
     *
     * @return the value of userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Set the value of userId
     *
     * @param userId new value of userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    private int courseNumber;

    /**
     * Get the value of courseNumber
     *
     * @return the value of courseNumber
     */
    public int getCourseNumber() {
        return courseNumber;
    }

    /**
     * Set the value of courseNumber
     *
     * @param courseNumber new value of courseNumber
     */
    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    private String courseName;

    /**
     * Get the value of courseName
     *
     * @return the value of courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Set the value of courseName
     *
     * @param courseName new value of courseName
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    private String registrationDate;

    /**
     * Get the value of registrationDate
     *
     * @return the value of registrationDate
     */
    public String getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Set the value of registrationDate
     *
     * @param registrationDate new value of registrationDate
     */
    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    private double totalPayment;

    /**
     * Get the value of totalPayment
     *
     * @return the value of totalPayment
     */
    public double getTotalPayment() {
        return totalPayment;
    }

    /**
     * Set the value of totalPayment
     *
     * @param totalPayment new value of totalPayment
     */
    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

}
