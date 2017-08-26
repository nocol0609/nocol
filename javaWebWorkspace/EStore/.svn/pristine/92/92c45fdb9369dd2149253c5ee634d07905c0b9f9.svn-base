package com.nocol.filter;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nocol.bean.User;
import com.nocol.service.UserService;
import com.nocol.service.impl.UserServiceImpl;

public class AutologinFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		//1.只有未登录的用户才自动登录
		if(req.getSession(false)==null || req.getSession().getAttribute("user")==null){
			//2.只有带了自动登陆cookie的用户才自动登陆
			Cookie [] cs = req.getCookies();
			Cookie findC = null;
			if(cs!=null){
				for(Cookie c : cs){
					if("autologin".equals(c.getName())){
						findC = c;
						break;
					}
				}
			}
			if(findC!=null){
				//3.只有自动登录cookie中的用户名密码都正确才做自动登陆
				String v = URLDecoder.decode(findC.getValue(),"utf-8");
				String username = v.split(":")[0];
				String password = v.split(":")[1];
				UserService service = new UserServiceImpl();
				User user = service.findUserByNameAndPwd(username, password);
				if(user!=null){
					req.getSession().setAttribute("user", user);
				}
			}
		}
		
		
		//4.无论是否自动登陆都要放行
		chain.doFilter(request, response);
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

}
