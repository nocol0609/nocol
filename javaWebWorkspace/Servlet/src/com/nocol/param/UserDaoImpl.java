package com.nocol.param;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDaoImpl implements UserDao {

	private static Connection conn;

	static {
		try {
			conn = JdbcUtils.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		String sql = "insert into u values(u_id.nextval,?,?,?,?,?)";
		PreparedStatement pre;
		try {
			pre = conn.prepareStatement(sql);

			pre.setString(1, user.getName());
			pre.setString(2, user.getGender());
			pre.setString(3, user.getPwd());
			pre.setString(4, user.getHobby());
			pre.setInt(5, user.getAge());
			pre.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public User findUserByName(String name) {
		// TODO Auto-generated method stub
		User user = null;
		try {
			Statement statement = conn.createStatement();
			String sql = "select * from u where name='"+ name +"'";
			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				user = new User();
				user.setName(rs.getString("name"));
				user.setGender(rs.getString("gender"));
				user.setPwd(rs.getString("pwd"));
				user.setHobby(rs.getString("hobby"));
				user.setAge(rs.getInt("age"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

}
