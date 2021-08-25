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
					<a class="col-md-6" href="/dojos//new">Crear Dojos</a>
					<a class="col-md-6" href="/ninjas/new">Crear Ninjas</a>
				</div>
			<div class="row mt-5 col col-md-6 ">
				<h1 class="mr:20px"> Dojos Location</h1>
				<table border="1">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Name</th>
							<th scope="col">Ninjas</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${listado}" var="l">
							<tr>
								<td class="table-secondary">
									<c:out value="${l.name}"/>							
								</td>
								<td class="table-secondary">
									<form action="/dosjos/${id}" method="get">
										<a href="/dojos/${l.id}">Listar Ninjas</a>
									</form>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		
	</body>
</html>