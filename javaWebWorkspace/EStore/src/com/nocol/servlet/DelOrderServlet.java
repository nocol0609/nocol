package com.nocol.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nocol.service.OrderService;
import com.nocol.service.impl.OrderServiceImpl;

@WebServlet("/delOrder")
public class DelOrderServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// ��ȡ����id
		String order_id = req.getParameter("id");
		OrderService service = new OrderServiceImpl();
		service.delOrderByOrderId(order_id);
		// ����������ѯҳ��
		resp.setCharacterEncoding("GBK");
		resp.getWriter().write("����ɾ���ɹ���3��ص������б�...");
		resp.setHeader("refresh", "3;url=orderList");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setCharacterEncoding("GBK");
		this.doGet(req, resp);
	}
}
