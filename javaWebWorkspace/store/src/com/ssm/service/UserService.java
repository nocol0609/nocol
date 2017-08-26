package com.ssm.service;

import com.ssm.bean.User;

/**
 * ҵ���ӿ�
 * @author Nocol
 *
 */
public interface UserService {
	/**
	 * �����û�����ѯ�û�
	 * @return
	 */
	User findUserByName(String name);
	
	/**
	 * �����û����������ѯ�û�
	 * @param name
	 * @param pwd
	 * @return
	 */
	User findUserByNameAndPwd(String name, String password);
	
	/**
	 * ע���û�
	 * @param user
	 */
	void regist(User user);
}
