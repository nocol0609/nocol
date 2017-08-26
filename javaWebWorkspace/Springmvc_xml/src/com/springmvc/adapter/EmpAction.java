package com.springmvc.adapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * 员工控制器（实现Controller接口）
 * 
 * 实现Controller接口的弊端：
 * 1、使代码耦合
 * 2、若传递过来的参数过多，该方法收集不便（所以可以使控制器Action类去继承类）
 * 
 * @author Nocol
 *
 */
public class EmpAction implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView modelAndView=new ModelAndView();
		
		request.setCharacterEncoding("utf-8");
		
		//获取员工姓名
		String name = request.getParameter("username");
		System.out.println("员工姓名："+name);
		//封装员工姓名
		modelAndView.addObject("msg", name);
		//封装视图路径
		modelAndView.setViewName("/jsp/success.jsp");
		return modelAndView;
	}

}
