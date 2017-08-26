package com.spring.aspectJ_annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ≤‚ ‘◊¢Ω‚«–√Ê
 * 
 * @author Nocol
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext_aspectJ_annotation.xml")
public class AspectJTest {

	@Autowired
	private UserDao dao;

	@Test
	public void test() {
		dao.add();
		dao.delete();
		dao.update();
	}
}
