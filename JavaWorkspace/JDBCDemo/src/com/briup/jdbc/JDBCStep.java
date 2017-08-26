package com.briup.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import oracle.jdbc.OracleDriver;

/**
 * 
 * @author cll
 * 2016-12-27
 * @todo JDBC��������
 * 
 */
public class JDBCStep  {

	public static void main(String[] args) {
		  Connection connect=null;
		  Statement state=null;
		  ResultSet rs=null;
		try {
			//��һ��:ע������ 
			  //��һ�ַ�ʽ:�����(����)
			//Class.forName("oracle.jdbc.OracleDriver");
			  //�ڶ��ַ�ʽ:����Driverʵ����Ķ���
			   Driver driver=new OracleDriver();
			   DriverManager.deregisterDriver(driver);//ע������
			  //�����ַ�ʽ:����ϵͳ����
			   //Djdbc.drivers=oracle.jdbc.OracleDriver  
			//�ڶ���:��ȡ����
			    //��һ�ַ�ʽ:����DriverManager(����)
		 //connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","briup","briup");
			    //�ڶ��ַ�ʽ:��Driverʵ����������Driver�ӿڵ�connection()�����������ݿ�
			      Properties pro=new Properties();
			       pro.put("user","briup");
			       pro.put("password","briup");
			   connect=driver.connect("jdbc:oracle:thin:@localhost:1521:XE",pro);
		 System.out.println(connect);
		    //������:��ȡִ��sql���Ķ���
		       //��һ��:Statement
		    // state = connect.createStatement();
		       //�ڶ���:PreStatement
		        PreparedStatement preState = connect.prepareStatement("insert into tbl_dept values(6,'6','6')");
		       // preState.setInt(1,2);//��Sql���Ϊռλ������ʹ��SetXxx������Sql��䲹��(1Ϊ����2 Ϊֵ)
		   //���Ĳ�:ִ��sql���(Statement),���ؽ��������rs
		    /* rs = state.executeQuery("select *��from"+ " tbl_dept");*/
		     //ִ�в�ѯ���(PreStatement)�����ؽ��������rs
		   //  rs=preState.executeQuery();
		     //ִ���κ����,����н����,����true,û�� �����,����fasle
		        boolean execute = preState.execute();
		      //ִ��DML���:insert update delete,���ص�ֵ��ʾ�ܵ�Ӱ�������
		        int update = preState.executeUpdate();
		        System.out.println(execute);
		   //���岽����������
		      while(rs.next()){
		    	int id = rs.getInt("id");  
		    	String name = rs.getString("name");
		    	String city = rs.getString("city");
		    	System.out.println(id+" "+name+" "+city);
		      }
		} /*catch (ClassNotFoundException e) {
			e.printStackTrace(); 
		}*/ catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//������:�ر���Դ:�ȿ��ĺ��
				try {
				  if(rs!=null) rs.close();
				  if(state!=null) state.close();
				  if(connect!=null) connect.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}		
	  }
	}
