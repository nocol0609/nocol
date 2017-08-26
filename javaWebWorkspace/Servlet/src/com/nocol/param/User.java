package com.nocol.param;

public class User {
	private String name;
	private String pwd;
	private String gender;
	private int age;
	private String hobby;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, String pwd, String gender, int age, String hobby) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.gender = gender;
		this.age = age;
		this.hobby = hobby;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", pwd=" + pwd + ", gender=" + gender + ", age=" + age + ", hobby=" + hobby + "]";
	}

}
