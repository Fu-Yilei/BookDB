<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World</title>
</head>
<body>
	<h3>Say "Hello" to</h3>
	<form action="HelloWorld" method="get">
		<p>Name:<input type ="text" name="name"/></p>
		<input type="submit" value="submit">
	</form>
	<form action="add" method="get">
		<p>N1:<input type ="text" name="Num1"/></p>
		<p>N2:<input type ="text" name="Num2"/></p>
		<input type="submit" value="add">
	</form>
	

</body>
</html>