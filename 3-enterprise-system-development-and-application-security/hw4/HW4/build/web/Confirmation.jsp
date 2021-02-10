<%-- 
    Document   : Confirmation
    Created on : Nov 4, 2020, 5:04:33 AM
    Author     : Owner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Complete!</title>
    </head>
    <body>
        <h1>Registered Class:</h1>
        <p>Course Number: ${SelectedCourse.courseNumber}<br>
           Course Name: ${SelectedCourse.name}<br>
           CostPerDay:$ ${SelectedCourse.costPerDay}<br> 
           Duration (Days): ${Duration}<br>          
           Total Payment:$ ${Registration.totalPayment}<br></p>
        <a href="AvailableCoursesServlet">Show Available Courses</a>
    </body>
</html>
