<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>       

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Current visit count</title>
</head>
<body>
	<h1>Usted ha visitado su servidor :  <c:out value="${contador}"> </c:out> veces.</h1>
	<br>
	<br>
	<h2>
		<a type="button" href="reinicio" class="btn btn-primary"><i class="fas fa-plus-circle"></i> Reiniciar Contador</a>
	</h2>
</body>
</html>