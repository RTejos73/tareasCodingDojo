<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link href="/css/style.css" rel="stylesheet" type="text/css">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
	</head>
	<body>
		<div class="container mt-5">
			<div class="enlinea">
								
				<h3>Songs by Artist : <c:out value="${buscando}"/>  </h3>
				<form action="/search/like" method="get" class="enlinea">
					<input type="text" name="busqueda" class="mt-2"/>	
					<input type="submit" value="Search Artist" class="btn bg-info btn-sm" class="mt-2"/>	
				</form>
				<a href="/dashboard">DashBoard</a>
			</div>	
			<div class="row mt-5">
				<table border="1">
					<thead class="thead-dark">
						<tr class="bg-info text-white">
							<th scope="col">Rating</th>
							<th scope="col">Name</th>
							<th scope="col">Artist</th>
						</tr>
					</thead>
					<tbody>
						<%boolean par = true; %>
						
						<c:forEach items="${songs}" var="song">
							<tr <%if (par) {%>
								<%="style='background-color: lightgrey'"%>
								<%par = false;
							} else {
							par = true;
							}%>>
								<td class="table-succes"><c:out value="${song.rating}" /></td>
								<td class="table-succes"><c:out value="${song.title}" /></td>
	
								<td class="table-succes"><c:out value="${song.artist}" /></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</body>
</html>