package com.ssm.service.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.bean.User;
import com.ssm.dao.UserDao;
import com.ssm.service.UserService;

/**
 * ÒµÎñ²ã
 * @author Nocol
 *
 */

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public void regist(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
	}

	@Override
	public void login(String name, String password) {
		// TODO Auto-generated method stub
		userDao.findUserByNameAndPwd(name,password);
	}
}
