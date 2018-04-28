<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Artists</title>
</head>
<body>
	Artist:
	<c:forEach items="${artists_list}" var="item">
		<p><c:out value="${item}"/>
	</c:forEach> 
</body>
</html>