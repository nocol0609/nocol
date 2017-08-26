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

@WebServlet("/forget1")
public class ForgetPwd1Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = req.getParameter("userName");
		String checkCode = req.getParameter("checkCode");
		System.out.println(userName+"----"+checkCode);
		//从session中获取验证码
		String checCode2 = (String) req.getSession().getAttribute("valistr");
		System.out.println("验证码："+checCode2);
		//校验用户名
		UserService service=new UserServiceImpl();
		User user=service.findUserByName(userName);
		
		if(user!=null && checkCode.equals(checCode2)){
			req.getRequestDispatcher("/forgetPassword1.jsp").forward(req, resp);	
		}else {
			
			if(user==null){
				req.setAttribute("msg", "该用户不存在");
			}else if (!checkCode.equals(checCode2)) {
				req.setAttribute("msg", "验证码输入有误");
			}
			req.getRequestDispatcher("/forgetPassword.jsp").forward(req, resp);	
		}

	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}	
