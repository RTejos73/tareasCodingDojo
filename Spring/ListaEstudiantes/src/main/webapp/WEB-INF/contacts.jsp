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
			<h1>Nuevo Contacto</h1>
			<div>
				<form action="/contacts/create" method="post">				    
				    <p>Students				
						<select name="id">
							<c:forEach items="${listaStudents}" var="ls">
								<option value="<c:out value="${ls.id}"/>">
									<c:out value="${ls.firstName}"/> <c:out value="${ls.lastName}"/>
								</option>
							</c:forEach>
						</select>
					</p>
				    <p>
				        <label>Address	</label>				       
				        <input type="text" name="address"/>
				        
				    </p>
				    <p>
				        <label>City    	</label>				        
				        <input type="text" name="city"/>
				        
				    </p>
				    <p>
				        <label>State			</label>				        
				        <input type="text" name="state"/>
				        
				    </p>   
				    <input type="submit" value="Crear Contacto"/>
				</form>
			</div>		
		</div>	
	</body>
</html>