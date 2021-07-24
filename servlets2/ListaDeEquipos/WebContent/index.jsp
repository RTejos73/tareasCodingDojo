<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ tablib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Lista de Equipos </title>
	<!--JQUERY-->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    
	<!--Fontawesome icons-->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.3/css/solid.css">
	<script src="https://use.fontawesome.com/releases/v5.15.3/js/all.js"></script>
	
	<!-- Bootstrap CSS -->
	<!-- 	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"> -->
	<!-- Theme vapor CSS -->
	<link href="theme/united/bootstrap.min.css" rel="stylesheet">
	
	<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
	<script src="sweetalert2.all.min.js"></script>
	<script type="text/javascript" src="javascript/home.js"></script>
</head>
<body>
	
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<div class="container">
			<div class="container-fluid">
			    <a class="navbar-brand" >Teams</a>
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
					<h2>Web App Teams</h2>
				</div>
				<div class="col-sm-6" style="text-align: right;">
					<a type="button" href="teams.jsp" class="btn btn-primary"><i class="fas fa-plus-circle"></i> New Team</a>
				</div>
			</div>
			
			<table class="table table-hover">
				<thead>
			    	<tr>
			      		<th scope="col">Team</th>
			      		<th scope="col">Players</th>
			      		<th scope="col" width="200px">Actios</th>
			    	</tr>
			  	</thead>
				<tbody>
			  		<c:forEach var="team" items="${equipos}">
		    		<tr>
		    			<td><c:out value="${team.nombre}"/></td>
		    			<td><c:out value="${team.players.size()}"/></td>
		    			<td>
		    				<a type="button" href="team?id=<c:out value="${team.id}"/>" class="btn btn-info">Detail</a>
							<a type="button" href="deleteTeam?id=<c:out value="${team.id}"/>" class="btn btn-danger">Delete</a>
		    			</td>
		    		</tr>				    
					</c:forEach>			   
			   <button type="button" onclick="test()" class="btn btn-info">Detail</button>
			  </tbody>
			</table>
		</div>
	</main>



	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>	
</body>
</html>