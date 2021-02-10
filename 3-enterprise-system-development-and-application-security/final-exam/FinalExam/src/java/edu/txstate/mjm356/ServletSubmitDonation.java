/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.txstate.mjm356;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Owner
 */
@WebServlet(name = "ServletSubmitDonation", urlPatterns = {"/ServletSubmitDonation"})
public class ServletSubmitDonation extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        //Get paramters from selected-fundraiser jsp form
        String title = request.getParameter("selectedFundraiserTitle");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        double donationAmount = Double.parseDouble(request.getParameter("donationAmount"));
        int fundraiserId = Integer.parseInt(request.getParameter("selectedFundraiserId"));
        
        //Create a donation object based on the parameters we found and put it in the database
        Donation aDonation = new Donation(name, donationAmount, email, fundraiserId);
        DBDonation.submitDonationInDB(aDonation);
        
        //Save the donation cookie so we know what their previous donation was
        Cookie c = new Cookie("PreviousDonation", title);
        c.setMaxAge(60*60*24*365); //One year           
        c.setPath("/");
        response.addCookie(c);
        
        getServletContext().getRequestDispatcher("/thankyou.jsp").forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
