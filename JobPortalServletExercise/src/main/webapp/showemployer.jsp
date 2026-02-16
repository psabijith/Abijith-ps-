<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.aitrich.servlets.Entity.Employer" %>
    
<!DOCTYPE html>
<html>
<head>
<style>
body{
	align-self: center;
	margin: 0;
  	height: 100vh;
  	display: flex;
  	justify-content: center;
  	align-items: center; 
}

div{
	margin: 0;
  	
  	justify-content: center;
}

</style>
<meta charset="UTF-8">
<title>All Employers</title>
</head>
<body>
<div style= "border: solid red thin; width: 450px; height: 500px; padding: 40px;border-radius: 40px;">
<h2 style="position: relative;top: 20px; left: 150px;">All Employers</h2>
<br><br>
	<table border="1">
    <tr>
        <th>ID</th>
        <th>Commpany Name</th>
        <th>Email</th>
    </tr>

<%
    List<Employer> employers = (List<Employer>) request.getAttribute("employers");

    if (employers != null) {
        for (Employer emp : employers) {
%>
    <tr>
        <td name="id"><%= emp.getId() %></td>
        <td name="companyName"><%= emp.getCompanyName() %></td>
        <td name="email"><%= emp.getEmail() %></td>
        <td><a href="update-employer-by-id?id=<%=emp.getId() %>">UPDATE</a></td>
        <td><a href="delete-employer-by-id?id=<%=emp.getId() %>">DELETE</a></td>
    </tr>
<%
        }
    }
%>

</table>
</div>
</body>
</html>