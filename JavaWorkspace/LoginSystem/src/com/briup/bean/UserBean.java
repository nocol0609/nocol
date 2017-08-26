package com.briup.bean;

public class UserBean {

	private int id;
	private String name;
	private String passwd;
	private String tel;
	private String address;

	public UserBean(int id,String name, String passwd, String tel, String address) {
		super();
		this.id = id;
		this.name = name;
		this.passwd = passwd;
		this.tel = tel;
		this.address = address;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserBean() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
