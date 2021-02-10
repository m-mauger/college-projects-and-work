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
public class Donation {

    public Donation(String donorName, double amount, String email, int fundraiserId) {
        this.donorName = donorName;
        this.amount = amount;
        this.email = email;
        this.fundraiserId = fundraiserId;
    }
    
    private String donorName;
    
    private double amount;
    
    private String email;
    
    private int fundraiserId;

    /**
     * Get the value of fundraiserId
     *
     * @return the value of fundraiserId
     */
    public int getFundraiserId() {
        return fundraiserId;
    }

    /**
     * Set the value of fundraiserId
     *
     * @param fundraiserId new value of fundraiserId
     */
    public void setFundraiserId(int fundraiserId) {
        this.fundraiserId = fundraiserId;
    }


    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Get the value of amount
     *
     * @return the value of amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Set the value of amount
     *
     * @param amount new value of amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }


    /**
     * Get the value of donorName
     *
     * @return the value of donorName
     */
    public String getDonorName() {
        return donorName;
    }

    /**
     * Set the value of donorName
     *
     * @param donorName new value of donorName
     */
    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

}
