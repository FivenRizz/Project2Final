<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
.error{
	color:red
}
</style>
</head>
<body>

<form:form method = "post" action = "register" modelAttribute = "users">
<table>

<tr>
<td> User ID :</td>
<td> <form:input path = "userId" />
<form:errors path = "userId" cssClass ="error"/>
 </td>    <!-- users.getUserID() -->
</tr>

<tr>
<td> First Name :</td>
<td> <form:input path = "firstName" />
<form:errors path = "firstName" cssClass ="error"/> </td>    
</tr>

<tr>
<td> Last Name :</td>
<td> <form:input path = "lastName" />
<form:errors path = "lastName" cssClass ="error"/> </td>    
</tr>

<tr>
<td> Username :</td>
<td> <form:input path = "username" />
<form:errors path = "username" cssClass ="error"/> </td>    
</tr>

<tr>
<td> Password :</td>
<td> <form:input path = "password" />
<form:errors path = "password" cssClass ="error"/> </td>    
</tr>

<tr>
<td colspan = 2> <input type = "submit" value = "save"/> </td>    
</tr>

</table>
</form:form>

</body>
</html>