<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page import="java.util.*"%>
<%@page import="com.rtejos.auth.models.User"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Admin Page</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
		<style>
			table{
				border: 1px solid black;
			}
			td, th{
				padding: 10px;
				border: 1px solid black;
			}
		</style>
	</head>
	<body>
		<h1>Welcome <c:out value="${currentUser.firstName}"></c:out>!</h1>
    <table>
    		<tr>
    			<th>Name</th>
    			<th>Email</th>
    			<th>Actions</th>
    		</tr>
    		<% List<User> all = (List<User>) request.getAttribute("all"); %>
    		<% for(int i = 0; i < all.size(); i++) { %>
    			<% User user = all.get(i); %>
    				<tr>
    					<td><%= user.getFirstName() %> <%= user.getLastName() %></td>
    					<td><%= user.getEmail() %></td>
    					<% if(!user.checkIfAdmin()) { %>
    						<td><a href="/user/delete/<%= user.getId()%>">Delete</a> || <a href="/user/admin/<%= user.getId()%>">Promote to Admin</a></td>
    					<% } else { %>
    						<td> Admin Status || <a href="/user/demote/<%= user.getId()%>">Demote to User</a></td>
    					<% } %>
    				</tr>
    		<% } %>
    </table>
    <form id="logoutForm" method="POST" action="/logout">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Logout!" />
    </form>
	</body>
</html>