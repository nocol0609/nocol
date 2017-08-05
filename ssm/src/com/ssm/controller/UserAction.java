package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.bean.User;
import com.ssm.service.UserService;

/**
 * ���Ʋ�
 * @author Nocol
 *
 */
@Controller
@RequestMapping("/user")
public class UserAction {
	//ע��Service
	@Autowired
	private UserService userService;
	
	@RequestMapping("regist")
	public String regist(User user,Model model){
		
		System.out.println("�û�ע�᣺"+user.getName()+user.getPassword());
		
		user.setId(1);
		userService.regist(user);
		
		model.addAttribute("msg", "ע��ɹ�");
		
		return "success";
	}
	
	@RequestMapping("login")
	public String login(String name,String password,Model model){
		
		System.out.println("�û���¼��"+name+password);
		
		/*Map<String, String> map=new LinkedHashMap<String,String>();
		
		map.put("name", user.getName());
		map.put("password", user.getPassword());*/
		
		userService.login(name,password);
		
		model.addAttribute("msg", "��¼�ɹ�");
		
		return "success";
	}
}
