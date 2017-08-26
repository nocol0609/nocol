package com.nocol.jedispool;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class jedispoolTest {
	public static void main(String[] args) {
		
		
		//获取jedis池对象
		JedisPool jedisPool = JedisPoolUtil.getJedisPoolInstance();
		JedisPool jedisPool2 = JedisPoolUtil.getJedisPoolInstance();
		
		//jedis池对象为单例，因此打印true
		System.out.println(jedisPool == jedisPool2);
		
		Jedis jedis = null;
		try {
			
			//从jedis池获取jedis对象
			jedis = jedisPool.getResource();
			jedis.set("aa","bb");
			
			//获取
			System.out.println(jedis.get("aa"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JedisPoolUtil.release(jedisPool, jedis);
		}
	}
}	
