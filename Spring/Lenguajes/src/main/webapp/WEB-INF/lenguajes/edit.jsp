<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>   
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
			<form:form action="/languages/${lenguajes.id}" method="put" modelAttribute="lenguaje">
			    <input type="hidden" name="_method" value="put">
			    <div class="mt-5">
			    	<a href="/languages/${lenguajes.id}" class="btn btn-danger">Delete</a>
			    	<a href="/languages" class="btn btn-secondary">DashBoard</a>
			    </div>
			    <p>
			        <form:label path="name">Name</form:label>
			        <form:errors path="name"/>
			        <form:input path="name" value="${lenguajes.name}" />
			    </p>
			    <p>
			        <form:label path="creator">Creator</form:label>
			        <form:errors path="creator"/>
			        <form:input path="creator" value="${lenguajes.creator}"/>
			    </p>
			    <p>
			        <form:label path="currentVersion">Version</form:label>
			        <form:errors path="currentVersion"/>
			        <form:input path="currentVersion" value="${lenguajes.currentVersion}"/>
			    </p>    
			    <input type="submit" value="Submit"/>
			</form:form>
		</div>
	</body>
</html>