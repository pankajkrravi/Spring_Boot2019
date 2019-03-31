<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h1>Employee update</h1>
<form action="./empupdate.ds">
	<pre>
Name:<input type="text" name="name">
Email:<input type="text" name="email">
Address:<textarea rows="5" cols="15" name="address"></textarea>
<input type="submit" value="update">
</pre>
</form>
</body>
</html>