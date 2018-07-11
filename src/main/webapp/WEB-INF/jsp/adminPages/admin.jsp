<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8 ">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="<c:url value="/resources/css/user.css" />" rel="stylesheet">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" 
		integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" 
		crossorigin="anonymous">
	
	<title>Admin page</title>

	
</head>
<body>
<div class="container">	
 	<div class="row">
 	 	<div class="col-sm-10">
		<h1 align="center">Hello, ${login}!</h1>
			<form method="post" action="to_orders">
				<button class="btn btn-warning"  value="admin/to_orders">
				    	Show orders
			 	</button>
			</form>
			<table class="table">
			    <thead>
			      <tr>
			        <th>Firstname</th>
			        <th>Lastname</th>
			        <th>Birthday</th>
			        <th>Action</th>
			      </tr>
			    </thead>
			    <tbody>
				    <c:forEach items="${artistList}" var="item">
				      <tr>
				        <td><c:out value="${item.getName()}"/></td>
				        <td><c:out value="${item.getSurname()}"/></td>
				        <td><c:out value="${item.getBirthdayNoTime()}"/></td>
				        <td>
					        <form method="post" action="admin/to_advanced_artist_exhibition">
				               	<button class="btn btn-link btn-secondary-outline display-4"  value="to_advanced_artist_exhibition">
				               		Watch pictures
				               	</button>
				               	<input type="hidden" name="artistId" value="${item.getId()}"/>
							</form>
				        </td>	
				      </tr>
			      	</c:forEach> 
			    </tbody>
			  </table>
		
		</div>
		
		  <div class="col-sm-2">
			   <form method="post" action="log_out">
			   		<button class="btn btn-md btn-danger btn-secondary-outline display-4" value="log_out">
							Log Out
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