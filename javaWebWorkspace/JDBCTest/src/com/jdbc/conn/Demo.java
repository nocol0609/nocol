package com.jdbc.conn;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Properties;

import oracle.jdbc.OracleDriver;

public class Demo {
	public static void main(String[] args) throws Exception{
		
		/**
		 * 第一种方式（常用）
		 * 
		 */
//		String url="jdbc:oracle:thin:@localhost:1521:XE";//url
//		String user="nocol";//用户名
//		String password="123";//密码	
//		
//		//注册驱动(方式一)
//		Driver driver=new OracleDriver();
//		//连接数据库(方式二)
//		Properties pro=new Properties();
//		pro.put("user", user);
//		pro.put("password", password);
//		Connection conn=driver.connect(url, pro);
//		System.out.println(conn);
		
		/**
		 * 第二种方式
		 */
//		//注册驱动(方式二)
//		Driver driver=new OracleDriver();
//		DriverManager.deregisterDriver(driver);
//			
//		//连接数据库(方式二)
//		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","nocol","123");
//		System.out.println(conn);
		
		/**
		 * 第三种方式（常用）
		 */
		//类加载时注册驱动
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","nocol","123");
		System.out.println(conn);
	}
}
