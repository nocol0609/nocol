package com.spring.demo;

public class UserServieImpl implements UserService {

	// ����ע��
	private UserDao dao;

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	public void regist() {

		System.out.println("ҵ���----����û�");

//		// ��ͳ����
//		UserDao dao = new UserDaoImpl();
		dao.add();
	}
}
