package com.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.web.Service;

/**
 * Spring��junit���ɲ��ԣ�����web����
 * 
 * @author Nocol
 *
 */

// ʹ��ע�ⷽʽ��Spring��Junit����
@RunWith(SpringJUnit4ClassRunner.class)
// ָ��Spring�����ļ�
@ContextConfiguration(locations = "classpath:applicationContext-mix.xml")

public class ServiceTest2 {
	// ��Ҫ���ԵĶ���ע��
	@Autowired
	private Service service;

	@Test
	public void servicetest() {
		service.sayHello();
	}
}
