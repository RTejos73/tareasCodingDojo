<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="../css/styles.css">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
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
					<li class="nav-item">
						<a class="nav-link active" href="#">Home
							<span class="visually-hidden">(current)</span>
						</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	<main>
		<div class="container mt-5">
			<a type="button" href="/questions/" class="btn btn-primary mt-3">Volver</a>
			<h2>
				<c:out value="${question.question}" />
			</h2>
			<c:forEach items="${question.tags}" var="tag">
				<div class="tag-detail">
					<c:out value="${tag.subject}" />
				</div>
			</c:forEach>

			<div class="row">
				<div class="col-sm-6">
					<table class="table table-hover">
						<thead>
							<tr>
								<td>Answers</td>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${answers}" var="answer">
								<tr>
									<td><c:out value="${answer.answers}" /></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div class="col-sm-6">
					<h3>Add Your Answer</h3>
					<form
						action="/questions/<c:out value="${question.idQuestions}"/>/addAnswer"
						method="post">
						<fieldset>
							<div class="form-group">
								<label for="answer" class="form-label mt-4">Answer</label>
								<textarea class="form-control" id="answer" name="answer"
									rows="3" required></textarea>
							</div>
							<button type="submit" class="btn btn-primary mt-3">Submit</button>
						</fieldset>
					</form>
				</div>
			</div>
		</div>
	</main>
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>