package com.jdbc.prestatment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jdbc.util.JdbcUtils;

public class Demo {
	public static void main(String[] args) throws Exception {
		// 注册驱动并获取连接
		Connection conn = JdbcUtils.getConnection();

		// 准备sql语句
		//String sql = "select * from s_dept";
	
		  //执行插入语句(使用占位符),赋值的索引从1开始
		  String sql="select * from student where id=? and name=?";
		  
		// 获取PreparedStatment对象
		  PreparedStatement preStatment = conn.prepareStatement(sql);
		   
		  preStatment.setInt(1,1); 
		  preStatment.setString(2,"rose"); 
		 
		
		// 执行sql语句返回结果集
		ResultSet rs = preStatment.executeQuery();

		// 处理结果集
		while (rs.next()) {
//			int id = rs.getInt("id");
//			String name = rs.getString("name");
//			int region_id = rs.getInt("region_id");
//			System.out.println(id + "--" + name + "--" + region_id);
			int id=rs.getInt("id");
			String name=rs.getString("name");
			System.out.println(id+"---"+name);
		}

		// 关闭资源
		JdbcUtils.close(conn, preStatment, rs);
	}
}
