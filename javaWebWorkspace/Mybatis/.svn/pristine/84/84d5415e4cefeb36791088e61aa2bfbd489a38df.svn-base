package com.nocol.annocation;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.nocol.pojo.Address;
import com.nocol.pojo.Person;

public interface AnnocationMapper {

	/*
	 * @Insert("insert into person(id,name,age) values(#{id},#{name},#{age})")
	 * int insertPerson(Person person);
	 */

	@Insert("insert into person(id,name,age,addr_id) values(#{id},#{name},#{age},#{address.addrId})")
	@SelectKey(statement = "select my_seq.nextval from dual", keyProperty = "id", resultType = int.class, before = true)
	int insertPerson(Person person);

	@Update("update person set name=#{name},age=#{age} where id=#{id}")
	void updatePerson(Person person);

	@Delete("delete from person where id=#{id}")
	void deletePerrson(int id);

	// @Select("select id,name,age from person where id=#{id}")
	// Person findPersonById(Integer id);

	@Select("select * from address")
	@Results({ 
		@Result(id = true, column = "addr_id", property = "addrId"),
		@Result(column = "county", property = "country"), 
		@Result(column = "province", property = "province"),
		@Result(column = "city", property = "city"), 
		@Result(column = "zip", property = "zip") })
	List<Address> findAllAddress();

	@Select("select * from person where id=#{id}")
	@ResultMap("com.nocol.annocation.AnnocationMapper.PersonResult")
	Person findPersonById(int id);

	@Select("select * from person")
	@ResultMap("com.nocol.annocation.AnnocationMapper.PersonResult")
	List<Person> findAllPerson();

	// @Select("select addr_id as addrId, county, province, city, zip from
	// address where addr_id=#{id}")
	// Address findAddressById(int id);

	@Select("select * from address where addr_id=#{id}")
	@ResultMap("com.nocol.annocation.AnnocationMapper.AddressResult")
	Address findAddressById(int id);

//	@Select("select * from person where id=#{id} ")
//	@Results({ 
//		@Result(id = true, column = "id", property = "id"), 
//		@Result(column = "name", property = "name"),
//		@Result(column = "age", property = "age"),
//		@Result(property = "address", column = "addr_id", 
//		one = @One(select = "com.nocol.annocation.AnnocationMapper.findAddressById") ) })
//	Person selectPersontWithAddress(int id);
	
	@Select("select id, name, age, a.addr_id, county, province, city, zip FROM person s left outer join address a on s.addr_id=a.addr_id  where id=#{id} ") 
	@ResultMap("com.nocol.annocation.AnnocationMapper.PersonResult") 
	Person selectPersonWithAddress(int id); 

}
