package com.briup.server;

import com.briup.bean.UserBean;
import com.briup.dao.IUserDao;
import com.briup.dao.UserDaoImpl;

/**
 * 用户业务逻辑实现类
 * @author Administrator
 *
 */
public class UserServerImpl implements IUserServer{

	private IUserDao dao;
	private UserBean user;
	
	//登录的业务逻辑处理
	public String login(String name,String passwd) {
		String result = null;
		dao = new UserDaoImpl();
		 user = dao.findUserByName(name);
		if(user==null){
			result =  "用户不存在";
		}else {
			if(user.getPasswd().equals(passwd)){
				result = "登入成功";
			}
			
		}
		return result;
	}

	//处理注册的业务逻辑
	@Override
	public String register(UserBean newUser) {
		String result = null;
		dao = new UserDaoImpl();
		System.out.println(newUser.getName());
		user = dao.findUserByName(newUser.getName());
		if(user==null){
			dao.saveUser(newUser);
			result = "注册成功";
		}else {
			result = "该用户已被注册";
		}
		return result;
	}

}
