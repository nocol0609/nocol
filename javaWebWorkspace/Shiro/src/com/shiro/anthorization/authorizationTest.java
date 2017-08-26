package com.shiro.anthorization;

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
 * �û���Ȩ����
 * 
 * @author Nocol
 *
 */
public class authorizationTest {
	
	/**
	 * ��ɫ��Ȩ
	 */
	@Test
	public void testAuthorization() {
		//������ȫ������󹤳�
		Factory<SecurityManager> factory=new IniSecurityManagerFactory("classpath:shiro-permission.ini");
		
		//��ȡ��ȫ�������
		SecurityManager securityManager = factory.getInstance();
		
		//��securityManager���õ���ǰ����
		SecurityUtils.setSecurityManager(securityManager);
		
		//��ȡsubject����
		Subject subject = SecurityUtils.getSubject();
		
		//����token
		UsernamePasswordToken token=new UsernamePasswordToken("tom","123");
		
		//�ύ��֤
		try {
			subject.login(token);
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("�Ƿ�ͨ����֤��"+subject.isAuthenticated());
		
		
		//��֤ͨ����ִ����Ȩ
		
		//���ڽ�ɫ����Ȩ
		
		/**
		 * �жϵ�ǰ��¼���û��Ƿ���role1�����ɫ��role1�����ɫ������Ӧ��Ȩ�ޣ�
		 */
		boolean hasRole = subject.hasRole("role1");  //ָtom�ǲ���ӵ��role1�����ɫ
		System.out.println("������ɫ�ж�:"+hasRole);
		
		/**
		 * �жϵ��ڵ�¼���û��Ƿ���role1��role2��������ɫ��role1��role2��������ɫ�ֱ�ӵ�в�ͬ��Ȩ�ޣ�
		 */
		boolean hasAllRoles = subject.hasAllRoles(Arrays.asList("role1","role2"));
		System.out.println("�����ɫ�жϣ�"+hasAllRoles);
		
		// ʹ��check����������Ȩ�������Ȩ��ͨ�����׳��쳣
		// subject.checkRole("role13");
		
		
		System.out.println("--------------------------------------------------------------");
		
		//����Ȩ�޵���Ȩ
		
		/**
		 * �жϵ�ǰ�û��Ƿ�ӵ��ĳȨ��
		 */
		boolean permitted = subject.isPermitted("user:create"); //��ʾ���û���Դ��������userʵ��������create������Ȩ��
		System.out.println("����Ȩ�޵��жϣ�"+permitted);
		
		/**
		 *  �жϵ�ǰ�û��Ƿ�ӵ�ж��Ȩ��
		 */
		boolean isPermittedAll = subject.isPermittedAll("user:create:1",
				"user:delete");
		System.out.println("���Ȩ�޵��ж�" + isPermittedAll);
		
		// ʹ��check����������Ȩ�������Ȩ��ͨ�����׳��쳣
		//subject.checkPermission("items:add:1");
	}
}

