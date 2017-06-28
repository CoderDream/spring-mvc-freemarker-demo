<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎</title>
</head>
<body>
	<h3>User name: ${user.name} has been deleted.</h3>
	<h6>Detail:</h6>
	<div>
		<p>user id : ${user.id}.</p>
		<p>user address : ${user.address}.</p>
	</div>
	<span>Sent using FreeMarker Template</span>
</body>
</html>