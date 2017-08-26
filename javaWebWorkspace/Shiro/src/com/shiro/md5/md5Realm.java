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
 * �Զ���realm֧��ɢ���㷨 
 * @author Nocol
 *
 */
public class md5Realm extends AuthorizingRealm {
	/**
	 * ����realm������
	 */
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName("md5Realm");
	}
	
	/**
	 * �û���֤
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		
		//��token�л�ȡ�û���Ϣ
		String userCode = (String) token.getPrincipal();
		
		//ģ������ݿ����Ѿ�ͨ���˺Ų�ѯ�����ĵ����루ɢ��ֵ��
		String password="79cfeb94595de33b3326c06ab1c7dbda";
		
		//ģ������ݿ��л�ȡ�Σ�һ�����û��������Σ�
		String salt="abcd";
		
		//����������123��Ӧ��ɢ��ֵ����
		
		//�����ѯ���򷵻���֤��Ϣ
		SimpleAuthenticationInfo simpleAuthenticationInfo=
				new SimpleAuthenticationInfo(userCode, password, ByteSource.Util.bytes(salt), this.getName());
		
		return simpleAuthenticationInfo;
	}
	
	/**
	 * �û���Ȩ
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		return null;
	}
}
