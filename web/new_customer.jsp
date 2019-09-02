<%-- 
    Document   : New_customer
    Created on : Aug 25, 2019, 11:23:05 AM
    Author     : Jennifer Jarrait
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TOBA New Customer</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    </head>
    <body>
        <h1>New Customer Registration</h1>
        <p>Please fill in the information below to register an account.</p>
        <p><b>${message}</b></p>
        
        <form action ="NewCustomerServlet" method="post">
            <input type="hidden" name="action" value="add">
            
            <label>First Name</label>
            <input type="text" name="firstName" value="${user.firstName}"><br>
            
            <label>Last Name</label>
            <input type="text" name="lastName" value="${user.lastName}"><br>
            
            <label>Phone</label>
            <input type="text" name="phone" value="${user.phone}"><br>
            
            <label>Address</label>
            <input type="text" name="address" value="${user.address}"><br>
            
            <label>City</label>
            <input type="text" name="city" value="${user.city}"><br>
            
            <label>State</label>
            <input type="text" name="state" value="${user.state}"><br>
            
            <label>Zipcode</label>
            <input type="text" name="zipcode" value="${user.zipcode}"><br>
            
            <label>Email</label>
            <input type="email" name="email" value="${user.email}"><br>
            
            <label>&nbsp;</label>
            <input type="submit" value="Submit" id="submit">
        </form>        
    </body>
</html>
