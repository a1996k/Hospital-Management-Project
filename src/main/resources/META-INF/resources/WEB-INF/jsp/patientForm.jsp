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

@media ( max-width : 768px) {
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

	<h1>Add Patient</h1>
		<br>
		<br>
		<br>
	<form action="add-patient" method="POST">
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
		<label for="photoID">photoID:</label> 
		<input type="text" id="photoID" name="photoID">
		<br>
		<label for="country">country:</label> 
		<input type="text" id="country" name="country">
		<br>
		<label for="state">state:</label> 
		<input type="text" id="state" name="state">
		<br>
		<label for="city">city:</label> 
		<input type="text" id="city" name="city">
		<br>
		<label for="residentialAddress">residentialAddress:</label> 
		<input type="text" id="residentialAddress" name="residentialAddress">
		<br>
		<label for="permanentAddress">permanentAddress:</label> 
		<input type="text" id="permanentAddress" name="permanentAddress">
		<br>
		<label for="bloodGroop">bloodGroop:</label> 
		<input type="text" id="bloodGroop" name="bloodGroop">
		<br>
		<label for="chronicDiseases">chronicDiseases:</label> 
		<input type="text" id="chronicDiseases" name="chronicDiseases">
		<br>
		<label for="medicalAllergy">medicalAllergy:</label> 
		<input type="text" id="medicalAllergy" name="medicalAllergy">
		<br>
		<!--  <label for="assignedDoctor">assignedDoctor:</label> 
		<input type="text" id="assignedDoctor" name="assignedDoctor">
		<br>-->
		<!--<label for="doctor-dropdown">Select Doctor:</label>
		<select id="doctor-dropdown" name = "doctor-dropdown" onchange="updateDoctorID()">
			<c:forEach items="${doctor}" var="doctor">
				<option value="${doctor.doctorName}">${doctor.doctorName}</option>
			</c:forEach>
		</select>-->
		<br>
		<button type="submit">Submit</button>
	</form>
	
	<script>
		function updateDoctorID() {
			var doctorDropdown = document.getElementById("doctor-dropdown");
			var doctorIDField = document.getElementById("doctorID");
			var selectedDoctorID = doctorDropdown.options[doctorDropdown.selectedIndex].value;
			doctorIDField.value = selectedDoctorID;
		}
	</script>
</body>
</html>

