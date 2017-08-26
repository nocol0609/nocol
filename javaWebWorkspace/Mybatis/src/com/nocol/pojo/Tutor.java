package com.nocol.pojo;

import java.util.List;

public class Tutor {
	private Integer tutorId;
	private String name;
	private String email;
	private PhoneNumber phone;
	private Address address;
	private List<Course> courses;

	public Tutor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tutor(Integer tutorId, String name, String email, PhoneNumber phone, Address address, List<Course> courses) {
		super();
		this.tutorId = tutorId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.courses = courses;
	}

	public Integer getTutorId() {
		return tutorId;
	}

	public void setTutorId(Integer tutorId) {
		this.tutorId = tutorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PhoneNumber getPhone() {
		return phone;
	}

	public void setPhone(PhoneNumber phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Tutor [tutorId=" + tutorId + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address="
				+ address + ", courses=" + courses + "]";
	}

}