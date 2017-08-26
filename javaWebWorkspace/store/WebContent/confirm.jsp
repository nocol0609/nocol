<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>我的订单</title>
<link rel="stylesheet" href="css/common.css" />
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />
<link rel="stylesheet" href="css/orderSure.css" />
</head>
<body>
	<!--顶部-->
	<div class="top">
		<div class="top_center">
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
		<a href="index.jsp"><img src="images/logo.png" class="oneImg"></a>


		<div class="h3_right">
			<img src="images/play_03.png" alt="">
		</div>

	</div>
	<p class="orderButtom">填写并核对订单信息</p>
	<!--中间复杂部分-->
	<form action="addOrder" method="post">
	<div class="content">
		<div class="contentCenter">
			<div class="centerTop">
				<b style="font-size: 20px;">收货人信息</b>
				<p style="font-size: 15px;">
					收件人姓名：<input type="text" name="name"><br />
					<br /> 收件人地址：<input type="text" name="address"><br />
					<br /> 收件人电话：<input type="text" name="phone">
				</p>
			</div>
			<p class="singleP">
				<b>送货清单</b><span><a href="shopCart.jsp">返回修改购物车</a></span>
			</p>
			
			<div class="bigDiv">
				<div class="twoDiv">
					<b>商家：briup自营</b>
					<!--定义总价  -->
					<c:set var="money" value="0"></c:set>
					<!--定义商品数量  -->
					<c:set var="prodNum" value="0"></c:set>
					<c:forEach items="${sessionScope.cartmap }" var="entry">
						<br/>
						<ul class="oneUL">
							<li><img src="/BookStore/${entry.key.images }" class="pic">
								<p>${entry.key.cate_detail.category.name }&nbsp;&nbsp;${entry.key.cate_detail.name }&nbsp;&nbsp;${entry.key.name }&nbsp;&nbsp;</p>
								<p>
									<c:if test="${entry.value<=entry.key.stock }">
									<font>¥${entry.key.price }</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;×${entry.value }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;有货
									</c:if>
									<c:set var="money" value="${money+entry.key.price*entry.value }"></c:set>
									<c:set var="prodNum" value="${prodNum+1 }"></c:set>
									<c:if test="${entry.value>entry.key.stock }">
									<font>¥${entry.key.price }</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;×${entry.value }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;缺货
									</c:if>
								</p>
								<p>
									<c:if test="${entry.key.service_fg !=null }">
									<img src="images/icons/service_03.png" alt=""><span>${entry.key.service_fg  }</span>
									</c:if>
									
									<c:if test="${entry.key.service_myf !=null }">
									<img src="images/icons/service_05.png" alt=""><span>${entry.key.service_myf  }</span>
									</c:if>
									
									<c:if test="${entry.key.service_zt !=null }">
									<img src="images/icons/service_07.png" alt=""><span>${entry.key.service_zt  }</span>
									</c:if>
									
									<c:if test="${entry.key.service_th !=null }">
									<img src="images/icons/service_09.png" alt=""><span>${entry.key.service_th  }</span>
									</c:if>							
								</p></li>
								<br/>
							<li><pre>【赠品】  高级定制干花书签  随机  ×1</pre></li>
						</ul>
					</c:forEach>
				</div>
			</div>

			<div class="money">
				<span><font>${prodNum }</font>件商品，总商品金额：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;¥${money }</span>
				<span><img src="images/sureLogo_18.png" alt="">运费：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;¥0.00</span>
				<span>应付总额：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;¥${money }</span>
				<span>应付金额：<font>¥${money }</font><input  type="submit" value="提交订单" ></span>
			</div>
		</div>
	</div>
</form>
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
					<h1>客服中心</h1> <img src="images/qrcode_jprj.jpg" width="80px"
					height="80px">
					<p>抢红包、疑问咨询、优惠活动</p>
				</li>
			</ul>
		</div>
		<div class="f3_bottom">
			<p class="f3_links">
				<a href="#">关于我们</a>| <a href="#">联系我们</a>| <a href="#">友情链接</a>| <a
					href="#">供货商入驻</a>
			</p>
			<p>沪ICP备14033591号-8 杰普软件briup.com版权所有 杰普软件科技有限公司</p>
			<img src="images/police.png">
		</div>
	</div>
</body>
</html>