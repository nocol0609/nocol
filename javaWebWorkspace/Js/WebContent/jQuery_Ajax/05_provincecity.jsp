<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>基于jQuery的ajax省市联动</title>
<script type="text/javascript" src="jquery-1.8.3.js"></script>
</head>
<body>
	<select id="province">
		<option>选择省份</option>
		<option>江西</option>
		<option>江苏</option>
	</select>

	<select id="city">
		<option>选择城市</option>
	</select>

	<script type="text/javascript">
		$("#province").change(function() {
			var province = $("#province option:selected").text();
			
			//清空城市
			$("#city option:gt(0)").remove();

			if ("选择省份" != province) {

				//alert(province);

				var url = "${pageContext.request.contextPath}/jQyery_city";
				var sendDate = {
					"province" : province
				};

				$.post(url, sendDate, function(backDate) {
					var $city = $(backDate).find("city");
					$city.each(function() {
						var city = $(this).text();
	
						var $cityOption = $("<option></option>");
						$cityOption.text(city);
						$("#city").append($cityOption);
					});
				});
			}

		});
	</script>
</body>
</html>