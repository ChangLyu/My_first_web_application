<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create a new contact</title>
</head>
<body>
<h1>Creating!</h1>
<hr>
<form action="Contact_Servlet" name="Add_Contact" method="post">
	<table border="1" style="width:100%">
	<tr>
	<th width="50">Id</th><th>Name</th><th>Phone-Number</th><th>E-mail</th>
	</tr>
	<tr>
	<td ><input type="text" name="Id" style="width:150px"/></td>
	<td><input type="text" name="Name" style="width:150px"/></td>
	<td><input type="text" name="Phone_Number" style="width:150px"/></td>
	<td><input type="text" name="E_mail" style="width:150px"/></td>
	<td><input type="submit" name="operation" value="add" style="width:150px"/></td>
	</tr>
	</table>
</form>

</body>
</html>