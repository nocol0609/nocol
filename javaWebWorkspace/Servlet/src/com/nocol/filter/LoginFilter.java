package com.nocol.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.nocol.param.User;

public class LoginFilter implements Filter {
	public void destroy() {
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		        //1.强转
				HttpServletRequest request=(HttpServletRequest) req;
				HttpServletResponse response=(HttpServletResponse) resp;
				
				//2.业务逻辑
				//从session中获取user 判断user是否为空 若为空 请求转发
				User user=(User) request.getSession().getAttribute("user");
				if(user==null){
					request.setAttribute("msg", "没有权限,请先登录!");
					request.getRequestDispatcher("/login.jsp").forward(request, response); //forward会清空response里边的信息
					return;
				}
				
				//3.放行
				chain.doFilter(request, response);
	}

	public void init(FilterConfig arg0) throws ServletException {
	}
}
