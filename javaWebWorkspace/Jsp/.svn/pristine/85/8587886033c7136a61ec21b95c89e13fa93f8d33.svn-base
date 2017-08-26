<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>内置标签</title>
</head>
<body>
	转发--以前写法:<br/>
	<%
		//request.getRequestDispatcher("/el2.jsp").forward(request, response);
	%>
	用jsp内置标签:<br/>
	
	<%-- 
	<!--带参转发  -->
	<jsp:forward page="/action2.sp">
		<jsp:param value="nocol" name="name"/> 
		<jsp:param value="123" name="pwd"/> 
	</jsp:forward> 
	--%>
	
	
	
	<!--包含(动态包含):编译后要包含的内容是通过函数调用之后和主页一起显示，
		而包含指令@include则是静态的把包含内容和主页内容融在一起 
		且动态包含可传参数而静态包含不能传参 -->
	<jsp:include page="/common/header.jsp">
		<jsp:param value="Kyurie" name="name"/>
	</jsp:include><br/>
	主页内容
</body>
</html>