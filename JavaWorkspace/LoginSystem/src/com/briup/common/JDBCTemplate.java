package com.briup.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC模板类
 * @author lxp
 *
 */
public class JDBCTemplate {
     private Connection conn;
     public JDBCTemplate(){
    	 this(null);
     }
     public JDBCTemplate(Connection conn){
    	 if(conn==null){
    		 this.conn=ConnectionFactory.getConnection();
    	 }else{
    		 this.conn=conn;
    	 }
     }
     //有输入值,有结果集
     public void execute(String sql,PreSetter ps,Handler handler){
    	 PreparedStatement pst=null;
    	 ResultSet rs=null;
    	 try {
			pst=conn.prepareStatement(sql);
			if(ps!=null){
				ps.setter(pst);
			}
		    rs = pst.executeQuery();
		   if(handler!=null){
			   handler.handler(rs);
		   }
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			CloseUtils.closeResource(conn,pst,rs);
		}
     }
     //有输入值,没有结果集
 	 public void execute(String sql,PreSetter ps){
 		 PreparedStatement pst=null;
 		try {
			  pst = conn.prepareStatement(sql);
			if(ps!=null){
				ps.setter(pst);
			}
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			CloseUtils.closeResource(conn,pst);
		}
 	 }
 	 //没有输入值,有结果集
 	 public void execute(String sql,Handler handler){
 		 ResultSet rs=null;
 		 Statement state=null;
 		 try {
		 state=	conn.createStatement();
		rs=state.executeQuery(sql);
		if(handler!=null){
			handler.handler(rs);
		 }
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			CloseUtils.closeResource(conn,state,rs);
		}
 		
 	 }
 	 //没有输入值,没有结果集
 	 public void execute(String sql){
 		 Statement state=null;
 		 try {
			state = conn.createStatement();
			state.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			CloseUtils.closeResource(conn);
		}
 	 }
     
     public static void main(String[] args) {
		String sql="select * from tbl_dept where id=?";
		new JDBCTemplate().execute(sql,new PreSetter() {
			@Override
			public void setter(PreparedStatement pst) {
				try {
					pst.setInt(1,1);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		},new Handler() {
			
			@Override
			public void handler(ResultSet rs) {
			  try {
				while(rs.next()){
					 int id=rs.getInt("id");
				 String name = rs.getString("name");
				 String city=rs.getString("city");
				  System.out.println(id+" "+name+" "+city);
				  }
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		  }
	   });
	 }
   }

