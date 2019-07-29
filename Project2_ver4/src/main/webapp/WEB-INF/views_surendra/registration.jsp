<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

   <head>
      <title>Users Registration Form</title>
   </head>
	
   <body>
   
      <form action = "register"   method = "post" >
      	 
         First name: <input type = "text" name = "firstName" />
         <br>
         Last name: <input type = "text" name = "lastName" />
         <br>
         User name: <input type = "text" name = "userName" />
         <br>
         Password: <input type = "password" name = "password" />
         <br>
         Email: <input type = "email" name = "email" />
         <br>
         <input type = "submit" name = "register" value = "Register" />
      </form>
   </body>
	
</html>