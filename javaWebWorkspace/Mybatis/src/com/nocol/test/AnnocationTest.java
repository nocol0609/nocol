package com.nocol.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.nocol.annocation.AnnocationMapper;
import com.nocol.onetomany.OneToManyMapper;
import com.nocol.pojo.Address;
import com.nocol.pojo.Course;
import com.nocol.pojo.Person;
import com.nocol.pojo.Tutor;
import com.nocol.utils.MyBatisSqlSessionFactory;

public class AnnocationTest {
	@Test
	public void insertTest() {
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		AnnocationMapper mapper = session.getMapper(AnnocationMapper.class);

		Address address = new Address();
		address.setAddId(1);
		Person person = new Person(1, "tom", 20, address);
		mapper.insertPerson(person);
		session.commit();
	}

	@Test
	public void update() {
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		AnnocationMapper mapper = session.getMapper(AnnocationMapper.class);

		Person person = new Person(1, "jack", 22);
		mapper.insertPerson(person);
		session.commit();
	}

	@Test
	public void delete() {
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		AnnocationMapper mapper = session.getMapper(AnnocationMapper.class);

		mapper.deletePerrson(42);
		session.commit();
	}

	@Test
	public void select() {
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		AnnocationMapper mapper = session.getMapper(AnnocationMapper.class);

		// Person person = mapper.findPersonById(41);
		// System.out.println(person);

		Address address = mapper.findAddressById(1);
		System.out.println(address);

	}

	@Test
	public void selectAll() {
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		AnnocationMapper mapper = session.getMapper(AnnocationMapper.class);

		List<Address> list = mapper.findAllAddress();
		for (Address address : list) {
			System.out.println(address);
		}

	}

	@Test
	public void selectAllPerson() {
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		AnnocationMapper mapper = session.getMapper(AnnocationMapper.class);

		List<Person> list = mapper.findAllPerson();
		for (Person person : list) {
			System.out.println(person);
		}
	}

	@Test
	public void selectPersontWithAddress() {
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		AnnocationMapper mapper = session.getMapper(AnnocationMapper.class);

		Person person = mapper.selectPersonWithAddress(41);
		System.out.println(person);
	}

	@Test
	public void OneToMany() {
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		OneToManyMapper mapper = session.getMapper(OneToManyMapper.class);

		 Address address = mapper.findAddressById(1);
		 System.out.println(address);

		List<Course> list = mapper.findCoursesByTutorId(1);
		for (Course course : list) {
			System.out.println(course);
		}
	}
	
	@Test
	public void selectTutorById() {
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		OneToManyMapper mapper = session.getMapper(OneToManyMapper.class);

//		List<Course> list = mapper.findCoursesByTutorId(1);
//		for (Course course : list) {
//			System.out.println(course);
//		}
		Tutor tutor = mapper.selectTutorById(1);
		System.out.println(tutor);
	}

}
