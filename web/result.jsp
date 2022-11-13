<%@page import="Student.Student"%>
<%@page import="Student.StudentTable"%>
<%@page import="java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
  <table style="width:30%" border=" 1px solid black">
            <%
         List<Student> stdList = StudentTable.findAllStudent();
            %>
  <tr>
    <td>Id</td>
    <td>Name</td>
    <td>Gpa</td>
  </tr>
      <%for(Student std : stdList) {%>
  <tr>
      <td><%out.print(std.getId() + "<br/>"); %></td>
    <td><%out.print(std.getName()+ "<br/>"); %></td>
    <td><%out.print(std.getGPA()+ "<br/>");%></td>
  </tr>
     <%}%>
  <table/>
    </body>
</html>
