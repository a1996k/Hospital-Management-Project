<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="stylesheet">
<title>List of Patient for Doctors</title>
</head>
<body>
	<div>List of Patient</div>
	<div class="container">
		<h1>List of Patient's</h1>
		<hr>
		<div class="table">
			<table>
				<thead>
					<tr>
						<th>ID</th>
						<th>firstName</th>
						<th>middleName</th>
						<th>lastName</th>
						<th>dob</th>
						<th>gender</th>
						<th>email</th>
						<th>mobileNumber</th>
						<th>photoID</th>
						<th>country</th>
						<th>state</th>
						<th>city</th>
						<th>residentialAddress</th>
						<th>permanentAddress</th>
						<th>bloodGroop</th>
						<th>chronicDiseases</th>
						<th>medicalAllergy</th>
						<th>assignedDoctor</th>
					</tr>

				</thead>
				<tbody>
					<c:forEach items="${patient}" var="patient">
						<tr>
							
							<td>${patient.id}</td>
							<td>${patient.firstName}</td>
							<td>${patient.middleName}</td>
							<td>${patient.lastName}</td>
							<td>${patient.dob}</td>
							<td>${patient.gender}</td>
							<td>${patient.email}</td>
							<td>${patient.mobileNumber}</td>
							<td>${patient.photoID}</td>
							<td>${patient.country}</td>
							<td>${patient.state}</td>
							<td>${patient.city}</td>
							<td>${patient.residentialAddress}</td>
							<td>${patient.permanentAddress}</td>
							<td>${patient.bloodGroop}</td>
							<td>${patient.chronicDiseases}</td>
							<td>${patient.medicalAllergy}</td>
							<td>${patient.assignedDoctor}</td>
							<td>
							
                        		<a href="/api/edit-patient/${patient.id}">Edit</a> |
		                        <a href="/api/delete-patient/${patient.id}">Delete</a>
		                    </td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href="patient-form" class="btn btn-success"> Go to Patient Form</a>
		</div>
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>