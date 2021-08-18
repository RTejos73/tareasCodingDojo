<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
			<a type="button" href="/questions/" class="btn btn-primary mt-3">Volver</a>
			<h2>What is you questions?</h2>
			<form action="/questions/new" method="post">
				<fieldset>
					<div class="form-group">
						<label for="question" class="form-label mt-4">Questions</label>
						<textarea class="form-control" id="question" name="question"
							rows="3" required></textarea>
					</div>
					<div class="form-group">
						<label for="tags" class="form-label mt-4">Tags</label> <input
							type="text" class="form-control" id="tags" name="tags"
							aria-describedby="emailHelp" required>
					</div>
					<button type="submit" class="btn btn-primary mt-3">Submit</button>
				</fieldset>
			</form>
		</div>
	</main>

</body>
</html>