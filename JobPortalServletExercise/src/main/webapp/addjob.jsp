<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Job</title>

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
    <h2 style="position: relative; top: 20px; left: 90px;">Add Job</h2>
    <br><br>

    <form action="add-job" method="post">

        <input name="id" placeholder="Enter Job ID"><br><br>

        <input name="title" placeholder="Enter Title"><br><br>

        <input name="description" placeholder="Enter Description"><br><br>

        <input name="salary" placeholder="Enter Salary"><br><br>

        <input name="employerId" placeholder="Enter Employer ID"><br><br>

        <input type="submit" value="Add Job">
    </form>
</div>

</body>
</html>