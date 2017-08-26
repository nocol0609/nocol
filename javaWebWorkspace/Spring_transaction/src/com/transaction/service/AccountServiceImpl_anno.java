package com.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.transaction.dao.AccountDao;

public class AccountServiceImpl_anno implements AccountService {

	// 注入AccountDao
	/**
	 * 使用了@Autowired后不需要在配置文件中二次注入了。。。。。
	 */
	@Autowired
	private AccountDao accountDao;


	/**
	 * 使用@Transactional注解开启事务，可在@Transactional()括号内配置属性
	 */
	@Transactional
	@Override
	public void transfer(String outAccount, String inAccount, int money) {
		// 转出
		accountDao.out(outAccount, money);

		// 异常
		int d = 1 / 0;

		// 转入
		accountDao.in(inAccount, money);
	}

}
