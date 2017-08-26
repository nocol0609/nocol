<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>传统web思考</title>

<script type="text/javascript">
	window.onload = function() {
		document.getElementById("btn").onclick = function() {
			//发送请求到服务端
			//var url = "http://localhost:8088/Jsp/time";
			var url="${pageContext.request.contextPath}/time";
			window.location.href = url;
		}
	}
</script>

</head>
<body>
	<%-- 当前时间：${requestScope.date} --%>
	当前时间：${date }
	<br/>
	<input type="button" value="显示时间" id="btn" />

</body>

</html>