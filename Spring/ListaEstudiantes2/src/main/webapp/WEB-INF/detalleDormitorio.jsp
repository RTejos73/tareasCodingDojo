<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
			<div class="container container-fluid">
				<a class="navbar-brand" href="#">Estudents</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarColor01"
					aria-controls="navbarColor01" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse" id="navbarColor01">
					<ul class="navbar-nav me-auto">
						<li class="nav-item"><a class="nav-link active" href="#">Home
								<span class="visually-hidden">(current)</span>
						</a></li>
					</ul>
				</div>
			</div>
		</nav>
		
		<main>
		<div class="container mt-5">
			<h2>Dormitorio</h2>
	
			<table class="table table-hover">
				<thead>
					<tr>
						<td>Name</td>
						<td>Age</td>
						<td>Address</td>
						<td>City</td>
						<td>State</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${studentsFromDorm}" var="student">
			            <tr>
			                <td><c:out value="${student.firstName}+${student.lastName}"/></td>
			                <td><c:out value="${student.age}"/></td>
			                <td><c:out value="${student.contact.address}"/></td>
			                <td><c:out value="${student.contact.city}"/></td>
			                <td><c:out value="${student.contact.state}"/></td>
			            </tr>
			        </c:forEach>
				</tbody>
			</table>
		</div>
	</main>
		
	</div>
</body>
</html>