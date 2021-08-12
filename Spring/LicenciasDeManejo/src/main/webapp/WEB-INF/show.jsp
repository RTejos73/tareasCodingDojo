<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
	</head>
	<body>
		<div class="container">
			<div class="container text-aling:rigth">
				<div>
					<a href="/listado">Volver a Listado </a>
				</div>
			</div>
			<div class="mt-5">
				<h1>
					<strong>					
						<c:out value="${persons.fisrtName}"></c:out>
						<c:out value="${persons.lastName}"></c:out>
					</strong>					
				</h1>
				<br/>
				<p>
					License Number	: <strong>
						<c:out value="${persons.license.number}"></c:out>	
					</strong>
				</p>
				<br />
				<p>
					State			: <strong>
					<c:out value="${persons.license.state}"></c:out>
					</strong>
				</p>
				<br />
				<p>
					Expiration Date	: <strong>
					<c:out value="${persons.license.expirationDate}"></c:out>
					</strong>
				</p>
				<br />
			</div>
			
		</div>
		
	</body>
</html>