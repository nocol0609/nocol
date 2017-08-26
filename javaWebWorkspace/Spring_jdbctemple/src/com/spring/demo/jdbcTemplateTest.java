package com.spring.demo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * jdbcTemple入门测试（使用jdbcTemple完成对数据库的操作） ------无配置文件版
 * 
 * @author Nocol
 *
 */
public class jdbcTemplateTest {
	public static void main(String[] args) {
		// 创建数据库连接池（使用Spring内置连接池对象）
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		dataSource.setUsername("oracle");
		dataSource.setPassword("123");
		
		//通过连接池对象获得jdbc模板对象
		JdbcTemplate template=new JdbcTemplate(dataSource);
		
		//执行sql语句
		String sql="create table test(id number primary key,name varchar2(10))";
		template.execute(sql);
	}
}
