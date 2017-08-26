package com.nocol.dao;

import com.nocol.bean.User;

public interface UserDao {
	/**
	 * 根据用户名查找用户
	 * @param username
	 * @return
	 */
	User findUserByName(String username);
	
	/**
	 * 添加用户
	 * @param user
	 */
	void addUser(User user);
	
	/**
	 * 根据激活码查询用户
	 * @param activecode
	 */
	User findUserByActiveCode(String activecode);
	
	/**
	 * 根据id删除用户
	 * @param id
	 */
	void deleteUser(int id);
	
	/**
	 * 修改用户状态
	 * @param id
	 * @param i
	 */
	void updateState(int id, int state);
	
	/**
	 * 根据用户名和密码查询用户
	 * @param name
	 * @param pwd
	 * @return
	 */
	User findUserByNameAndPwd(String name, String pwd);
	
	/**
	 * 根据用户id查找用户
	 * @param user_id
	 * @return
	 */
	User findUserByUserId(int user_id);

}
