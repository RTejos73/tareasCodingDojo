<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Juego de Adivinanza</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
	<script src="dom.js"></script>
</head>
<body>
	<div>
		<h2>Welcome to the Great Number Game!</h2>
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
			if (session.getAttribute("attemps") == null) {
				out.print("0");
			} else {
				int attemps = (int) session.getAttribute("attemps");
				out.print(attemps);
			}
			%> /
			<%
			if (session.getAttribute("difficult") == null) {
				out.print("0");
			} else {
				int difficult = (int) session.getAttribute("difficult");
				out.print(difficult);
			}
			%>
		</h2>
		<form action="Adivinar" method="post">
			<h2>
				<select name="dificultad">
					<option value="10">Easy</option>
					<option value="5">Medium</option>
					<option value="3">Hard</option>
				</select>
			</h2>
			<h3>
				<label>Ingrese el Número a Adivinar </label> <input type="number"
					name="numeroElegido">
			</h3>
			<br> <br>
			<h3>
				<input type="submit" value="Jugar!" name="elBoton">
			</h3>
		</form>
	</div>
</body>
</html>