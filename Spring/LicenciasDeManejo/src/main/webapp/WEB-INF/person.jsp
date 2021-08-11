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
			<h1>New Person</h1>
			<form action="/persons/new" method="post" modelAttribute="newPerson">
				<div class="form-group col-md-6">
					<label>First Name</label>
				    <input type="text" class="form-control" name="firstName">
				</div>
				<div class="form-group col-md-6">
					<label>Last Name</label>
				    <input type="text" class="form-control" name="lastName">
				</div>
				<button type="submit" class="btn btn-primary mt-3">Submit</button>
			</form>
		</div>
	</body>
</html>