<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>修改信息</h3>
	<form action="EditStu" method="post">
	<input type="hidden" name="sid" value="${stu.sid }"/>
	<table border="1" width="600">
		<tr>
			<td>姓名</td>
			<td><input type="text" name="name" value="${stu.sname }"/></td>
		</tr>
		<tr>
			<td>性别</td>
			<td>
				<input type="radio" name="gender" value="男"
					<c:if test="${stu.gender=='男'}">checked="checked"</c:if>
				/>男&nbsp;
				<input type="radio" name="gender" value="女"
					<c:if test="${stu.gender=='女' }">checked="checked"</c:if>
				/>女
			</td>
		</tr>
		<tr>
			<td>电话</td>
			<td><input type="number" name="phone" value="${stu.phone }"/></td>
		</tr>
		<tr>
			<td>生日</td>
			<td><input type="date" name="birthday" value="${stu.birthday }"/></td>
		</tr>
		<tr>
			<td>爱好</td>
			<td>
				<input type="checkbox" name="hobby" value="游泳"
					<c:if test="${fn:contains(stu.hobby,'游泳') }">checked="checked"</c:if>
				/>游泳&nbsp;
				<input type="checkbox" name="hobby" value="篮球"
					<c:if test="${fn:contains(stu.hobby,'篮球') }">checked="checked"</c:if>
				/>篮球&nbsp;
				<input type="checkbox" name="hobby" value="足球"
					<c:if test="${fn:contains(stu.hobby,'足球') }">checked="checked"</c:if>
				/>足球&nbsp;
				<input type="checkbox" name="hobby" value="看书"
					<c:if test="${fn:contains(stu.hobby,'看书') }">checked="checked"</c:if>
				/>看书&nbsp;
				<input type="checkbox" name="hobby" value="写字"
					<c:if test="${fn:contains(stu.hobby,'写字') }">checked="checked"</c:if>
				/>写字&nbsp;
			</td>
		</tr>
		<tr>
			<td>简介</td>
			<td>
				<textarea name="info" rows="4"><c:out value="${stu.info }"></c:out> </textarea> 
			</td>
		</tr>
		<tr>
			<td>修改</td>
			<td><button type="submit">修改</button></td>
		</tr>
	</table>
	</form>
</body>
</html>