<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>iLibrary | Home</title>
</head>
<body>
<h1>Welcome <s:property value="username"/>.</h1>
<form action="<s:url action="add" namespace="/book" />" method="post">
	<label for="title">Title: </label>
	<input type="text" name="title" />
	<label for="price">Price: </label>
	<input type="text" name="price" />
	<input type="submit" value="Add"/>
</form>
</body>
</html>