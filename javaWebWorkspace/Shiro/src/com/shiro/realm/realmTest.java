package com.shiro.realm;

import java.util.Arrays;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Test;

/**
 * 自定义realm测试
 * 
 * @author Nocol
 *
 */
public class realmTest {

	/**
	 * 测试认证
	 */
	@Test
	public void testRealm() {
		// 创建securityManager工厂
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-realm.ini");

		// 通过工厂创建securityManager对象
		SecurityManager securityManager = factory.getInstance();

		// 将securityManager对象设置到当前环境
		SecurityUtils.setSecurityManager(securityManager);

		// 创建token
		UsernamePasswordToken token = new UsernamePasswordToken("nokia", "123");

		// 获取Subject对象
		Subject subject = SecurityUtils.getSubject();

		// subject登录提交认证
		subject.login(token);

		// 是否认证通过
		boolean authenticated = subject.isAuthenticated();
		System.out.println("是否通过认证：" + authenticated);
	}

	/**
	 * 测试认证并授权
	 */
	@Test
	public void testAuthorization() {

		// 创建安全管理对象工厂
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-realm.ini");

		// 获取安全管理对象
		SecurityManager securityManager = factory.getInstance();

		// 将securityManager设置到当前环境
		SecurityUtils.setSecurityManager(securityManager);

		// 获取subject对象
		Subject subject = SecurityUtils.getSubject();

		// 创建token
		UsernamePasswordToken token = new UsernamePasswordToken("tom", "123");

		// 提交认证
		try {
			subject.login(token);
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("是否通过认证：" + subject.isAuthenticated());

		// 认证通过后执行授权

		// 基于权限的授权

		/**
		 * 判断当前用户是否拥有某权限
		 */
		boolean permitted = subject.isPermitted("user:create"); // 表示对用户资源（包括了user实例）进行create操作的权限
		System.out.println("单个权限的判断：" + permitted);

		/**
		 * 判断当前用户是否拥有多个权限
		 */
		boolean isPermittedAll = subject.isPermittedAll("user:create:1", "user:delete");
		System.out.println("多个权限的判断" + isPermittedAll);

		// 使用check方法进行授权，如果授权不通过会抛出异常
		// subject.checkPermission("items:add:1");

	}
}
