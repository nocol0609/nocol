package com.jdbc.statment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jdbc.util.JdbcUtils;

/**
 * 使用Statment执行查询语句
 * @author Nocol
 *
 */
public class Demo {
	public static void main(String[] args) throws Exception {
		//注册驱动并获取连接
		Connection conn=JdbcUtils.getConnection();
		//System.out.println(conn);
		
		//获取Statment对象
		Statement statement=conn.createStatement();
		
		//准备Sql语句
		String sql="select * from s_dept";
		
		//执行sql语句，返回结果集
		ResultSet rs=statement.executeQuery(sql);
		
		//处理结果集
		while(rs.next()){
			int id=rs.getInt("id");
			String name=rs.getString("name");
			int region_id=rs.getInt("region_id");	
			
			System.out.println(id+"--"+name+"--"+region_id);
		}
		
		//关闭资源
		JdbcUtils.close(conn, statement,rs);
	}
}
