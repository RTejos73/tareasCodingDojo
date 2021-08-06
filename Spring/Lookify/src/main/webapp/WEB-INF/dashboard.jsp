<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lookify DashBoard</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="container">
		<div class="row mt-5">
			<nav class="navbar navbar-expand-lg navbar-light bg-info text-white">
				<div class="collapse navbar-collapse">
					<div class=" enlinea">
						<ul class="navbar-nav mr-auto">
							<li class="nav-item"><a class="nav-link" href="#">Add
									New</a></li>
							<li class="nav-item"><a class="nav-link" href="#">Top
									Song</a></li>
							<li class="nav-item"><a class="nav-link" href="#">Sheeron</a></li>
							<li class="nav-item"><a class="nav-link" href="#">Search
									Artist</a></li>
						</ul>
					</div>
				</div>
			</nav>
		</div>
		<div class="row mt-4">
			<table border="1">
				<thead class="thead-dark">
					<tr>
						<th scope="col">Name</th>
						<th scope="col">Rating</th>
						<th scope="col">Accion</th>
					</tr>
				</thead>
				<tbody>
					<%
						boolean par =true;
						
					%>
					<c:forEach items="${songs}" var="s">
					
						<tr <%
							if(par) {
							%>
							<%="style='background-color: lightgrey'" %>
							<%
								par=false;
							} else {				
								par=true;
							} %>>
							
							<td class="table-secondary">
								<form action="/languages/${s.id}" method="get">
									<a href="/languages/${s.id}"><c:out value="${s.title}" /></a>
								</form>
							</td>
							
							<td class="table-success"><c:out value="${s.rating}" /></td>

							<td class="table-success">
								<form action="/languages/${s.id}" method="post">
									<input type="hidden" name="_method" value="delete"> <input
										type="submit" value="Delete" class="btn btn-danger btn-sm mb-1 mt-1">
								</form>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

<%--    style="background-color: lightgrey;}" --%>

		</div>
	</div>
</body>
</html>