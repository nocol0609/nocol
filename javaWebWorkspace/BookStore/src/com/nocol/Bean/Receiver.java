package com.nocol.Bean;

import java.io.Serializable;
import java.util.Set;

/*
 * 收件人
 */
public class Receiver implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	//收件人名字
	private String name;
	//收件人地址
	private String address;
	//收件人电话号码
	private String phone;
	//用户
	private User user;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Receiver [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", user=" + user
				+ "]";
	}
	
	
	
}
