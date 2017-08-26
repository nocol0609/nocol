<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>失去焦点时校验</title>

<script type="text/javascript">
	function CreateAjax() {
		var ajax = null;
		ajax = new XMLHttpRequest();
		return ajax;
	}
</script>

<script type="text/javascript">
	window.onload = function() {
		document.getElementById("userName").onblur = function() {
			var spanNode = document.getElementById("check");

			var userName = this.value;
			//创建ajax对象
			var ajax = CreateAjax();
			//准备发送请求
			var method = "Post";
			var url = "${pageContext.request.contextPath}/ajaxUser";
			ajax.open(method, url);

			//设置AJAX请求头为POST，他会将请求体中的汉字自动进行UTF-8的编码
			ajax.setRequestHeader("content-type","application/x-www-form-urlencoded");

			//发送请求
			var content = "userName=" + userName;
			ajax.send(content);

			ajax.onreadystatechange = function() {
				if (ajax.readyState == 4) {
					if (ajax.status == 200) {
						var tip = ajax.responseText;
						//创建image标签
						var imageNode = document.createElement("img");
						//设置img标签的src/width/height的属性值
						/* imageNode.src = tip;
						imageNode.style.width = "12px";
						imageNode.style.height = "12px"; */
						imageNode.setAttribute("src", tip);
						imageNode.setAttribute("width", "12px");
						imageNode.setAttribute("height", "12px"); 
						//清空span标签中的内容
						spanNode.innerHTML = "";
						spanNode.appendChild(imageNode);
					}
				}
			}
		}
	}
</script>
</head>
<body>
	用户名：
	<input type="text" id="userName" />
	<span id="check"> <!-- 
		<img src="tip变量" width="12px" height="12px"/>
	-->
	
	</span>
	<hr />

</body>
</html>