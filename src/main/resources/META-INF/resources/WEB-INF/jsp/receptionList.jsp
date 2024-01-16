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
	<div class="container">
	<h1>Hospital Management System</h1>
		<h1>List of Receptionist</h1>
		<hr>
		<div class="table">
			<table border="3">
				<thead>
					<tr>
						<th>id</th>
						<th>firstName</th>
						<th>middleName</th>
						<th>lastName</th>
						<th>dob</th>
						<th>gender</th>
						<th>email</th>
						<th>mobileNumber</th>
						<th>userName</th>
						<th>password</th>
						<th>Actions</th>
					</tr>

				</thead>
				<tbody>
					<c:forEach items="${receptionList}" var="receptionList">
						<tr>
							
							<td>${receptionList.id}</td>
							<td>${receptionList.firstName}</td>
							<td>${receptionList.middleName}</td>
							<td>${receptionList.lastName}</td>
							<td>${receptionList.dob}</td>
							<td>${receptionList.gender}</td>
							<td>${receptionList.email}</td>
							<td>${receptionList.mobileNumber}</td>
							<td>${receptionList.userName}</td>
							<td>${receptionList.password}</td>
							<td>
                        		<a href="/api/edit-reception/${receptionList.id}">Edit</a> |
		                        <a href="/api/delete-reception/${receptionList.id}">Delete</a>
		                    </td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href="reception-form" class="btn btn-success"> Add Receptionist</a>
		</div>
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>