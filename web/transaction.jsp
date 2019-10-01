<%-- 
    Document   : transaction
    Created on : Sep 15, 2019, 11:46:36 PM
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
        <h1>New Transaction</h1>
        
         <label class="pad_top">Account Balance</label>
            <span>${account.balance}</span><br>
            
        <form action="TransactionServlet" method="post">
            <input type="hidden" name="action" value="add">      
            <label class="pad_top">Enter Deposit Amount</label>
            <input type="number" name="Credit()" value="${account.Credit()}"><br>
            <label>&nbsp</label>
            <input type="submit" value="Submit" class="margin_left">
            
            
        </form>
        <c:import url="/includes/footer.jsp" />
    </body>
</html>
