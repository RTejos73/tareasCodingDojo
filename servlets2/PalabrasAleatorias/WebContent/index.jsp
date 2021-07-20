<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>

	<h1>You have generated a word ${contador} times.</h1>
	<br>
	<h2>${palabra}</h2>
	
	<form action="Random" method="get">
	
		<input type="submit" name="aleatorio" value="Generate">
		
	</form>
	
	<br>
	<h2>The last time you generated a word was :</h2>
	<br>
	<h1>${ultimaFecha}</h1>

</body>
</html>