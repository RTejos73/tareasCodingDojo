<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
			<div class="col-6">
				<%
					Date fecha = new Date();
					SimpleDateFormat formato = new SimpleDateFormat("EEEEEEE, d ' de ' MMMM, yyyy");
				//	String eldia = Integer.parseInt(formato.format(fecha).toString());
				//	Integer elmes = fecha.getMonth();
				//	Integer elanio = fecha.getYear();
				
					String lagranfecha = formato.format(fecha).toString();
					
				%>
				<h1><c:out value="<%=lagranfecha %>"> </c:out></h1>
		
			</div>
		</div>
	</div>
	
	<script>
		//$(document).ready(function(){
			alerta1();
	//	});
	</script>
</body>
</html>