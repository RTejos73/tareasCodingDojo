<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Dojo Survery Index</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>

	<div class="container">
	
	<form action="/crear" method="POST">
  		<fieldset>
    
    		<div class="form-group mb-3">
				<label class="col-form-label" for="inputDefault">Tu Nombre</label>
			  	<input type="text" class="form-control" id="inputDefault" name="nombre">
			</div>
    		
		    <div class="form-group mb-3">
		      <label class="col-form-label" for="exampleSelect1">Dojo Location</label>
		      <select class="form-select" id="exampleSelect1" name="location">
		        <option>Hualpen</option>
		        <option>Concepcion</option>
		        <option>Talcahuano</option>
		        <option>Villarrica</option>
		        <option>Pucon</option>
		      </select>
		    </div>
		    
		    <div class="form-group mb-3">
		      <label class="col-form-label" for="exampleSelect1">Lenguaje Favorito</label>
		      <select class="form-select" id="exampleSelect1" name="lenguaje">
		        <option>Java</option>
		        <option>Python</option>
		        <option>C ++</option>
		        <option>Sql</option>
		        <option>Php</option>
		      </select>
		    </div>
		    
		    <div class="form-group">
		      <label class="col-form-label" for="exampleTextarea">Comentario (opcional</label>
		      <textarea class="form-control" id="exampleTextarea" rows="3" name="comentario"></textarea>
		    </div>
    
       		<button type="submit" class="btn btn-primary mt-5">Submit</button>
  		</fieldset>
	</form>

</div>




</body>
</html>