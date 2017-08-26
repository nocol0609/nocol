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
 * �Զ���realm
 * @author Nocol
 *
 */
public class myRealm extends AuthorizingRealm {
	
	/**
	 * ����realm����
	 * 
	 */
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName("myRealm");
	}
	
	/**
	 * �û���֤
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		
		System.out.println("���ǵ�һ��Realm ############");
		
		//��toekn�л�ȡ�û� ��Ϣ
		String userName=(String) token.getPrincipal();
		
		//...�������ݿ�...ͨ���û�����ѯ�Ƿ��и��û��������ڸ��û���ͨ�����ص�user�õ�����
		
		/*	
		    SimpleHash simpleHash=new SimpleHash("md5","123","user",1);
			System.out.println("userΪ�μ�������123��"+simpleHash); //6ad14ba9986e3615423dfca256d04e3f
		
			simpleHash=new SimpleHash("md5","123","admin",1);
			System.out.println("adminΪ�μ�������123��"+simpleHash); //0192023a7bbd73250516f069df18b500
		 */
		
		//������û������ݿ��д����Ҹ��û���������ܺ�ģ�����Ϊ123����Ϊ�û�����
		
		String passWord=null;
		
		if(userName.equals("user")){
			 passWord="6ad14ba9986e3615423dfca256d04e3f";
		}else if (userName.equals("admin")) {
			 passWord="0192023a7bbd73250516f069df18b500";
		}
		
		
		//�����ѯ���򷵻���֤��Ϣ
		SimpleAuthenticationInfo simpleAuthenticationInfo=
				new SimpleAuthenticationInfo(userName, passWord, ByteSource.Util.bytes(userName), this.getName());
		
		return simpleAuthenticationInfo;
	}

	
	/**
	 * �û���Ȩ
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		// TODO Auto-generated method stub
		
		//��ȡ��ǰ��¼�û�������֤��
		String userName = (String) principalCollection.getPrimaryPrincipal();
		
		
		//ģ����û������еĽ�ɫ-----(ʵ�ʿ�����roles�Ǵ����ݿ��в�ѯ������)
		Set<String> roles=new HashSet<String>();
		//��ʾ��ǰ��¼���û�ֻӵ��user�����ɫ
		roles.add("user");
		
		//�жϵ�ǰ�û��Ƿ�Ϊadmin,��Ϊadmin�����һ��admin�Ľ�ɫ
		//��˷�admin�û�ֻӵ��user��ɫ,��admin��¼ͬʱ����user��admin��ɫ
		
		if(userName.equals("admin")){
			roles.add("admin");
		}
		
		//������Ȩ��Ϣ
		SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo(roles);
		
		return simpleAuthorizationInfo;
	}

}
