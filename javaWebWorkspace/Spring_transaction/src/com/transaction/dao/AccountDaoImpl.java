package com.transaction.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	@Override
	public void out(String outAccount, int money) {
		String sql = "update account set money = money -? where name= ?";
		this.getJdbcTemplate().update(sql, money, outAccount);
	}

	@Override
	public void in(String inAccount, int money) {
		String sql = "update account set money=money + ? where name= ?";
		this.getJdbcTemplate().update(sql, money, inAccount);
	}

}
