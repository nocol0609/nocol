package com.springmvc.controller;

/**
 * UserÊµÌåÀà
 * 
 * @author Nocol
 *
 */
public class User {
	private String name;
	private String gender;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", gender=" + gender + "]";
	}

}
