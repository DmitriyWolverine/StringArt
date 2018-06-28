<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8 ">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<link href="<c:url value="/WEB-INF/resources/css/index.css" />" rel="stylesheet">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" 
		integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" 
		crossorigin="anonymous">
  	<title>Home</title>
 
 	<style >
 		li{
 			display:inline-block;
 		}
 	</style>
 	
</head>

<body>
	<div class="container">
	  <section class="menu cid-qQBWg77Svs" once="menu" id="menu2-l">

	
	   <div class="row">
	       <div class="col-sm-6" >
	            <div class="navbar-brand"> 
	               	<a class="navbar-caption text-black display-4" href="https://instagram.com/shad.anthony">
	                   	Anthony Shad
	                </a>
	            </div>
	        </div>
	       <div class="col-sm-6">
	            <ul class="row" data-app-modern-menu="true" >
	          		<li>
	                    <form method="post" action="to_news">
			               	<button class="btn btn-link btn-secondary-outline display-4 " type="hidden"  value="to_news">
			               		News
			               	</button>
						</form>
	                </li>
	                <li>
	                	<form method="post" action="to_service">
			               	<button class="btn btn-link btn-secondary-outline display-4" type="hidden"  value="to_service">
			               		Service
			               	</button>
						</form>
	                </li>
	                <li>
	                	<form method="post" action="to_about_us">
			               	<button class="btn btn-link btn-secondary-outline display-4" type="hidden"  value="to_about_us">
			               		About Us
			               	</button>
						</form>
	                </li>
	            </ul>
	            
	        </div>
	   </div>
	</section>
	
	
	<section class="header4 cid-qQBUaa6gmL mbr-parallax-background" id="header4-j">
	    <div class="container">
	        <div class="row justify-content-md-center">
	            <div class="media-content col-md-10">
	                <h1 class="mbr-section-title align-center mbr-white pb-3 mbr-bold mbr-fonts-style display-1">Welcome to our Art Gallery</h1>
	                
	                <div class="mbr-text align-center mbr-white pb-3">
	                    <p class="mbr-text mbr-fonts-style display-5">
	                        We are happy to introduce you some great works of one modern artist from Eastern Europe. Here you can see some interesting picures in different &nbsp;modern art directions. You can find describtions of some art-entities and do it by yourself</p>
	                </div>
	                
	                <div class="mbr-section-btn align-center">
	                
						<form method="post" action="to_authentication">
			               	<button class="btn btn-md btn-info-outline display-4" type="hidden" value="to_authentication">
			               		Log In
			               	</button>
						</form>
						
						 <form method="post" action="to_registration">
			               	<button class="btn btn-md btn-secondary-outline display-4" type="hidden"  value="to_registration">
			               		Sign Up
			               	</button>
						</form>
					
	                </div>
	           	</div>
	           		
	   
	        </div>
	    </div>
	</section>
	
		<section class="cid-qQVMcuHJM1" id="footer6-u">
		    <div class="container">
		        <div class="media-container-row align-center mbr-white">
		            <div class="col-12">
		                <p class="mbr-text mb-0 mbr-fonts-style display-7">
		                    © Copyright 2018 anthony.shad. All rights reserved.
		                </p>
		            </div>
		        </div>
		    </div>
		</section>

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