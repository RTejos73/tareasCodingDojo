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
				<a class="col-md-6" href="/dojos/listado">Volver a Listado de Dojos</a>
			</div>
			<div class="row mt-5 col col-md-6 ">
				<h1 class="mr:20px"> <c:out value="${nombre.name}" /> Location Ninjas</h1>
				<table border="1">
					<thead class="thead-dark">
						<tr>
							<th scope="col">First Name</th>
							<th scope="col">Last Name</th>
							<th scope="col">Age</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${ninjasdojo}" var="nd">
							<tr>
								<td class="table-secondary">
									<c:out value="${nd.firstName}"/>							
								</td>
								<td class="table-secondary">
									<c:out value="${nd.lastName}"/>							
								</td>
								<td class="table-secondary">
									<c:out value="${nd.age}"/>							
								</td>								
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</body>
</html>