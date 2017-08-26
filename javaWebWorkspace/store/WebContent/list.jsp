<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>电子商务-首页</title>
<link rel="stylesheet" href="css/common.css"/>
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />

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
            	<li><a href="user/logout">退出</a>|</li>
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
                <span>搜索</span>
            </div>
             <p>
            	<c:forEach items="${applicationScope.allList }" var="category">
            		<a href="product/prodList?categoryName=${category.name }&categoryId=${category.id}">${category.name }</a>|
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
            		<li><a href="product/prodList?categoryName=${category.name }&categoryId=${category.id}">${category.name }</a></li>
            	</c:forEach>
            </ul>
        </div>
    </div>
    
    <!--内容-->
    <div class="container4">
    	<!--热卖-->
    	<div class="c4_b1">
        	<ul class="c4_b1_boxes">
        		<c:forEach items="${applicationScope.hotList }" var="hotProduct">
            	<li>
                	<a href="product/prodInfor?id=${hotProduct.id }"><img src="${hotProduct.images }"></a>
                    <div class="c4_b1_box_txt">
                    	<p>${hotProduct.name } </p>
                        <h1>活动价：<b>${hotProduct.price }</b></h1>
                        <h2><a href="product/prodInfor?id=${hotProduct.id }">立即抢购</a></h2>
                    </div>
                </li>
               </c:forEach>
            </ul>
        </div>
        <div class="c4_b2">
            <h1 class="c4_b2_x">
            	<a href="#">${requestScope.categoryName }&nbsp;&nbsp;></a>
                <span><a href="#">${requestScope.categoryDetailName }</a></span>
            </h1> 
                
            <ul class="c4_b2_y">
            	<li>
                	<span class="search_key">价格：</span>
                    <span class="search_val">0-99</span>
                    <span class="search_del"></span>
                </li>
                <li>
                	<span class="search_key">出版社：</span>
                    <span class="search_val">清华出版社</span>
                    <span class="search_del"></span>
                </li>
            </ul>
        </div>
        <div class="c4_b3">
        	<h1></h1>
        	<div>
            	<ul class="c4_b3_search">
                	<li class="c4_b3_name">价格：</li>
                    <li class="c4_b3_vals">
                    	<c:forEach items="${applicationScope.priceList }" var="priceList">
                    		<a href="#">${priceList.min_price }-${priceList.max_price }</a>
                    	</c:forEach>                    
					</li>
                </ul><ul class="c4_b3_search">
                	<li class="c4_b3_name">出版社：</li>
                    <li class="c4_b3_vals">
                    	<c:forEach items="${applicationScope.publishList }" var="publishList">
                    		<a href="#">${publishList.name }</a>
                    	</c:forEach>
					</li>
                </ul>
            </div>
        </div>
    	<div class="c4_b4">
        	<div class="c4_b4_x">
            	<ul class="c4_b4_nav">
                	<li class="current"><a href="#">默认</a></li>
                    <li><a href="#">销量</a></li>
                    <li><a href="#">价格</a></li>
                    <li><a href="#">新品</a></li>
                </ul>
                <div class="c4_b4_search">
                	<input type="text"/><span>确认</span>
                </div>
                <div class="c4_b4_pages">
                	
                </div>
				<div class="clear"></div>
            </div>
             <div class="c4_b4_y">
            	<ul>
                    <li><input type="checkbox"> 仅显示有货</li>
                </ul>               
            </div>
       	</div>
    	<!--商品列表-->
        <div class="c4_b5">	
        	<div class="c4_b5_content">
            	<ul class="c4_b5_c_boxes">
            		<c:if test="${requestScope.categoryDetailName ==null }">            
            			<c:forEach items="${requestSocpe.cateProdList }" var="cateProdList">
            			<%-- <c:if test="${requestScope.categoryName == cateProdList.cate_detail.category.name  }"> --%>
            			<li class="c4_b5_c_box">
                    	<!--图片-->
                    	<div class="c4_b5_c_box_pic">
                        	<div class="c4b5_pic_view">
                            	<a href="product/prodInfor?id=${cateProdList.id }"><img src="${cateProdList.images }"></a>
                            </div>
                        </div>
                        <!--价钱-->
                        <div class="c4_b5_c_box_txt">
                        	<h1>￥ ${cateProdList.price }</h1>
                            <h2><a href="product/prodInfor?id=${cateProdList.id }">${cateProdList.name }</a></h2>
                        </div>
                        <!--购买等操作-->
                        <div class="c4b5_el">
                        	<div class="c4b5_el_x">
                            	<span class="wjx01"></span>
                            </div>
                        </div>
                        <ul class="c4b5_option">
                                <li class="shopcar_box"><span class="shopcar01"></span><a href="javascript:void(0)" onclick="addShopCart('book_1')">加入购物车 </a></li>
                        </ul>                                         
                    </li>
                   <%--  </c:if>  --%>          			
            			</c:forEach>           			
            		</c:if>
            		
            		<c:if test="${requestScope.categoryDetailName !=null  }">
            		<c:forEach items="${requestScope.map }" var="map">
                		<c:if test="${requestScope.categoryDetailName == map.key.name }">
                			<c:forEach items="${map.value }" var="prodList">
                	<li class="c4_b5_c_box">
                    	<!--图片-->
                    	<div class="c4_b5_c_box_pic">
                        	<div class="c4b5_pic_view">
                            	<a href="product/prodInfor?id=${prodList.id }"><img src="${prodList.images }"></a>
                            </div>
                        </div>
                        <!--价钱-->
                        <div class="c4_b5_c_box_txt">
                        	<h1>￥ ${prodList.price }</h1>
                            <h2><a href="product/prodInfor?id=${prodList.id }">${prodList.name }</a></h2>
                        </div>
                        <!--购买等操作-->
                        <div class="c4b5_el">
                        	<div class="c4b5_el_x">
                            	<span class="wjx01"></span>
                            </div>
                        </div>
                        <c:if test="${sessionScope.user != null}">
                        <ul class="c4b5_option">
                                <li class="shopcar_box"><span class="shopcar01"></span><a href="product/addCart?id=${prodList.id}&number=1" >加入购物车 </a></li>
                        </ul>
                        </c:if>
                        <c:if test="${sessionScope.user == null}">
                        <ul class="c4b5_option">
                                <li class="shopcar_box"><span class="shopcar01"></span><a href="login.jsp" >加入购物车 </a></li>
                        </ul>
                        </c:if>                                                                               
                    </li>
                    	</c:forEach>
                    </c:if>
                   </c:forEach>
                   </c:if>        
                </ul>
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