/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.txstate.mjm356;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Owner
 */
@WebServlet(name = "RegisterForClassServlet", urlPatterns = {"/RegisterForClassServlet"})
public class RegisterForClassServlet extends HttpServlet {

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
       
        HttpSession session = request.getSession();
        User aUser = (User) session.getAttribute("User");
        if(aUser == null){
           
            getServletContext().getRequestDispatcher("/LoginForm.jsp").forward(request, response);
            
        }
                
        GregorianCalendar currentDate = new GregorianCalendar();        
        int currentMonth = currentDate.get(Calendar.MONTH) + 1;
        int currentDay = currentDate.get(Calendar.DAY_OF_MONTH);
        String registrationDate = currentMonth + "/" + currentDay;
                        
        Course selectedCourse = (Course) session.getAttribute("SelectedCourse");
        double totalPayment = (Double.parseDouble(request.getParameter("duration")) * selectedCourse.getCostPerDay());
        
        Registration registration = new Registration(aUser.getId(), selectedCourse.getCourseNumber(), selectedCourse.getName(), registrationDate, totalPayment);
        
        //ServletContext sc = this.getServletContext();
        //String p = sc.getRealPath("/WEB-INF/Registrations.txt");
        //RegistrationIO.save(registration, p);
        String duration = request.getParameter("duration");
        RegistrationDB.registerForClassInDB(registration, duration);
        
        request.setAttribute("Registration", registration);
        request.setAttribute("Duration", duration);
        
        //Remove cookie and session object        
        Cookie c = new Cookie("SelectedCourse", "");             
        c.setMaxAge(0); 
        c.setPath("/");
        response.addCookie(c);        
        getServletContext().getRequestDispatcher("/Confirmation.jsp").forward(request, response);
        session.setAttribute("SelectedCourse", null);
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
