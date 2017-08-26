<%@page import="com.nocol.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Jsp中使用javabean</title>
</head>
<body>
	<%
		/* Student s=new Student();
		s.setName("nocol");
		s.setAge(20); 
		s.getName();
		*/
	%>
	<!--Jsp内置javaBean标签 创建对象  -->
	<jsp:useBean id="s" class="com.nocol.Student"></jsp:useBean>
	
	<!--为对象赋值  -->
	<jsp:setProperty property="name" name="s" value="nocol"/>
	<!--name对应setName，必须是setName -->
	
	<!--获取  -->
	<jsp:getProperty property="name" name="s"/>
	
	
	
	
</body>
</html>