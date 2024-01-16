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
	<h1>Welcome to Hospital Management System</h1>
	<p>Please select your user type:</p>

	<form method="post" action="/api/Reception-LoginPage">
		<button type="submit" name="user_type" value="admin">Reception Login</button>
	</form>
	<form method="post" action="/api/Doctor-LoginPage">
		<button type="submit" name="user_type" value="doctor">Doctor Login</button>
	</form>
	<form method="post" action="/api/Admin-LoginPage">
		<button type="submit" name="user_type" value="reception">Admin Login</button>
	</form>

	
</body>
</html>

