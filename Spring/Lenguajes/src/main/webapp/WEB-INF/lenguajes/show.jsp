<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
	</head>
	<body>
		<div class="container">
			<a href="/languages" class="btn btn-secondary  ml-auto">DashBoard</a>
			<h1>Lenguaje	:  <c:out value="${lenguajes.name}"/></h1>
			<h2>Description	: <c:out value="${lenguajes.creator}"/></h2>
			<h2>Version     : <c:out value="${lenguajes.currentVersion}"/></h2>
			<div>
				<div class="container">
					<form action="/languages/${lenguajes.id}" method="post">
						<a class="btn btn-secondary" href="/languages/${lenguajes.id}/edit">Edit</a>
			 	   		<input type="hidden" name="_method" value="delete">
			 	  		<input type="submit" value="Delete" class="btn btn-danger">	 	  		
					</form>
				</div>
			</div>
		</div>
	</body>
</html>