<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>iLibrary | Welcome</title>
</head>
<body>
<h1>Welcome to iLibrary.</h1>
<form action="<s:url action="login" namespace="/" />" method="post">
	<label for="u">Username:&nbsp;</label>
	<input id="u" type="text" name="username" />
	<input type="submit" value="log in" />
</form>
<p><s:property value="error"/></p>
</body>
</html>