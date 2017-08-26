package com.springmvc.mapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * 控制器
 * @author Nocol
 *
 */
public class UserAction implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("操作用户");
		
		ModelAndView modelAndView=new ModelAndView();
		//封装数据
		modelAndView.addObject("msg", "操作用户成功");
		
		//封装路径（逻辑）
		modelAndView.setViewName("success");
		return modelAndView;
	}

}
