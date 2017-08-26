package com.springmvc.view;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * 控制器Action---(处理器Action)
 * @author Nocol
 *
 */
public class HelloAction implements Controller{
	
	public HelloAction() {
		// TODO Auto-generated constructor stub
		System.out.println("HelloAction()-----创建");//只创建一次
	}
	
	
	/**
	 * 业务方法(调业务层直接在这调)
	 */
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("handleRequest..............");//每次请求都会执行
		/**
		 * ModelAndView表示向视图封装的数据和方法
		 */
		ModelAndView modelAndView=new ModelAndView();
		//封装数据
		modelAndView.addObject("msg","first springmvc ");
		/**
		 * 封装视图路径（这里是真实名称），此时视图解析器可选配置
		 */
//		modelAndView.setViewName("/jsp/success.jsp");
		
		/**
		 * 封装视图路径（这里是逻辑名称），则必须配置视图解析器
		 */
		modelAndView.setViewName("success");
		
		return modelAndView;
	}
}
