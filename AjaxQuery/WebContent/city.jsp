<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-3.3.1.js" language="javascript"></script>
<script type="text/javascript" src="js/city.js"></script>
</head>
<body>
    <label for="province">省份:</label>
	<select name="province" id="province">
        <option value="">--请选择--</option>
        <option value="1">四川</option>
        <option value="2">陕西</option>
        <option value="3">湖北</option>
        <option value="4">浙江</option>
    </select>
    <label for="city">市区:</label>
    <select name="city" id="city">
        
    </select>
</body>
</html>