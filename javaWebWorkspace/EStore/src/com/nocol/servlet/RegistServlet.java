package com.nocol.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.nocol.bean.User;
import com.nocol.service.UserService;
import com.nocol.service.impl.UserServiceImpl;
import com.nocol.utils.MD5Utils;

@WebServlet("/regist")
public class RegistServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			// 校验验证码
			String valistr1 = req.getParameter("valistr");
			System.out.println("获取验证码："+valistr1);
			String valistr2 = (String) req.getSession().getAttribute("valistr");
			if (valistr1 == null || valistr2 == null || !valistr1.equals(valistr2)) {
				req.setAttribute("msg", "<font color='red'>验证码不正确!</font>");
				req.getRequestDispatcher("/regist.jsp").forward(req, resp);
				return;
			}

			User user = new User();
			UserService service = new UserServiceImpl();
			// 封装用户
			BeanUtils.populate(user, req.getParameterMap());
			
			//使用MD5算法加密密码
			user.setPassword(MD5Utils.getMD5Str(user.getPassword()));
			
			
			// 注册用户
			service.regist(user);
			//4.回到主页
			resp.getWriter().write("注册成功,请到邮箱中进行激活...");
			resp.setHeader("Refresh", "3;url=index.jsp");
			
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setCharacterEncoding("GBK");
		this.doGet(req, resp);
	}
}
