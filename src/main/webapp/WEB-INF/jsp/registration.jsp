<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8 ">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<link href="<c:url value="/resources/css/registration.css" />" rel="stylesheet">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" 
		integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" 
		crossorigin="anonymous">
	
	<title>Registration Page</title>
	
</head>
<body>
<div class="container">
	
		<div class="row" id="textColor">
		  <div class="col-lg-7">
		   <h1>Don't forget basic rules:</h1>
		   <h3 >
			   <p>1) Password should be not shorter than 8 symbols;</p>
			   <p>2) More random - harder "brute force";</p>
			   <p>3) Changing languages, usage of numbers, punctuation signs and HIGH LETTERS - good practice;</p>
		   </h3>
		  </div>
		  <div class="col-lg-5">
		  <h1>Registration form</h1>	
			<form class="form-horizontal" method = "post" action="registrate">
				  <div class="form-group col-sm-5">
				    <label class="control-label col-sm-2" for="login">Login:</label>
				    <input type="text" class="form-control" id="login" name="login" placeholder="Enter login">
				  </div>
				  
				   <div class="form-group col-sm-5">
				    <label class="control-label col-sm-2" for="pwd">Password:</label>
				    <input type="password" class="form-control" id="pwd" name="password" placeholder="Enter password">
				  </div>
				  
				  <div class="form-group col-sm-5">
				    <label class="control-label col-sm-2" for="email">Email:</label>
				    <input type="email" class="form-control" id="email" name="email" placeholder="Enter email">
				  </div>
				  
				  <div class="col-sm-2">
					  <button type="submit" class="btn btn-default " value="registrate">Submit</button>
				   </div>
			</form>
		</div>
	</div>
	<form method="post" action="to_main_page">
		<button class="btn btn-md  btn-outline-success btn-info-outline display-4" value="to_main_page">
			To main page
		</button>
	</form>
	<div id="footer" >
		  <p> © Copyright 2018 anthony.shad. All rights reserved.</p> 
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