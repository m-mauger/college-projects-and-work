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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Owner
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

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
       
        String id = request.getParameter("id");
        String password = request.getParameter("pwd");
        
        User aUser = UserDB.getUser(id);
        
        //if(id.equals("mjm356") && password.equals("1234")){
        if(aUser != null && aUser.getPassword().equals(password)){
            
            //User aUser = new User(id, null);
            HttpSession session = request.getSession();
            session.setAttribute("User", aUser);
            Course selectedCourse = null;
            
            //Course selectedCourse = (Course) session.getAttribute("SelectedCourse");
            //Find the selected course cookie
            String courseNumber = CookieUtil.getCookieValue(request.getCookies(), "SelectedCourse");
            if(courseNumber != null && !courseNumber.equals("")){
                selectedCourse = CoursesDB.getACourseByNumber(Integer.parseInt(courseNumber));
                session.setAttribute("SelectedCourse", selectedCourse);
            }
            
            if(selectedCourse == null){
                getServletContext().getRequestDispatcher("/AvailableCoursesServlet").forward(request, response);
            }else{
                getServletContext().getRequestDispatcher("/DisplaySelectedCourseServlet").forward(request, response);
            }
            
        }
        else{
            getServletContext().getRequestDispatcher("/LoginForm.jsp").forward(request, response);
        }
        
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
