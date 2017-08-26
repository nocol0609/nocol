<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" buffer="1kb" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Out对象</title>
</head>
<body>
<%
	out.write("abc"); //先写入到缓冲区，满足条件后再通过PrintWriter对象写出到浏览器
	//out.flush();//刷新缓存
	
	//查看当前缓存区的大小
	System.out.println("当前缓存区的大小："+out.getBufferSize());
	//查看缓存区剩余的大小
	System.out.println("当前缓存区的大小："+out.getRemaining());
	response.getWriter().write("123");
	
	//刷新输出：abc123  或者将buffer设置为0kb
	//不刷新输出：123abc
%>
</body>
</html>