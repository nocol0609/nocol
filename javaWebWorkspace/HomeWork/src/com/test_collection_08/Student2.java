package com.test_collection_08;

public class Student2 {
	private int id;
	private String name;
	private int score;

	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student2(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", score=" + score + "]";
	}

	/*@Override
	public int compareTo(Student2 s) {
		// TODO Auto-generated method stub
		int num = s.score - this.score;
		int num2 = num == 0 ? s.name.compareTo(this.name) : num;
		int num3 = num2 == 0 ? s.id - this.id : num2;
		return num3;
	}*/

}
