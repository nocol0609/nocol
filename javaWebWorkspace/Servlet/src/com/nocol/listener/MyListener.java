package com.nocol.listener;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebServlet("/listener")
public class MyListener implements HttpSessionListener {
	
	public MyListener() {
		// TODO Auto-generated constructor stub
		System.out.println("SESSION糞箭幹秀。。。。。。。。。。。。。。。。");
	}
	
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("create...................");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("xiaohui-----------------");
	}

	

}
