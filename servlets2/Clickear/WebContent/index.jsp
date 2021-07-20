<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="Clickear" method="get">
	
		<input type="submit" name="entrada" value="Click Me!">
		
	</form>
	
	<br><br><br>
	<h1>Se han clickeado ${laSession} veces </h1>
	
</body>
</html>