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
	<div>Appointment Details</div>
	<div class="container">
		<h1>Appointment Details</h1>
		<hr>
		<div class="patienttable">
		<h2>Selected Patient Details</h2>
			<table border="3">
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
							
                        		<!--<a href="/api/edit-patient/${patient.id}">Edit</a> |
		                        <a href="/api/delete-patient/${patient.id}">Delete</a>-->
		                    </td>
						</tr>
				</tbody>
			</table>	
			<br>
			<div class="doctortable">
			<h2>Selected Doctor Details</h2>
			<table border="3">
				<thead>
					<tr>
						<th>ID</th>
						<th>doctorName</th>
						<th>dob</th>
						<th>gender</th>
						<th>email</th>
						<th>mobileNumber</th>
						<!--<th>userName</th>
						<th>password</th>-->
					</tr>

				</thead>
				
				
				<tbody>
						<tr>
							
							<td>${doctor.id}</td>
							<td>${doctor.doctorName}</td>
							<!--<td>${doctor.doctorDepartment}</td>-->
							<td>${doctor.dob}</td>
							<td>${doctor.gender}</td>
							<td>${doctor.email}</td>
							<td>${doctor.mobileNumber}</td>
							<!--<td>${doctor.userName}</td>
							<td>${doctor.password}</td>-->
							<td>
							
                        		<!--<a href="/api/edit-doctor/${doctor.id}">Edit</a> |
		                        <a href="/api/delete-doctor/${doctor.id}">Delete</a>-->s
		                    </td>
						</tr>
				</tbody>
			</table>	
			</div>	
			<a href="/api/bookAppointment/${patient.id}/${doctor.id}">Book Appointment</a>
			<!--<form method="get" action="/api/bookAppointment/${patient.id}/${doctor.id}">
				<button type="submit" >Book Appointment</button>
			</form>-->
			
			<form method="get" action="/api/Reception-HomePage">
				<button type="submit" name="receptionHomePage" value="receptionHomePage">Receptionist Home Page</button>
			</form>
		</div>
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>