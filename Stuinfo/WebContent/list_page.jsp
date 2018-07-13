<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息列表</title>
<script type="text/javascript">
	function dodelete(sid) {
		var con = confirm("是否删除行？");
        if(con){
            window.location.href="DoDelete?sid="+sid;
        }
	}
</script>
</head>
<body>
	<form action="FindSelect" method="post">
	
    <table border="1" width="900">
    	<tr>
    		<td colspan="8">
    			<a href="add.jsp">添加用户</a>&nbsp;
    			按姓名查找&nbsp;<input type="text" name="name"/>&nbsp;
    			按性别查询&nbsp;<select name="gender">
    						<option value="" selected="selected">--请选择--
		    				<option value="男">男
		    				<option value="女">女
		    			</select>&nbsp;
		    	<input type="submit" value="查询"/>
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
        <c:forEach items="${requestScope.pageBean.list}" var="stu">
            <tr align="center">
                <td><c:out value="${stu.sid }"></c:out></td>
                <td><c:out value="${stu.sname }"></c:out></td>
                <td><c:out value="${stu.gender }"></c:out></td>
                <td><c:out value="${stu.phone }"></c:out></td>
                <td><c:out value="${stu.birthday }"></c:out></td>
                <td><c:out value="${stu.hobby }"></c:out></td>
                <td><c:out value="${stu.info }"></c:out></td>
                <td><a href="FindOneStu?sid=${stu.sid}">更新</a>&nbsp;<a href="#" onclick="dodelete(${stu.sid})">删除</a> </td>
            </tr>
        </c:forEach>
        <tr>
        	<td colspan="8">
        	第${pageBean.currentPage } / ${pageBean.totalPage }&nbsp;&nbsp;
        	每页显示${pageBean.pageSize }条&nbsp;&nbsp;
        	总记录数${pageBean.totalSize }&nbsp;&nbsp;
        	<c:if test="${pageBean.currentPage!=1 }">
        		<a href="Paging?currentPage=1">首页</a>|<a href="Paging?currentPage=${pageBean.currentPage-1 }">上一页</a>
        	</c:if>
        	
        	<c:if test="${pageBean.currentPage != pageBean.totalSize }">
        		<a href="Paging?currentPage=${pageBean.currentPage+1 }">下一页</a>|<a href="Paging?currentPage=${pageBean.totalPage }">尾页</a>
        	</c:if>
        	</td>
        </tr>
    </table>
    </form>
</body>
</html>