<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
 
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Juego Ninja Gold</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>

	<div class="container">
		<div class="col">
			<h1>Your Gold  ${gold}</h1>
		</div>
		<br/>
		<div class="cajota">
			<div class="card cajitas">
				<div class="card-body">
					<h2 class="card-title">Farm</h2>
					<h4 class="card-text">(earns 10-20 gold)</h4>
					<form action="/farm/10/20" method="post">
						<input name="farm" type="submit" value="Find Gold!">
					</form>
				</div>
			</div>
			<div class="card cajitas">
				<div class="card-body">
					<h2 class="card-title">Cave</h2>
					<h4 class="card-text">(earns 5-10 gold)</h4>
					<form action="/cave/5/10" method="post">
						<input name="cave" type="submit" value="Find Gold!">
					</form>
				</div>
			</div>
			<div class="card cajitas">
				<div class="card-body">
					<h2 class="card-title">House</h2>
					<h4 class="card-text">(earns 2-5 gold)</h4>
					<form action="/house/2/5" method="post">
						<input name="house" type="submit" value="Find Gold!">
					</form>
				</div>
			</div>
			<div class="card cajitas">
				<div class="card-body">
					<h2 class="card-title">Casino</h2>
					<h4 class="card-text">(earns/takes 0-50 gold)</h4>
					<form action="/casino/-50/50" method="post">
						<input name="casino" type="submit" value="Find Gold!">
					</form>
				</div>
			</div>
			<div class="card cajitas">
				<div class="card-body">
					<h2 class="card-title">Spa</h2>
				    <h4 class="card-text">(erns 5-20 gols)</h4>
				    <form action="/spa/5/20" method="post">
						<input name="spa" type="submit" value="Find Gold!">
					</form>
				 </div>
			</div>
			
		</div>
		<br/>
		<br/>
			<div>
				<h2>Activities :</h2>
			</div>
			<div class="actividades">
				<textarea  rows="13" cols="130">					
					<c:forEach items="${activitie}" var="actividad">${fn:trim(actividad)}
				</c:forEach>		
				</textarea>
			</div>
		<br/>
		<div>
			<div class="boton"><a href="/reinicio" type="button" class="btn btn-info">Reiniciar Juego</a></div>
		</div>
	</div>	
</body>
</html>