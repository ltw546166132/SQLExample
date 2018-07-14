<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-3.3.1.js" language="javascript"></script>
<script type="text/javascript" language="javascript">
	function doload(){
		$.post("Ajax", {name:$("#postname").val()}, function(data){
			if (data==1) {
				$("#doload").text("用户名存在");
			} else {
				$("#doload").text("用户名不存在");
			}
			
		}, "text")
	}
</script>
</head>
<body>
	<input type="text" onblur="doload()" id="postname"></input>
	<p id="doload"></p>
</body>
</html>