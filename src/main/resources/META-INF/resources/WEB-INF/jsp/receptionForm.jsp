<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Add Receptionist</h1>
	<br>
	<br>
	<br>
	<form action="add-reception" method="POST">
		<label for="firstName">firstName:</label> 
		<input type="text" id="firstName" name="firstName"><br>
		<br> 
		<label for="middleName">middleName:</label> 
		<input type="text" id="middleName" name="middleName"><br>
		<br>
		<label for="lastName">lastName:</label> 
		<input type="text" id="lastName" name="lastName"><br>
		<br>
		<label for="dob">DOB:</label> 
		<input type="Date" id="dob" name="dob">
		<br>
		<label for="gender">Gender:</label> 
		<input type="text" id="gender" name="gender">
		<br>
		<label for="email">Email:</label> 
		<input type="email" id="email" name="email">
		<br>
		<label for="mobileNumber">mobileNumber:</label> 
		<input type="text" id="mobileNumber" name="mobileNumber">
		<br>
		<label for="userName">userName:</label>
		<input type="text" id="userName" name="userName">
		<br>
		<label for="password">password:</label> 
		<input type="text" id="password" name="password">
		<br>   
		<button type="submit">Submit</button>
	</form>
</body>
</html>

