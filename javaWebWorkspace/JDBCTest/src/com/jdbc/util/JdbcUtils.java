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
		
		//读取db.properties文件
		Properties pro = new Properties();
		/**
		 *  . 代表java命令运行的目录
		 *  在java项目下，. java命令的运行目录从项目的根目录开始
		 *  在web项目下，  . java命令的而运行目录从tomcat/bin目录开始
		 *  所以不能使用点.
		 */
		//FileInputStream in = new FileInputStream("./src/db.properties");//在web项目下不能使用该工具
		
		/**
		 * 使用类路径的读取方式
		 *  / : 斜杠表示classpath的根目录
		 *     在java项目下，classpath的根目录从bin目录开始
		 *     在web项目下，classpath的根目录从WEB-INF/classes目录开始
		 */
		InputStream in = JdbcUtils.class.getResourceAsStream("/db.properties");
		
		pro.load(in);	
		url=pro.getProperty("url");
		user=pro.getProperty("user");
		pwd=pro.getProperty("passwd");
		driver=pro.getProperty("driver");	

		// 注册驱动
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, pwd);
		return conn;
	}

	public static void close(Connection conn, Statement statement, ResultSet rs) {

		// 先开的后关闭
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
