package com.briup.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * 获取连接对象的工厂类
 * @author cll
 *
 */
public class ConnectionFactory {
    private static String DRIVER;//驱动类名
    private static String URL;//数据库url
    private static String USER;//数据库用户名
    private static String PASSWD;//数据库用户密码
   static{
	   /*DRIVER="oracle.jdbc.OracleDriver";
	   URL="jdbc:oracle:thin:@localhost:1521:XE";
	   USER="briup";
	   PASSWD="briup";*/
	   Properties p=new Properties();
	   try {
		p.load(new FileInputStream("src/com/briup/common/db.properties"));
		DRIVER=p.getProperty("driver");
		URL=p.getProperty("url");
		USER=p.getProperty("user");
		PASSWD=p.getProperty("passwd");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   
   }
   public static Connection getConnection() {
	   Connection conn=null;
	   try {
		Class.forName(DRIVER);//注册驱动
		//获取连接
		conn=DriverManager.getConnection(URL,USER,PASSWD);
	} catch (Exception e) {
		e.printStackTrace();
	}
	    return conn; 
   }
}
