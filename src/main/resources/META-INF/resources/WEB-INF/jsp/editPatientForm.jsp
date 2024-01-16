<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/api/edit/${patient.id}" method="POST">
		<!--<input type="hidden" name="id" value="${patient.id}"/>-->
		
		<label for="firstName">firstName:</label> 
		<input type="text" id="firstName" name="firstName" value = "${patient.firstName}"><br>
		<br> 
		<label for="middleName">middleName:</label> 
		<input type="text" id="middleName" name="middleName" value = "${patient.middleName}"><br>
		<br>
		<label for="lastName">lastName:</label> 
		<input type="text" id="lastName" name="lastName" value = "${patient.lastName}"><br>
		<br>
		<label for="dob">DOB:</label> 
		<input type="Date" id="dob" name="dob" value = "${patient.dob}">
		<br>
		<label for="gender">Gender:</label> 
		<input type="text" id="gender" name="gender" value = "${patient.gender}">
		<br>
		<label for="email">Email:</label> 
		<input type="email" id="email" name="email" value = "${patient.email}">
		<br>
		<label for="mobileNumber">mobileNumber:</label> 
		<input type="text" id="mobileNumber" name="mobileNumber" value = "${patient.mobileNumber}">
		<br>
		<label for="photoID">photoID:</label> 
		<input type="text" id="photoID" name="photoID" value = "${patient.photoID}">
		<br>
		<label for="country">country:</label> 
		<input type="text" id="country" name="country" value = "${patient.country}">
		<br>
		<label for="state">state:</label> 
		<input type="text" id="state" name="state" value = "${patient.state}">
		<br>
		<label for="city">city:</label> 
		<input type="text" id="city" name="city" value = "${patient.city}">
		<br>
		<label for="residentialAddress">residentialAddress:</label> 
		<input type="text" id="residentialAddress" name="residentialAddress" value = "${patient.residentialAddress}">
		<br>
		<label for="permanentAddress">permanentAddress:</label> 
		<input type="text" id="permanentAddress" name="permanentAddress" value = "${patient.permanentAddress}">
		<br>
		<label for="bloodGroop">bloodGroop:</label> 
		<input type="text" id="bloodGroop" name="bloodGroop" value = "${patient.bloodGroop}">
		<br>
		<label for="chronicDiseases">chronicDiseases:</label> 
		<input type="text" id="chronicDiseases" name="chronicDiseases"  value = "${patient.chronicDiseases}">
		<br>
		<label for="medicalAllergy">medicalAllergy:</label> 
		<input type="text" id="medicalAllergy" name="medicalAllergy"  value = "${patient.medicalAllergy}">
		<br>
		<label for="assignedDoctor">assignedDoctor:</label> 
		<input type="text" id="assignedDoctor" name="assignedDoctor"  value = "${patient.assignedDoctor}">
		<br>

		<br>
		<button type="submit">Submit</button>
	</form>
</body>
</html>

