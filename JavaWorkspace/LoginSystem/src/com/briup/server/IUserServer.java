package com.briup.server;
/**
 * ҵ���߼���Ľӿ�
 * @author Administrator
 * 
 */

import com.briup.bean.UserBean;

public interface IUserServer {

	//�����¼�߼�
	String login(String name,String passwd);
	//����ע���߼�
	String register(UserBean newUser);
	
	
}
