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
 * ������
 * 
 * @author AdminTC
 */
public class MybatisTest {
	// �Ự����
	private SqlSessionFactory sqlSessionFactory;

	// ��������
	@Before
	public void init() throws IOException {

		// �����ļ���SqlMapConfig.xml��
		String resource = "SqlMapConfig.xml";

		// ���������ļ������� ��
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// �����Ự����
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

	}

	// ���Ը���id��ѯ�û�(�õ�������¼)
	@Test
	public void testFindUserById() {

		// ͨ��sqlSessionFactory����sqlSession

		SqlSession sqlSession = sqlSessionFactory.openSession();

		// ͨ��sqlSession�������ݿ�
		// ��һ��������statement��λ�ã�����namespace+statement��id
		// �ڶ�������������Ĳ���
		s_dept user = null;
		try {
			user = sqlSession.selectOne("test.findUserById", 10);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// �ر�sqlSession
			sqlSession.close();
		}
		System.out.println(user);
	}

}
