<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
	<head>
		<title>Welcome</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
		<link rel="stylesheet" href="/resources/css/main.css">
	</head>
	<body>
		<div class="container" id="container">
		<h1>Welcome</h1>
		<div id="leftpanel">
			<h1>Register</h1>
			<form:form method="post" action="/register" modelAttribute="userObj">
				<h4 class="avoid">
					<form:label path="firstName">First Name:</form:label>
					<form:input cssClass="fields" type="text" path="firstName"/>
				</h4>
				<h4 class="avoid">
					<form:label path="lastName">Last Name:</form:label>
					<form:input cssClass="fields" type="text" path="lastName"/>
				</h4>
				<h4 class="avoid">
					<form:label path="email">Email:</form:label>
					<form:input cssClass="fields" type="email" path="email"/>
				</h4>
				<h4 class="avoid">
					<form:label path="location">Location:</form:label>
					<form:select cssClass="state" path="state">
						<c:forEach items="${states}" var="state">
							<form:option value="${state}"><c:out value="${state}"/></form:option>
						</c:forEach>
					</form:select>
					<form:input cssClass="smfields" type="text" path="location"/>
				</h4>
				<h4 class="avoid">
					<form:label path="password">Password:</form:label>
					<form:password cssClass="fields" path="password"/>
				</h4>
				<h4 class="avoid">
					<form:label path="confirmPassword">Confirm Password:</form:label>
					<form:password cssClass="fields" path="confirmPassword"/>
				</h4>
				<input class="btn" type="submit" value="Register"/>
			</form:form>
			<form:errors cssClass="red" path="userObj.*"/>
		</div>
		<div id="rightpanel">
			<h1>Login</h1>
			<form action="/login" method="post">
				<h4>Email:<input class="fields" type="email" name="email"></h4>
				<h4>Password:<input class="fields" type="password" name="password"></h4>
				<input class="btn" type="submit" value="Login">
			</form>
		</div>
	</div>
	</body>
</html>