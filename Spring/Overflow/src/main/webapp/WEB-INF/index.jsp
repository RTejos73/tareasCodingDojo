<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Questios!</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<div class="container container-fluid">
			<a class="navbar-brand" href="#">Questions</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarColor01"
				aria-controls="navbarColor01" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarColor01">
				<ul class="navbar-nav me-auto">
					<li class="nav-item"><a class="nav-link active" href="#">Home
							<span class="visually-hidden">(current)</span>
					</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<main>
		<div class="container mt-5">
			<h2>All Questions</h2>
	
			<table class="table table-hover">
				<thead>
					<tr>
						<td>Questions</td>
						<td>Tags</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${questions}" var="question">
			            <tr>
			                <td>
			                	<a href="/questions/<c:out value="${question.idQuestions}"/>"><c:out value="${question.question}"/></a>
			                	
			                </td>
			                <td>
			                	<c:forEach items="${question.tags}" var="tag">
			                		<c:out value="${tag.subject}"/>,
			                	</c:forEach>			                	
			                </td>
			            </tr>
			        </c:forEach>
				</tbody>
			</table>			
			<div class="row">
				<div class="col-sm-12" style="text-align: right;">
					<a type="button" class="btn btn-primary" href="/questions/new">New Questions</a>
				</div>
			</div>
		</div>
	</main>



</body>
</html>