<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%@page isELIgnored="false"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show the contacts</title>
</head>
<body>


<h1>Here are your contacts</h1>
<hr>
	<table border="1" style="width:100%">
	<tr>
	<th width="50">Id</th><th>Name</th><th>Phone-Number</th><th>E-mail</th><th colspan="2">Operation</th>
	</tr>
	
	<c:forEach var="cont" items="${contact}">
	<tr>
	<td >${cont.id}</td>
	<td><c:out value="${cont.name}"/></td>
	<td><c:out value="${cont.mobile_number}"/></td>
	<td><c:out value="${cont.email}"/></td>
	<td>
	    <a href="EditManager?id=${cont.id}" >Edit</a>
	    <a href="DeleteManager?id=${cont.id}">Delete</a>
	 </td>
	</tr>
	</c:forEach>
	<tr> <td colspan="6" align="center"><a href="Add_Contact.jsp">Add a new contact</a></td></tr>
	
	</table>
</body>
</html>