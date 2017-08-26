package com.nocol.dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nocol.param.User;
import com.nocol.param.UserDao;
import com.nocol.param.UserDaoImpl;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("GBK");
		String name = req.getParameter("username");
		String pwd = req.getParameter("pwd");
		UserDao dao = new UserDaoImpl();
		User user = dao.findUserByName(name);
		PrintWriter out = resp.getWriter();
		if (user != null) {
			if (user.getPwd().equals(pwd)) {
				
				HttpSession session = req.getSession();
				session.setAttribute("user", user);
				
				out.println("<html><body><h1>登录成功</h1></body></html>");

			} else {
				out.println("<html><body><h1>用户名或密码错误</h1></body></html>");

			}
		} else {
			out.println("<html><body><h1>用户不存在</h1></body></html>");

		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
}
