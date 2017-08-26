<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  <body>
  	<font color="red"><h1>${prod.name }</h1><hr></font>
  	<table width="50%">
  		<tr>
  			<td><img src="upload/a.jpg" style="width: 110px;height: 110px"/></td>
  			<td>
  				商品名称:${prod.name }<br>
  				商品种类:${prod.category }<br>
  				商品库存:${prod.pnum }<br>
  				商品价格:${prod.price }<br>
  				商品描述:${prod.description }<br>
  				<a href="addCart?id=${prod.id }"><img src="img/buy.bmp"/></a><br>
  			</td>
  		</tr>
  	</table>
  </body>
</html>
