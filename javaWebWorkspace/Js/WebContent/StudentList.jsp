<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>分页查询所有学生</title>
<!--引入css文件 顺序不限  -->
<link rel="stylesheet" href="easyui/themes/default/easyui.css" type="text/css"></link>
<link rel="stylesheet" href="easyui/themes/icon.css" type="text/css"></link>
<!--引入js文件 顺序有限  -->
<script type="text/javascript" src="easyui/jquery-1.8.3.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="easyui/easyui-lang-zh_CN.js"></script>
</head>
<body>
	<table id="dg" style="width:800px"></table>
	<script type="text/javascript">
		$("#dg").datagrid({
			url : '${pageContext.request.contextPath}/student',  
		    columns : [[    
				        {field:'id',title:'学号',width:100},    
				        {field:'name',title:'姓名',width:100},    
				        {field:'gender',title:'性别',width:100},    
				        {field:'major',title:'专业',width:100},    
				        {field:'grade',title:'年级',width:100}  
				 
		    ]],
		    fitColumns : true,   //等分列宽
		    singleSelect : true, //单独行
		    pagination : true, //分页组件（内置分页）
		    pageNumber : 1, //当前页号
		    pageSize : 3,  //每页 显示三条
		    pageList : [3] //可供选择3条
		});
	</script>
</body>
</html>