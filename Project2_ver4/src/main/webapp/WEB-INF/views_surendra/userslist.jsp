<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

    <table border = "2" width= "70%" cellpadding = "2">
    <tr><th>User Id</th><th>First Name</th><th>Last Name</th><th>Username</th><th>User Email</th><th>Post Id</th></tr>
    
    <c:forEach var="users" items="${ulist}">
  <tr>
  <td>${users.userId}</td>
  <td>${users.firstName}</td>
  <td>${users.lastName}</td>
  <td>${users.userName}</td>
  <td>${users.email}</td>
  <td>${users.postId}</td>
  </tr>
  </c:forEach>
  </table>
  
  </html>