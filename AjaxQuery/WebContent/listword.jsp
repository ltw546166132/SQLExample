<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<table style="width:500px">
	<c:forEach var="word" items="${requestScope.list }">
	<tr>
		<td>${word.word }</td>
	</tr>
	</c:forEach>
</table>
