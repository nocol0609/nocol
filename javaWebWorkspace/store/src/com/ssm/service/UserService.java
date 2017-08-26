package com.ssm.service;

import com.ssm.bean.User;

/**
 * 业务层接口
 * @author Nocol
 *
 */
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
	User findUserByNameAndPwd(String name, String password);
	
	/**
	 * 注册用户
	 * @param user
	 */
	void regist(User user);
}
