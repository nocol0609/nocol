package com.nocol.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.nocol.bean.User;
import com.nocol.dao.UserDao;
import com.nocol.utils.DataSourceUtils;

public class UserDaoImpl implements UserDao {

	/**
	 * �������������û�
	 */
	@Override
	public User findUserByName(String username) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from users where username=?";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());

			return runner.query(sql, new BeanHandler<User>(User.class), username);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	/**
	 * ����û�
	 */
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		try {

			String sql = "insert into users values(user_id.nextval,?,?,?,?,?,?,?,sysdate)";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			runner.update(sql, user.getUsername(), user.getPassword(), user.getNickname(), user.getEmail(),
					user.getRole(), user.getState(), user.getActivecode());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	/**
	 * ���ݼ���������û�
	 */
	@Override
	public User findUserByActiveCode(String activecode) {

		// TODO Auto-generated method stub
		try {
			String sql = "select * from users where activecode=?";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());

			return runner.query(sql, new BeanHandler<User>(User.class), activecode);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	/**
	 * ����idɾ���û�
	 */
	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from users where id = ?";
		try {
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			runner.update(sql, id);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * �޸��û�״̬
	 */
	@Override
	public void updateState(int id, int state) {
		// TODO Auto-generated method stub
		String sql = "update users set state = ? where id=?";
		try {
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			runner.update(sql, state, id);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * �����û����������ѯ�û�
	 */
	@Override
	public User findUserByNameAndPwd(String name, String pwd) {
		// TODO Auto-generated method stub
		String sql = "select * from users where username=? and password=?";
		try {
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			return runner.query(sql, new BeanHandler<User>(User.class), name, pwd);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * �����û�id�����û�
	 */
	@Override
	public User findUserByUserId(int user_id) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from users where id=?";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());

			return runner.query(sql, new BeanHandler<User>(User.class), user_id);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

}
