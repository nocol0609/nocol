<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Jsp语法</title>
</head>
<body>
	<!--Jsp脚本  -->
	<%
		//生成随机数
		Random random = new Random();
		float num = random.nextFloat();
	%>
	随机数：<%=num%>
	<hr />
	<!--穿插html代码 -->
	<%
		for (int i = 1; i <= 6; i++) {
	%>
	<h<%=i%>>标题<%=i%></h<%=i%>>
	<%
		}
	%>
	<hr />
	<!-- Jsp生成九九乘法表 -->
	<%
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
	%>
	<%=i%>
	x
	<%=j%>=<%=(i * j)%>&nbsp;
	<%
		}
	%>
	<br />
	<%
		}
	%>
	<!--Jsp声明  -->
	<%!
	//变量
	String name="jack";
	public String getName(){
		return name;
	}
	
	%>

</body>
</html>