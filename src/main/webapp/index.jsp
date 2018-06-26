<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html >
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8 ">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<link href="<c:url value="/WEB-INF/resources/css/index.css" />" rel="stylesheet">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" 
		integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" 
		crossorigin="anonymous">
  	<title>Home</title>
 
</head>

<body>
  <section class="menu cid-qQBWg77Svs" once="menu" id="menu2-l">

    <nav class="navbar navbar-expand beta-menu navbar-dropdown align-items-center navbar-fixed-top navbar-toggleable-sm bg-color transparent">
        <div class="menu-logo">
            <div class="navbar-brand"> 
                <span class="navbar-caption-wrap">
                <!-- может ещё тоже переделать через сервлет ? -->
                	<a class="navbar-caption text-black display-4" href="https://instagram.com/shad.anthony">
                		<span class="mbrib-change-style mbr-iconfont mbr-iconfont-btn"></span>
                        	Anthony Shad
                    </a>
                </span>
            </div>
        </div>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav nav-dropdown" data-app-modern-menu="true">
          		<li class="nav-item">
                     <form method="post" action="to_news">
		               	<button class="btn btn-md btn-secondary-outline display-4" type="hidden"  value="to_news">
		               		News
		               	</button>
					</form>
                </li>
                <li class="nav-item">
                	<form method="post" action="to_service">
		               	<button class="btn btn-md btn-secondary-outline display-4" type="hidden"  value="to_service">
		               		Service
		               	</button>
					</form>
                </li>
                <li class="nav-item">
                	<form method="post" action="to_about_us">
		               	<button class="btn btn-md btn-secondary-outline display-4" type="hidden"  value="to_about_us">
		               		About Us
		               	</button>
					</form>
                </li>
            </ul>
            <div class="navbar-buttons mbr-section-btn">
	            <a class="btn btn-sm btn-black-outline display-4" href="tel:+1-234-567-8901">
	                <span class="btn-icon mbri-mobile mbr-iconfont mbr-iconfont-btn"></span>
	                +7-916-307-00-61
	            </a>
            </div>
        </div>
    </nav>
</section>

<section class="engine">
	<a href="https://mobirise.me/q">
		free responsive site templates
	</a>
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
           		
            <div class="mbr-figure pt-5">
                <img src="assets/images/leps-700x700.jpg" alt="Mobirise" title="" style="width: 80%;">
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


  <script src="assets/web/assets/jquery/jquery.min.js"></script>
  <script src="assets/tether/tether.min.js"></script>
  <script src="assets/popper/popper.min.js"></script>
  <script src="assets/bootstrap/js/bootstrap.min.js"></script>
  <script src="assets/parallax/jarallax.min.js"></script>
  <script src="assets/dropdown/js/script.min.js"></script>
  <script src="assets/touchswipe/jquery.touch-swipe.min.js"></script>
  <script src="assets/smoothscroll/smooth-scroll.js"></script>
  <script src="assets/theme/js/script.js"></script>
  
  
</body>
</html>