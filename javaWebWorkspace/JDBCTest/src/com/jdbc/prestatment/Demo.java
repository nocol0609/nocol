package com.jdbc.prestatment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jdbc.util.JdbcUtils;

public class Demo {
	public static void main(String[] args) throws Exception {
		// ע����������ȡ����
		Connection conn = JdbcUtils.getConnection();

		// ׼��sql���
		//String sql = "select * from s_dept";
	
		  //ִ�в������(ʹ��ռλ��),��ֵ��������1��ʼ
		  String sql="select * from student where id=? and name=?";
		  
		// ��ȡPreparedStatment����
		  PreparedStatement preStatment = conn.prepareStatement(sql);
		   
		  preStatment.setInt(1,1); 
		  preStatment.setString(2,"rose"); 
		 
		
		// ִ��sql��䷵�ؽ����
		ResultSet rs = preStatment.executeQuery();

		// ��������
		while (rs.next()) {
//			int id = rs.getInt("id");
//			String name = rs.getString("name");
//			int region_id = rs.getInt("region_id");
//			System.out.println(id + "--" + name + "--" + region_id);
			int id=rs.getInt("id");
			String name=rs.getString("name");
			System.out.println(id+"---"+name);
		}

		// �ر���Դ
		JdbcUtils.close(conn, preStatment, rs);
	}
}
