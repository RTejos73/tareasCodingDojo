<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Detail Song</title>
		<link
			href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
			rel="stylesheet">
	</head>
	<body>
		<div class="container">
			<div class="container text-aling:rigth">
				<div>
					<a href="/dashboard">DashBoard </a>
				</div>
			</div>
			<div class="mt-5">
				<p>
					Title : <strong>
						<c:out value="${songs.title}"></c:out>
					</strong>
				</p>
				<br />
				<p>
					Artist : <strong>
					<c:out value="${songs.artist}"></c:out>
					</strong>
				</p>
				<br />
				<p>
					Rating : <strong>
					<c:out value="${songs.rating}"></c:out>
					</strong>
				</p>
				<br />
			</div>
			<div class="mt-5">				
				<form action="/delete/${songs.id}" method="post">
	    			<input type="hidden" name="_method" value="delete">
				    <input type="submit" value="Delete" class="btn btn-danger btn-sm mb-1 mt-1">
				</form>
			</div>
		</div>
	</body>
</html>