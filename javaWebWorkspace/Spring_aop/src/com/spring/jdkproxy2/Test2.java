package com.spring.jdkproxy2;

/**
 * jdk动态代理方式二
 * @author Nocol
 *
 */
public class Test2 {
	public static void main(String[] args) {
		//创建目标对象
		UserDao dao=new UserDaoImpl();
		
		//创建MyHandler实例
		MyInvocationHandler handler=new MyInvocationHandler(dao);
		
		//获取代理对象
		UserDao userDaoProxy = (UserDao) handler.getUserDaoProxy();
		
		//代理对象调用方法
		userDaoProxy.add();
	}
}
