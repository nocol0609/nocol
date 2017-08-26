package com.spring.cglibproxy;

/**
 * Cglibʵ�ִ���
 * cglib��̬�����Ǽ̳д�����ͨ��ASM�ֽ������޸��ֽ��������µ����࣬��д����ǿ�����Ĺ���
 * @author Nocol
 *
 */
public class CglibTest {
	public static void main(String[] args) {
		
		//Ŀ�����
		UserDao dao=new UserDao();
		
		CglibProxy cglibProxy=new CglibProxy(dao);
		
		//��ȡ��������
		UserDao userDaoProxy = (UserDao) cglibProxy.getUserDaoProxy();
		
		//��������ִ�з���
		userDaoProxy.add();
	}
}