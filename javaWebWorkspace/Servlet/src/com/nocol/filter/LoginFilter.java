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
		        //1.ǿת
				HttpServletRequest request=(HttpServletRequest) req;
				HttpServletResponse response=(HttpServletResponse) resp;
				
				//2.ҵ���߼�
				//��session�л�ȡuser �ж�user�Ƿ�Ϊ�� ��Ϊ�� ����ת��
				User user=(User) request.getSession().getAttribute("user");
				if(user==null){
					request.setAttribute("msg", "û��Ȩ��,���ȵ�¼!");
					request.getRequestDispatcher("/login.jsp").forward(request, response); //forward�����response��ߵ���Ϣ
					return;
				}
				
				//3.����
				chain.doFilter(request, response);
	}

	public void init(FilterConfig arg0) throws ServletException {
	}
}
