package com.nocol.service;

import com.nocol.bean.User;

public interface UserService{
	
	/**
	 * 注册用户
	 * @param user
	 */
	void regist(User user);

	/**
	 * 通过激活码激活用户
	 * @param activecode
	 */
	void activeUser(String activecode);
	
	/**
	 * 根据用户名和密码查找用户
	 * @param name
	 * @param pwd
	 */
	User findUserByNameAndPwd(String name, String pwd);
}
