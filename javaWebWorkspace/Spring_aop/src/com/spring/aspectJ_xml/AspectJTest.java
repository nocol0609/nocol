package com.spring.aspectJ_xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ≤‚ ‘AspectJ«–√Ê–ßπ˚
 * 
 * @author Nocol
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AspectJTest {
	@Autowired
	private UserService service;

	@Test
	public void test() {
		service.add();
		service.delete();
		service.update();
	}
}
