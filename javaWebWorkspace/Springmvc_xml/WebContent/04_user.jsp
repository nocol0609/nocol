<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/submit.action" method="post">
		<table border="1px">
			<tr>
				<th>姓名</th>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<th>性别</th>
				<td>
					男<input type="radio" name="male">
					女<input type="radio" name="female" checked="checked">
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="提交"></td>
			</tr>
		</table>
	</form>
</body>
</html>