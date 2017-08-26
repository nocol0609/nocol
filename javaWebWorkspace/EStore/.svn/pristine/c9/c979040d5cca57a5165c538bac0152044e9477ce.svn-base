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
		//获取激活码
		String activecode = req.getParameter("code");
		
		System.out.println("激活码："+activecode);
		
		UserService service=new UserServiceImpl();
		//调用service激活用户
		service.activeUser(activecode);
		//激活成功回到主页
		resp.setCharacterEncoding("GBK");
		resp.getWriter().write("恭喜您激活成功,3秒后回到主页....");
		resp.setHeader("Refresh", "3;url=index.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
}
