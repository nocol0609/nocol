package com.spring.jdkproxy2;

/**
 * jdk��̬����ʽ��
 * @author Nocol
 *
 */
public class Test2 {
	public static void main(String[] args) {
		//����Ŀ�����
		UserDao dao=new UserDaoImpl();
		
		//����MyHandlerʵ��
		MyInvocationHandler handler=new MyInvocationHandler(dao);
		
		//��ȡ�������
		UserDao userDaoProxy = (UserDao) handler.getUserDaoProxy();
		
		//���������÷���
		userDaoProxy.add();
	}
}
