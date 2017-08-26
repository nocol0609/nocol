package com.springmvc.initbind;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器Action -------利用模型变量收集参数并用@initBind注解字符串转日期
 * 
 * @author Nocol
 *
 */
@Controller
@RequestMapping("/user3")
public class InitBindAction {
	
	/**
	 * 自定义类型装换器
	 */
	@InitBinder
	protected void initBinder(HttpServletRequest request,ServletRequestDataBinder binder) throws Exception {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"),true));
	}
	/**
	 * 用户注册 ----------以User实体方式收集参数
	 * @param model
	 * @param user
	 * @return
	 */
	@RequestMapping("/regist")
	public String regist(Model model, User user) {

		System.out.println("用户注册:" + user);

		// 封装user
		model.addAttribute("user", user);

		return "success";

	}
}
