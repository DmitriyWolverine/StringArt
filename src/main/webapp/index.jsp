<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8 ">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" 
		integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" 
		crossorigin="anonymous">
  	<title>Home</title>
 	<style type="text/css">
 		body{
		background-image:url(https://image.ibb.co/bKqZSJ/user_background.png);
		background-repeat: no-repeat;
		background-position: center;
	    background-attachment: fixed;
	  	background-size: cover;
		}
		
	   #footer {
	    position: fixed; /* Фиксированное положение */
	    text-align: center;
	   	bottom: 0; /* Левый нижний угол */
	    padding: 10px; /* Поля вокруг текста */
	    width: 70%; /* Ширина слоя */
	   }
	  </style>
</head>

<body>
	<div class="container">
	  <section class="menu cid-qQBWg77Svs" once="menu" id="menu2-l">

	
	   <div class="row">
	       <div class="col-sm-7" >
	               	<a class="navbar-caption text-black display-4" href="https://instagram.com/shad.anthony">
	                   	Anthony Shad
	                </a>
	        </div>
	       <div class="col-sm-5">
	            <ul class="row"  data-app-modern-menu="true" style="list-style-type:none">
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
	                <h2 class="mbr-section-title align-center mbr-white pb-3 mbr-bold mbr-fonts-style display-3">Welcome to our Art Gallery</h2>
	                
	                <div class="mbr-text align-center mbr-white pb-3">
	                    <p class="mbr-text mbr-fonts-style display-5">
	                        We are happy to introduce you some great works of one modern artist from Eastern Europe.
	                         Here you can see some interesting pictures in different &nbsp;modern art directions. 
	                         You can find descriptions of some art-entities and do it by yourself</p>
	                </div>
	              
	                  	<img src="https://image.ibb.co/gYmymd/1511498727187249362.jpg" class="img-rounded" alt="Leps" width="350" height="350">
				        <div class="caption">
				         	 <p >Grigory Leps</p>
				        </div>
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
	    </div>
	</section>
	
	<div class="container">
		<div id="footer" >
			  <p> © Copyright 2018 anthony.shad. All rights reserved.</p> 
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