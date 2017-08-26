package com.spring.demo;

public class UserServieImpl implements UserService {

	// 依赖注入
	private UserDao dao;

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	public void regist() {

		System.out.println("业务层----添加用户");

//		// 传统做法
//		UserDao dao = new UserDaoImpl();
		dao.add();
	}
}
