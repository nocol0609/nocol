<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>pageContext对象</title>
</head>
<body>
	<%
		//response.getWriter().write("是否相同？" + (out == pageContext.getOut()));
		//response.getWriter().write("是否相同？" + (session == pageContext.getSession()));
	%>
	<!-- pageContext作为域对象 -->

	<%
		//保存数据 ,默认情况下保存到page域中 
		/* pageContext.setAttribute("name", "nocol"); */
	%>
	
	<%  //保存到request域中(方式一)
		//request.setAttribute("name", "nocol");
	%>
	<%
		//保存数据 ,使保存到各内置对象域中
		 pageContext.setAttribute("name", "page"); //默认page域
		 pageContext.setAttribute("name", "request", pageContext.REQUEST_SCOPE);
	     pageContext.setAttribute("name", "session", pageContext.SESSION_SCOPE); 
	     pageContext.setAttribute("name", "context", pageContext.APPLICATION_SCOPE); 
	%>



	<!-- 获取数据 -->
	<%
		//page域中获取
		//String name=(String)pageContext.getAttribute("name");
		//out.write(name);
	%>
	
	<!--request域中获取数据  -->
	<%-- <%=request.getAttribute("name") %> --%>
	<%=pageContext.getAttribute("name",pageContext.REQUEST_SCOPE)%>
	
	<%=pageContext.getAttribute("name",pageContext.PAGE_SCOPE)%> 
	<%=pageContext.getAttribute("name",pageContext.SESSION_SCOPE)%>
	<%=pageContext.getAttribute("name",pageContext.APPLICATION_SCOPE)%> 
	<hr/>
	
	<!--findAttribute()自动搜索：
		page域->request域->session域->context域
	  -->
	<%=pageContext.findAttribute("name")%>
	
	<%
	//转发
	//request.getRequestDispatcher("/pageContext2.jsp").forward(request, response);
	//除page域没有其他都有
	%>
	<%
	//重定向
	response.sendRedirect(request.getContextPath()+"/pageContext2.jsp");
	//除session域和Context域有其他都没有（服务器没关，context一直存在）
	%>
</body>
</html>