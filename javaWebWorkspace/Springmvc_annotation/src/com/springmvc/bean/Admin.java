package com.springmvc.bean;

import java.util.Date;
/**
 * π‹¿Ì‘±
 * @author Nocol
 *
 */
public class Admin {
	private String name;
	private String password;
	private Date date;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String name, String password, Date date) {
		super();
		this.name = name;
		this.password = password;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", date=" + date.toLocaleString()   + "]";
	}

}
