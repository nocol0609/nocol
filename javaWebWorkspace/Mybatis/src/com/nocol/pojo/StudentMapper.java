package com.nocol.pojo;

import java.util.List;

public interface StudentMapper {
	List<Student> findAllStudents();

	Student findStudentById(Integer id);

	void insertStudent(Student student);

	void updateStudent(Student student);

	void deleteStudent(Integer id);
}
