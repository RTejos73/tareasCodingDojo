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
				<h1>New Category</h1>
			</div>
			<div>
				<form:form action="/categories/new" method="post" modelAttribute="newCategory">				    
				    <p>
				    	<form:label path="name">Name		</form:label>
				        <form:input path="name"/> 
					</p>
				    <input type="submit" value="Create Category"/>
				</form:form>
			</div>
		</div>
	</body>
</html>