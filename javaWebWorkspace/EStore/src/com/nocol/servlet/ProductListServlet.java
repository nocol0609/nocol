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
		// ����Service��ѯ������Ʒ
		ProdService service = new ProdServiceImpl();
		List<Product> list = service.findAllProduct();
		
		for (Product product : list) {
			System.out.println("��ѯ������Ʒ���ϣ�"+product);
		}
		
		// ��������Ʒ����Ϣ����request���д���ҳ����ʾ
		req.setAttribute("list", list);
		req.getRequestDispatcher("/prodList.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
