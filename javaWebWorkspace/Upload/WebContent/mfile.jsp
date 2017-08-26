<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>多文件上传</title>
<script type="text/javascript">
	function add() {
		//创建出要添加的行
		var trNode = document.createElement("tr");
		trNode.innerHTML = "<input type='file' name='photo'></td><td><input type='button' value='删除' onclick='deleteFile(this)'></td>";
		//找到最后一行
		var lastRow = document.getElementById("lastRow");
		//插入
		lastRow.parentNode.insertBefore(trNode, lastRow);
	}

	function deleteFile(obj) {
		obj.parentNode.parentNode.parentNode.removeChild(obj.parentNode.parentNode);
	}
</script>
</head>
<body>
	<form action="mfile" method="post" enctype="multipart/form-data">
		<table border="1">
			<tr>
				<th align="center">文件上传</th>
			</tr>
			<tr>
				<td><input type="file" name="photo"></td>
				<td><input type="button" value="添加" onclick="add()"></td>
			</tr>
			<tr id="lastRow">
				<td colspan="2" align="center"><input type="submit" value="上传"></td>
			</tr>
		</table>
	</form>
</body>
</html>