<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	 <h3>Recover Password Form</h3>
	 
 		<form name="PasswordForm" action="processPassword" method = "POST">
 		
 		Username: <input type="text"name="uName">
 		<br>
 		Email: <input type="email" name="uEmail">
 		<br>
 		<input type="submit"name="Submit"value="Submit">
 		</form>
</body>
</html>