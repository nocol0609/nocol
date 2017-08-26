package com.nocol.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nocol.service.UserService;
import com.nocol.service.impl.UserServiceImpl;

@WebServlet("/active")
public class ActiveServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//��ȡ������
		String activecode = req.getParameter("code");
		
		System.out.println("�����룺"+activecode);
		
		UserService service=new UserServiceImpl();
		//����service�����û�
		service.activeUser(activecode);
		//����ɹ��ص���ҳ
		resp.setCharacterEncoding("GBK");
		resp.getWriter().write("��ϲ������ɹ�,3���ص���ҳ....");
		resp.setHeader("Refresh", "3;url=index.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
}
