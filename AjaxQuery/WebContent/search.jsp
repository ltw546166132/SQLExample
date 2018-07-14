<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-3.3.1.js" language="javascript"></script>
<script type="text/javascript">
	$(document).ready(
    	function(){
    		$("#search").keyup(
    			function(){
    				var wordword = $(this).val();
    				if(wordword.length==0){
    					$("#indiv").hide();
    					return;
    				}
    				$.post("BaiduSearch", {keyword:wordword}, function(data){
    					$("#indiv").show();
    					$("#indiv").html(data);
    				}, "html")
    			}
    		);
    	}
    );
</script>

<style type="text/css">
    .center{
        height: 60px;
        width: 100px;
    }
    
    #search{
    	width: 500px;
        font-size: 20px;
        font-family: 'Courier New', Courier, monospace;
    }
    #divcenter{
        margin: auto;
        margin-top: 20px;
        width: 610px;
        
    }
    #indiv{
      
        width: 500px;
        height: 200px;
    }
</style>
</head>
<body>
    <div id="divcenter">
        <input type="text"  class="center" id="search">
        <input type="button" class="center" value="Google">
        <div id="indiv"></div>
    </div>
    
</body>
</html>