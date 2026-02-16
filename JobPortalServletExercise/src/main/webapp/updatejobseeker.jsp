<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.aitrich.servlets.Entity.JobSeeker" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update JobSeeker</title>

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

<div style="border: solid red thin; width: 300px; height: 500px; padding: 40px; border-radius: 40px;">
    <h2 style="position: relative; top: 20px; left: 50px;">Update JobSeeker</h2>
    <br><br>

    <%
        JobSeeker js = (JobSeeker) request.getAttribute("js");
    %>

    <form action="update-jobseeker-by-id" method="post">

        <input name="id" value="<%= js.getId() %>" readonly><br><br>

        <input name="name"
               value="<%= js.getName() %>"
               placeholder="Enter your Name"><br><br>

        <input name="email"
               value="<%= js.getEmail() %>"
               placeholder="Enter your Email"><br><br>

        <input name="skills"
               value="<%= js.getSkills() %>"
               placeholder="Enter your Skills"><br><br>

        <input name="resume"
               value="<%= js.getResume() %>"
               placeholder="Enter your Resume"><br><br>

        <input type="submit" value="Update">
    </form>

</div>

</body>
</html>