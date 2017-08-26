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
		// ��ȡҪ�޸�����Ʒid
		String id = req.getParameter("id");
		// ��ȡ�޸ĵ�����
		String num = req.getParameter("buynum");
		Integer number = Integer.parseInt(num);
		ProdService service = new ProdServiceImpl();
		Product product = service.findProductById(id);
		// �޸���Ʒ����
		Map<Product, Integer> cartmap = (Map<Product, Integer>) req.getSession().getAttribute("cartmap");
		cartmap.put(product, number);
		// �ص����ﳵҳ��
		resp.sendRedirect("cart.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
