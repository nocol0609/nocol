package com.nocol.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DataSourceUtils {
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
	private static ThreadLocal<Connection> local = new ThreadLocal<>();

	/**
	 * 从线程中获取连接
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		// 从本地线程中获取conneciton
		Connection conn = local.get();
		if (conn == null) {
			conn = dataSource.getConnection();
			//将连接对象和本地线程绑定
			local.set(conn);
		}
		return conn;
	}

	// 获取数据源
	public static DataSource getDataSource() {
		return dataSource;
	}

	// 释放 connection
	public static void closeConn(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
				// 和线程解绑
				local.remove();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			conn = null;
		}
	}

	// 开启事务
	public static void startTransaction() throws SQLException {
		getConnection().setAutoCommit(false);
	}

	/**
	 * 事务提交且释放连接
	 */
	public static void commitAndClose() {
		Connection conn = null;
		try {
			conn = getConnection();
			// 事务提交
			conn.commit();
			// 关闭资源
			conn.close();
			// 解除版定
			local.remove();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 事务回滚且释放资源
	 */
	public static void rollbackAndClose() {

		Connection conn = null;
		try {
			conn = getConnection();
			// 事务回滚
			conn.rollback();
			// 关闭资源
			conn.close();
			// 解除版定
			local.remove();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
