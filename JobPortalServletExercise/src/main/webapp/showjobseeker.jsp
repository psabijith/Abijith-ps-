<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.aitrich.servlets.Entity.JobSeeker" %>
    
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
<title>All Job seekers</title>
</head>
<body>
<div style= "border: solid red thin; width: 450px; height: 500px; padding: 40px;border-radius: 40px;">
<h2 style="position: relative;top: 20px; left: 150px;">All Job Seekers</h2>
<br><br>
	<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Skills</th>
        <th>Resume</th>
    </tr>

<%
    List<JobSeeker> jobseekers = (List<JobSeeker>) request.getAttribute("jobseekers");

    if (jobseekers != null) {
        for (JobSeeker js : jobseekers) {
%>
    <tr>
        <td name="id"><%= js.getId() %></td>
        <td name="name"><%= js.getName() %></td>
        <td name="email"><%= js.getEmail() %></td>
        <td name="skill"><%= js.getSkills() %></td>
        <td name="resume"><%= js.getResume() %></td>
        <td><a href="update-jobseeker-by-id?id=<%=js.getId() %>">UPDATE</a></td>
        <td><a href="delete-jobseeker-by-id?id=<%=js.getId() %>">DELETE</a></td>
    </tr>
<%
        }
    }
%>

</table>
</div>
</body>
</html>