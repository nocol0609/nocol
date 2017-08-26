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
 * @todo JDBC的六大步骤
 * 
 */
public class JDBCStep  {

	public static void main(String[] args) {
		  Connection connect=null;
		  Statement state=null;
		  ResultSet rs=null;
		try {
			//第一步:注册驱动 
			  //第一种方式:类加载(常用)
			//Class.forName("oracle.jdbc.OracleDriver");
			  //第二种方式:利用Driver实现类的对象
			   Driver driver=new OracleDriver();
			   DriverManager.deregisterDriver(driver);//注册驱动
			  //第三种方式:利用系统参数
			   //Djdbc.drivers=oracle.jdbc.OracleDriver  
			//第二步:获取连接
			    //第一种方式:利用DriverManager(常用)
		 //connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","briup","briup");
			    //第二种方式:用Driver实现类对象调用Driver接口的connection()方法连接数据库
			      Properties pro=new Properties();
			       pro.put("user","briup");
			       pro.put("password","briup");
			   connect=driver.connect("jdbc:oracle:thin:@localhost:1521:XE",pro);
		 System.out.println(connect);
		    //第三步:获取执行sql语句的对象
		       //第一种:Statement
		    // state = connect.createStatement();
		       //第二种:PreStatement
		        PreparedStatement preState = connect.prepareStatement("insert into tbl_dept values(6,'6','6')");
		       // preState.setInt(1,2);//若Sql语句为占位符，则使用SetXxx方法对Sql语句补充(1为索引2 为值)
		   //第四步:执行sql语句(Statement),返回结果集对象rs
		    /* rs = state.executeQuery("select *　from"+ " tbl_dept");*/
		     //执行查询语句(PreStatement)，返回结果集对象rs
		   //  rs=preState.executeQuery();
		     //执行任何语句,如果有结果集,返回true,没有 结果集,返回fasle
		        boolean execute = preState.execute();
		      //执行DML语句:insert update delete,返回的值表示受到影响的行数
		        int update = preState.executeUpdate();
		        System.out.println(execute);
		   //第五步：处理结果集
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
			//第六步:关闭资源:先开的后关
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
