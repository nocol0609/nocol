package com.transaction.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.transaction.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext_anno.xml")
public class AccountServiceTest {
	// ×¢Èëservice
	@Autowired
	private AccountService accountService;

	@Test
	public void testTransfer() {
		accountService.transfer("tom", "jack", 200);
	}
}
