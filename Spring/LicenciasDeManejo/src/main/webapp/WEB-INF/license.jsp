<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
	</head>
	<body>
		<div class="container">
			<h1>New License</h1>
			<%-- <p> <c:out value="${existe}"/></p>	 --%>
			
			<br/>
			<form action="/licenses/new" method="post" modelAttribute="newLicense">
				<div>
					<p>Person   :   
						<select path="person" name="id">								
								<c:forEach items="${lista}" var="l">
										<option value="<c:out value="${l.id}"/>"><c:out value="${l.fisrtName}"/> <c:out value="${l.lastName}"/></option>
								</c:forEach>
						</select>						
					</p>
				</div>
			
				<div class="col-md-3 mt-2 mb-2">
					<label>State</label>
				    <input type="text" class="form-control" name="state">
				</div>
				<div class="col-md-3 mt-2 mb-2">
					<label>Expiration Date
				    <input type="date" class="form-control" name="expirateDate"></label>
				</div>
				<button type="submit" class="btn btn-primary mt-3">Crear</button>
			</form>
		
			<br/>
			
			
			
			
			
			
		
		
		</div>
	</body>
</html>