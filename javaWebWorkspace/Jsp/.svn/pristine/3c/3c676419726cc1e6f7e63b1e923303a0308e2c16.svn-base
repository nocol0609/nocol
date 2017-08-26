<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL表达式</title>
</head>
<body>
	<%
		String name="nocol";
		pageContext.setAttribute("name", name);//存放在page域中

		pageContext.setAttribute("name", name,pageContext.REQUEST_SCOPE);//存放在requst域中
	%>
	
	<%=name %>
	<br/>
	El表达式:${name}
	
	<!-- 
	${name}能将存放在不同域中对应name的值取出，类似于pageContext.findAtrribute("name);
	 -->
	<hr/> 
	 <!--从指定的域中获取  -->
	EL表达式:${pageScope.name}<br/>
	EL表达式:${requestScope.name}
	<!--
	${requestScope.name}等价于：
		<%-- <%=pageContext.getAttribute("name",pageContext.REQUEST_SCOPE)%> --%>
	  -->
	
</body>
</html>