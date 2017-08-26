package com.nocol.pojo;

import java.util.List;

public class Student2 {
	private Integer id;
	private String name; // ����
	private String gender; // �Ա�
	private String major; // רҵ
	private String grade; // �꼶
	private List<Course2> courses;// ��ѡ�Ŀγ�

	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student2(Integer id, String name, String gender, String major, String grade, List<Course2> courses) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.major = major;
		this.grade = grade;
		this.courses = courses;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public List<Course2> getCourses() {
		return courses;
	}

	public void setCourses(List<Course2> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", gender=" + gender + ", major=" + major + ", grade=" + grade
				+ ", courses=" + courses + "]";
	}

}