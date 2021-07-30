<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Juego de Adivinanza</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script src="dom.js"></script>
</head>
<body>
	<form action="Adivinar" method="post">
		<h2>
			Welcome to the Great Number Game!
		</h2>
		<br>
		<h2>Ingrese un numero entre 1 y 100</h2>
		<br>
		
		<div id="feedback">
	<%
	String validator = (String) session.getAttribute("validator");
	out.print(validator);
	%>
	</div>
	<h2>
	<% 
	if ( session.getAttribute("attemps")==null ) {
		out.print("0");
	} else {
		int attemps = (int) session.getAttribute("attemps");	
		out.print(attemps);	
	}
	
	%>/
	<%
	if ( session.getAttribute("difficult")==null ) {
		out.print("0");
	} else {
		int difficult = (int) session.getAttribute("difficult");
		out.print(difficult);	
	}
	%>
	</h2>
		
		<form action="Adivinar" method="POST">
		<h2>
			<select name="dificultad">
				<option value="10">Easy</option>
				<option value="5">Medium</option>
				<option value="3">Hard</option>
			</select>
		</h2>
		</form>
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