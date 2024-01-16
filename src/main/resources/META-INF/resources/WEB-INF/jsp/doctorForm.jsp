<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Hospital Management System</title>
</head>
<style>
		body {
			background-color: #f7f7f7;
			font-family: Arial, sans-serif;
			margin: 0;
			padding: 0;
			text-align: center;
		}

		h1 {
			color: #0077b6;
			margin-top: 50px;
		}

		p {
			color: #293241;
			font-size: 18px;
			margin-top: 20px;
		}

		button {
			background-color: #0077b6;
			border: none;
			border-radius: 5px;
			color: #fff;
			cursor: pointer;
			font-size: 16px;
			margin: 10px;
			padding: 10px 20px;
			transition: background-color 0.3s;
		}

		button:hover {
			background-color: #005b8f;
		}

		@media (max-width: 768px) {
			h1 {
				font-size: 32px;
			}

			p {
				font-size: 16px;
			}

			button {
				font-size: 14px;
			}
		}
	</style>
</head>
<body>

	<h1>Add Doctor</h1>
	<br>
	<br>
	<br>
	<form action="add-doctor" method="POST">
		<label for="doctorName">doctorName:</label> 
		<input type="text" id="doctorName" name="doctorName"><br>
		<br> 
		<label for="doctorDepartment">doctorDepartment:</label> 
		<input type="text" id="doctorDepartment" name="doctorDepartment"><br>
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

