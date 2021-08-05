<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>       
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h1>Todos los Libros</h1>
	<table>
		<thead>
			<tr>
				<th>Title</th>
				<th>Description</th>
				<th>Language</th>
				<th>Number of Pages</th>
			</tr>	
		</thead>
		<tbody>
			<c:forEach items="${lenguajes}" var="l">
				<tr>
					<td><c:out value="${l.name}" /></td>
					<td><c:out value="${l.creator}" /></td>
					<td><c:out value="${l.currentVersion}" /></td>		
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="/books/new">New Book</a>
</body>
</html>