<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>New Song</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
	</head>
	<body>
	
		<div class="container">
			<div class="container text-aling:rigth">
				<div>
					<a href="/dashboard">DashBoard </a>
				</div>
			</div>
			<div class="mt-5">
				<form:form action="/songs/new" method="post" modelAttribute="song">
				
					<p>
						<form:label path="title">Title</form:label>
				        <form:input path="title"/>		
				        <form:errors path="title"/>
					</p>
					<br />
					<p>
						<form:label path="artist">Artist</form:label>
				        <form:input path="artist"/>
				        <form:errors path="artist"/>
					</p>
					<br />
					<p>
						<form:label path="rating">Rating</form:label>
						<select name="rating">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
							<option>6</option>
							<option>7</option>
							<option>8</option>
							<option>9</option>
							<option>10</option>
						</select>
					</p>
					<br />
					<div class="mt-5">	
			    		<input type="submit" value="Add Song">
					</div>
				</form:form> 
			</div>
		</div>	
		
		<%-- <option><c:out value="${listRating}"></c:out> <option> --%>		
	</body>
</html>