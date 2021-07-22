<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Juego de Adivinanza</title>
</head>
<body>
	<form action="Adivinar" method="post">
		<h2>
			Welcome to the Great Number Game!
		</h2>
		<br>
		<h2>Ingrese un numero entre 1 y 100</h2>
		<br>
		<h2>
			<select name="dificultad">
				<option value="10">Easy</option>
				<option value="5">Medium</option>
				<option value="3">Hard</option>
			</select>
		</h2>
		<h3>
			<label>Ingrese el Número a Adivinar </label>
			<input type="number" name="numeroElegido">			
		</h3>
		<br><br>
		<h3>
			<input type="submit" value="Jugar!" name="elBoton">
		</h3>
	
	
	
	
	
	
	</form>
</body>
</html>