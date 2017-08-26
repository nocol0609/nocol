<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.nocol.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL表达式输出对象属性</title>
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
	EL输出对象属性:<br/>
		${student.name}--${student.age}  
		<!--
		${student.name}:  点相当于调用getXxx()方法
						name不是Student类中的属性，而是获取name属性的方法,即和属性名无关
		  -->
		<hr/>
	EL输出List集合:<br/>
		${list[0].name}--${list[0].age}<br/>
		${list[1].name}--${list[1].age}<br/>
		${list[2].name}--${list[2].age}<br/>
		<!--中括号相当于调用get(参数)方法  -->
		<hr/>
	EL输出map集合:<br/>
		${map['001'].name}--${map['001'].age}<br/>
		${map['002'].name}--${map['002'].age}<br/>
		${map['003'].name}--${map['003'].age}<br/>
</body>
</html>