<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="style.css" type="text/css">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
    		integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
		<script src="main.js"></script>
	</head>
	<body>

		<% 
			String an = request.getParameter("width"); 
		 	String al = request.getParameter("height");
		 	int ancho;
		 	int alto;
		 	if(an==null && al == null) {
		 		ancho = 10;
		 		alto = 10;
		 	}else if(an==null && al!= null){
		 		ancho = 10;
		 		alto = Integer.parseInt(al);
		 	}else if(an!=null && al==null) {
		 		alto = 10;
		 		ancho  = Integer.parseInt(an);
		 	} else {
		 		ancho  = Integer.parseInt(an);
		 		alto = Integer.parseInt(al);
		 	}
			int estado=1;
			
		 	for(int i = 0; i < alto; i++) { 
		%>		
			<div class="container">
				<div class="row">
			<!-- 	<div class="blanco"></div>    -->
			
		<%
				for(int j = 0; j < ancho; j++) {
					if(estado==1) {
						
		%>	
						<div class="col uno"></div>
		<%			
						estado = 2;
					}else { 
		%>
						<div class="col dos"></div>				
						
		<%
						estado =1;
					} 
				} 
		%>
				</div>
			</div>
		<%	
				if(estado==1) estado=2;
					else if(estado ==2) estado=1;
			} 
		%>
		
		<%
			for(int i=0; i<10; i++){
				
			}
		%>
			
	
		
	</body>
</html>