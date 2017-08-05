package com.ssm.service;

import java.security.Security;
import java.util.Date;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.Session;

/**
 * 权限注解
 * @author Nocol
 *
 */

public class annotationService {
	
	@RequiresRoles({"admin"})
	public void testMethod(){
		System.out.println("time："+new Date());
		
		//获取httpsession中的值
	    Session session = SecurityUtils.getSubject().getSession();
	    Object httpsessionValue = session.getAttribute("key");
		System.out.println("get value from httpseiion in service:"+httpsessionValue);
		
	}
}
