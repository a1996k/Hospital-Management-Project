<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/api/saveedit-reception/${reception.id}" method="POST">
		<!--<input type="hidden" name="id" value="${patient.id}"/>-->
		
		<label for="firstName">firstName:</label> 
		<input type="text" id="firstName" name="firstName" value = "${reception.firstName}"><br>
		<br> 
		<label for="middleName">middleName:</label> 
		<input type="text" id="middleName" name="middleName" value = "${reception.middleName}"><br>
		<br>
		<label for="lastName">lastName:</label> 
		<input type="text" id="lastName" name="lastName" value = "${reception.lastName}"><br>
		<br>
		<label for="dob">DOB:</label> 
		<input type="Date" id="dob" name="dob" value = "${reception.dob}">
		<br>
		<label for="gender">Gender:</label> 
		<input type="text" id="gender" name="gender" value = "${reception.gender}">
		<br>
		<label for="email">Email:</label> 
		<input type="email" id="email" name="email" value = "${reception.email}">
		<br>
		<label for="mobileNumber">mobileNumber:</label> 
		<input type="text" id="mobileNumber" name="mobileNumber" value = "${reception.mobileNumber}">
		<br>
		<label for="userName">userName:</label> 
		<input type="text" id="userName" name="userName" value = "${reception.userName}">
		<br>
		<label for="password">password:</label> 
		<input type="text" id="password" name="password" value = "${reception.password}">
		<br>
		<br>
		<button type="submit">Submit</button>
	</form>
</body>
</html>

