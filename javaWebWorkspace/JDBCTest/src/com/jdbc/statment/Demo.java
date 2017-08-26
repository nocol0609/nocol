package com.jdbc.statment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jdbc.util.JdbcUtils;

/**
 * ʹ��Statmentִ�в�ѯ���
 * @author Nocol
 *
 */
public class Demo {
	public static void main(String[] args) throws Exception {
		//ע����������ȡ����
		Connection conn=JdbcUtils.getConnection();
		//System.out.println(conn);
		
		//��ȡStatment����
		Statement statement=conn.createStatement();
		
		//׼��Sql���
		String sql="select * from s_dept";
		
		//ִ��sql��䣬���ؽ����
		ResultSet rs=statement.executeQuery(sql);
		
		//��������
		while(rs.next()){
			int id=rs.getInt("id");
			String name=rs.getString("name");
			int region_id=rs.getInt("region_id");	
			
			System.out.println(id+"--"+name+"--"+region_id);
		}
		
		//�ر���Դ
		JdbcUtils.close(conn, statement,rs);
	}
}
