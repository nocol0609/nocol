package com.spring.jdkproxy1;
/**
 * 目标对象
 * @author Nocol
 *
 */
public class UserDaoImpl implements UserDao {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("添加用户...");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("删除用户...");
	}

}
