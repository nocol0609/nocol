package com.ssm.dao;

import org.apache.ibatis.annotations.Param;

import com.ssm.bean.User;

/**
 * �־ò�ӿ�
 * @author Nocol
 *
 */
public interface UserDao {
	/**
	 * �����û�����ѯ�û�
	 * @param name
	 * @return
	 */
	User findUserByName(String name);
	
	/**
	 * �����û����������ѯ�û�
	 * @param name
	 * @param pwd
	 * @return
	 */
	User findUserByNameAndPwd(@Param("name")String name, @Param("password")String password);
	
	/**
	 * ����û�
	 * @param user
	 */
	void addUser(User user);
	
	/**
	 * �����û�id��ѯ�û�
	 * @param id
	 * @return
	 */
	User findUserByUserId(int id);
}
