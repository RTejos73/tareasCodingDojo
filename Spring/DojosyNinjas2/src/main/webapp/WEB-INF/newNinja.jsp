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
			<h1> New Ninja</h1>
			<br/>
			<form action="/ninjas/new" method="post">
				<div class="form-group row">
					<p>Dojo				:
						<select name="id">
							<c:forEach items="${listadojos}" var="ld">
								<option value="<c:out value="${ld.id}"/>">
									<c:out value="${ld.name}"/>
								</option>
							</c:forEach>
						</select>
					</p>
				</div>	
				<div class="form-group row">
					<label class="col-sm-1 col-form-label">First Name	: </label>
					<div class="col-sm-2 mb-3">
						<input type="text" name="firstname">
					</div>					
				</div>
				<div class="form-group row">
					<label class="col-sm-1 col-form-label">Last Name	: </label>
					<div class="col-sm-2 mb-3">
						<input type="text" name="lastname">
					</div>					
				</div>
				<div class="form-group row">
					<label class="col-sm-1 col-form-label">Age			: </label>
					<div class="col-sm-2 mb-3">
						<input type="text" name="age">
					</div>					
				</div>
				<input type="submit" value="Create">
			</form>
		</div>
	</body>
</html>