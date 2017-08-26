package com.briup.server;
/**
 * 业务逻辑层的接口
 * @author Administrator
 * 
 */

import com.briup.bean.UserBean;

public interface IUserServer {

	//处理登录逻辑
	String login(String name,String passwd);
	//处理注册逻辑
	String register(UserBean newUser);
	
	
}
