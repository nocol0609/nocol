package com.spring.yilai;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Employee")
public class Employee {
	
	@Value("1001")
	private int id;
	@Value("tom")
	private String name;
	
	/**
	 * 注解复杂引用类型方式一:spring 3.0、支持spEL
	 */
//	@Value("#{Car}") 
	
	/**
	 * 使用@Autowired 自动装配（按照类型注入）
	 */
//	@Autowired
	
	/**
	 * 注解复杂引用类型方式二:@Autowired + @Qualifier 指定注入Bean的id 
	 */
//	@Autowired
//	@Qualifier("Car")
	
	/**
	 * 注解复杂引用类型方式三:@Resource注解(等价于@Autowired)
	 */
	@Resource(name="Car")
	
	
	private Car car;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", car=" + car + "]";
	}
	
	
}
