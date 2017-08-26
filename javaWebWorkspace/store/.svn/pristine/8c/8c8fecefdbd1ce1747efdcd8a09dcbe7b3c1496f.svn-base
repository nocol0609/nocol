package com.ssm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssm.bean.User;
import com.ssm.service.UserService;

/**
 * 用户控制层
 * 
 * @author Nocol localhsot:8099/store/user/login.action
 *
 *
 *         localhsot:8099/store/user/index.jsp
 *
 *         index.jsp
 */
@Controller
@RequestMapping("/user")
public class UserAction {

	@Autowired
	private UserService userService;

	/**
	 * 用户注册
	 */
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public void regist(User user, HttpServletResponse response) {
		try {
			System.out.println("注册的用户信息：" + user);
			userService.regist(user);
			// 3秒返回登录页面
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().write("注册成功,3秒回到登录页面...");
			response.setHeader("Refresh", "3;url=/store/login.jsp");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 用户登录
	 * 
	 * @throws IOException
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public void login(String name, String password, HttpServletRequest request, HttpServletResponse response) throws Exception {
		// response.sendRedirect("/store/index.jsp");

		System.out.println("当前登录用户:" + name + "---" + password);
		
		User user=userService.findUserByNameAndPwd(name, password);
				
		if (user != null) {
			// 将当前用户存入session域
			request.getSession().setAttribute("user", user);
			response.sendRedirect("/store/index.jsp");
			// return "redirect:index";
		} else {
			request.setAttribute("loginMsg", "用户名或密码错误！");
			request.getRequestDispatcher("/store/login.jsp").forward(request, response);
			// return "login";
		}

		// return null;
	}

	/**
	 * 检验用户名
	 */
	@RequestMapping("/checkName")
	public void checkName(String name, HttpServletResponse response) {
		try {

			System.out.println("用户名：" + name);
			if (name != null) {
				User user = userService.findUserByName(name);
				System.out.println("根据用户名查询用户:" + user);
				String nameMsg = null;
				if (user == null) {
					nameMsg = "该用户不存在";
				} else {
					nameMsg = "该用户已存在";
				}
				// 以流的形式将提示返回
				response.setContentType("text/html;charset=utf-8");
				PrintWriter pw = response.getWriter();
				pw.write(nameMsg);
				pw.flush();
				pw.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 用户退出
	 */
	@RequestMapping("/logout")
	public void logout(HttpServletRequest request, HttpServletResponse response) {

		try {
			if (request.getSession(false) != null) {
				// 注销
				request.getSession().invalidate();
			}
			// 重新回到主页
			response.sendRedirect("/store/index.jsp");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
