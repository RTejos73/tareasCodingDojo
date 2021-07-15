<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Veterinaria</title>
	<link rel="stylesheet" href="css/style.css" type="text/css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
    		integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>


	<div class="container">
		<div class="row1">
			<div class="col uno">
				<form action="dogs" method="get" class="form-horizontal">
					<fieldset>
						<legend>Formulario Dogs</legend>							
							<div class="col">
								<label for="name" class="form-label">Name </label>
							    <input type="text" class="form-control" name="name">
							    
							 </div>
							  
							 <div class="col">
							    <label for="breed" class="form-label">Breed</label>
							    <input type="text" class="form-control" name="breed">
							 </div>
							  
							 <div class="col">
							    <label for="weight" class="form-label">Weight</label>
							 	<input type="text" class="form-control" name="weight">
							 </div>
							  <hr style="border:2px;">
							  <button type="submit" class="btn btn-primary">Submit</button>
							  <hr style="border:2px;">
				  </fieldset>
				</form>
			</div>
		</div>
		<hr style="border:2px;">
		<div class="row1">
			<div class="col uno">
				<form action="cats" method="get" class="form-horizontal">
					<fieldset>
						<legend>Formulario Cats</legend>							
							<div class="col">
								<label for="name" class="form-label">Name </label>
							    <input type="text" class="form-control" name="name">
							    
							 </div>
							  
							 <div class="col">
							    <label for="breed" class="form-label">Breed</label>
							    <input type="text" class="form-control" name="breed">
							 </div>
							  
							 <div class="col">
							    <label for="weight" class="form-label">Weight</label>
							 	<input type="text" class="form-control" name="weight">
							 </div>
							  <hr style="border:10px;">
							  <button type="submit" class="btn btn-primary">Submit</button>
							  <hr style="border:2px;">
				  </fieldset>
				  
				</form>
			</div>
		</div>
	</div>

</body>
</html>