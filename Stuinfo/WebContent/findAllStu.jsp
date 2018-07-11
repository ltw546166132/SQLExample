<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息列表</title>
</head>
<body>
    <table border="1" width="700">
    	<tr>
    		<td colspan="8">
    			<a href="add.jsp">添加</a>
    		</td>
    	</tr>
        <tr align="center">
            <td>编号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>电话</td>
            <td>生日</td>
            <td>爱好</td>
            <td>简介</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${sessionScope.findAllStudent}" var="stu">
        <tr align="center">
            <td><c:out value="${stu.sid }"></c:out></td>
            <td><c:out value="${stu.sname }"></c:out></td>
            <td><c:out value="${stu.gender }"></c:out></td>
            <td><c:out value="${stu.phone }"></c:out></td>
            <td><c:out value="${stu.birthday }"></c:out></td>
            <td><c:out value="${stu.hobby }"></c:out></td>
            <td><c:out value="${stu.info }"></c:out></td>
            <td><a href="#">更新</a>&nbsp<a href="#">删除</a> </td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>