package com.briup.server;

import com.briup.bean.UserBean;
import com.briup.dao.IUserDao;
import com.briup.dao.UserDaoImpl;

/**
 * �û�ҵ���߼�ʵ����
 * @author Administrator
 *
 */
public class UserServerImpl implements IUserServer{

	private IUserDao dao;
	private UserBean user;
	
	//��¼��ҵ���߼�����
	public String login(String name,String passwd) {
		String result = null;
		dao = new UserDaoImpl();
		 user = dao.findUserByName(name);
		if(user==null){
			result =  "�û�������";
		}else {
			if(user.getPasswd().equals(passwd)){
				result = "����ɹ�";
			}
			
		}
		return result;
	}

	//����ע���ҵ���߼�
	@Override
	public String register(UserBean newUser) {
		String result = null;
		dao = new UserDaoImpl();
		System.out.println(newUser.getName());
		user = dao.findUserByName(newUser.getName());
		if(user==null){
			dao.saveUser(newUser);
			result = "ע��ɹ�";
		}else {
			result = "���û��ѱ�ע��";
		}
		return result;
	}

}
