<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
  	height: 100vh;
  	
  	justify-content: center;
}
form{
	position: relative;top: 40px;
}
input{
	width: 300px;
	height: 40px;
	border-radius: 30px;
	background-color: skyblue;
	color: black;
}
</style>
<meta charset="UTF-8">
<title>Add Job Seeker</title>
</head>
<body>
<div style= "border: solid red thin; width: 300px; height: 500px; padding: 40px;border-radius: 40px;">
<h2 style="position: relative;top: 20px; left: 70px;">Add Job Seeker</h2>
<br><br>

	<form action="add-job-seeker" method="post">
		<input name="id" placeholder="Enter your Id"><br><br>
		<input name="name" placeholder="Enter your Name"><br><br>
		<input name="email" placeholder="Enter your Email"><br><br>
		<input name="skills" placeholder="Enter your skill"><br><br>
		<input name="resume" placeholder="Enter your resume url"><br><br>
		<input style="position: relative;left: 50px; width: 200px; height: 40px; border-radius: 30px;" type="submit" value="Add Me">
	</form>
</div>
</body>
</html>