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
        <h1>ID :  <%out.print(Id + "<br/>"); %>   </h1>
        <h1>Name : <%out.print(Name + "<br/>"); %>  </h1>
        <h1>GPA : <%out.print(Gpa + "<br/>"); %>  </h1>
        <h1>Is added </h1>
        <a href="index.html">Back to Add Student </a>
        <%@ include file = "result.jsp" %>
    </body>
</html>
