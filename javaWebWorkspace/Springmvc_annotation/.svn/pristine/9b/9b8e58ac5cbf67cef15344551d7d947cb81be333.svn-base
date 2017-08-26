<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body> 
    普通用户 
	<form action="${pageContext.request.contextPath}/person/regist.action" method="POST">
		<table border="1">
			<tr>
				<th>姓名</th>
				<td><input type="text" name="user.name" value="${user.name}"/></td>
			</tr>
			<tr>
				<th>密码</th>
				<td><input type="text" name="user.password" value="${!empty user.password?user.password:'2222'}"></td>
			</tr>
			<tr>
				<th>入职时间</th>
				<td><input 
						type="text"  
						name="user.date" 
						value="${!empty user.date?user.date:'2017-6-22-00:00:00' }"/>
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="普通用户注册"/>
				</td>
			</tr>
		</table>	
	</form>	
	
	 管理员用户 
	<form action="${pageContext.request.contextPath}/person/regist.action" method="POST">
		<table border="1">
			<tr>
				<th>姓名</th>
				<td><input type="text" name="admin.name" value="${admin.name}"/></td>
			</tr>
			<tr>
				<th>密码</th>
				<td><input type="text" name="admin.password" value="${!empty admin.password?admin.password:'2222'}" ></td>
			</tr>
			<tr>
				<th>入职时间</th>
				<td><input 
						type="text"  
						name="admin.date" 
						value="${!empty admin.date?admin.date:'2017-6-22-00:00:00' }"/>
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="管理员用户注册"/>
				</td>
			</tr>
		</table>	
	</form>	
	
  </body>
</html>
