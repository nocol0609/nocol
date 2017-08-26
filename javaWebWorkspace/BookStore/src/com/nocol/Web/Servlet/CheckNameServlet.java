package com.nocol.Web.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nocol.Bean.User;
import com.nocol.Service.UserService;
import com.nocol.Service.Impl.UserServiceImpl;

@WebServlet("/checkName")
public class CheckNameServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		System.out.println("name:"+name);
		if(name!=null){
			UserService service = new UserServiceImpl();
			User user = service.findUserByName(name);
			System.out.println("根据用户名查询用户:"+user);
			String nameMsg = null;
			if (user == null) {
				nameMsg = "该用户不存在";
			} else {
				nameMsg = "该用户已存在";
			}
			// 以流的形式将提示返回
			resp.setContentType("text/html;charset=utf-8");
			PrintWriter pw = resp.getWriter();
			pw.write(nameMsg);
			pw.flush();
			pw.close();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
