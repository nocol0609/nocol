package com.shiro.md5;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Test;

/**
 * 自定义realm实现散列的匹配
 * @author Nocol
 *
 */
public class md5RealmTest {
	@Test
	public void testMd5Realm(){
		
		//创建serityManager工厂对象
		Factory<SecurityManager> factory=new IniSecurityManagerFactory("classpath:shiro-realmmd5.ini");
		
		//获取securityManage对象
		SecurityManager securityManager = factory.getInstance();
		
		//将安全管理器设置到当前环境
		SecurityUtils.setSecurityManager(securityManager);
		
		//获取subject对象
		Subject subject = SecurityUtils.getSubject();
		                 
		//创建token
		UsernamePasswordToken token=new UsernamePasswordToken("nocol", "123");
		
		//subject登录提交认证
		subject.login(token);
		
		//是否通过认证
		boolean authenticated = subject.isAuthenticated();
		System.out.println("是否通过认证："+authenticated);
		
	}
}

