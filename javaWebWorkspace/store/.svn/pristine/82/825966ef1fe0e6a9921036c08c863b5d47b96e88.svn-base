//----------------------注册表单校验-----------------------------------

/*--------------------------------------------------------------------------  */
function checkPassword() {
	var password = $("input[type='password'][name='password']").val();
	var passReg = /^[a-z0-9]{6}$/
	if (passReg.test(password)) {
		$("span[id='password']").html(
				"<img src='css/easyUI/icons/ok.png'></img>");
		$("span[id='pwdMsg']").html("");
		return true;
	} else {
		$("span[id='password']").html(
				"<img src='css/easyUI/icons/no.png'></img>");
		$("span[id='pwdMsg']").html("密码由6个数字或字母组成".fontcolor("red"));
		return false;
	}
}
/*------------------------------------------------------------------------------  */
function checkZip() {
	var postcode = $("input[type='text'][name='zip']").val();
	var zipReg = /^[1-9]\d{5}(?!\d)$/
	if (zipReg.test(postcode)) {
		$("span[id='zip']").html("<img src='css/easyUI/icons/ok.png'></img>");
		$("span[id='zipMsg']").html("");
		return true;
	} else {
		$("span[id='zip']").html("<img src='css/easyUI/icons/no.png'></img>");
		$("span[id='zipMsg']").html("邮编必须由6位数字组成".fontcolor("red"));
		return false;
	}
}
/*-----------------------------------------------------------------------------------  */
function checkAddress() {
	var address = $("input[type='text'][name='address']").val();
	if (address.trim().length == 0) {
		$("span[id='address']").html(
				"<img src='css/easyUI/icons/no.png'></img>");
		$("span[id='addlMsg']").html("地址不能为空".fontcolor("red"));
		return false;
	} else {
		$("span[id='address']").html(
				"<img src='css/easyUI/icons/ok.png'></img>");
		$("span[id='addlMsg']").html("");
		return true;
	}
}
/*--------------------------------------------------------------------------------  */
function checkTelephone() {
	var tel = $("input[type='text'][name='phone']").val();
	var telReg = /^1(3|4|5|7|8)\d{9}$/
	if (telReg.test(tel)) {
		$("span[id='phone']").html("<img src='css/easyUI/icons/ok.png'></img>");
		$("span[id='telMsg']").html("");
		return true;
	} else {
		$("span[id='phone']").html("<img src='css/easyUI/icons/no.png'></img>");
		$("span[id='telMsg']").html("无效的手机号码".fontcolor("red"));
		return false;
	}
}
/*--------------------------------------------------------------------------------- */
function checkEmail() {
	var email = $("input[type='text'][name='email']").val();
	var emailReg = /^[\w\-\.]+@[\w\-\.]+(\.\w+)+$/
	if (emailReg.test(email)) {
		$("span[id='email']").html("<img src='css/easyUI/icons/ok.png'></img>");
		$("span[id='emailMsg']").html("");
		return true;
	} else {
		$("span[id='email']").html("<img src='css/easyUI/icons/no.png'></img>");
		$("span[id='emailMsg']").html("无效的邮箱".fontcolor("red"));
		return false;
	}
}
/*-----------------------------------------------------------------------------------  */
function checkRegist() {
	if (!checkPassword() || !checkZip() || !checkAddress()
			|| !checkTelephone() || !checkEmail()) {
		return false;
	}
}

// ----------------------登录表单校验--------------------------------

function checkLoginPassword() {
	var password = $("input[type='password'][name='password']").val();
	if (password.trim().length == 0) {
		$("span[id='loginMsg']").html("密码不能为空".fontcolor("red"));
		return false;
	}else{
		$("span[id='loginNAP']").html("");
		return true;
	}
}

function checkLogin() {
	$("span[id='loginMsg']").html("");
	if(!checkLoginPassword()) {
		$("span[id='loginNAP']").html("");
		$("span[id='loginMsg']").html("账号和密码不能为空".fontcolor("red"));
		return false;
	}
}
