<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8 ">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<link href="<c:url value="/resources/css/news.css" />" rel="stylesheet">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" 
		integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" 
		crossorigin="anonymous">
	
	<title>NEWS Page</title>
  	
</head>
<body>
<div class="container" id="myNewsColor">
	<h1 align="center"  >NEWS</h1>
	
	<h3 align="center" >Here you can see some of our latest pictures. If you want to see more - sign up.</h3>
	 <div class="row" id="picturePlace">
	 <div class="col-md-3">
	    <div class="thumbnail">
	        <img src="/stringart/resources/images/0Egor.jpg" class="img-rounded" alt="Egor3" width="280" height="350">
	        <div class="caption">
	         	 <p >Original Photo</p>
	        </div>
	    </div>
	  </div>
	  <div class="col-md-3">
	    <div class="thumbnail">
	        <img src="/stringart/resources/images/3Egor.jpg" class="img-rounded" alt="Egor3" width="280" height="350">
	        <div class="caption">
	         	 <p >Result</p>
	        </div>
	    </div>
	  </div>
	  <div class="col-md-3">
	    <div class="thumbnail ">
	        <img src="/stringart/resources/images/2Egor.jpg" class="img-rounded" alt="Egor2" width="280" height="350">
	        <div class="caption">
	        	  <p >Process</p>
	        </div>
	    </div>
	  </div>
	  <div class="col-md-3">
	    <div class="thumbnail">
	        <img src="/stringart/resources/images/1Egor.jpg" class="img-rounded" alt="Egor1" width="280" height="350">
	        <div class="caption">
	            <p >First Step</p>
	        </div>
	    </div>
	  </div>
	</div>
	 <div class="row" >
	 	<div class="col-md-1">
	 	</div>
	  	<div class="col-md-5">
			<h3 class="mr-2" >Press to make a good decision:</h3>
			
			 <div class="mbr-section-btn align-center">
	                
		                <ul class="row" data-app-modern-menu="true"  style="list-style-type:none">
			          		<li class="mr-4">
			                    <form method="post" action="to_authentication">
					               	<button class="btn btn-md  btn-outline-primary btn-info-outline display-4" value="to_authentication">
					               		Log In
					               	</button>
								</form>
			                </li>
		                
							<li>
								 <form method="post" action="to_registration">
					               	<button class="btn btn-md btn-outline-danger btn-secondary-outline display-4" value="to_registration">
					               		Sign Up
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