package com.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.web.Service;

/**
 * Spring与junit集成测试（导入web包）
 * 
 * @author Nocol
 *
 */

// 使用注解方式将Spring与Junit整合
@RunWith(SpringJUnit4ClassRunner.class)
// 指定Spring配置文件
@ContextConfiguration(locations = "classpath:applicationContext-mix.xml")

public class ServiceTest2 {
	// 将要测试的对象注入
	@Autowired
	private Service service;

	@Test
	public void servicetest() {
		service.sayHello();
	}
}
