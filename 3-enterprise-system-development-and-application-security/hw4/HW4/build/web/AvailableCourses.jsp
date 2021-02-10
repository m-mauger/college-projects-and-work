<%-- 
    Document   : AvailableCourses
    Created on : Nov 4, 2020, 2:44:01 AM
    Author     : Owner
--%>

<%@page import="edu.txstate.mjm356.Course"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Available Courses</title>
    </head>
    <body>
        <h1>Courses that are available</h1>
         <%
            ArrayList<Course> courses = (ArrayList<Course>) request.getAttribute("CourseList");
            for(Course aCourse : courses){
        %>
        
        <p><%=aCourse.getCourseNumber()%> : <%=aCourse.getName()%> : <%=aCourse.getCostPerDay()%> <a href="AvailableCoursesServlet?courseNumber=<%=aCourse.getCourseNumber()%>">Select</a></p>
        
        <%
            }
        %>
    </body>
</html>
