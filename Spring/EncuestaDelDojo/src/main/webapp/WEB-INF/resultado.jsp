<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	
	<div class="container">
	
		<div class="row">Informacion Enviada</div>
			<div class="col-6">
				<p/>
				<p>Nombre             : <c:out value="${nombre}"> </c:out> </p>
				<p>Locacion           : <c:out value="${locacion}"> </c:out> </p>
				<p>Lenguaje Favorito  : <c:out value="${lenguaje}"> </c:out> </p>
				<p>Comentario         : <c:out value="${comentario}"> </c:out> </p>				
			</div>
			<a href="/">Volver Atrás</a>
		
	</div>
	
	
</body>
</html>