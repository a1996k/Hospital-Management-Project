<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Hospital Management System</title>
</head>
<!--
<body>
	<div class="login">
		<h1>WELCOME to Hospital Management</h1>
		<div>
			<form action="/api/Login-Validate" method="post">
			</form>
		</div>
	</div>

</body>
-->
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
	<h1>Welcome to Admin Home Page</h1>
	<p>Please select your action:</p>

	<form method="post" action="..">
		<button type="submit" name="user_type" value="admin">New
			Appointment</button>
	</form>
	<form method="get" action="/api/doctor">
		<button type="submit" name="doctorAdmin" value="doctorAdmin">CRUD operation for Doctors</button>
	</form>
	<form method="get" action="/api/patients">
		<button type="submit" name="patientAdmin" value="patientAdmin">CRUD operation for Patients</button>
	</form>
	<br>
	<br>
	<br>
	<br>
	<form method="get" action="/api/">
		<button type="submit" name="receptionHomePage"
			value="receptionHomePage">Go back to Login page </button>
	</form>
	<br>
	<br>
	<form method="get" action="/api/Admin-HomePage">
		<button type="submit" name="adminHomePage"
			value="adminHomePage">Go to Admin HomePage </button>
	</form>

</body>
</html>

