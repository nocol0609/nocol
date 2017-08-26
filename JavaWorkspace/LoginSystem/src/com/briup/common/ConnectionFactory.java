package com.briup.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * ��ȡ���Ӷ���Ĺ�����
 * @author cll
 *
 */
public class ConnectionFactory {
    private static String DRIVER;//��������
    private static String URL;//���ݿ�url
    private static String USER;//���ݿ��û���
    private static String PASSWD;//���ݿ��û�����
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
		Class.forName(DRIVER);//ע������
		//��ȡ����
		conn=DriverManager.getConnection(URL,USER,PASSWD);
	} catch (Exception e) {
		e.printStackTrace();
	}
	    return conn; 
   }
}
