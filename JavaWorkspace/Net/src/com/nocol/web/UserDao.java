package com.nocol.web;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

	private static List<User> list = new ArrayList<User>();
	private User user;

	// ����û�
	public void addUser(User user) {
		list.add(user);
	}

	// �����û����������ѯ�û�
	public User findUserByNameAndPwd(String name, String pwd) {

		System.out.println("�û�����" + name + "���룺" + pwd);

		for (User user1 : list) {
			if (user1 != null) {
				if (user1.getName().equals(name) && user1.getPwd().equals(pwd)) {// ��Ϊtrue����ڣ��ɵ�¼
					user = new User(user1.getName(), user1.getPwd());
				}
			} else {
				return null;
			}
		}
		return user;
	}

	// ����������ѯ�û�
	public User findUserByName(String name) {

		System.out.println("ע�����������ѯ���û�����" + name);

		for (User user1 : list) {
			if (user1.getName().equals(name)) {
				// return user;// ����user˵����ע��
				user = new User(user1.getName(), user1.getPwd());
			} else {
				return null;
			}
		}
		return user;
	}

	// ��ʾ�����û�
	public List<User> findAllUser() {
		return list;
	}
}
