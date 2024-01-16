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
	<h1>Appointment</h1>
	<form action="/api/appointmentDetails" method="GET" >
		<label for="patient-dropdown">Select Patient:</label> 
		<select id="patient-dropdown" name = "patient-dropdown" onchange="updatePatientID()">
			<c:forEach items="${patient}" var="patient">
				<option value="${patient.id}">${patient.firstName}</option>
			</c:forEach>
		</select> 
		<!--<input type="hidden" id="patientID" name="patientID" value="">-->
		
		<label for="doctor-dropdown">Select Doctor:</label>
		<select id="doctor-dropdown" name = "doctor-dropdown" onchange="updateDoctorID()">
			<c:forEach items="${doctor}" var="doctor">
				<option value="${doctor.id}">${doctor.doctorName}</option>
			</c:forEach>
		</select>
		<!--  <input type="hidden" id="doctorID" name="doctorID" value="">-->
		
		<br>
		<button type="submit">Submit</button>

	</form>

	<script>
		function updatePatientID() {
			var patientDropdown = document.getElementById("patient-dropdown");
			var patientIDField = document.getElementById("patientID");
			var selectedPatientID = patientDropdown.options[patientDropdown.selectedIndex].value;
			patientIDField.value = selectedPatientID;
		}
		
		function updateDoctorID() {
			var doctorDropdown = document.getElementById("doctor-dropdown");
			var doctorIDField = document.getElementById("doctorID");
			var selectedDoctorID = doctorDropdown.options[doctorDropdown.selectedIndex].value;
			doctorIDField.value = selectedDoctorID;
		}
	</script>
</body>
</html>



