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
	<h1 align="center" id="headerColor" >NEWS</h1>
	
	<h3 align="center" id="headerColor">Here you can see some of our latest pictures. If you want to see more - sign up.</h3>
	 <div class="row" id="picturePlace">
	  <div class="col-md-4">
	    <div class="thumbnail">
	        <img src="/stringart/resources/images/leps.jpg" class="img-rounded" alt="Leps" width="350" height="350">
	        <div class="caption">
	         	 <p >Grigory Leps</p>
	        </div>
	    </div>
	  </div>
	  <div class="col-md-4">
	    <div class="thumbnail ">
	        <img src="/stringart/resources/images/egor.jpg" class="img-rounded" alt="Egor" width="300" height="350">
	        <div class="caption">
	        	  <p >Private order</p>
	        </div>
	    </div>
	  </div>
	  <div class="col-md-4">
	    <div class="thumbnail">
	        <img src="/stringart/resources/images/nikulin.jpg" class="img-rounded" alt="Nikulin" width="300" height="350">
	        <div class="caption">
	            <p >Yury Nikulin</p>
	        </div>
	    </div>
	  </div>
	</div>
	 <div class="row" >
	 	<div class="col-md-1">
	 	</div>
	  	<div class="col-md-5">
			<h3 class="mr-2" id="headerColor">Press to make good decision:</h3>
			<form method="post" action="to_registration">
				<button class="btn btn-md btn-danger btn-secondary-outline display-4" value="to_registration">
					Sign Up
				</button>
			</form>
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