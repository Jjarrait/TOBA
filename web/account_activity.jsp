<%-- 
    Document   : account_activity
    Created on : Sep 15, 2019, 8:01:17 PM
    Author     : jnjrr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <h1>Account Activity</h1>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <c:import url="/includes/header.html" />
        <c:if test="${sessionScope.user == null}">
              <p>Not Logged In</p>
    </c:if>
    <c:if test="${sessionScope.user != null}">
        <p>Welcome ${user.firstName}  
            ${user.lastName}</p>
        
    </c:if>
        <c:import url="/includes/footer.jsp" />
    </body>
</html>
