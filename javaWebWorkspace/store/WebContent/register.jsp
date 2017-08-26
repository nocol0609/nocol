<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>电子商务-注册页</title>
<link rel="stylesheet" href="css/common.css" />
<link rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/check.js"></script>
</head>
<body>
	<div class="container2">
		<div class="header2">
			<div>
				<a href="#"><img class="logo" src="images/logon_register.png"></a>
			</div>
			<div>
				<ul class="tabs">
					<li class="phone current"><a href="#">用手机登陆</a></li>
				</ul>
			</div>
			<div class="tlg">
				已有账号 <a href="login.jsp">登陆</a>
			</div>
		</div>
		<form action="${pageContext.request.contextPath }/user/regist.action" method="post" onsubmit="return checkRegist()" >
			<div class="content2">
				<ul class="reg_box">
					<li><span><b>*</b>用户名：</span> <input type="text" name="name"
						onblur="checkName()" /> <span id="name" style="width: 15px"></span><span
						id="nameMsg" style="width: 185px"></span></li>
					<li><span><b>*</b>密码：</span> <input type="password"
						name="password" onblur="checkPassword()" /> <span id="password"
						style="width: 15px"></span><span id="pwdMsg" style="width: 145px"></span></li>
					<li><span><b>*</b>邮编：</span> <input type="text" name="zip"
						onblur="checkZip()" /> <span id="zip" style="width: 15px"></span><span
						id="zipMsg" style="width: 135px"></span></li>
					<li><span><b>*</b>地址：</span> <input type="text" name="address"
						onblur="checkAddress()" /> <span id="address" style="width: 15px"></span><span
						id="addlMsg" style="width: 80px"></span></li>
					<li><span><b>*</b>电话：</span> <input type="text"
						name="phone" onblur="checkTelephone()" /> <span id="phone"
						style="width: 15px"></span><span id="telMsg" style="width: 80px"></span></li>
					<li><span><b>*</b>电子邮箱：</span> <input type="text" name="email"
						onblur="checkEmail()" /> <span id="email" style="width: 15px"></span><span
						id="emailMsg" style="width: 70px"></span></li>
				</ul>
				<p>
					<input type="checkbox" checked /> 我已阅读并同意 <a href="#">用户注册协议</a>
				</p>
				<input class="btn_submit" type="submit" value="立即注册" />
		</form>
	</div>
	</div>
<script type="text/javascript">
	function checkName() {
		var name = $("input[type='text'][name='name']").val();
		var nameReg = /^[a-z0-9_-]{3,16}$/
		if (nameReg.test(name) && name.trim().length != 0 && !name == "") {
			$.ajax({
				type : "POST",
				url : "${pageContext.request.contextPath}/user/checkName.action?name="+name+"",
				sendDate : {
					"name" : name
				},
				success : function(backDate) {
					if ("该用户不存在" == backDate) {
						$("span[id='name']").html(
								"<img src='css/easyUI/icons/ok.png'></img>");
						$("span[id='nameMsg']").html("");
						return true;
					} else if ("该用户已存在" == backDate) {
						$("span[id='name']").html(
								"<img src='css/easyUI/icons/no.png'></img>");
						$("span[id='nameMsg']").html(
								"<font style='width: 90px'>该用户已存在</font>");
						return false;
					}
				}
			});
		} else if (!nameReg.test(name)) {
			$("span[id='name']").html("<img src='css/easyUI/icons/no.png'></img>");
			$("span[id='nameMsg']").html("用户名最少由3个数字或字母组成".fontcolor("red"));
			return false;
		}
	}
	
</script>
</body>
</html>