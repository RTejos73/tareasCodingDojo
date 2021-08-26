<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Login Page</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
	</head>
	<body>
		<div class="container">
			<c:if test="${logoutMessage != null}">
		        <c:out value="${logoutMessage}"></c:out>
		    </c:if>
		    
			<h1>Login</h1>
			
			<c:if test="${errorMessage != null}">
		        <c:out value="${errorMessage}"></c:out>
		    </c:if>
		    
		    <form method="POST" action="/login">
		        <p>
		            <label for="username">Username</label>
		            <input type="text" id="username" name="username"/>
		        </p>
		        <p>
		            <label for="password">Password</label>
		            <input type="password" id="password" name="password"/>
		        </p>
		        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		        <input type="submit" value="Login!"/>
		    </form>	
		</div>
	</body>
</html>