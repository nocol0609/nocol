package com.ssm.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.util.ByteSource;

/**
 * 自定义realm
 * @author Nocol
 *
 */
public class secondeRealm extends AuthenticatingRealm {
	
	/**
	 * 设置realm名称
	 * 
	 */
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName("myRealm");
	}
	
	
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		
		System.out.println("这是第二个Realm ############");
		
		//从toekn中获取用户 信息
		String userName=(String) token.getPrincipal();
		
		//...连接数据库...通过用户名查询是否有该用户，若存在该用户再通过返回的user得到密码
		
		/*	
		    SimpleHash simpleHash=new SimpleHash("sha1","123","user",1);
			System.out.println("user为盐加密明文123："+simpleHash); //95c946bf622ef93b0a211cd0fd028dfdfcf7e39e
		
			simpleHash=new SimpleHash("sha1","123","admin",1);
			System.out.println("admin为盐加密明文123："+simpleHash); //f865b53623b121fd34ee5426c792e5c33af8c227
		 */
		
		//假设该用户在数据库中存在且该用户的密码加密后的（明文为123，盐为用户名）
		
		String passWord=null;
		
		if(userName.equals("user")){
			 passWord="95c946bf622ef93b0a211cd0fd028dfdfcf7e39e--------";
		}else if (userName.equals("admin")) {
			 passWord="f865b53623b121fd34ee5426c792e5c33af8c227";
		}
		
		
		//如果查询到则返回认证信息
		SimpleAuthenticationInfo simpleAuthenticationInfo=
				new SimpleAuthenticationInfo(userName, passWord, ByteSource.Util.bytes(userName), this.getName());
		
		return simpleAuthenticationInfo;
	}

}
