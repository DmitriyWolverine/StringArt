<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8 ">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="<c:url value="/resources/css/someProblem.css" />" rel="stylesheet">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" 
		integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" 
		crossorigin="anonymous">
	
	<title>Registration problem</title>

  	
</head>
<body>
<h2 align = "right" id="headColor">Registration service encountered some problems...</h2>
<div class="container" id = "informatiomOut">	
	<div class="row">
	  <div class="col-md-8">
	  
			<h1 align="left" >	${errorString }</h1>
				 <ul class="row" data-app-modern-menu="true"  style="list-style-type:none">
		          		<li class="mr-4">
		                    <form method="post" action="to_authentication">
				               	<button class="btn btn-md  btn-primary btn-info-outline display-4" value="to_authentication">
				               		Log In
				               	</button>
							</form>
		                </li>
	                
						<li>
							 <form method="post" action="to_registration">
				               	<button class="btn btn-md btn-danger btn-secondary-outline display-4" value="to_registration">
				               		Sign Up
				               	</button>
							</form>
						</li>
					</ul>
		</div>
	</div>
		
</div>	
	<script 
		src="https://code.jquery.com/jquery-3.3.1.slim.min.js" 
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" 
		crossorigin="anonymous">
	</script>
	<script 
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" 
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" 
		crossorigin="anonymous">
	</script>
	<script 
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" 
		integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" 
		crossorigin="anonymous">
	</script>
</body>
</html>