<%-- 
    Document   : success
    Created on : Sep 11, 2019, 1:28:39 PM
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
        <h1>Your account has been successfully created.</h1>
        <p>
            <label>First Name:</label>
            <span>${user.firstName}</span><br>
            <label>Last Name:</label>
            <span>${user.lastName}</span><br>
            <label>Phone:</label>
            <span>${user.phone}</span><br>
            <label>Address:</label>
            <span>${user.address}</span><br>
            <label>City:</label>
            <span>${user.city}</span><br>
            <label>State:</label>
            <span>${user.state}</span><br>
            <label>Zipcode:</label>
            <span>${user.zipcode}</span><br>
            <label>Email:</label>
            <span>${user.email}</span><br>
            <label>Username:</label>
            <span>${user.username}</span><br>
            <label>Password:</label>
            <span>${user.password}</span><br>
        </p>
        <c:import url="/includes/footer.jsp" />
    </body>
</html>
