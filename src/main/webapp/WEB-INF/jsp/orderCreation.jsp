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
	
	<title>Order creation Page</title>
  	
</head>
<body>
<div class="container-fluid">
 	<div class="row">
 	 	<div class="col-sm-11">
		<h1 align="center">Create your order</h1>
			<form method="post" action="create_order">
				<table class="table">
				    <thead>
				      <tr>
				        <th>Photo</th>
				        <th>Picture</th>
				        <th>Order Name</th>
				        <th>Size</th>
				        <th>Price</th>
				        <th>Order</th>
				      </tr>
				    </thead>
				    <tbody>
					      <tr>
					     	<td><img src="${picture.getPhoto()}" height = 300/></td>
					     	<td>
					     		<img src="${picture.getImage()}" height = 300/>
					     	</td>
					     	<td>
					     	<div class="col-xs-2">
							    <input type="text" class="form-control" id="ex1"name="title"  placeholder="Enter some name">
							  </div>
							  </td>
					        <td>
					   					
					        <select name="size" >
								<option disabled>Choose standard</option>
								<c:forEach items="${standartList}" var="standart">
										<option  value="${standart.getId()}" > ${standart.getName()} </option>
								</c:forEach>
							</select>
					        
							</td>
					        <td>
					       	  <div class="col-xs-2">
							    <input type="text" class="form-control" id="ex1" name="price"  placeholder="Enter you price">
							  </div>
							</td>
					      	<td>
						    		<input type="hidden" name="pictureId" value="${picture.getId()}"/>
					               	<button class="btn btn-link btn-secondary-outline display-4" type="hidden"  value="create_order">
					               		Submit
					               	</button>
					        </td>	
					      </tr>
				    </tbody>
				  </table>
			</form>
		</div>
		
		  <div class="col-sm-1">
			   <form method="post" action="log_out">
			   		<button class="btn btn-md btn-danger btn-secondary-outline display-4" value="log_out">
							Log Out
					</button>
				</form>
			</div>
		</div>
		
		<form method="post" action="to_user_page">
			<button class="btn btn-md btn-danger btn-secondary-outline display-4" value="to_user_page">
				Back
			</button>
		</form>
		
		
		<form method="post" action="/to_admin_page">
			<button class="btn btn-md btn-info btn-secondary-outline display-4" value="/to_admin_page">
				False Button
			</button>
		</form>
</div>		
	
	<div class="container">
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