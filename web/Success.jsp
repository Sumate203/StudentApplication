<%-- 
    Document   : allStudent
    Created on : 13 พ.ย. 2565, 20:35:45
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success</title>
    </head>
 <body>
        
     <% 
     String Id = request.getParameter("ID");
     String Name  = request.getParameter("Name");
     String Gpa  = request.getParameter("GPA");
     %>
        <h2>ID :  <%out.print(Id + "<br/>"); %>   <h2>
        <h2>Name : <%out.print(Name + "<br/>"); %>  <h2>
        <h2>GPA : <%out.print(Gpa + "<br/>"); %> <h2>
        <h2>Is added <h2>
        <h1>Student List </h1>
        <%@ include file = "result.jsp" %>
        <a href="index.html">Back to Add Student </a>
    </body>
</html>
