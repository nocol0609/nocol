<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.nocol.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>java标准标签库</title>
</head>
<body>
	<%
		Student student=new Student("nocol",18);
		pageContext.setAttribute("student", student);
		
		//List
		List<Student> list=new ArrayList<Student>();
		list.add(new Student("tom",20));
		list.add(new Student("jack",25));
		list.add(new Student("rose",24));
		pageContext.setAttribute("list", list);
		
		//Map
		HashMap<String,Student> map=new HashMap<String,Student>();
		map.put("001",new Student("tom",20));
		map.put("002",new Student("jack",25));
		map.put("003",new Student("rose",24));
		pageContext.setAttribute("map", map);
	%>

	<!--set标签：保存数据（默认保存到page域中）  -->
	<c:set var="name" value="nocol"></c:set>
	${name}
	<hr/>
	
	<%
		String name=null;
		pageContext.setAttribute("name", name);
	%>
	
	${name}<br/>
	<!--out标签：获取数据（从域中获取）  
		EL表达式输出时若为null则不输出,out标签输出时若为null则可以输出默认值
		-->
	<c:out value="${name}" default="<h3>name值为空</h3>" escapeXml="false" ></c:out>
	<hr/>
	
	<!--if标签：单条件判断  -->
	<c:if test="${10>5}">
		若test为true则显示，若为false则不显示(支持EL表达式)
	</c:if>
	<hr/>
	
	<!--choose标签+when标签+otherwise标签:多条件判断  -->
	<c:set var="Score" value="88"></c:set>
	<c:choose>
	<c:when test="${Score>90&&Score<=100 }">优秀</c:when>
	<c:when test="${Score>80&&Score<=90 }">良好</c:when>
	<c:when test="${Score>70&&Score<=80 }">一般</c:when>
	<c:when test="${Score>60&&Score<=70 }">及格</c:when>
	<c:otherwise>不及格</c:otherwise>
	</c:choose>
	<hr/>
	<!--forEach标签：遍历集合  -->
	<%--
      begin="": 从哪个元素开始遍历，从0开始.默认从0开始
      end="":   到哪个元素结束。默认到最后一个元素
      step="": 步长    (每次加几)  ，默认1
      items="": 需要遍历的数据（集合） 
      var="": 每个元素的名称 
      varStatus="": 当前正在遍历元素的状态对象。（count属性：当前位置，从1开始）
     --%>
	<c:forEach  items="${list }" var="Student" varStatus="varStu">
		序号：${varStu.count}--姓名：${Student.name }--年龄：${Student.age}<br/>
	</c:forEach>
	
	<hr/>
	<c:forEach items="${map }" var="entry" >
		${entry.key}--姓名：${entry.value.name}--年龄：${entry.value.age}<br/>
	</c:forEach>
	<hr/>
	<!--forTokens标签：循环特殊标签  -->
	<%
		String str="java-oracle-mybatis-servlet";
		pageContext.setAttribute("str", str);
	%>
	<c:forTokens items="${str }" delims="-" var="s">
		${s}<br/>
	</c:forTokens>
	<hr/>
	<!--redirect标签：重定向  -->
	<c:redirect url="http://www.baidu.com"></c:redirect>
</body>
</html>