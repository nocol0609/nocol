package com.nocol.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.nocol.dynamic.DynamicMapper;
import com.nocol.pojo.Course;
import com.nocol.pojo.PhoneNumber;
import com.nocol.pojo.Student;
import com.nocol.utils.MyBatisSqlSessionFactory;

public class DynamicTest {

	@Test
	public void test() throws Exception {

		SqlSession session = MyBatisSqlSessionFactory.openSession();
		DynamicMapper mapper = session.getMapper(DynamicMapper.class);// 创建代理对象

		HashMap<String, Object> map = new HashMap<>();
		map.put("tutorId", 1);
		map.put("courseName", "%java%");
		//map.put("endDate", new Date());
		List<Course> list = mapper.searchCourses(map);
		for (Course course : list) {
			System.out.println(course);
		}
	}
	
	@Test
	public void test2() throws Exception {

		SqlSession session = MyBatisSqlSessionFactory.openSession();
		DynamicMapper mapper = session.getMapper(DynamicMapper.class);// 创建代理对象

		HashMap<String, Object> map = new HashMap<>();
		map.put("tutorId", 1);
		map.put("courseName", "%java%");
		//map.put("endDate", new Date());
		map.put("searchBy", "Tutor");
		map.put("searchBy", "CourseName");
		List<Course> list = mapper.searchCourses(map);
		for (Course course : list) {
			System.out.println(course);
		}
	}
	
	@Test
	public void test3() throws Exception {

		SqlSession session = MyBatisSqlSessionFactory.openSession();
		DynamicMapper mapper = session.getMapper(DynamicMapper.class);// 创建代理对象

		HashMap<String, Object> map = new HashMap<>();
		map.put("tutorId", 1);
//		map.put("courseName", "%java%");
//		//map.put("endDate", new Date());
//		map.put("searchBy", "Tutor");
//		map.put("searchBy", "CourseName");
		List<Course> list = mapper.searchCourses(map);
		for (Course course : list) {
			System.out.println(course);
		}
	}
	
	@Test
	public void test4() throws Exception {

		SqlSession session = MyBatisSqlSessionFactory.openSession();
		DynamicMapper mapper = session.getMapper(DynamicMapper.class);// 创建代理对象

		Map<String,Object> map = new HashMap<String,Object>(); 
		List<Integer> tutorIds = new ArrayList<Integer>(); 
		tutorIds.add(1); 
		tutorIds.add(2); 
		tutorIds.add(5); 
		map.put("tutorIds", tutorIds); 
		
		List<Course> list = mapper.searchCoursesByTutors(map);
		for (Course course : list) {
			System.out.println(course);
		}
	}
	
	@Test
	public void test5() throws Exception {

		SqlSession session = MyBatisSqlSessionFactory.openSession();
		DynamicMapper mapper = session.getMapper(DynamicMapper.class);// 创建代理对象

		Student student=new Student();
		student.setStudId(2);
		student.setName("nocol");
		student.setEmail("nocol@163.com");
//		PhoneNumber pNumber=new PhoneNumber("0086","0791","4546");
//		student.setpNumber(pNumber);
		mapper.updateStudent(student);
		session.commit();
	}
}
