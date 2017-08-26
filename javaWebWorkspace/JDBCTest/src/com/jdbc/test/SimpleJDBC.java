package com.jdbc.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jdbc.util.JdbcUtils;

public class SimpleJDBC {

	private static Connection conn;
	private static Statement statement;
	private static ResultSet rs;

	public static void main(String[] args) throws Exception {

		conn = JdbcUtils.getConnection();
		String sql1 = "insert into student values(student_id.nextVal,'tom','123',22)";
		String sql2="update student set name='jack' where id=2";
		SimpleJDBC.getInsert(sql1);
		SimpleJDBC.getUpdate(sql2);
		
	}

	// 插入
	public static void getInsert(String sql) {
		try {
			statement = conn.createStatement();
			boolean flag = statement.execute(sql);
			if (flag) {
				rs = statement.executeQuery(sql);
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String pwd = rs.getString("passwd");
					int age = rs.getInt("age");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 更新
	public static void getUpdate(String sql) {

		try {
			statement = conn.createStatement();
			int count = statement.executeUpdate(sql);
			System.out.println("更新的条数：" + count);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
