<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>获取当前时间</title>
<script type="text/javascript" src="jquery-1.8.3.js"></script>
</head>
<body>
	当前时间：
	<span id="time"></span>
	<br />
	<input type="button" value="获取时间" id="click" />

	<script type="text/javascript">
		//load()不带参数，默认get方式提交------(一个参数))
		/* 		$(":button").click(function() {
		 var url = "${pageContext.request.contextPath}/jqueryTime";
		 $("#time").load(url);
		 }); */

/* 		 
		//load()带参，以Post方式提交-------(两个参数)
		$(":button").click(function() {
			var url = "${pageContext.request.contextPath}/jqueryTime";
			//以Json文本发送参数
			var sendDate = {
				"name" : "爸爸",//自动转码
				"pwd" : "123"
			}
			$("#time").load(url, sendDate);
		});
*/
		 
		 //load()带三个参数,返回数据回调函数
		 $(":button").click(function() {
			var url = "${pageContext.request.contextPath}/jqueryTime";
			//以Json文本发送参数
			var sendDate = {
				"name" : "爸爸",//自动转码
				"pwd" : "123"
			}
			$("#time").load(url, sendDate,function(backDate,textStatus,xmlHttpRequest){
				//参数一：backDate表示返回的数据，是一个Js对象
				//参数二：textStatus表示文本的状态
				//参数三：xmlHttpRequest表示传统ajax对象
				
				alert("backDate:"+backDate);//js对象
				alert("textStatus:"+textStatus);//success/fail
				
				alert("xmlRequest:"+xmlHttpRequest.readyState);
				alert("xmlRequest:"+xmlHttpRequest.status);
				alert("xmlRequest:"+xmlHttpRequest.responseText);//字符串   
				
			});
		});
		 
		 
	</script>

</body>
</html>