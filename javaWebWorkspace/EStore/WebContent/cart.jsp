<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<script type="text/javascript">
  		function changeNum(id,obj,oldnum){
  			if(!/^[1-9]\d*$/.test(obj.value)){
  				alert("购买数量必须为正整数!");
  				obj.value=oldnum;
  				return;
  			}
  			window.location.href=" changCartProd?id="+id+"&buynum="+obj.value;
  		}
  	</script>
  </head>
  <body style="text-align: center;" >
  	<h1>我的购物车</h1>
  	<div align="right">
  		<a href="productList">继续购物</a>
  		<a href="clearCart">清空购物车</a>
  		<a href="addOrder.jsp"><img src="img/gotoorder.bmp"/></a>
  	</div>
  	
  	<hr>
  	<c:if test="${empty sessionScope.cartmap}">
  		<h2><a href="productList">购物车空空如也,请先去挑点东西吧~~~</a></h2>
  	</c:if>
  	<c:if test="${not empty sessionScope.cartmap}">
		<table width="100%" border="1" style="text-align: center">
			<tr>
				<th>缩略图</th>
				<th>商品名称</th>
				<th>商品种类</th>
				<th>商品单价</th>
				<th>购买数量</th>
				<th>库存状态</th>
				<th>总价</th>
				<th>删除</th>
			</tr>
			<c:set var="money" value="0" />
			<c:forEach items="${sessionScope.cartmap}" var="entry">
				<tr>
					<td><img src="/img?imgurl=${entry.key.imgurl }"/></td>
					<td>${entry.key.name }</td>
					<td>${entry.key.category }</td>
					<td>${entry.key.price }元</td>
					<td><input type="text" value="${entry.value }" style="width: 30px" onchange="changeNum('${entry.key.id }',this,${entry.value })"/>件</td>
					<td>
						<c:if test="${entry.value<=entry.key.pnum}">
							<font color="blue">有货</font>
						</c:if>
						<c:if test="${entry.value>entry.key.pnum}">
							<font color="red">缺货</font>
						</c:if>
					</td>
					<td>
						${entry.key.price * entry.value }元
						<c:set var="money" value="${money + entry.key.price * entry.value }"/>
					</td>
					<td>
						<a href="delCartProd?id=${entry.key.id }">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<div align="right">
			<font color="red" size=6">总价:${money }元</font>
		</div>
  	</c:if>
  </body>
</html>
