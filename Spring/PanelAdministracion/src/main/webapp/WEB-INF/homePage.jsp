<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html">
<html>
	<head>
		<meta charset="UTF-8">
		<title>Welcome Home Page</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
	</head>
	<body>
		<p><c:out value="${currentUser.getRoles().get(0).getName()}"/></p>
	    <h1>Welcome <c:out value="${currentUser.firstName}"></c:out>!</h1>
	    <p><b>First Name: </b> <c:out value="${currentUser.firstName}"></c:out></p>
	    <p><b>Last Name: </b> <c:out value="${currentUser.lastName}"></c:out></p>
	    <p><b>Email: </b> <c:out value="${currentUser.email}"></c:out></p>
	    <p><b>Sign Up: </b> <fmt:formatDate pattern = "EEEEEE, 'the' dd 'of' MMMM, yyyy: hh:mm a"  value="${currentUser.updatedAt}"/></p>
	    <p><b>Last Sign On: </b> <fmt:formatDate pattern = "EEEEEE, 'the' dd 'of' MMMM, yyyy: hh:mm a"  value="${currentUser.createdAt}"/></p>
	    
	    <form id="logoutForm" method="POST" action="/logout">
	        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	        <input type="submit" value="Logout!" />
	    </form>
	</body>
</html>