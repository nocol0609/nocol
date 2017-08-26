package com.spring.aspectJ_annotation;

public class UserDaoImpl implements UserDao {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("add....");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("delete....");
		int a=10/0;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("update.....");
	}
	
}
