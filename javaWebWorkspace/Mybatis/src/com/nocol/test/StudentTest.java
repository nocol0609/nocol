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

	// ����ѧ��
	@Test
	public void testInsert() throws Exception {
		// ���������ļ���������
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		// �����Ự����
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// �����û��ӿڣ����ݿ��������
		SqlSession session = sqlSessionFactory.openSession();
		
		
		// ��һ��ִ��sql���ķ�ʽ ͨ��XxxxMapper�ӿڵ�ʵ�������������
		// ��̬���XxxxMapper�ӿڵ�ʵ����
		StudentMapper mapper = session.getMapper(StudentMapper.class);// �����������
		PhoneNumber pNumber = new PhoneNumber("0086", "0791", "6768");
		mapper.insertStudent(new Student(3, "tom", "123@.qq.com", new Date(), pNumber));

		// �ύ
		session.commit();

		// ͨ��sqlSession�������ݿ�
		// ��һ��������statement��λ�ã�����namespace+statement��id
		// �ڶ�������������Ĳ���
		// int
		// count=session.insert("com.nocol.pojo.StudentMapper.insertStudent");
		// System.out.println("Ӱ����"+count+"������");

	}

	// ����Id��ѯѧ��
	@Test
	public void testSelect() throws Exception {

		SqlSession session = MyBatisSqlSessionFactory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);// �����������
		
		
		// ��ʽһ��ͨ���ӿڲ�ѯ
		Student student = mapper.findStudentById(2);
		System.out.println(student);

		// ��ʽ����ͨ��sqlSession�������ݿ�
		// ��һ��������statement��λ�ã�����namespace+statement��id
		// �ڶ�������������Ĳ���
		// Student student=
		// session.selectOne("com.nocol.pojo.StudentMapper.findStudentById",1);
		// System.out.println(student);

	}

	// ��ѯ����ѧ��
	@Test
	public void testSelectAll() throws Exception {

		/*
		 * SqlSession session = MyBatisSqlSessionFactory.openSession();
		 * StudentMapper mapper = session.getMapper(StudentMapper.class);//
		 * �����������
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

	// ����ѧ��
	@Test
	public void updateStudent() throws Exception {

		SqlSession session = MyBatisSqlSessionFactory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);// �����������

		Student student = new Student();
		student.setStudId(2);
		student.setName("jack");
		student.setEmail("456@qq.com");
		student.setDob(new Date());

		PhoneNumber pNumber = new PhoneNumber("0086", "0791", "6768");
		student.setpNumber(pNumber);
		mapper.updateStudent(student);
		session.commit();

		// ��ʽ��
		// int count =
		// sqlSession.update("com.nocol.mappers.StudentMapper.updateStudent",
		// student);
	}

	// ɾ��ѧ��
	@Test
	public void deleteStudent() throws Exception {

		SqlSession session = MyBatisSqlSessionFactory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);// �����������

		mapper.deleteStudent(4);
		session.commit();

		// ��ʽ��
		// int count =
		// sqlSession.delete("com.nocol.mappers.StudentMapper.deleteStudent",
		// studId);
	}
}
