<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script src="js/main.js"></script>
</head>
<body>

<div class="container">
		<div class="row mt-5">
			<div class="col-6 centrar">				
				<h2 id="verde"><c:out value="${fechaTime}"> </c:out></h2>		
			</div>
		</div>
	</div>
	
	<script>
		//$(document).ready(function(){
			alerta2();
	//	});
	</script>


	
</body>
</html>