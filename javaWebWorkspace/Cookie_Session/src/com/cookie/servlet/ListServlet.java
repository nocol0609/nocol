package com.cookie.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookie.bean.Product;
import com.cookie.dao.ProductDao;

public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListServlet() {
		super();
		// TODO Auto-geerated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");

		// 读取数据库查询所有商品
		ProductDao dao = new ProductDao();
		List<Product> list = dao.findAll();
		// 显示数据
		String html = "";
		html += "<html>";
		html += "<head>";
		html += "<title>显示商品列表</title>";
		html += "</head>";
		html += "<body>";
		html+="<table border='1' align='center' width='600px'>";
		html += "<tr>";
		html += "<th>编号</th><th>商品名称</th><th>商品型号</th><th>商品价格</th>";
		html += "</tr>";
		//遍历商品
		if(list!=null){
			for (Product product : list) {
				html += "<tr>";
				// /Cookie_Session/DetailServlet?id=1 访问DetailSErvlet的servlet程序，同时传递 名为id，值为1 的参数
				html += "<td>"+product.getId()+"</td><td><a href='"+request.getContextPath()+"/DetailServlet?id="+product.getId()+"'>"+product.getName()+"</a></td><td>"+product.getType()+"</td><td>"+product.getPrice()+"</td>";
				html += "<tr>";
			}
		}
		
		html+="</table>";
		
		/**
		 * 显示浏览过的商品
		 */
		html += "最近浏览过的商品：<br/>";
		//取出prodHist的cookie
		Cookie[] cookies = request.getCookies();
		if(cookies!=null){
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("proHist")){
					String prodHist = cookie.getValue(); // 3,2,1
					String[] ids = prodHist.split(",");
					//遍历浏览过的商品id
					for (String id : ids) {
						//查询数据库，查询对应的商品
						Product p = dao.findById(id);
						//显示到浏览器
						html += p.getId()+"&nbsp;&nbsp;"+p.getName()+"&nbsp;&nbsp;"+p.getPrice()+"<br/>";
					}
				}
			}
		}
		html += "</body>";
		html += "</html>";
		response.getWriter().write(html);
	}

}
