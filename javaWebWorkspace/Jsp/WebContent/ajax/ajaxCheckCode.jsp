<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ajax实现验证码校验</title>
<script type="text/javascript" src="/js/ajax.js"></script>

<script type="text/javascript">
	//去掉两边空格  
	function trim(str) {
		str = str.replace(/^\s*/, "");//"  nocol  " 	
		str = str.replace(/\s*$/, "");//"nocol"
		return str;
	}
</script>

<script type="text/javascript">
	window.onload = function() {
		document.getElementById("checkCode").onkeyup = function() {

			var spanNode = document.getElementById("check");

			//获取输入的验证码
			var checkCode = this.value;
			checkCode = trim(checkCode);
			if (checkCode.length == 4) {
				//创建ajax对象
				var ajax = CreatAjax();
				var method = "Post";
				var url = "${pageContext.request.contextPath}/code";
				ajax.open(method, url);
				//设置AJAX请求头为POST，他会将请求体中的汉字自动进行UTF-8的编码
				ajax.setRequestHeader("content-type","application/x-www-form-urlencoded");
				var content = "checkCode=" + checkCode;
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
			} else {
				spanNode.innerHTML = "";
			}
		}
	}
</script>
</head>
<body>
	<table>
		<tr>
			<td>验证码：</td>
			<td><input type="text" name="checkCode" id="checkCode"></td>
			<td><img src="${pageContext.request.contextPath}/images/checkCode.jsp"></td>
			<td><span id="check"></span></td>
		</tr>
	</table>
</body>
</html>