package com.shiro.md5;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

/**
 * 自定义realm支持散列算法 
 * @author Nocol
 *
 */
public class md5Realm extends AuthorizingRealm {
	/**
	 * 设置realm的名称
	 */
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName("md5Realm");
	}
	
	/**
	 * 用户认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		
		//从token中获取用户信息
		String userCode = (String) token.getPrincipal();
		
		//模拟从数据库中已经通过账号查询到密文的密码（散列值）
		String password="79cfeb94595de33b3326c06ab1c7dbda";
		
		//模拟从数据库中获取盐（一般拿用户名来做盐）
		String salt="abcd";
		
		//上面是明文123对应的散列值和盐
		
		//如果查询到则返回认证信息
		SimpleAuthenticationInfo simpleAuthenticationInfo=
				new SimpleAuthenticationInfo(userCode, password, ByteSource.Util.bytes(salt), this.getName());
		
		return simpleAuthenticationInfo;
	}
	
	/**
	 * 用户授权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		return null;
	}
}
