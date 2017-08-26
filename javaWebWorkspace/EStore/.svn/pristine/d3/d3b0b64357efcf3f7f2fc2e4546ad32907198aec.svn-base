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

@WebServlet("/changCartProd")
public class ChangCartProdServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 获取要修改是商品id
		String id = req.getParameter("id");
		// 获取修改的数量
		String num = req.getParameter("buynum");
		Integer number = Integer.parseInt(num);
		ProdService service = new ProdServiceImpl();
		Product product = service.findProductById(id);
		// 修改商品数量
		Map<Product, Integer> cartmap = (Map<Product, Integer>) req.getSession().getAttribute("cartmap");
		cartmap.put(product, number);
		// 回到购物车页面
		resp.sendRedirect("cart.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
