package com.springmvc.manyservice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 控制器------包含多个业务方法----并在业务方法中写入普通变量来收集参数
 * 
 * @author Nocol
 *
 */
@Controller
@RequestMapping(value="/user") // 请求调用业务方法的根路径
public class RegistAndLoginAction {
	/**
	 * 注册业务
	 * @param model
	 * @return
	 */
	
	//只注解请求子路径，此时虽然表单中的是post请求，但是从地址栏中用get方式依然可以提交
	//可根据需要配置只限定post方法请求
	@RequestMapping(method=RequestMethod.POST ,value="/regist")  //请求调用业务方法的子路径 ----不需要再配置.action
	
	/**
	 * 可在业务方法中写入普通变量来收集参数
	 * @param model
	 * @param name
	 * @param gender
	 * @return
	 */
								    //普通变量需要与表单中name属性值相同
	public String regist(Model model,String username,String password) {
		
		System.out.println("regist:"+"---"+username+"---"+password);
		
		model.addAttribute("msg", "regist success");
		
		return "success";
	}
	
	/**
	 * 登录业务
	 * @param model
	 * @return
	 */
	
	//可配置既能接收post请求又可以接收get请求(不限制方法即为默认)
	@RequestMapping(method={RequestMethod.POST,RequestMethod.GET} ,value="/login")
	/**
	 * 可在业务方法中写入普通变量来收集参数
	 * @param model
	 * @param name
	 * @return
	 */
	public String login(Model model,String username) {
		
		System.out.println("login:"+"---"+username);
		
		model.addAttribute("msg", "login success");
		
		return "success";
	}
}
