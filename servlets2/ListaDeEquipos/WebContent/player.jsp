<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<@ tablib prefix="c" uri="http://java/sun/com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<!--Fontawesome icons-->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.3/css/solid.css">
	<script src="https://use.fontawesome.com/releases/v5.15.3/js/all.js"></script>
	  
	<!-- Bootstrap CSS -->
	<!-- 	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"> -->
	<!-- Theme vapor CSS -->
	<link href="theme/united/bootstrap.min.css" rel="stylesheet">
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
				<div class="col-sm-12">
					<a type="button" href="Home" class="btn btn-primary"><i class="fas fa-hand-point-left"></i> Volver</a>
					<h2 style="display: inline-block;margin-left: 15px;">Create New PLayer</h2>
				</div>
				
			</div>
			<% 
				Integer teamId = Integer.parseInt(request.getParameter("teamId")); 
			%>
	
			<div class="row">
				<form action="SavePlayer" method="post">
					<fieldset>
					    <div class="form-group">
					      <label for="playerName" class="form-label mt-4">Player Name</label>
					      <input type="hidden" class="form-control" id="teamId" name="teamId" value="<%=teamId%>">
					      <input type="text" class="form-control" id="playerName" name="playerName" placeholder="Enter Player Name" required>
					    </div>
					    <div class="form-group">
					      <label for="playerSurname" class="form-label mt-4">Player Last Name</label>
					      <input type="text" class="form-control" id="playerSurname" name="playerSurname" placeholder="Enter PLayer Last Name" required>
					    </div>
					    <div class="form-group">
					      <label for="playerAge" class="form-label mt-4">Player Age</label>
					      <input type="number" class="form-control" id="playerAge" name="playerAge" required>
					    </div>
				    	<button type="submit" class="btn btn-primary mt-3"><i class="fas fa-save"></i> Save</button>
				    </fieldset>
				</form>
			</div>
		</div>
		
		
	</main>
	
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>