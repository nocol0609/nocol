package com.ssm.shiro;

import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import com.mchange.lang.ByteUtils;
/**
 * 自定义realm
 * @author Nocol
 *
 */
public class myRealm extends AuthorizingRealm {
	
	/**
	 * 设置realm名称
	 * 
	 */
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName("myRealm");
	}
	
	/**
	 * 用户认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		
		System.out.println("这是第一个Realm ############");
		
		//从toekn中获取用户 信息
		String userName=(String) token.getPrincipal();
		
		//...连接数据库...通过用户名查询是否有该用户，若存在该用户再通过返回的user得到密码
		
		/*	
		    SimpleHash simpleHash=new SimpleHash("md5","123","user",1);
			System.out.println("user为盐加密明文123："+simpleHash); //6ad14ba9986e3615423dfca256d04e3f
		
			simpleHash=new SimpleHash("md5","123","admin",1);
			System.out.println("admin为盐加密明文123："+simpleHash); //0192023a7bbd73250516f069df18b500
		 */
		
		//假设该用户在数据库中存在且该用户的密码加密后的（明文为123，盐为用户名）
		
		String passWord=null;
		
		if(userName.equals("user")){
			 passWord="6ad14ba9986e3615423dfca256d04e3f";
		}else if (userName.equals("admin")) {
			 passWord="0192023a7bbd73250516f069df18b500";
		}
		
		
		//如果查询到则返回认证信息
		SimpleAuthenticationInfo simpleAuthenticationInfo=
				new SimpleAuthenticationInfo(userName, passWord, ByteSource.Util.bytes(userName), this.getName());
		
		return simpleAuthenticationInfo;
	}

	
	/**
	 * 用户授权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		// TODO Auto-generated method stub
		
		//获取当前登录用户（已认证）
		String userName = (String) principalCollection.getPrimaryPrincipal();
		
		
		//模拟该用户所具有的角色-----(实际开发中roles是从数据库中查询出来的)
		Set<String> roles=new HashSet<String>();
		//表示当前登录的用户只拥有user这个角色
		roles.add("user");
		
		//判断当前用户是否为admin,若为admin则添加一个admin的角色
		//因此非admin用户只拥有user角色,而admin登录同时具有user和admin角色
		
		if(userName.equals("admin")){
			roles.add("admin");
		}
		
		//返回授权信息
		SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo(roles);
		
		return simpleAuthorizationInfo;
	}

}
