package com.nocol.web;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

	private static List<User> list = new ArrayList<User>();
	private User user;

	// 添加用户
	public void addUser(User user) {
		list.add(user);
	}

	// 根据用户名和密码查询用户
	public User findUserByNameAndPwd(String name, String pwd) {

		System.out.println("用户名：" + name + "密码：" + pwd);

		for (User user1 : list) {
			if (user1 != null) {
				if (user1.getName().equals(name) && user1.getPwd().equals(pwd)) {// 若为true则存在，可登录
					user = new User(user1.getName(), user1.getPwd());
				}
			} else {
				return null;
			}
		}
		return user;
	}

	// 根据姓名查询用户
	public User findUserByName(String name) {

		System.out.println("注册根据姓名查询后用户名：" + name);

		for (User user1 : list) {
			if (user1.getName().equals(name)) {
				// return user;// 返回user说明已注册
				user = new User(user1.getName(), user1.getPwd());
			} else {
				return null;
			}
		}
		return user;
	}

	// 显示所有用户
	public List<User> findAllUser() {
		return list;
	}
}
