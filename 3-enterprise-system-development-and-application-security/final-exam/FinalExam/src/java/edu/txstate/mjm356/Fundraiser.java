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
public class Fundraiser {

    public Fundraiser(int id, String title, String organizer, double goalAmount) {
        this.id = id;
        this.title = title;
        this.organizer = organizer;
        this.goalAmount = goalAmount;
    }
    
    private int id;
    
    private String title;
    
    private String organizer;
    
    private double goalAmount;

    /**
     * Get the value of goalAmount
     *
     * @return the value of goalAmount
     */
    public double getGoalAmount() {
        return goalAmount;
    }

    /**
     * Set the value of goalAmount
     *
     * @param goalAmount new value of goalAmount
     */
    public void setGoalAmount(double goalAmount) {
        this.goalAmount = goalAmount;
    }


    /**
     * Get the value of organizer
     *
     * @return the value of organizer
     */
    public String getOrganizer() {
        return organizer;
    }

    /**
     * Set the value of organizer
     *
     * @param organizer new value of organizer
     */
    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }


    /**
     * Get the value of title
     *
     * @return the value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the value of title
     *
     * @param title new value of title
     */
    public void setTitle(String title) {
        this.title = title;
    }


    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }

}
