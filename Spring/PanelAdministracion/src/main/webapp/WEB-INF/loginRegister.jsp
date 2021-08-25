<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login and Register</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
	<link href="../css/styles.css">
</head>
<body>

	<div class="container">
		
		<div class="row  border border-primary mt-3">
			<div class="row">
				<c:if test="${logoutMessage != null}">
					<c:out value="${logoutMessage}"></c:out>
				</c:if>
				<c:if test="${errorMessage != null}">
					<c:out value="${errorMessage}"></c:out>
				</c:if>
			</div>
			<fieldset>
				<h2>Login</h2>
				<form method="POST" action="/login" class="form-horizontal">
					<div class="form-group">
						<label class="control-label col-sm-2" for="email">Email:</label>
					    <div class="col-sm-6">
					      <input type="email" class="form-control" name="email" placeholder="Enter email">
					    </div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="password">Password:</label>
						<div class="col-sm-6">
							<input type="password" class="form-control" name="password" placeholder="Enter password">
						</div>
					</div>
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}"/>
					<button type="submit" class="btn btn-primary mt-3 mb-3">Login</button>
				</form>
			</fieldset>
		</div>

		<div class="row  border border-primary mt-3">
		 	<p><form:errors path="user.*"/></p>
			<h2>Register</h2>
			<form:form method="POST" action="/registration" modelAttribute="user" class="form-horizontal">
				<div class="form-group">
					<form:label path="email" class="control-label col-sm-2">Email					:</form:label>
					<div class="col-sm-6">
						<form:input path="email" class="form-control"/>
					</div>
				</div>
				<div class="form-group">
					<form:label path="firstName" class="control-label col-sm-2">First Name				:</form:label>
					<div class="col-sm-6">
						<form:input path="firstName" class="form-control"/>
					</div>
				</div>
				<div class="form-group">
					<form:label path="lastName" class="control-label col-sm-2">Last Name				:</form:label>
					<div class="col-sm-6">
						<form:input path="lastName" class="form-control"/>
					</div>
				</div>
				<div class="form-group">
					<form:label path="password" class="control-label col-sm-2">Password				:</form:label>
					<div class="col-sm-6">
						<form:password path="password" class="form-control"/>
					</div>
				</div>
				<div class="form-group">
					<form:label path="passwordConfirmation" class="control-label col-sm-2">Password Confirmation	:</form:label>
					<div class="col-sm-6">
						<form:password path="passwordConfirmation" class="form-control"/>
					</div>
				</div>
				<input type="submit" value="Register" class="btn btn-primary mt-3 mb-3" />
			</form:form>
		</div>

	</div>
</body>
</html>