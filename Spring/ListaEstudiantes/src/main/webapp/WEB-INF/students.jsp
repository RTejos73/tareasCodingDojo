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
		
			<h1>Nuevo Estudiante</h1>
			<div>
				<form:form action="/students/create" method="post" modelAttribute="newStudent">
				    
				    <p>
				        <form:label path="firstName">First Name	</form:label>				       
				        <form:input path="firstName"/>
				        <form:errors path="firstName"/>
				    </p>
				    <p>
				        <form:label path="lastName">Last Name	</form:label>				        
				        <form:input path="lastName"/>
				        <form:errors path="lastName"/>
				    </p>
				    <p>
				        <form:label path="age">Age			</form:label>				        
				        <form:input path="age"/>
				        <form:errors path="age"/>
				    </p>   
				    <input type="submit" value="Crear Estudiente   "/>
				</form:form>
			</div>		
		</div>		
	</body>
</html>