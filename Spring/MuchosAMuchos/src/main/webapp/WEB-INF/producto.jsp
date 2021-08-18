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
			<div class="nav">
				<h1>New Product</h1>
			</div>
			<div>
				<form:form action="/products/new" method="post" modelAttribute="newProduct">				    
				    <p>
				    	<form:label path="name">Name		</form:label>
				        <form:input path="name"/> 
					</p>
				    <p>
				        <form:label path="description">Description		</form:label>
				        <form:input path="description"/> 
				    </p>
				    <p>
				        <form:label path="price">Price		</form:label>				        
				        <form:input path="price"/> 
				    </p>
				    <input type="submit" value="Create Product"/>
				</form:form>
			</div>
		</div>	
	</body>
</html>