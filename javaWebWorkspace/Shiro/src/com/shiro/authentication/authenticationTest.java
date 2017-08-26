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
 * �û���֤����
 * 
 * @author Nocol
 *
 */
public class authenticationTest {
	
	/**
	 * �û���¼���˳�
	 */
	@Test
	public void testLoginAndLogout() {
		
		//ͨ��ini�����ļ�����SecurityManager����
		Factory<SecurityManager> factory=new IniSecurityManagerFactory("classpath:shiro-first.ini");
		
		//ͨ��factory�������󴴽�SecurityManager����
		SecurityManager securityManager = factory.getInstance();
		
		//��SecurityManager���õ���ǰ����
		SecurityUtils.setSecurityManager(securityManager);
		
		//��SecurityUtils����Subject����
		Subject subject = SecurityUtils.getSubject();
		
		//���û���֤ǰ�ύƾ֤��Ϣ������ʱ�û��ύ���û��������룩
		//token ����
		UsernamePasswordToken token=new UsernamePasswordToken("nocol","123");
		
		try {
			
			//�û���¼ִ����֤
			subject.login(token);
			
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//�Ƿ�ͨ����֤
		boolean authenticated = subject.isAuthenticated();
		System.out.println("��¼�Ƿ�ͨ����֤��"+authenticated);
		
		//�û��˳�
		subject.logout();
		authenticated = subject.isAuthenticated();
		System.out.println("�˳��Ƿ�ͨ����֤��"+authenticated);
		
	}
}
