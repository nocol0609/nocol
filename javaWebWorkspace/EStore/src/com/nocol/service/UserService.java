package com.nocol.service;

import com.nocol.bean.User;

public interface UserService{
	
	/**
	 * ע���û�
	 * @param user
	 */
	void regist(User user);

	/**
	 * ͨ�������뼤���û�
	 * @param activecode
	 */
	void activeUser(String activecode);
	
	/**
	 * �����û�������������û�
	 * @param name
	 * @param pwd
	 */
	User findUserByNameAndPwd(String name, String pwd);
}
