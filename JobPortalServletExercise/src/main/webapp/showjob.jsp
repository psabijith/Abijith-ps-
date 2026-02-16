<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.aitrich.servlets.Entity.Job" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Jobs</title>

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

</head>
<body>

<div style="border: solid red thin; width: 700px; height: 500px; padding: 40px;border-radius: 40px;">
<h2 style="position: relative;top: 20px; left: 270px;">All Jobs</h2>
<br><br>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Description</th>
        <th>Salary</th>
        <th>Employer ID</th>
    </tr>

<%
    List<Job> jobs = (List<Job>) request.getAttribute("jobs");

    if (jobs != null) {
        for (Job job : jobs) {
%>
    <tr>
        <td><%= job.getId() %></td>
        <td><%= job.getTitle() %></td>
        <td><%= job.getDescription() %></td>
        <td><%= job.getSalary() %></td>
        <td><%= job.getEmployerId() %></td>

        <td><a href="update-job-by-id?id=<%= job.getId() %>">UPDATE</a></td>
        <td><a href="delete-job-by-id?id=<%= job.getId() %>">DELETE</a></td>
    </tr>
<%
        }
    }
%>

</table>
</div>

</body>
</html>