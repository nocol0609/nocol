package com.briup.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.briup.bean.UserBean;
import com.briup.common.Handler;
import com.briup.common.JDBCTemplate;
import com.briup.common.PreSetter;

public class UserDaoImpl implements IUserDao{
	
	private JDBCTemplate template;
	private UserBean user = null;

	//根据用户名查找用户
	@Override
	public UserBean findUserByName(final String name) {
		// TODO Auto-generated method stub
		user = null;
		String sql = "select * from tbl_user where name=?";
		template = new JDBCTemplate();
		template.execute(sql, new PreSetter() {
			
			@Override
			public void setter(PreparedStatement pst) {
				try {
					pst.setString(1, name);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}, new Handler() {
			
			@Override
			public void handler(ResultSet rs) {
			//	List<UserBean> list =new ArrayList();
				try {
					while (rs.next()) {
						int id = rs.getInt("id");
						String name = rs.getString("name");
						String passwd = rs.getString("passwd");
						String tel = rs.getString("tel");
						String address = rs.getString("address");
						
						user = new UserBean(id,name,passwd,tel,address);
						//list.add(user);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		return user;
	}
	
	//保存用户到数据库
	@Override
	public void saveUser(final UserBean user) {
		String sql = "insert into tbl_user values(?,?,?,?,?)";
		template= new JDBCTemplate();
		template.execute(sql, new PreSetter() {
			
			@Override
			public void setter(PreparedStatement pst) {
				// TODO Auto-generated method stub
				try {
					pst.setInt(1, user.getId());
					pst.setString(2, user.getName());
					pst.setString(3, user.getPasswd());
					pst.setString(4, user.getTel());
					pst.setString(5, user.getAddress());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

}
