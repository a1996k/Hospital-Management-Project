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

	<h1>Doctors Observation</h1>
		<br>
		<br>
		<br>
	<form action="/api/save-bookedAppointment" method="POST">
		<label for="patientName">Patient Name:</label> 
		<input type="text" id="patientName" name="patientName" value = "${patient.firstName} ${patient.middleName} ${patient.lastName}" readonly>
		<br>
		<input type="hidden" id="patientID" name="patientID" value="${patient.id}">
		<br> 
		<label for="doctorName">DoctorName:</label> 
		<input type="text" id="doctorName" name="doctorName"  value = "${doctor.doctorName}" readonly><br>
		<br>
		<input type="hidden" id="doctorID" name="doctorID" value="${doctor.id}">
		<br>
		<label for="symptoms">Symptoms:</label> 
		<input type="text" id="symptoms" name="symptoms">
		<br>
		<label for="gender">Gender:</label> 
		<input type="text" id="gender" name="gender">
		<br>
		<label for="diagnosis">Diagnosis:</label> 
		<input type="text" id="diagnosis" name="diagnosis">
		<br>
		<label for="medicinesDose">Medicines Dose:</label> 
		<input type="text" id="medicinesDose" name="medicinesDose">
		<br>
		<label for="dos">Do's:</label> 
		<input type="text" id="dos" name="dos">
		<br>
		<label for="donts">Dont's:</label> 
		<input type="text" id="donts" name="donts">
		<br>
		<label for="investigations">Investigations:</label> 
		<input type="text" id="investigations" name="investigations">
		<br>
		<label for="followupDate">Follow-up Date:</label> 
		<input type="date" id="followupDate" name="followupDate">
		<br>

		<br>
		<button type="submit">Submit</button>
	</form>
</body>
</html>

