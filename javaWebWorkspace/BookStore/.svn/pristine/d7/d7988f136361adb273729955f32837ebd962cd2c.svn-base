package com.nocol.Dao.Impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.nocol.Bean.User;
import com.nocol.Dao.UserDao;
import com.nocol.Util.Common.DataSourceUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public User findUserByName(String name) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from d_user where name=?";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			return runner.query(sql, new BeanHandler<User>(User.class), name);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public User findUserByNameAndPwd(String name, String pwd) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from d_user where name=? and password=?";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			return runner.query(sql, new BeanHandler<User>(User.class), name, pwd);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		try {
			String sql = "insert into d_user values(d_user_id.nextval,?,?,?,?,?,?)";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			runner.update(sql, user.getName(), user.getPassword(), user.getZip(), user.getAddress(), user.getPhone(),
					user.getEmail());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public User findUserByUserId(int id) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from d_user where id=?";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());

			return runner.query(sql, new BeanHandler<User>(User.class), id);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}
	
}
