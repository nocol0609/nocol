<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>安全中心</title>
<link rel="stylesheet" href="css/common.css"/>
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />
<link rel="stylesheet" href="css/newmain.css" />
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
    function changeImg(){   								
    	var img=$("#J_imgVcode");
    	img.src = img.src+"?num="+Math.random(); 	
   		window.location.href="/BookStore/forgetPassword.jsp";
   }
</script>

</head>
<body>
	<!--顶部-->
	<div class="top">
    	<div class="top_center">
    	<c:if test="${sessionScope.user == null}">
  			<ul class="top_lr">
            	<li><a href="login.jsp" style="color: red;">亲,请登入</a></li>
                <li><a href="register.jsp">免费注册</a></li>
            </ul>
  		</c:if>
    	<c:if test="${sessionScope.user != null}">
  			<ul class="top_lr">
            	<li><a>您好:&nbsp;&nbsp;${sessionScope.user.name }</a></li>
            </ul>
  		</c:if> 		
            <ul class="top_bars">
            	<li><a href="logout">退出</a>|</li>
                <li><a href="confirm.jsp">我的订单<span class="jt_down"></span></a>|</li>
                <li><a href="#">关注杰普<span class="jt_down"></span></a>|</li>
                <li><a href="index.jsp">网站导航<span class="jt_down"></span></a></li>
            </ul>
        </div>
    </div>
     <!--头部-->
    <div class="header3">
    	<a href="index.jsp"><img src="images/logo.png"></a>
    	<div class="h3_center">
        	<div class="search_box">
            	<input type="text"/>
                <span style="width: 100px;">搜索</span>
            </div>
            <p>
            	<c:forEach items="${applicationScope.allList }" var="category">
            		<a href="prodList?categoryName=${category.name }&categoryId=${category.id}">${category.name }</a>|
            	</c:forEach>
            </p>
        </div>
        <div class="h3_right">
        <c:if test="${sessionScope.user == null}">
        	<div class="myyy">
            	<a href="login.jsp">个人信息</a>
                <span class="sj_down"></span>
             </div>
            <div class="tsc">
            	<a href="login.jsp">去购物车结算</a>
                <span class="sj_right"></span>
            </div>
        </c:if> 
        <c:if test="${sessionScope.user != null}">
        	<div class="myyy">
            	<a href="userinfo.jsp">个人信息</a>
                <span class="sj_down"></span>
             </div>
            <div class="tsc">
            	<a href="shopCart.jsp">去购物车结算</a>
                <span class="sj_right"></span>
            </div>
        </c:if>  
        </div>
    </div>
    <!--头部导航-->
    <div class="nav_top">
    	<div class="nav_top_center">
            <div>
                全部图书分类
            </div>
             <ul>
            	<c:forEach items="${applicationScope.allList }" var="category">
            		<li><a href="prodList?categoryName=${category.name }&categoryId=${category.id}">${category.name }</a></li>
            	</c:forEach>
            </ul>
        </div>
    </div>
    <div class="container4">
    	<div class="register_box">
    			<div class="head">
    				<h3>找回密码</h3>
    			</div>
    			<div class="security">
    				<ul class="step">
    					<li class="green">
    						<span class="line">1</span>
    						<span>填写账户名</span>
    					</li>
    					<li>
    						<span class="line">2</span>
    						<span>身份验证</span>
    					</li>
    					<li>
    						<span class="line">3</span>
    						<span>设置密码</span>
    					</li>
    					<li>
    						<span class="line">4</span>
    						<span>完成</span>
    					</li>
    				</ul>
    				<form action="forget1" id="form">
    					<ul class="list">
    						<li>
    								<input id="J_euserName" name="userName" type="text" placeholder="请输入用户名" />
    								<div class="name">用户名</div>
    								<span id="J_eUserNameTipImg" class="icon"></span>
    								<div id="J_eUserNameTipInfo" class="ltip"></div>  								
    						</li>
    						<li>
    						<div class="name">图形验证码:</div>
    						<input id="J_eUserNameCode" name="checkCode" type="text" placeholder="请输入验证码"/>
    						<span class="code">
    							<img id="J_imgVcode" src="ValiImg" height="38" width="85"/>
    						</span>
    						<a id="J_vcodeImgBtn" class="more" href="#" onclick="changeImg()">换一张</a>
    			
    						<div id="J_eUserNameCodeTipInfo" class="ltip"></div>
    						</li>
    						<li>
    							<div class="name"></div>
    							<input id="J_eUserNameSubmit" type="submit" value="下一步" class="btn_red"><span>${msg }</span>
    						</li>    						    											
    					</ul>      					
    				</form>
    			</div>
    	</div>
    </div>
 
    <!--脚部-->
    <div class="footer3">
    	<div class="f3_top">
        	<div class="f3_center">
                <div class="ts1">品目繁多 愉悦购物</div>
                <div class="ts2">正品保障 天天低价</div>
                <div class="ts3">极速物流 特色定制</div>
                <div class="ts4">优质服务 以客为尊</div>
            </div>
        </div>
        <div class="f3_middle">
        	<ul class="f3_center">
            	<li class="f3_mi_li01">
                	<h1>购物指南</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>配送方式</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>支付方式</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>售后服务</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>服务保障</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li06">
                	<h1>客服中心</h1>
                    <img src="images/qrcode_jprj.jpg" width="80px" height="80px">
                    <p>抢红包、疑问咨询、优惠活动</p>
                </li>
            </ul>
        </div>
         <div class="f3_bottom">
        	<p class="f3_links">
                <a href="#">关于我们</a>|
                <a href="#">联系我们</a>|
                <a href="#">友情链接</a>|
                <a href="#">供货商入驻</a> 
           	</p>
            <p>沪ICP备14033591号-8 杰普briup.com版权所有 杰普软件科技有限公司 </p>
          	<img src="images/police.png">
        </div>
    </div>

</body>
</html>