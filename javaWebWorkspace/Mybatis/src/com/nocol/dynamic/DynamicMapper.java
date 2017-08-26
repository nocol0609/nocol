package com.nocol.dynamic;

import java.util.List;
import java.util.Map;

import com.nocol.pojo.Course;
import com.nocol.pojo.Student;

public interface DynamicMapper {

	List<Course> searchCourses(Map<String, Object> map);

	List<Course> searchCoursesByTutors(Map<String, Object> map);
	
	void updateStudent(Student student);
}
