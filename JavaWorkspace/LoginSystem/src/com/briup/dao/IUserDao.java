package com.briup.dao;

import com.briup.bean.UserBean;

/**
 * Dao接口
 * 
 */

public interface IUserDao {

	//根据用户名查询用户
	UserBean findUserByName(String name);
	//向数据库中插入数据
	void saveUser(UserBean user);
}
