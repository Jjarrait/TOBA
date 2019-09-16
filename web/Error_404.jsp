<%-- 
    Document   : Error_404
    Created on : Aug 25, 2019, 2:59:43 PM
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
        <h1>404 Error</h1>
        <p>The server was not able to find the file you requested.</p>
        <p>To continue, click the Back button.</p>
        <c:import url="/includes/footer.jsp" />
    </body>
</html>
