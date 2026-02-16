<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.aitrich.servlets.Entity.Job" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Job</title>

<style>
body{
    margin: 0;
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
}

input{
    width: 300px;
    height: 40px;
    border-radius: 30px;
    background-color: skyblue;
    color: black;
    border: none;
    padding-left: 15px;
}

form{
    position: relative;
    top: 40px;
}
</style>

</head>
<body>

<div style="border: solid red thin; width: 300px; height: 550px; padding: 40px; border-radius: 40px;">
    <h2 style="position: relative; top: 20px; left: 90px;">Update Job</h2>
    <br><br>

    <%
        Job job = (Job) request.getAttribute("job");
    %>

    <form action="update-job-by-id" method="post">

        <input type="hidden" name="id" value="<%= job.getId() %>">

        <input name="title"
               value="<%= job.getTitle() %>"
               placeholder="Enter Title"><br><br>

        <input name="description"
               value="<%= job.getDescription() %>"
               placeholder="Enter Description"><br><br>

        <input name="salary"
               value="<%= job.getSalary() %>"
               placeholder="Enter Salary"><br><br>

        <input name="employerId"
               value="<%= job.getEmployerId() %>"
               placeholder="Enter Employer ID"><br><br>

        <input type="submit" value="Update">
    </form>

</div>

</body>
</html>