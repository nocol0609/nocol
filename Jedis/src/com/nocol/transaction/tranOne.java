package com.nocol.transaction;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

/**
 * redis事务
 * @author Nocol
 * 
 * /**
	   * 通俗点讲，watch命令就是标记一个键，如果标记了一个键， 
	   * 在提交事务前如果该键被别人修改过，那事务就会失败，这种情况通常可以在程序中
	   * 重新再尝试一次。
	   * 首先标记了键balance，然后检查余额是否足够，不足就取消标记，并不做扣减； 
	   * 足够的话，就启动事务进行更新操作，
	   * 如果在此期间键balance被其它人修改， 那在提交事务（执行exec）时就会报错， 
	   * 程序中通常可以捕获这类错误再重新执行一次，直到成功。
 *
 */
public class tranOne {
	public static void main(String[] args) {
		// 获取连接
		Jedis jedis = new Jedis("192.168.44.129", 6379);
		
		//可用余额
		int balance;
		//欠额
		int debt;
		//实刷金额
		int money=20;
			
		balance=Integer.parseInt(jedis.get("balance"));
		debt = Integer.parseInt(jedis.get("debt"));
		System.out.println("事务前："+balance+"---"+debt);
		
		//先开启监控
		jedis.watch("balance");
		
		//再开启事务
		Transaction transaction = jedis.multi();
		
		//开始进行事务
		transaction.decrBy("balance",money);
		transaction.incrBy("debt", money);
		
		//提交事务
		transaction.exec();
		
		balance = Integer.parseInt(jedis.get("balance"));
	    debt = Integer.parseInt(jedis.get("debt"));
		
		//打印执行事务后可用余额和欠额
	    System.out.println("----------事务后------------");
		System.out.println("可用余额："+balance);
		System.out.println("欠额："+debt);
		
		jedis.close();
	}
}
