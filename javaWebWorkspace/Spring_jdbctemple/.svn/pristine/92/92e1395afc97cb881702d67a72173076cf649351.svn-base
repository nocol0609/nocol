package com.spring.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 使用Spring内置连接池对象测试（基于文件配置）
 * @author Nocol
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class jdbcTemplateTest {
	@Autowired
	private JdbcTemplate template;
	
	@Test
	public void jdbcTemplateTest(){
		//template.execute("create table test2(id number primary key,name varchar2(10))");
		template.execute("drop table test2");
	}
}
