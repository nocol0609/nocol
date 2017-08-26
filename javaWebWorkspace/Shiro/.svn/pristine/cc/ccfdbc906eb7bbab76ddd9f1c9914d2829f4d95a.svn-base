package com.shiro.realm;

import java.util.ArrayList;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * 自定义realm
 * 
 * @author Nocol
 *
 */
public class myRealm extends AuthorizingRealm {
	
	/**
	 * 设置realm的名称
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
		
		//从token中获取用户信息
		String userCode = (String) token.getPrincipal();
		
		//模拟从数据库中已经通过账号查询到密码
		String password="123";
		
		//如果查询到则返回认证信息
		SimpleAuthenticationInfo simpleAuthenticationInfo=new SimpleAuthenticationInfo(userCode,password,this.getName());
		
		return simpleAuthenticationInfo;
	}
	
	
	/**
	 * 用户授权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		
		
		//从principals中获取主身份信息
		//将getPrimaryPrincipal方法返回值转为真实身份类型（在上边的doGetAuthenticationInfo认证通过填充到SimpleAuthenticationInfo中的身份类型），
		//通过getPrimaryPrincipal得到的身份是已经通过认证了的
		String  userCode = (String) principals.getPrimaryPrincipal();
		
		
		//模拟从数据库中根据身份信息查询权限信息
		//连接数据库...
		//假设查询到该身份拥有的权限为
		ArrayList<String> permissions=new ArrayList<String>();
		permissions.add("user:create");//用户的创建
		permissions.add("items:add");//商品添加权限
		//....
		
		
		//查询到权限数据需要返回权限信息
		SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo();
		//将查询到的权限信息填充到simpleAuthorizationInfo对象中
		simpleAuthorizationInfo.addStringPermissions(permissions);
		
		//返回权限信息
		return simpleAuthorizationInfo;
		
	}

}

