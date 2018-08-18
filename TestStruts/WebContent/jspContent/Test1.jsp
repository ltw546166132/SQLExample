<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="${pageContext.request.contextPath }/strutsdemo1!find.action">TestAction</a>
	<h1>Struts2访问Servlet API</h1>
	<h3>方式一:完成解耦合的方式</h3>
	<form action="${pageContext.request.contextPath }/strutsdemo1.action">
		<label for="name">姓名:</label>
		<input type="text" id="name" name="name"/>
		<label for="password">密码:</label>
		<input type="password" id="password" name="password"/>
		<input type="submit" value="提交">
	</form>
	
	<h3>方式二:完成解耦合的方式</h3>
	<form action="${pageContext.request.contextPath }/strutsdemo2.action">
		<label for="name">姓名:</label>
		<input type="text" id="name" name="name"/>
		<label for="password">密码:</label>
		<input type="password" id="password" name="password"/>
		<input type="submit" value="提交">
	</form>
	
</body>
</html>