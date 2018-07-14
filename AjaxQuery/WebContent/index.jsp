<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function ajaxFunction(){
		var xmlHttp;
		try {
			xmlHttp=new XMLHttpRequest();
			
		} catch (e) {
			try {
				xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
			} catch (e) {
				try {
					xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
				} catch (error) {
					
				}
			}
		}
		return xmlHttp;
	}

	function get(){
		var request = ajaxFunction();
		request.open("GET","Ajax",true);
		request.onreadystatechange = function(){
			if(request.readyState==4 && request.status==200){
				alert("收到数据");
			}
		}

		request.send();
	}
</script>
</head>
<body>
	<a href="" onclick="get()">Ajax请求</a>
</body>
</html>