<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>基于Json数据载体的二联动</title>

<script type="text/javascript">
	function CreatAjax() {
		var ajax = null;
		ajax = new XMLHttpRequest();
		return ajax;
	}
</script>

<script type="text/javascript">
	window.onload = function() {
		document.getElementById("province").onchange = function() {
			//获取option标签中的索引(从0开始)
			var index = this.selectedIndex;
			//获取索引处的option标签
			var optionNode = this[index];
			//获取标签中的内容
			var province = optionNode.innerHTML;
			if ("选择省份" != province) {
				var ajax = CreatAjax();
				var method = "Post";
				var url = "${pageContext.request.contextPath}/json";
				ajax.open(method, url);

				//设置AJAX请求头为POST，他会将请求体中的汉字自动进行UTF-8的编码
				ajax.setRequestHeader("content-type",
						"application/x-www-form-urlencoded");

				var content = "province=" + province;
				ajax.send(content);
			}

			//定位城市
			var cityNode = document.getElementById("city");
			cityNode.options.length = 1;

			ajax.onreadystatechange = function() {
				if (ajax.readyState == 4) {
					if (ajax.status == 200) {
						
						//java生成的Json格式的数据
						var JsonJava = ajax.responseText;
						//调用函数转化为Js格式的Json数据格式
						var JsonJs=eval("("+JsonJava+")");
						//alert(JsonJava);
						var array = jsonJS.cityList;
						var size = array.length;
						//alert(size); 
						for(var i=0;i<size;i++){
							var city = array[i];
							var cityOption = document.createElement("option");
							cityOption.innerHTML = city;
							//将option添加到城市下
							cityNode.appendChild(cityOption);
						}
					}
				}
			}
		}
	}
</script>
</head>
<body>
	<!-- <form action=""\.enctype="application/x-www-form-urlencoded"></form>-->

	<select id="province" style="width: 100px">
		<option>选择省份</option>
		<option>江西</option>
		<option>江苏</option>
	</select> &nbsp;&nbsp;&nbsp;
	<select id="city" style="width: 100px">
		<option>选择城市</option>
	</select>
</body>
</html>