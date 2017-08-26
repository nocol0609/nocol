<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body> 
    <form action="${pageContext.request.contextPath}/emp/deleteAll.action" method="POST">
    	<table border="2" align="center">
    		<tr>
    			<th>编号</th>
    			<th>姓名</th>
    		</tr>
    		<tr>
    			<td><input type="checkbox" name="ids" value="1"/></td>
    			<td>tom</td>
    		</tr>
    		<tr>
    			<td><input type="checkbox" name="ids" value="2"/></td>
    			<td>jack</td>
    		</tr>
    		<tr>
    			<td><input type="checkbox" name="ids" value="3"/></td>
    			<td>rose</td>
    		</tr>
    		<tr>
    			<td><input type="checkbox" name="ids" value="4"/></td>
    			<td>alice</td>
    		</tr>
    		<tr>
    			<td><input type="checkbox" name="ids" value="5"/></td>
    			<td>nocol</td>
    		</tr>
    		<tr>
    			<td>
    				<input type="submit" value="删除"/>
    			</td>
    		</tr>
    	</table>
    </form>
  </body>
</html>
