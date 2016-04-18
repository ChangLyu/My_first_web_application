<%@ page language="java" import="com.model.Contacts, com.operation.Operation, org.hibernate.Session" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit a contact</title>

</head>
<body>
<h1>Editing!</h1>
<hr>

<form action="Contact_Servlet" name="Edit_Contact" method="post">


	<table border="1" style="width:100%">
	<tr>
	<th width="50">Id</th><th>Name</th><th>Phone-Number</th><th>E-mail</th>
	</tr>
	<c:forEach var="c" items="${editContact}">
	<tr>
	<td ><input type="text" name="Id" style="width:150px" value="${c.id}"/></td>
	<td><input type="text" name="Name" style="width:150px" value="${c.name}"/></td>
	<td><input type="text" name="Phone_Number" style="width:150px" value="${c.mobile_number}"/></td>
	<td><input type="text" name="E_mail" style="width:150px" value="${c.email}"/></td>
	<td><input type="submit" name="operation" value="edit" style="width:150px"/></td>
	</tr>
	</c:forEach>
	</table>


</form>
</body>
</html>