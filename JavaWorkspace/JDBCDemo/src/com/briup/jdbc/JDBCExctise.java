 package com.briup.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.briup.common.Handler;
import com.briup.common.JDBCTemplate;
import com.briup.common.PreSetter;

public class JDBCExctise {
  //������
   public void create(){
    /*	Connection connect=null;
    	Statement state=null;
      try {
		Class.forName("oracle.jdbc.OracleDriver");
		connect= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","briup","briup");
		state = connect.createStatement();
		state.execute("create table"+tableName+"(id number(5) primary key");
	} catch (Exception e) {
		e.printStackTrace();
	}*/ 
     new JDBCTemplate().execute("create table");
    }
    //�������
    public void add(){
    	/*Connection conn=null;
    	Statement state=null;
       try {
		Class.forName("oracle.jdbc.OracleDriver");
		conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","briup","briup");
		state = conn.createStatement();
		state.execute("insert into "+tableName+"values(1)");
	} catch (Exception e) {
		e.printStackTrace();
	}*/
    	String sql="insert into tbl_dept values(?,?,?)";
    	new JDBCTemplate().execute(sql,new PreSetter() {
			@Override
			public void setter(PreparedStatement pst) {
				try {
					pst.setInt(1,7);
					pst.setString(2,"7");
					pst.setString(3,"7");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
    	System.out.println("�������ݳɹ�");
     }
    //�½�һ�ű�,����Ϊtbl_test  id,name
    public void createTable(){
    	String sql="create table tbl_test(id number(5) primary key,name varchar2(10) not null)";
    	new JDBCTemplate().execute(sql);
    	System.out.println("�����ɹ�");
    }
    //������������
    public void addData(){
    	String sql="insert into tbl_test values(?,?)";
    	new JDBCTemplate().execute(sql,new PreSetter() {
			
			@Override
			public void setter(PreparedStatement pst) {
				try {
					pst.setInt(1,1);
					pst.setString(2,"xiaozhang");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
new JDBCTemplate().execute(sql,new PreSetter() {
			
			@Override
			public void setter(PreparedStatement pst) {
				try {
					pst.setInt(1,2);
					pst.setString(2,"xiaoming");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
   System.out.println("�����������ݳɹ�");
    }
    //�޸�id=2����Ϣ,��name��һ��
    public void updateData(){
    	String sql="update tbl_test set name=? where id=?";
    	new JDBCTemplate().execute(sql, new PreSetter() {
			
			@Override
			public void setter(PreparedStatement pst) {
				try {
					pst.setString(1,"xiaohong");
					pst.setInt(2,2);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
    	System.out.println("�޸ĳɹ�");
    }
    //��ѯidΪ1���˵���Ϣ
    public void  selectData(){
    	String sql="select * from tbl_test where id=?";
    	
    	new JDBCTemplate().execute(sql,new PreSetter() {
			
			@Override
			public void setter(PreparedStatement pst) {
				try {
					pst.setInt(1,1);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		},new Handler() {
			
			@Override
			public void handler(ResultSet rs) {
				try {
					while(rs.next())
					System.out.println(rs.getInt("id")+rs.getString("name"));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
    	System.out.println("��ѯ�ɹ�");
    }
    
}
