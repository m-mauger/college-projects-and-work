/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.txstate.mjm356;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(name = "AvailableCoursesServlet", urlPatterns = {"/AvailableCoursesServlet"})
public class AvailableCoursesServlet extends HttpServlet {

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
        if(aUser != null){
            //ArrayList<Course> courses = new ArrayList<Course>();
            //courses.add(new Course(100, "Science", 50.5));
            //courses.add(new Course(101, "Math", 30.4));
            //courses.add(new Course(102, "Reading", 20.6));
            //courses.add(new Course(103, "Art", 30.5));
            //courses.add(new Course(104, "Music", 25.8));
            ArrayList<Course> courses = CoursesDB.getCourses();
            
            request.setAttribute("CourseList", courses);
        
            String courseNumber = request.getParameter("courseNumber");
            if(courseNumber != null){
                Course aCourse = courses.stream()
                        .filter(item -> courseNumber.equals(Integer.toString(item.getCourseNumber())))
                        .findAny()
                        .orElse(null);
                
             session.setAttribute("SelectedCourse", aCourse);
             //Save selected courseNumber cookie
             Cookie c = new Cookie("SelectedCourse", courseNumber);
             c.setMaxAge(60*60*24*365); //One year           
             c.setPath("/");
             response.addCookie(c);
             
             getServletContext().getRequestDispatcher("/SelectedCourse.jsp").forward(request, response);
            }        
            getServletContext().getRequestDispatcher("/AvailableCourses.jsp").forward(request, response);
        }else{
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
