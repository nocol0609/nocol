package com.nocol.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nocol.bean.Product;
import com.nocol.service.ProdService;
import com.nocol.service.impl.ProdServiceImpl;

@WebServlet("/prodInfor")
public class ProdInfoServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//获取要查询商品的id
		String id = req.getParameter("id");
		System.out.println("id:"+id);
		
		//调用Service根据id查找商品
		ProdService service=new ProdServiceImpl();
		Product product=service.findProductById(id);
		
		System.out.println("根据id查找到的商品："+product);
		//将返回的商品存入request域中带回页面显示
		if(product==null){
			throw new RuntimeException("该商品不存在");
		}else {
			req.setAttribute("prod", product);
			req.getRequestDispatcher("/prodInfo.jsp").forward(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
