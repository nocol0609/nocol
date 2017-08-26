package com.nocol.Service.Impl;

import com.nocol.Bean.User;
import com.nocol.Dao.UserDao;
import com.nocol.Dao.Impl.UserDaoImpl;
import com.nocol.Service.UserService;

public class UserServiceImpl implements UserService {

	UserDao dao = new UserDaoImpl();

	@Override
	public User findUserByName(String name) {
		// TODO Auto-generated method stub
		return dao.findUserByName(name);
	}

	@Override
	public User findUserByNameAndPwd(String name, String pwd) {
		// TODO Auto-generated method stub
		return dao.findUserByNameAndPwd(name,pwd);
	}

	@Override
	public void regist(User user) {
		// TODO Auto-generated method stub
		dao.addUser(user);
	}
}
