package com.jdbc.conn;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Properties;

import oracle.jdbc.OracleDriver;

public class Demo {
	public static void main(String[] args) throws Exception{
		
		/**
		 * ��һ�ַ�ʽ�����ã�
		 * 
		 */
//		String url="jdbc:oracle:thin:@localhost:1521:XE";//url
//		String user="nocol";//�û���
//		String password="123";//����	
//		
//		//ע������(��ʽһ)
//		Driver driver=new OracleDriver();
//		//�������ݿ�(��ʽ��)
//		Properties pro=new Properties();
//		pro.put("user", user);
//		pro.put("password", password);
//		Connection conn=driver.connect(url, pro);
//		System.out.println(conn);
		
		/**
		 * �ڶ��ַ�ʽ
		 */
//		//ע������(��ʽ��)
//		Driver driver=new OracleDriver();
//		DriverManager.deregisterDriver(driver);
//			
//		//�������ݿ�(��ʽ��)
//		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","nocol","123");
//		System.out.println(conn);
		
		/**
		 * �����ַ�ʽ�����ã�
		 */
		//�����ʱע������
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","nocol","123");
		System.out.println(conn);
	}
}
