<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Login" method="post">
		name:<input type="text" name="name"/><br>
		password:<input type="text" name="password"/><br>
		auto login:<input type="checkbox" name="auto" value="auto"/><br>
		<input type="submit" value="login"/>
	</form>
</body>
</html>