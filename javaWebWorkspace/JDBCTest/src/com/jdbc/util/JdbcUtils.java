package com.jdbc.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUtils {

	public static Connection getConnection() throws Exception {
		String url =null;
		String user = null;
		String pwd = null;
		String driver=null;	
		
		//��ȡdb.properties�ļ�
		Properties pro = new Properties();
		/**
		 *  . ����java�������е�Ŀ¼
		 *  ��java��Ŀ�£�. java���������Ŀ¼����Ŀ�ĸ�Ŀ¼��ʼ
		 *  ��web��Ŀ�£�  . java����Ķ�����Ŀ¼��tomcat/binĿ¼��ʼ
		 *  ���Բ���ʹ�õ�.
		 */
		//FileInputStream in = new FileInputStream("./src/db.properties");//��web��Ŀ�²���ʹ�øù���
		
		/**
		 * ʹ����·���Ķ�ȡ��ʽ
		 *  / : б�ܱ�ʾclasspath�ĸ�Ŀ¼
		 *     ��java��Ŀ�£�classpath�ĸ�Ŀ¼��binĿ¼��ʼ
		 *     ��web��Ŀ�£�classpath�ĸ�Ŀ¼��WEB-INF/classesĿ¼��ʼ
		 */
		InputStream in = JdbcUtils.class.getResourceAsStream("/db.properties");
		
		pro.load(in);	
		url=pro.getProperty("url");
		user=pro.getProperty("user");
		pwd=pro.getProperty("passwd");
		driver=pro.getProperty("driver");	

		// ע������
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, pwd);
		return conn;
	}

	public static void close(Connection conn, Statement statement, ResultSet rs) {

		// �ȿ��ĺ�ر�
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
