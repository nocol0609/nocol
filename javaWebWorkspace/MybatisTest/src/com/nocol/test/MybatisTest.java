package com.nocol.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;  

import com.nocol.bean.s_dept;

/**
 * 工具类
 * 
 * @author AdminTC
 */
public class MybatisTest {
	// 会话工厂
	private SqlSessionFactory sqlSessionFactory;

	// 创建工厂
	@Before
	public void init() throws IOException {

		// 配置文件（SqlMapConfig.xml）
		String resource = "SqlMapConfig.xml";

		// 加载配置文件到输入 流
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// 创建会话工厂
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

	}

	// 测试根据id查询用户(得到单条记录)
	@Test
	public void testFindUserById() {

		// 通过sqlSessionFactory创建sqlSession

		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 通过sqlSession操作数据库
		// 第一个参数：statement的位置，等于namespace+statement的id
		// 第二个参数：传入的参数
		s_dept user = null;
		try {
			user = sqlSession.selectOne("test.findUserById", 10);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭sqlSession
			sqlSession.close();
		}
		System.out.println(user);
	}

}
