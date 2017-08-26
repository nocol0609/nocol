package com.briup.jdbc;

public class Test {
    public static void main(String[] args) {
		JDBCExctise exc=new JDBCExctise();
		exc.createTable();
		exc.addData();
		exc.updateData();
		exc.selectData();
	}
 }
