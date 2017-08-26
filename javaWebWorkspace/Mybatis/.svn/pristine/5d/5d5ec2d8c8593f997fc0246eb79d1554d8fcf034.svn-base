package com.nocol.manytomany;

import java.util.List;

import com.nocol.pojo.Course;
import com.nocol.pojo.Course2;
import com.nocol.pojo.Student2;

public interface ManyToManyMapper {
	// 插入student数据
	public void insertStudent(Student2 student);

	// 插入course数据
	public void insertCourse(Course2 course);

	// 通过id查询学生
	public Student2 getStudentById(Integer id);

	// 通过id查询课程
	public Course2 getCourseById(Integer id);

	// 学生x选课y
	public void studentSelectCourse(Student2 student, Course2 course);

	// 查询比指定id值小的学生信息
	public List<Student2> getStudentByIdOnCondition(Integer id);

	// 查询student级联查询出所选的course并且组装成完整的对象
	public Student2 getStudentByIdWithCourses(Integer id);
}