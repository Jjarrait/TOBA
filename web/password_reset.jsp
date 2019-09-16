<%-- 
    Document   : password_reset
    Created on : Sep 11, 2019, 11:50:01 PM
    Author     : Jennifer Jarrait
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
        <h1>Enter new Password below.</h1>
        <form action ="NewCustomerServlet" method="post">
            <input type="hidden" name="action" value="resetPassword">
            
            <label class="pad_top">Password</label>
            <input type="text" name="password" value="${user.password}"><br>
            
            <label>&nbsp;</label>
            <input type="submit" value="Reset Password" class="margin_left">
        </form>
            <c:import url="/includes/footer.jsp" />
    </body>
</html>
