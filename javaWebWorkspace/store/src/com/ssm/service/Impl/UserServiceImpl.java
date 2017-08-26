package com.ssm.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.bean.User;
import com.ssm.dao.UserDao;
import com.ssm.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public User findUserByName(String name) {
		// TODO Auto-generated method stub
		return userDao.findUserByName(name);
	}

	@Override
	public User findUserByNameAndPwd(String name, String password) {
		// TODO Auto-generated method stub
		return userDao.findUserByNameAndPwd(name, password);
	}

	@Override
	public void regist(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
	}

}
