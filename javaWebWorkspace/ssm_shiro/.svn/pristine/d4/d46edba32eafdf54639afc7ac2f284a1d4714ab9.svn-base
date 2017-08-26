package com.ssm.controller;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.service.annotationService;

/**
 * 用户控制器
 * @author Nocol
 *
 */
@Controller
@RequestMapping("/shiro")
public class ShiroHandler {
	
	@Autowired
	private annotationService annoService;
	
	/**
	 * 测试权限注解
	 * 测试在service层拿到httpsession中的数据
	 */
	@RequestMapping("/annotation")
	public String testShiroAnnotation(HttpSession httpSession){
		
		httpSession.setAttribute("key", "this is httpsession value");
		
		annoService.testMethod();
		return "roleLimit";
	}
	
	/**
	 * 用户认证
	 */
	@RequestMapping("/login")
	public String  login(String userName,String passWord){
		
		System.out.println("用户名和密码："+userName+"---"+passWord);
		
		//获取当前用户
		Subject currentUser = SecurityUtils.getSubject();
		
		//创建token
		UsernamePasswordToken token=new UsernamePasswordToken(userName,passWord);
		
		//remenberMe:登录成功后关闭浏览器重新打开，浏览器依然记得，但是在反问某些敏感页面还是需要再次认证
		token.setRememberMe(true);
		
		//提交认证
		try {
			
			currentUser.login(token);
			
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			
			System.out.println("登录失败");
			
			return "login";
		}
		
		boolean authenticated = currentUser.isAuthenticated();
		
		System.out.println("是否通过认证："+authenticated);
		
		//登录失败后跳转页面
		return "index";
	}
}

