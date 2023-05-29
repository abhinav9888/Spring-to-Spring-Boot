<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<link rel="stylesheet" type="text/css" href="style.css">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Hello friend!!!</h2>
	<form action="process" method="post">
		Enter your name: <input type="text" name="yourname"/><br/>
		<input type="submit"/>
	</form>
	${message}
</body>
</html>