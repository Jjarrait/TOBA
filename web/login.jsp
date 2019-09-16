<%-- 
    Document   : login
    Created on : Sep 15, 2019, 11:37:58 PM
    Author     : jnjrr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <c:import url="/includes/header.html" />
        <h1>TOBA Login</h1>
        
        <form action="LoginServlet" method="post">
            <input type="hidden" name="action" value="add">
            
            <label>Username</label>
            <input type="email" name="username" required><br>
            
            <label>Password</label>
            <input type="text" name="password" required><br>
            
            <label>&nbsp;</label>
            <input type="submit" value="Login" id="submit">
        </form>
        <p> 
        <a href="new_customer.jsp">New customer? Register here.</a><br>
        <a href="password_reset.jsp">Reset Password</a><br>
        </p>
        <c:import url="/includes/footer.jsp" />
    </body>
</html>
