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
	 * java���ô洢����
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
			
			//����in��������ֵ
			call.setInt(1, 23);
			
			//����out����������
			call.registerOutParameter(2, OracleTypes.VARCHAR);
			call.registerOutParameter(3, OracleTypes.NUMBER);
			call.registerOutParameter(4, OracleTypes.VARCHAR);
			
			//ִ��
			call.execute();
			
			//ȡ�����
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
	 * java���ô洢����
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
			
			//����out����������
			call.registerOutParameter(1, OracleTypes.NUMBER);
			
			//����in��������ֵ
			call.setInt(2, 23);
			
			call.execute();
			
			//ȡ�����
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
			
			//����in��������ֵ
			call.setInt(1, 20);
			
			//����out����������
			call.registerOutParameter(2, OracleTypes.CURSOR);

			//ִ��
			call.execute();
			
			//ȡ�����
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

















