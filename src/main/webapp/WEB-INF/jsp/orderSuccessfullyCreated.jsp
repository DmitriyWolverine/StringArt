<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8 ">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="<c:url value="/resources/css/orderCreated.css" />" rel="stylesheet">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" 
		integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" 
		crossorigin="anonymous">
	
	<title>Order created Page</title>

  	
</head>
<body>
<div class="container">	
	<h1 align="center" id="color" >Thank you</h1>
	 <div class="row" >
		   <div class="col-md-5">
		  </div>
		<div class="col-md-7">
		 	  <h3 id="color">
				Your order is waiting for moderation.
			  </h3>
			   <div class="mbr-section-btn align-center">
	                
		                <ul class="row" data-app-modern-menu="true"  style="list-style-type:none">
			          		<li class="mr-4">
			                    <form method="post" action="to_main_page">
					               	<button class="btn btn-md  btn-outline-primary btn-info-outline display-4" value="to_main_page">
					               		To main page
					               	</button>
								</form>
							</li>
							<li class="mr-4">	
								<form method="post" action="to_user_page">
							   		<button class="btn btn-md btn-danger btn-secondary-outline display-4" value="to_user_page">
											Back
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