package com.nocol.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CookieDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CookieDemo1() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie cookie = new Cookie("name", "nocol");
		response.addCookie(cookie); 
//		String header = request.getHeader("cookie");
//		System .out.println(header);
		
		Cookie[] cookies = request.getCookies();
		if(cookies!=null){
			for(Cookie c:cookies){
				String name = c.getName();
				String value = c.getValue();
				System.out.println(name+"="+value );
			}
		}else {
			System.out.println("没有Cookie数据");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
