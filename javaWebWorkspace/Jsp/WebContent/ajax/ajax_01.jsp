<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>检测ajax对象</title>
<script type="text/javascript">
	window.onload=function(){
		
		document.getElementById("btn").onclick=function(){
			var aja=null;
			try {
				//IE
				ajax=new ActiveXObject("microsoft.xmlhttp");
				alert("IE"+ajax) 
			} catch (e1) {
				//非IE
				try {
						ajax=new XMLHttpRequest()
						alert("非IE"+ajax);
				} catch (e2) {
					// TODO: handle exception
				}
			}		 
		}		
	}

</script>
</head>
<body>
	<input type="button" value="点击" id="btn"/>
</body>
</html>