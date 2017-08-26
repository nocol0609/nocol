package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.bean.User;
import com.ssm.service.UserService;

/**
 * 控制层
 * @author Nocol
 *
 */
@Controller
@RequestMapping("/user")
public class UserAction {
	//注入Service
	@Autowired
	private UserService userService;
	
	@RequestMapping("regist")
	public String regist(User user,Model model){
		
		System.out.println("用户注册："+user.getName()+user.getPassword());
		
		user.setId(1);
		userService.regist(user);
		
		model.addAttribute("msg", "注册成功");
		
		return "success";
	}
	
	@RequestMapping("login")
	public String login(String name,String password,Model model){
		
		System.out.println("用户登录："+name+password);
		
		/*Map<String, String> map=new LinkedHashMap<String,String>();
		
		map.put("name", user.getName());
		map.put("password", user.getPassword());*/
		
		userService.login(name,password);
		
		model.addAttribute("msg", "登录成功");
		
		return "success";
	}
}
