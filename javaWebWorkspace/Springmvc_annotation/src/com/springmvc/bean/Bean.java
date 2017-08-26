package com.springmvc.bean;

/**
 * 普通员工和管理员的包装实体类
 * 
 * @author Nocol
 *
 */
public class Bean {
	private User user;
	private Admin admin;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

}
