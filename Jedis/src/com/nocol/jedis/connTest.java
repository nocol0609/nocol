package com.nocol.jedis;

import redis.clients.jedis.Jedis;

/**
 * ²âÊÔÁªÍ¨
 * @author Nocol
 *
 */
public class connTest {
	public static void main(String[] args) {
		Jedis jedis=new Jedis("192.168.44.129",6379);
		System.out.println(jedis.ping());
		jedis.close();
	}
}
