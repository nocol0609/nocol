package com.nocol.beanutils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/**
		 * 扩展性低，效率低
		 */
		 //获取参数
		 //String name = req.getParameter("name"); 
		 //String pwd =req.getParameter("pwd");
		 //封装对象 
		 //User user=new User();
		 //user.setName(name); 
		 //user.setPwd(pwd);
		 	
		/**
		 * 使用第三方工具类
		 */
		
		/**
		 * beanUtils会为8种基本数据类型自动转换，其他类型需自己自定义转换器
		 * 
		 * 若需要转换成其他类型需注册该类型转换器
		 */
		
		User user = new User();
		try {
			//自定义类型转换器必须在populate方法之前
			ConvertUtils.register(new MyDateConverter(), Date.class); 
			BeanUtils.populate(user, req.getParameterMap());
						
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println(user);
	}
}
