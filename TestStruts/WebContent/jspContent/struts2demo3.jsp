<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Struts2数据封装</h2>
	<form action="${pageContext.request.contextPath }/demofengz_getParameters" method="post">
		用户名:<input type="text" name="user.username"/>
		密码:<input type="text" name="user.password"/>
		生日:<input type="date" name="user.birthday">
		<input type="submit" value="提交">
	</form>
	
	<h2>Struts2数据封装模型驱动</h2>
	<form action="${pageContext.request.contextPath }/demofzmodel_fzModel" method="post">
		用户名:<input type="text" name="username"/>
		密码:<input type="text" name="password"/>
		生日:<input type="date" name="birthday">
		<input type="submit" value="提交">
	</form>
</body>
</html>