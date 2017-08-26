<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jQuery解析xml</title>
<script type="text/javascript" src="jquery-1.8.3.js"></script>
</head>
<body>
<input type="button" value="解析服务器响应的xml文件"/>
	
	<script type="text/javascript">
	$(":button").click(function(){
		
		var url="${pageContext.request.contextPath}/jQuery_Ajax/03_city.xml";
		var sendDate=null;
		$.get(url,sendDate,function(backDate){//此时backDate就是一个xml文件对象（js对象）
			var $city=$(backDate).find("city");
			$city.each(function(){
				alert($(this).text());
			});
		});
	});
	</script>

</body>
</html>