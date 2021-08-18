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
	<div class="container">
		<form action="/products/category/add" method="post">
			<div class="nav">
				<label>
					<c:out value="${producto.name}" />
					<input type="hidden" name="${producto.id}">
				</label>
			</div>
			<br />
			<div class="row">
				<div class="col col-md-6 mt-6">
					<h2>Categories :</h2>
					<p>
						<c:forEach items="${catprod}" var="cp">
						- <c:out value="${cp.category_id}" />
						</c:forEach>
					</p>
				</div>
				<div class="col col-md-6 mt-3">
					<p>
						Add Category
						<select name="category_id">
							<c:forEach items="${categoria}" var="c">
								<option value="${c}" label="${c.name}"/>
							</c:forEach>
						</select>
					</p> 
					<br>
					<input type="submit" value="Add" />
				</div>
			</div>
		</form>
	</div>
</body>
</html>