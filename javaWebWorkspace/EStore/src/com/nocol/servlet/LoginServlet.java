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
		
		System.out.println("�û���:"+name+"-----"+"����:"+pwd);
		
		UserService service=new UserServiceImpl();
		User user = service.findUserByNameAndPwd(name,pwd);
		
		System.out.println("�����û�����������ҵ��û���"+user);
		
		if(user == null){
			req.setAttribute("msg", "���û�������!");
		 	req.getRequestDispatcher("/login.jsp").forward(req, resp);
			return;
		}
		//3.����û�����״̬
		if(user.getState() == 0){
			req.setAttribute("msg", "�û���δ����,�뵽�����н��м���!");
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
			return;
		}
		//4.��¼�û������session���ض�����ҳ
		req.getSession().setAttribute("user", user);
		
		//�����ס�û���
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
		
		//����30�����Զ���½
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
