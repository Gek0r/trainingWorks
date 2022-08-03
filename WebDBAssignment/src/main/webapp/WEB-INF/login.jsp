<%@ page import="java.util.date" language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<form action="./login">
		User Name : <input type="text" name="username" /> Password : <input
			type="password" name="password" /> <input type="submit" value="Login" />
	</form>
	
	<% new Date() %>
		
	<h1>Showing off the jsp tag</h1>
	
	<% 
	int count = 10;
	out.println("Outputing from the jsp");
	sessionn.setAttribute("k1", count);
	%>
</body>
</html>