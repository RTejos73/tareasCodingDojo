<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
	</head>
	<body>
		<div class="container">		
			<h1>New Prodcut</h1>
			<div>
				<form:form action="/contacts/create" method="post" modelAttribute="newContact">				    
				    <p>
				    	<form:label path="address">Name	</form:label>
				        <form:input path="address"/> 
					</p>
				    <p>
				        <form:label path="address">Description	</form:label>
				        <form:input path="address"/> 
				    </p>
				    <p>
				        <form:label path="city">Price    	</form:label>				        
				        <form:input type="text" path="city"/> 
				    </p>
				    <input type="submit" value="Crear Contacto"/>
				</form:form>
			</div>		
		</div>	
	</body>
</html>


