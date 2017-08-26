package com.nocol.Web.Servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.nocol.Bean.User;
import com.nocol.Service.UserService;
import com.nocol.Service.Impl.UserServiceImpl;

@WebServlet("/regist")
public class RegistServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User user = new User();
		try {
			BeanUtils.populate(user, request.getParameterMap());
			System.out.println("注册的用户信息："+user);
			UserService service = new UserServiceImpl();
			service.regist(user);

			// 3秒返回登录页面
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().write("注册成功,3秒回到登录页面...");
			response.setHeader("Refresh", "3;url=login.jsp");

		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
