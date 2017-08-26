package com.nocol.Web.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nocol.Bean.User;
import com.nocol.Service.UserService;
import com.nocol.Service.Impl.UserServiceImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String pwd = request.getParameter("password");
		UserService service = new UserServiceImpl();
		User user = service.findUserByNameAndPwd(name,pwd);
		System.out.println("当前登录用户："+user);
		if (user != null) {
			// 将当前用户存入session域
			request.getSession().setAttribute("user", user);
			response.sendRedirect("index.jsp");
		}else {
			request.setAttribute("loginMsg", "用户名或密码错误！");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
