<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Struts OGNL</h2>
	<s:property value="'string'.length()"/><br/>
	<s:property value="@java.lang.Math@random()"/>
	
	<h2>ValueStack取值</h2>
	<s:debug></s:debug>
	<s:property value="user1.username"/>
	<s:property value="username"/>
	
	<s:iterator var="i" value="{'a','b','c'}">
		<s:property value="i"/>.....<s:property value="#i"/>
	</s:iterator>
	
	<s:iterator var="map" value="#{'1':'aa','2':'bb','3':'cc' }">
		<s:property value="#map.key"/>...<s:property value="#map.value"/>
	</s:iterator><br>
	
	<s:radio list="#{'1':'男','2':'女' }" name="sex" label="性别:"></s:radio>
</body>
</html>