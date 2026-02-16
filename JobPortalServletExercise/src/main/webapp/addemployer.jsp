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
<title>Add Employer</title>
</head>
<body>
<div style= "border: solid red thin; width: 300px; height: 500px; padding: 40px;border-radius: 40px;">
<h2 style="position: relative;top: 20px; left: 70px;">Add Employer</h2>
<br><br>

	<form action="add-employer" method="post">
		<input name="id" placeholder="Enter your Id"><br><br>
		<input name="companyname" placeholder="Enter your Company Name"><br><br>
		<input name="email" placeholder="Enter your Email"><br><br>
		<input style="position: relative;left: 50px; width: 200px; height: 40px; border-radius: 30px;" type="submit" value="Add Me">
	</form>
</div>
</body>
</html>