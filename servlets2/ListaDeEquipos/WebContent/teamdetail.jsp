<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<@ tablib prefix="c" uri="http://java/sun/com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<div class="container">
			<div class="container-fluid">
			    <a class="navbar-brand" >Teams </a>
			    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
			      <span class="navbar-toggler-icon"></span>
			    </button>
	  		</div>
		</div>
	  
	</nav>			

	<main>
		<div class="container">
			
			
			<div class="row mt-5">
				<div class="col-sm-6">
					<a type="button" href="Home" class="btn btn-primary"><i class="fas fa-hand-point-left"></i> Volver</a>
					<h2 style="display: inline-block;margin-left: 15px;">Team <c:out value="${equipo.nombre}"/></h2>
				</div>
				<div class="col-sm-6" style="text-align: right;">
					<a type="button" href="player.jsp?teamId=<c:out value="${equipo.id}"/>" class="btn btn-primary"><i class="fas fa-plus-circle"></i> New Player</a>
				</div>
			</div>
			
			<table class="table table-hover">
			  <thead>
			    <tr>
			      <th scope="col">First Name</th>
			      <th scope="col">Last Name</th>
			      <th scope="col">Age</th>
			      <th scope="col" width="150px">Actios</th>
			    </tr>
			  </thead>
			  <tbody>
			  
				<c:forEach var="player" items="${equipo.players}">
		    		<tr>
		    			<td><c:out value="${player.name}"/></td>
		    			<td><c:out value="${player.surname}"/></td>
		    			<td><c:out value="${player.age}"/></td>
		    			<td>
							<a type="button" href="deletePlayer?idPlayer=<c:out value="${player.id}"/>&idTeam=<c:out value="${equipo.id}"/>" class="btn btn-danger">Delete</a>
		    			</td>
		    		</tr>
				    
				</c:forEach>
			
				</tbody>
			</table>
		</div>
	</main>
	

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>