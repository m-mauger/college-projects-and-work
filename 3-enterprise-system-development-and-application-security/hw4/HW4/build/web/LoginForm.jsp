<%-- 
    Document   : LoginForm
    Created on : Nov 4, 2020, 2:02:05 AM
    Author     : Owner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Please login to register for a class.</h1>
        <form action="LoginServlet" method="post">
            <label>ID</label><input type="input" name="id"><br>
            <label>Password</label><input type="password" name="pwd"><br>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
