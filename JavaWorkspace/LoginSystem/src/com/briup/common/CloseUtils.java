package com.briup.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
   * �ر���Դ������
   * @author cll
   *
   */
 public class CloseUtils {
     public static void closeResource(Connection conn,Statement state,ResultSet rs){
		try {
				if(rs!=null) rs.close();
				if(state!=null) state.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
     }
     
    public static void closeResource(Connection conn,Statement state){
    	closeResource(conn, state,null);
    }
    
    public static void closeResource(Connection conn){
    	closeResource(conn,null,null);
    }
 }
