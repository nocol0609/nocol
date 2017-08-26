package com.jdbc.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.jdbc.util.JdbcUtils;

public class BanchTest {
	private static Connection conn;
	private static Statement statement;
	private static PreparedStatement preStatement;

	public static void main(String[] args) {
		try {
			conn=JdbcUtils.getConnection();
			statement=conn.createStatement();
			String sql = "insert into student values(?,?,?,?)";
			preStatement = conn.prepareStatement(sql);
			for (int i = 1; i < 50000; i++) {
				preStatement.setInt(1, i);
				preStatement.setString(2, "b_"+i);
				preStatement.setString(3, "b_"+i);
				preStatement.setInt(4, 18);
				preStatement.addBatch();
				if(i%5000==0){
					preStatement.executeBatch();
					//preStatement.clearBatch();
				}
				
			}
			// conn=JdbcUtils.getConnection();
			// statement=conn.createStatement();
			// String sql1="insert into student values(6,'nocol','123',17)";
			// String sql2="update student set age=30 where id =6";
			//
			// statement.addBatch(sql1);
			// statement.addBatch(sql2);
			// statement.executeBatch();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
