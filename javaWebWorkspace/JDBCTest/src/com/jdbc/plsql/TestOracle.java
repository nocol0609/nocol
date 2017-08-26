package com.jdbc.plsql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;

import org.junit.Test;

import com.jdbc.util.JdbcUtils;

public class TestOracle {
/*
 * create or replace procedure queryEmpInformation(eno in number,
                                                pename out varchar2,
                                                psal   out number,
                                                pjob   out varchar2)
 */
	/**
	 * java调用存储过程
	 */
	@Test
	public void testProcedure(){
		// {call <procedure-name>[(<arg1>,<arg2>, ...)]}
		String sql = "{call queryEmp(?,?,?,?)}";
		
		Connection conn = null;
		CallableStatement call = null;
		try {
			conn = JdbcUtils.getConnection();
			call = conn.prepareCall(sql);
			
			//对于in参数，赋值
			call.setInt(1, 23);
			
			//对于out参数，申明
			call.registerOutParameter(2, OracleTypes.VARCHAR);
			call.registerOutParameter(3, OracleTypes.NUMBER);
			call.registerOutParameter(4, OracleTypes.VARCHAR);
			
			//执行
			call.execute();
			
			//取出结果
			String name = call.getString(2);
			double sal = call.getDouble(3);
			String job = call.getString(4);
			
			System.out.println(name+"\t"+sal+"\t"+job);		
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JdbcUtils.close(conn, call, null);
		}
	}

/*
 *  create or replace function queryEmpIncome(eno in number)
 return number
 */
	/**
	 * java调用存储函数
	 */
	@Test
	public void testFunction(){
		//{?= call <procedure-name>[(<arg1>,<arg2>, ...)]}
		String sql = "{?=call queryIncom(?)}";
		
		Connection conn = null;
		CallableStatement call = null;
		try {
			conn = JdbcUtils.getConnection();
			call = conn.prepareCall(sql);
			
			//对于out参数，申明
			call.registerOutParameter(1, OracleTypes.NUMBER);
			
			//对于in参数，赋值
			call.setInt(2, 23);
			
			call.execute();
			
			//取出结果
			double income = call.getDouble(1);
			System.out.println(income);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JdbcUtils.close(conn, call, null);
		}		
	}

	@Test
	public void testCursor(){
		String sql = "{call MYPACKAGE.QUERYEMPLIST(?,?)}";
		Connection conn = null;
		CallableStatement call = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtils.getConnection();
			call = conn.prepareCall(sql);
			
			//对于in参数，赋值
			call.setInt(1, 20);
			
			//对于out参数，申明
			call.registerOutParameter(2, OracleTypes.CURSOR);

			//执行
			call.execute();
			
			//取出结果
			rs = ((OracleCallableStatement)call).getCursor(2);
			while(rs.next()){
				String name = rs.getString("ename");
				double sal = rs.getDouble("sal");
				String job = rs.getString("job");
				System.out.println(name+"\t"+sal+"\t"+job);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JdbcUtils.close(conn, call, rs);
		}		
	}
}

















