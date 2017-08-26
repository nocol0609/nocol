<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajax异步刷新局部页面</title>

<script type="text/javascript">
	function CreatAjax() {
		var ajax = null;
		ajax = new XMLHttpRequest();
		return ajax;
	}
</script>

<script type="text/javascript">
	window.onload = function() {
		document.getElementById("btn").onclick = function() {
			//创建ajax对象
			var ajax = CreatAjax();
			//发送请求
			var method = "GET";
			var url = "${pageContext.request.contextPath}/ajaxTime";
			ajax.open(method, url);
			//真正发送请求体的数据到服务器，如果请求体中无数据的话，就用null表示
			ajax.send(null);//get方式请求数据在请求行不在请求体

			//-------------发送到服务器后等待服务器响应数据
			
			
			//AJAX异步对象不断监听服务器响应的状态0-1-2-3-【4】
			//一定要状态变化后，才可触发function(){}函数
			//如果状态永远是4-4-4-4-4，是不会触发function(){}函数的
			ajax.onreadystatechange = function() {
				if (ajax.readyState == 4) {//状态码
					if (ajax.status == 200) {//响应码
						//从AJAX异步对象中获取服务器响应的HTML数据
						var CurrDate = ajax.responseText;

						var spanNode = document.getElementById("time");
						//动态添加到web页面指定的标签中
						spanNode.innerHTML = CurrDate;
					}
				}
			}
		}
	}
</script>

</head>
<body>
	当前时间：
	<span id="time"></span>
	<br />
	<input type="button" value="点击获取时间" id="btn" />
</body>
</html>