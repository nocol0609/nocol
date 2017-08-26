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
	 * ע�⸴���������ͷ�ʽһ:spring 3.0��֧��spEL
	 */
//	@Value("#{Car}") 
	
	/**
	 * ʹ��@Autowired �Զ�װ�䣨��������ע�룩
	 */
//	@Autowired
	
	/**
	 * ע�⸴���������ͷ�ʽ��:@Autowired + @Qualifier ָ��ע��Bean��id 
	 */
//	@Autowired
//	@Qualifier("Car")
	
	/**
	 * ע�⸴���������ͷ�ʽ��:@Resourceע��(�ȼ���@Autowired)
	 */
	@Resource(name="Car")
	
	
	private Car car;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", car=" + car + "]";
	}
	
	
}
