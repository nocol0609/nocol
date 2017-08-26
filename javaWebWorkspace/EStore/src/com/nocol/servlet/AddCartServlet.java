package com.nocol.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nocol.bean.Product;
import com.nocol.service.ProdService;
import com.nocol.service.impl.ProdServiceImpl;

@WebServlet("/addCart")
public class AddCartServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = req.getParameter("id");
		ProdService service = new ProdServiceImpl();
		Product product = service.findProductById(id);
		if (product == null) {
			throw new RuntimeException("该商品不存在");
		} else {
			// 判断之前是否加入过购物车,有则数量加1,无则将数量设置为1
			Map<Product, Integer> cartmap = (Map<Product, Integer>) req.getSession().getAttribute("cartmap");
			
			System.out.println("cartmap:"+cartmap);
			
			if (cartmap.containsKey(product)) {
				cartmap.put(product, cartmap.get(product) + 1);
			} else {
				cartmap.put(product, 1);
			}
			// 重定向到购物车页面
			resp.sendRedirect("cart.jsp");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
