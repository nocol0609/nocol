package com.ssm.dao;

import org.apache.ibatis.annotations.Param;

import com.ssm.bean.User;

/**
 * 持久层接口
 * @author Nocol
 *
 */
public interface UserDao {
	/**
	 * 根据用户名查询用户
	 * @param name
	 * @return
	 */
	User findUserByName(String name);
	
	/**
	 * 根据用户名和密码查询用户
	 * @param name
	 * @param pwd
	 * @return
	 */
	User findUserByNameAndPwd(@Param("name")String name, @Param("password")String password);
	
	/**
	 * 添加用户
	 * @param user
	 */
	void addUser(User user);
	
	/**
	 * 根据用户id查询用户
	 * @param id
	 * @return
	 */
	User findUserByUserId(int id);
}
