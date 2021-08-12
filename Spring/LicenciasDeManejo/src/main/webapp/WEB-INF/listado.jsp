<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
		
	</head>
	<body>
		<div class="container">
			<div class="row mt-5">
				<div class="row">
					<a class="col-md-6" href="/persons/new">Crear Persona</a>
					<a class="col-md-6" href="/licenses/new">Crear Licencia</a>
				</div>
				<h1 class="mr:20px">Listado de  Personas</h1>
				<table border="1">
					<thead class="thead-dark">
						<tr>
							<th scope="col">First Name</th>
							<th scope="col">Last Name</th>
							<th scope="col">License Number</th>
							<th scope="col">Expiration Date</th>
							<th scope="col">State</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${listado}" var="l">
							<tr>
								<td class="table-secondary">
									<c:out value="${l.fisrtName}"/>							
								</td>
								<td class="table-secondary">
									<c:out value="${l.lastName}"/>							
								</td>
								<td class="table-secondary">
									<c:out value="${l.license.number}"/>							
								</td>
								<td class="table-secondary">
									<c:out value="${l.license.expirationDate}"/>							
								</td>
								<td class="table-secondary">
									<c:out value="${l.license.state}"/>							
								</td>								
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</body>
</html>
		