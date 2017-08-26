<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传</title>
</head>
<body>
    <!--multipart/form-data：表示文件是多段式提交  -->
	<form action="more" method="post" enctype="multipart/form-data">
	用户名：<input type="text" name="name"><br/>
	上传文件：<input type="file" name="photo"><br/>
	<input type="submit" value="上传"> 
	</form>
</body>
</html>