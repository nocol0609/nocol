package com.nocol.dao;

import com.nocol.bean.User;

public interface UserDao {
	/**
	 * �����û��������û�
	 * @param username
	 * @return
	 */
	User findUserByName(String username);
	
	/**
	 * ����û�
	 * @param user
	 */
	void addUser(User user);
	
	/**
	 * ���ݼ������ѯ�û�
	 * @param activecode
	 */
	User findUserByActiveCode(String activecode);
	
	/**
	 * ����idɾ���û�
	 * @param id
	 */
	void deleteUser(int id);
	
	/**
	 * �޸��û�״̬
	 * @param id
	 * @param i
	 */
	void updateState(int id, int state);
	
	/**
	 * �����û����������ѯ�û�
	 * @param name
	 * @param pwd
	 * @return
	 */
	User findUserByNameAndPwd(String name, String pwd);
	
	/**
	 * �����û�id�����û�
	 * @param user_id
	 * @return
	 */
	User findUserByUserId(int user_id);

}
