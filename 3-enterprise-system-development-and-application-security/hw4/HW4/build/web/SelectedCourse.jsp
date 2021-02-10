<%-- 
    Document   : SelectedCourse
    Created on : Nov 4, 2020, 4:03:29 AM
    Author     : Owner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Selected Course</title>
    </head>
    <body>
        <h1>Currently Selected Course:</h1>
        <p>${SelectedCourse.courseNumber} : ${SelectedCourse.name}</p>
        <form action="RegisterForClassServlet" method="post">
            <label>Duration (Days)</label><input type="number" name="duration"><br>
            <input type="submit" formaction="AvailableCoursesServlet" value="Back">
            <input type="submit" value="Submit">
            
        </form>
    </body>
</html>
