package com.ssm.service;

import com.ssm.bean.User;

public interface UserService {
	//用户注册
	void regist(User user);
	//用户登录
	void login(String name, String password);

}
