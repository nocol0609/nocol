package com.shiro.authentication;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Test;

/**
 * 用户认证测试
 * 
 * @author Nocol
 *
 */
public class authenticationTest {
	
	/**
	 * 用户登录和退出
	 */
	@Test
	public void testLoginAndLogout() {
		
		//通过ini配置文件创建SecurityManager工厂
		Factory<SecurityManager> factory=new IniSecurityManagerFactory("classpath:shiro-first.ini");
		
		//通过factory工厂对象创建SecurityManager对象
		SecurityManager securityManager = factory.getInstance();
		
		//将SecurityManager设置到当前环境
		SecurityUtils.setSecurityManager(securityManager);
		
		//从SecurityUtils创建Subject对象
		Subject subject = SecurityUtils.getSubject();
		
		//在用户认证前提交凭证信息（将来时用户提交的用户名和密码）
		//token 令牌
		UsernamePasswordToken token=new UsernamePasswordToken("nocol","123");
		
		try {
			
			//用户登录执行认证
			subject.login(token);
			
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//是否通过认证
		boolean authenticated = subject.isAuthenticated();
		System.out.println("登录是否通过认证："+authenticated);
		
		//用户退出
		subject.logout();
		authenticated = subject.isAuthenticated();
		System.out.println("退出是否通过认证："+authenticated);
		
	}
}
