package com.nocol.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nocol.bean.Product;
import com.nocol.service.ProdService;
import com.nocol.service.impl.ProdServiceImpl;

@WebServlet("/productList")
public class ProductListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 调用Service查询所有商品
		ProdService service = new ProdServiceImpl();
		List<Product> list = service.findAllProduct();
		
		for (Product product : list) {
			System.out.println("查询到的商品集合："+product);
		}
		
		// 将所有商品的信息存入request域中带到页面显示
		req.setAttribute("list", list);
		req.getRequestDispatcher("/prodList.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
