<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>EL表达式计算</title>  
  </head>
  
  <body>
    <%--
    	1)算术表达式
    	  +  -  *  /
     --%>
     ${10+5 }<br/>
     ${10*5 }
     <hr/>
     <%--
    	2)比较运算
    	>  <  >=  <=  ==   !=
     --%>
     ${10>5 }<br/>
     ${10<5 }<br/>
     ${10!=10 }
     <hr/>
     <%--
    	3)逻辑运算
    	 &&  ||  !
     --%>
     ${true && false }<br/>
     ${true || false }<br/>
     ${!false }<br/>
     <hr/>
      <%--
    	4)判空
    	null 或 空字符串:  empty
     --%>
     <%
     	//String name = "eric";
     	//String name = null;
     	String name = "";
     	pageContext.setAttribute("name",name);
      %>
      判断null： ${name==null }<br/>
      判断空字符： ${name=="" }<br/>
     判空：  ${name==null || name=="" }
     另一种判空写法： ${empty name }

  </body>
</html>
