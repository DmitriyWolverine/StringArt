<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Start page</title>
</head>
<body>
Welcome to first page
	<form action="MyServlet" method="post">
			<p><input type="hidden" name="action" value="show_artists"/></p>
			<p><input type="submit" value="Show artists"/></p>
	</form>
</body>
</html>