package com.briup.dao;

import com.briup.bean.UserBean;

/**
 * Dao�ӿ�
 * 
 */

public interface IUserDao {

	//�����û�����ѯ�û�
	UserBean findUserByName(String name);
	//�����ݿ��в�������
	void saveUser(UserBean user);
}
