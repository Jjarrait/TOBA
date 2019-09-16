<%-- 
    Document   : footer
    Created on : Sep 15, 2019, 11:03:36 PM
    Author     : Jennifer Jarrait
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TOBA</title>
        
    </head>
    <body>
        <%@ page import="java.util.GregorianCalendar, java.util.Calendar" %>
        <%GregorianCalendar currentDate = new GregorianCalendar();
        int currentYear = currentDate.get(Calendar.YEAR);
        %>
        <p>&copy; Copyright <%= currentYear %> TOBA </p>
    </body>
</html>
