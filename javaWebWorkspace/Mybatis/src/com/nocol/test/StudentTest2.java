package com.nocol.test;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.nocol.extend.ExtendMapper;
import com.nocol.manytomany.ManyToManyMapper;
import com.nocol.onetomany.OneToManyMapper;
import com.nocol.onetoone.OneToOneMapper;
import com.nocol.pojo.Address;
import com.nocol.pojo.Course2;
import com.nocol.pojo.Student;
import com.nocol.pojo.Student2;
import com.nocol.pojo.Tutor;
import com.nocol.utils.MyBatisSqlSessionFactory;

public class StudentTest2 {

	// ����Id��ѯѧ��
	@Test
	public void testSelect() throws Exception {

		SqlSession session = MyBatisSqlSessionFactory.openSession();
		ExtendMapper mapper = session.getMapper(ExtendMapper.class);// �����������

		// ��ʽһ��ͨ���ӿڲ�ѯ
		Student student = mapper.selectStudentWithAddress(2);
		System.out.println(student);

		// ��ʽ����ͨ��sqlSession�������ݿ�
		// ��һ��������statement��λ�ã�����namespace+statement��id
		// �ڶ�������������Ĳ���
		// Student student=
		// session.selectOne("com.nocol.pojo.StudentMapper.findStudentById",1);
		// System.out.println(student);

	}

	@Test
	public void OneToOne() throws Exception {

		SqlSession session = MyBatisSqlSessionFactory.openSession();
		OneToOneMapper mapper = session.getMapper(OneToOneMapper.class);// �����������

//		Address address=mapper.findAddressById(1);
//		System.out.println(address);
		Student student = mapper.findStudentWithAddress(1);
		System.out.println(student);

	}

	@Test
	public void OneToMany() throws Exception {

		SqlSession session = MyBatisSqlSessionFactory.openSession();
		OneToManyMapper mapper = session.getMapper(OneToManyMapper.class);// �����������

		// ��ʽһ��ͨ���ӿڲ�ѯ
		Tutor tutor = mapper.findTutorById(1);
		System.out.println(tutor);

	}

	@Test
	public void ManyToMany() throws Exception {

		SqlSession session = MyBatisSqlSessionFactory.openSession();
		ManyToManyMapper mapper = session.getMapper(ManyToManyMapper.class);// �����������

		
//		  Student2 student2 = new Student2();
//		  
//		  for (int i = 1; i < 11; i++) { student2.setId(1);
//		  student2.setName("briup" + i); 
//		  int d = (int) (Math.random() * 10); 
//		  if(d < 0.5) { 
//		  		student2.setGender("male"); 
//		  } else {
//		  		student2.setGender("female"); 
//		  } 
//		  student2.setGrade("����");
//		  student2.setMajor("��");
//		  mapper.insertStudent(student2); 
//		  
//		  session.commit();
//	}
		 

//		Course2 course = new Course2(1, "0001", "corejava", null);
//		Course2 course1 = new Course2(2, "0002", "oracle", null);
//		Course2 course2 = new Course2(3, "0003", "mybatis", null);
//		mapper.insertCourse(course);
//		mapper.insertCourse(course1);
//		mapper.insertCourse(course2);
//		session.commit();
		
//		Student2 student2=mapper.getStudentById(15);
//		System.out.println(student2);
		
//		Course2 course2 = mapper.getCourseById(25);
//		System.out.println(course2);
		
//		Student2 student2=mapper.getStudentById(15);
//		Course2 course2 = mapper.getCourseById(25);
//		mapper.studentSelectCourse(student2, course2);
//		session.commit();
		
//		List<Student2> list = mapper.getStudentByIdOnCondition(15);
//		for (Student2 student2 : list) {
//			System.out.println(student2);
//		}
		
		Student2 student2 = mapper.getStudentByIdWithCourses(25);
		System.out.println(student2);
	}
}
