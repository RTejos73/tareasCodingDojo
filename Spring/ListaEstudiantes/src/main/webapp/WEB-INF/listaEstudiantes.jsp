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
			<div class="row mt-4 mb-4">
				<a class="col-md-6" href="/students/create">Crear un Estudiante</a>
				<a class="col-md-6" href="/contacts/create">Crear un Contacto</a>
			</div>
			<div class="row mt-5">				
				<h1 class="mr:20px">Listado de Estudiantes</h1>
				<table border="1">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Name</th>
							<th scope="col">Age</th>
							<th scope="col">Addres</th>
							<th scope="col">City</th>
							<th scope="col">State</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${listado}" var="l">
							<tr>
								<td class="table-secondary">
									<c:out value="${l.firstName}"/>	<c:out value="${l.lastName}"/>						
								</td>
								<td class="table-secondary">
									<c:out value="${l.age}"/>							
								</td>
								<td class="table-secondary">
									<c:out value="${l.contact.address}"/>							
								</td>
								<td class="table-secondary">
									<c:out value="${l.contact.city}"/>							
								</td>
								<td class="table-secondary">
									<c:out value="${l.contact.state}"/>							
								</td>								
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>		
	</body>
</html>