package com.nocol.Service;

import com.nocol.Bean.User;

public interface UserService {
	
	/**
	 * 根据用户名查询用户
	 * @return
	 */
	User findUserByName(String name);
	
	/**
	 * 根据用户名和密码查询用户
	 * @param name
	 * @param pwd
	 * @return
	 */
	User findUserByNameAndPwd(String name, String pwd);
	
	/**
	 * 注册用户
	 * @param user
	 */
	void regist(User user);

}
