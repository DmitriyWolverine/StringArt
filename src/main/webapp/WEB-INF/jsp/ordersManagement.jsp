<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8 ">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="<c:url value="/resources/css/ordersManager.css" />" rel="stylesheet">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" 
		integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" 
		crossorigin="anonymous">
	
	<title>User Order page</title>
	
</head>
<body>
<div class="container-fluid">	
 	<div class="row">
 	 	<div class="col-sm-10">
		<h1 align="center">Welcome to your orders whole!</h1>
			<table class="table">
			    <thead>
			      <tr>
			      	<th>Picture</th>
			        <th>Name</th>
			        <th>Status</th>
			        <th>Date</th>
			        <th>Price</th>
			        <th>Accept</th>
			        <th>Deny</th>
			      </tr>
			    </thead>
			    <tbody>
				    <c:forEach items="${ordersList}" var="item">
				      <tr>
				      	<td><img src="${item.getPicture().getImage()}" width=300 /></td>
				        <td><c:out value="${item.getName()}"/></td>
						<td>
						<c:choose>
						    <c:when test="${item.getStatus()=='1'}">
						      		 accepted
						        <br />
						    </c:when>  
						     <c:when test="${item.getStatus()=='2'}">
						     		denied
						        <br />
						    </c:when>  
						    <c:otherwise>
						        	not accepted yet
						        <br />
						    </c:otherwise>
						</c:choose>	
						</td>
				        <td><c:out value="${item.getAppliedDate()}"/></td>
				        <td><c:out value="${item.getPrice()}"/></td>
				        <td>
				        	<form method="post" action="accept_order">
				               	<button class="btn btn-success btn-secondary-outline display-4" type="hidden"  value="accept_order">
				               		Accept
				               	</button>
				               	<input type="hidden" name="orderId" value="${item.getId()}"/>
							</form>
				        </td>
				        <td>
					        <form method="post" action="deny_order">
				               	<button class="btn btn-danger btn-secondary-outline display-4" type="hidden"  value="deny_order">
				               		Deny
				               	</button>
				               	<input type="hidden" name="orderId" value="${item.getId()}"/>
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
			<div class="col-sm-2">
			   <form method="post" action="to_admin_page">
			   		<button class="btn btn-md btn-danger btn-secondary-outline display-4" value="to_admin_page">
							Back
					</button>
				</form>
			</div>
		</div>
	</div>
	
	
<div class="container" >	
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