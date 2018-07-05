<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8 ">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<link href="<c:url value="/resources/css/aboutUs.css" />" rel="stylesheet">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" >
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	
	<title>ABOUT US</title>
  	
</head>
<body>
<div class="container" >
 	
 	
	<div class="row" id="textId">
	  <div class="col-sm-4">
	  	<h1 align="center">ABOUT US</h1>
	  </div>
		  <div class="col-sm-8">
			  <h3>Modern art, painting, sculpture, architecture, and graphic arts characteristic of the 20th and 21st 
			  centuries and of the later part of the 19th century.
			   Modern art embraces a wide variety of movements, theories, and attitudes whose modernism resides 
			   particularly in a tendency to reject traditional, historical, or academic forms and conventions in
			    an effort to create an art more in keeping with changed social, economic, and intellectual conditions.</h3>
			    <h3>If you are young, ambitious and creative person, the best thing you can do is to contact with us.</h3>
			    	
			    <a class="btn btn-link btn-xs" href="tel:+7-916-307-00-61" id="largeSymbols">
					<i class="glyphicon glyphicon-phone"></i> +7-916-307-00-61 
                </a>
                
                
                 <div class="mbr-section-btn align-center">
	                
		                <ul class="row" data-app-modern-menu="true"  style="list-style-type:none">
			          		<li class="mr-4">
			                    <form method="post" action="to_authentication">
					               	<button class="btn btn-md  btn-primary btn-info-outline display-4" value="to_authentication">
					               		Log In
					               	</button>
								</form>
			                </li>
		                
							<li class="mr-4">
								 <form method="post" action="to_registration">
					               	<button class="btn btn-md btn-danger btn-secondary-outline display-4" value="to_registration">
					               		Sign Up
					               	</button>
								</form>
							</li>
							<li>
								<form method="post" action="to_main_page">
						               	<button class="btn btn-md  btn-success btn-secondary-outline display-4" value="to_main_page">
						               		To main page
						               	</button>
								</form>
							</li>
						</ul>
	                </div>
               
	    </div>

		

	</div>		
						
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