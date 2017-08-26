package com.nocol.test;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.nocol.pojo.PhoneNumber;
import com.nocol.pojo.Student;
import com.nocol.pojo.StudentMapper;
import com.nocol.utils.MyBatisSqlSessionFactory;

public class StudentTest {

	// 增加学生
	@Test
	public void testInsert() throws Exception {
		// 加载配置文件到输入流
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		// 创建会话工厂
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 面向用户接口，数据库操作方法
		SqlSession session = sqlSessionFactory.openSession();
		
		
		// 第一种执行sql语句的方式 通过XxxxMapper接口的实现类对象来调用
		// 动态获得XxxxMapper接口的实现类
		StudentMapper mapper = session.getMapper(StudentMapper.class);// 创建代理对象
		PhoneNumber pNumber = new PhoneNumber("0086", "0791", "6768");
		mapper.insertStudent(new Student(3, "tom", "123@.qq.com", new Date(), pNumber));

		// 提交
		session.commit();

		// 通过sqlSession操作数据库
		// 第一个参数：statement的位置，等于namespace+statement的id
		// 第二个参数：传入的参数
		// int
		// count=session.insert("com.nocol.pojo.StudentMapper.insertStudent");
		// System.out.println("影响了"+count+"条数据");

	}

	// 根据Id查询学生
	@Test
	public void testSelect() throws Exception {

		SqlSession session = MyBatisSqlSessionFactory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);// 创建代理对象
		
		
		// 方式一：通过接口查询
		Student student = mapper.findStudentById(2);
		System.out.println(student);

		// 方式二：通过sqlSession操作数据库
		// 第一个参数：statement的位置，等于namespace+statement的id
		// 第二个参数：传入的参数
		// Student student=
		// session.selectOne("com.nocol.pojo.StudentMapper.findStudentById",1);
		// System.out.println(student);

	}

	// 查询所有学生
	@Test
	public void testSelectAll() throws Exception {

		/*
		 * SqlSession session = MyBatisSqlSessionFactory.openSession();
		 * StudentMapper mapper = session.getMapper(StudentMapper.class);//
		 * 创建代理对象
		 * 
		 * List<Student> list = mapper.findAllStudents(); 
		 * for (Student student :list) { 
		 * 		System.out.println(student); 
		 * }
		 */

		SqlSession session = MyBatisSqlSessionFactory.openSession();
		List<Map<String, String>> list = session.selectList("com.nocol.pojo.StudentMapper.findAllStudents");
		for (Map<String, String> map : list) {
//			Set set = map.entrySet();
//			for (Object o : set) {
				System.out.println("studId:" + map.get("Stud_id"));
				System.out.println("name:" + map.get("name"));
				System.out.println("email:" + map.get("email"));
				System.out.println("dob:" + map.get("dob"));
				System.out.println("pNumber:" + map.get("phone"));
//			}

		}
	}

	// 更新学生
	@Test
	public void updateStudent() throws Exception {

		SqlSession session = MyBatisSqlSessionFactory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);// 创建代理对象

		Student student = new Student();
		student.setStudId(2);
		student.setName("jack");
		student.setEmail("456@qq.com");
		student.setDob(new Date());

		PhoneNumber pNumber = new PhoneNumber("0086", "0791", "6768");
		student.setpNumber(pNumber);
		mapper.updateStudent(student);
		session.commit();

		// 方式二
		// int count =
		// sqlSession.update("com.nocol.mappers.StudentMapper.updateStudent",
		// student);
	}

	// 删除学生
	@Test
	public void deleteStudent() throws Exception {

		SqlSession session = MyBatisSqlSessionFactory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);// 创建代理对象

		mapper.deleteStudent(4);
		session.commit();

		// 方式二
		// int count =
		// sqlSession.delete("com.nocol.mappers.StudentMapper.deleteStudent",
		// studId);
	}
}
