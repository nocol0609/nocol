package com.ssm.dao;

import org.apache.ibatis.annotations.Param;

import com.ssm.bean.User;

/**
 * �־ò�ӳ��ӿ�
 * @author Nocol
 *
 */
public interface UserDao {
	
	//����û�
	public void addUser(User user);
	
	//�����û����������ѯ�û�
	//ע��������������Զ���װ��map���ϣ������ڼ�Ϊ��
	public User findUserByNameAndPwd(@Param("name")String name, @Param("password")String password);
	
}
