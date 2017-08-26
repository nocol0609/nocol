package com.spring.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试切面效果
 * @author Nocol
 *
 */
//整合Spring和Junit
@RunWith(SpringJUnit4ClassRunner.class)
//指定配置文件
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class AopTest {
	@Autowired
	private OderServce servce;
	
	@Test
	public void test(){
		servce.add();
		servce.delete();
		servce.update();
	}
}
