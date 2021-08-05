<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
			<div class="row mt-5">
				<h1>Todos los Libros</h1>
				<table border="2">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Name</th>
							<th scope="col">Creator</th>
							<th scope="col">Current Version</th>
							<th scope="col">Acciones</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${lenguajes}" var="l">
							<tr>
								<td class="table-secondary">
									<form action="/languages/${l.id}" method="get">
										<a href="/languages/${l.id}"><c:out value="${l.name}" /></a>
									</form>
								
								</td>
								<td class="table-success"><c:out value="${l.creator}" /></td>
								
								<td class="table-secondary"><c:out
										value="${l.currentVersion}" /></td>
								
								<td class="table-success">
									<form action="/languages/${l.id}" method="post">
										<input type="hidden" name="_method" value="delete"> <input
											type="submit" value="Delete" class="btn btn-danger mb-2">
										<a class="btn btn-secondary mb-2"
											href="/languages/${l.id}/edit">Edit</a>
									</form>
	
								</td>
								
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			
			<div class="mt-5">
				<form:form action="/languages" method="post" modelAttribute="lenguages">
					<div class="form-group row">
						<label for="inputName" class="col-sm-1 col-form-label">Name</label>
						<div class="col-sm-5">
						 	<input type="text" class="form-control form-control-sm" id="inputName" name="name"> 
						</div>
					</div>
					<div class="form-group row">
						<label for="inputCreator" class="col-sm-1 col-form-label">Creator</label>
						<div class="col-sm-5">
							<input type="text" class="form-control form-control-sm" id="inputCreator" name="creator">
						</div>
					</div>
					<div class="form-group row">
						<label for="inputVersion" class="col-sm-1 col-form-label">Version</label>
						<div class="col-sm-5">
							<input type="number" step="0.01" class="form-control form-control-sm" id="inputVersion" name="currentVersion">
						</div>
					</div>
					<br>
					<input type="submit" value="Crear Libro" />
				</form:form>
			</div>
		</div>
	</body>
</html>