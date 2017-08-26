package com.nocol.master_slave;

import redis.clients.jedis.Jedis;

/**
 * redis的主从复制
 * @author Nocol
 *
 */
public class msTest {
	public static void main(String[] args) {
		
		Jedis jedis_S = new Jedis("192.168.44.129", 6379);
		Jedis jedis_M = new Jedis("192.168.44.129", 6380);
		
		jedis_S.slaveof("192.168.44.129", 6380);
		
		jedis_M.set("class","1122V2");
		
		String result = jedis_S.get("class");
		System.out.println(result);
		
		jedis_M.close();
		jedis_S.close();
	}
}
