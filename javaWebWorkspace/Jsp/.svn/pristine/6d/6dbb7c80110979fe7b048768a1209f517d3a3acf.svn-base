<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>失去焦点时校验</title>
<script type="text/javascript">
		
		function CreateAjax() {
			var ajax=null;
			ajax=new XMLHttpRequest();
			return ajax;
		}

</script>

<script type="text/javascript">
	window.onload=function(){	
		document.getElementById("userName").onblur=function(){
			var userName=this.value;
			var spanNode=document.getElementById("check");
			if (userName.length==0) {
				var str="请输入用户名";
				spanNode.innerHTML=str.fontcolor("red");
			}else {
				//对汉字编码
				var userName=encodeURI(userName);
				
				//创建ajax对象
				var ajax=CreateAjax();
				//准备发送请求
				var method="Get";
				var url="${pageContext.request.contextPath}/ajaxUser?userName="+userName;
						
				ajax.open(method, url);
				//发送请求
				ajax.send(null);
				
				ajax.onreadystatechange=function(){
					if(ajax.readyState==4){
						if(ajax.status==200){
							var tip=ajax.responseText;
							spanNode.innerHTML=tip;
						}	
					}
				}
			}
		}	
	}


</script>
</head>
<body>
	用户名：<input type="text" id="userName" name="userName"/>
	<hr/>
	<span id="check"></span>
</body>
</html>