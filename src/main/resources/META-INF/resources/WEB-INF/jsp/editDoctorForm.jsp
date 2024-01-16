<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/api/saveedit-doctor/${doctor.id}" method="POST">
		<!--<input type="hidden" name="id" value="${patient.id}"/>-->
		
		<label for="doctorName">doctorName:</label> 
		<input type="text" id="doctorName" name="doctorName" value = "${doctor.doctorName}"><br>
		<br> 
		<label for="doctorDepartment">middleName:</label> 
		<input type="text" id="doctorDepartment" name="doctorDepartment" value = "${doctor.doctorDepartment}"><br>
		<br>
		<label for="dob">DOB:</label> 
		<input type="Date" id="dob" name="dob" value = "${doctor.dob}">
		<br>
		<label for="gender">Gender:</label> 
		<input type="text" id="gender" name="gender" value = "${doctor.gender}">
		<br>
		<label for="email">Email:</label> 
		<input type="email" id="email" name="email" value = "${doctor.email}">
		<br>
		<label for="mobileNumber">mobileNumber:</label> 
		<input type="text" id="mobileNumber" name="mobileNumber" value = "${doctor.mobileNumber}">
		<br>
		<label for="userName">userName:</label> 
		<input type="text" id="userName" name="userName" value = "${doctor.userName}">
		<br>
		<label for="password">password:</label> 
		<input type="text" id="password" name="password" value = "${doctor.password}">
		<br>
		<br>
		<button type="submit">Submit</button>
	</form>
</body>
</html>

