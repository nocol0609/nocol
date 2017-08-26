package com.nocol.servlet;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nocol.bean.User;
import com.nocol.service.UserService;
import com.nocol.service.impl.UserServiceImpl;
import com.nocol.utils.MD5Utils;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("username");
		String pwd = MD5Utils.getMD5Str(req.getParameter("password"));
		
		System.out.println("用户名:"+name+"-----"+"密码:"+pwd);
		
		UserService service=new UserServiceImpl();
		User user = service.findUserByNameAndPwd(name,pwd);
		
		System.out.println("根据用户名和密码查找的用户："+user);
		
		if(user == null){
			req.setAttribute("msg", "该用户不存在!");
		 	req.getRequestDispatcher("/login.jsp").forward(req, resp);
			return;
		}
		//3.检查用户激活状态
		if(user.getState() == 0){
			req.setAttribute("msg", "用户尚未激活,请到邮箱中进行激活!");
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
			return;
		}
		//4.登录用户后存入session域并重定向到主页
		req.getSession().setAttribute("user", user);
		
		//处理记住用户名
		if("true".equals(req.getParameter("remname"))){
			Cookie remnameCookie= new Cookie("remname",URLEncoder.encode(user.getUsername(),"utf-8"));
			remnameCookie.setPath("/");
			remnameCookie.setMaxAge(3600*24*30);
			resp.addCookie(remnameCookie);
			}else{
			    Cookie remnameCookie = new Cookie("remname","");
			    remnameCookie.setPath("/");
			    remnameCookie.setMaxAge(0);
				resp.addCookie(remnameCookie);
			}
		
		//处理30天内自动登陆
			if("true".equals(req.getParameter("autologin"))){
				Cookie autologinCookie = new Cookie("autologin",URLEncoder.encode(user.getUsername()+":"+user.getPassword(),"utf-8"));
				autologinCookie.setPath("/");
				autologinCookie.setMaxAge(3600*24*30);
				resp.addCookie(autologinCookie);
			}
	
		resp.sendRedirect("index.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
