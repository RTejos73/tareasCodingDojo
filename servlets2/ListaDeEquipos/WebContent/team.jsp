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
					<h2 style="display: inline-block;margin-left: 15px;">Create New Teams</h2>
				</div>
				
			</div>
			
			<div class="row">
				<form action="SaveTeam" method="post">
					<fieldset>
					    <div class="form-group">
					      <label for="teamName" class="form-label mt-4">Team Name</label>
					      <input type="text" class="form-control" id="teamName" name="teamName" placeholder="Enter Team Name" required>
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