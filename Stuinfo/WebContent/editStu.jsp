<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>更新人员信息</title>
</head>
<body>
	<h3>修改信息</h3>
	<form action="AddStu" method="post">
	<table border="1" width="600">
		<tr>
			<td>姓名</td>
			<td><input type="text" name="name"/></td>
		</tr>
		<tr>
			<td>性别</td>
			<td><input type="radio" name="gender" value="男" checked="checked"/>男&nbsp<input type="radio" name="gender" value="女"/>女</td>
		</tr>
		<tr>
			<td>电话</td>
			<td><input type="number" name="phone"/></td>
		</tr>
		<tr>
			<td>生日</td>
			<td><input type="date" name="birthday"/></td>
		</tr>
		<tr>
			<td>爱好</td>
			<td>
				<input type="checkbox" name="hobby" value="游泳" checked="checked"/>游泳&nbsp
				<input type="checkbox" name="hobby" value="篮球"/>篮球&nbsp
				<input type="checkbox" name="hobby" value="足球"/>足球&nbsp
				<input type="checkbox" name="hobby" value="看书"/>看书&nbsp
				<input type="checkbox" name="hobby" value="写字"/>写字&nbsp
			</td>
		</tr>
		<tr>
			<td>简介</td>
			<td>
				<textarea name="info" rows="4"></textarea>
			</td>
		</tr>
		<tr>
			<td>提交</td>
			<td><button type="submit">提交</button></td>
		</tr>
	</table>
	</form>
</body>
</html>