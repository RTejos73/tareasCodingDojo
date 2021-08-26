<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="\webjars\bootstrap\5.0.1\css\bootstrap.min.css">
<script src="\webjars\bootstrap\5.0.1\js\bootstrap.min.js"></script>
<script src="\webjars\jquery\3.6.0\jquery.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.25/css/jquery.dataTables.css">
<script type="text/javascript" charset="utf8"
	src="https://cdn.datatables.net/1.10.25/js/jquery.dataTables.js"></script>
<script src="/js/scripts.js"></script>
<title>WaterBnB</title>
</head>
<body>
	<div class="container">
		<div class="row float-end">
			<a href="/">Home</a>
			<c:if test="${user == null}">
				<a href="/guest/signing">Signing/Signup</a>
			</c:if>
			<c:if test="${user != null}">
				<a href="/logout">Logout!</a>
			</c:if>
		</div>
		<div class="row mt3">
			<h3>Find your Pool!</h3>
			<div class="col-auto">
				<input type="text" class="form-control" id="address"
					placeholder="new search">
			</div>
			<div class="col-auto">
				<button type="button" class="btn btn-primary mb-3"
					onclick="searchPoolByAddress()">Search</button>
			</div>
		</div>
		<div class="row mb-5 w-80">
			<table id="dtTable" class="display">
				<thead>
					<tr>
						<th>Address</th>
						<th>Pool Size</th>
						<th>Cost per Nigth</th>
						<th>Details</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${pools}" var="pool">
						<tr>
							<td>${pool.address}</td>
							<td>${pool.size.name}</td>
							<td>$${pool.cost_per_nigth}</td>
							<td><a href="/pools/${pool.id}">See more</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>