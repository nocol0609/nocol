package com.nocol.onetomany;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.nocol.pojo.Address;
import com.nocol.pojo.Course;
import com.nocol.pojo.Tutor;

public interface OneToManyMapper {

	Tutor findTutorById(Integer id);
	
//	@Select("SELECT tutor_id, name as tutor_name, email, adds_id FROM tutors where tutor_id=#{id}") 
//	@Results( 
//	{ 
//		@Result(id = true, column = "tutor_id", property = "tutorId"), 
//		@Result(column = "name", property = "name"), 
//		@Result(column = "email", property = "email"), 
//		@Result(property = "address", column = "addr_id", 
//		one = @One(select = "com.nocol.OneToMany.OneToManyMapper.findAddressById")), 
//		@Result(property = "courses", column = "tutor_id", 
//		many = @Many(select = "com.nocol.OneToMany.OneToManyMapper.findCoursesByTutorId")) 
//	}) 
//	Tutor findTutorById(int tutorId); 
	
	@Select("select t.tutor_id, t.name ,email,a.addr_id, county, province, city, zip course_id, c.name,description, start_date, end_date  from tutors t left outer join address a on t.adds_id=a.addr_id left outer join courses c on t.tutor_id=c.tutor_id where t.tutor_id=#{tutorId}") 
	@ResultMap("com.nocol.onetomany.OneToManyMapper.TutorResult") 
	Tutor selectTutorById(int tutorId); 
	
	
	@Select("select * from address where addr_id=#{id}")
	@ResultMap("com.nocol.annocation.AnnocationMapper.AddressResult")
	Address findAddressById(int id);
	
	@Select("select * from courses where tutor_id=#{tutorId}") 
	@Results( 
	{ 
		@Result(id = true, column = "course_id", property = "courseId"), 
		@Result(column = "name", property = "name"), 
		@Result(column = "description", property = "description"), 
		@Result(column = "start_date",property = "startDate"), 
		@Result(column = "end_date",property = "endDate") 
	}) 
	List<Course> findCoursesByTutorId(int tutorId); 
	
	
}
