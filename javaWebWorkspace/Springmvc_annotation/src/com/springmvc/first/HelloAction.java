package com.springmvc.first;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器Action（注解版）-------单例
 * 
 * @author Nocol
 *
 */
//表示该类实现了Controller接口,是一个控制器Action
@Controller
public class HelloAction {
	
	public HelloAction() {
		// TODO Auto-generated constructor stub
		System.out.println("HelloAction()----创建");
	}
	/**
	 * 业务方法（可带参可不带参）
	 * @return
	 * @throws Exception
	 */
	//映射注解
	@RequestMapping(value = "/hello.action")
	public String hello(Model model) throws Exception {
		
		System.out.println("hello....");
		
		model.addAttribute("msg", "hello");
		//若返回的是视图正式路径可不配置视图解析器
		return "success";
	}
	
	/**
	 * 业务方法（可带参可不带参）
	 * @return
	 * @throws Exception
	 */
	//映射注解
	@RequestMapping(value = "/bye.action")
	public String bye(Model model) throws Exception {
		
		System.out.println("bye.....");
		
		model.addAttribute("msg", "bye");
		//若返回的是视图正式路径可不配置视图解析器
		return "success";
	}
}
