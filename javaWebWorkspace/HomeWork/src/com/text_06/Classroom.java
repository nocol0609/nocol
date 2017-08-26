package com.text_06;

public class Classroom {
	public Teacher teacher; // 保存教师
	public Student[] students = new Student[40];// 保存学生
	public int count = 0; // 保存学生数量

	public Teacher getTeacher() {
		// 返回教室中的教师
		return teacher;
	}

	public Student[] getStudents() {
		// 返回所有的学生
		return students;
	}

	public void setTeacher(Teacher tea) {
		// 更换教师
		teacher = tea;
	}

	public void addStudent(int index,Student stu) {
		// 增加学生
		for(int i=count;i>index;i--){
			students[i]=students[i-1];		
		}
		students[index]=stu;
		count++;
	}

	public boolean removeStudent(int index) {
		// 删除学生
		if (index > count) {
			return false;
		} else {
			for (int i = index; i < count - 1; i++) {
				students[i] = students[i + 1];
			}
			count--;
			return true;
		}
	}

	public int getStudentNum() {
		// 返回教室中学生的数量
		return count;

	}

	public void print() {
		// 输出当前教室中的教师和学生的信息
		System.out.println(getTeacher().toString());
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
