<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index page</title>
</head>
<body>
	index page
	<hr>
	welcome：<shiro:principal></shiro:principal>
	<br>
	<shiro:hasRole name="user">
	<a href="${pageContext.request.contextPath }/user.jsp">user page</a>
	</shiro:hasRole>
	<br>
	<shiro:hasRole name="admin">
	<a href="${pageContext.request.contextPath }/admin.jsp">admin page</a>
	</shiro:hasRole>
	<br>
	<!--下面链接测试shiro注解权限  -->
	<a href="${pageContext.request.contextPath }/shiro/annotation.action">annotationRole</a>
	<br>
	<a href="${pageContext.request.contextPath }/shiro/logout.action">logout</a>
</body>
</html>