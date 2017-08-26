package com.nocol.jedispool;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class jedispoolTest {
	public static void main(String[] args) {
		
		
		//��ȡjedis�ض���
		JedisPool jedisPool = JedisPoolUtil.getJedisPoolInstance();
		JedisPool jedisPool2 = JedisPoolUtil.getJedisPoolInstance();
		
		//jedis�ض���Ϊ��������˴�ӡtrue
		System.out.println(jedisPool == jedisPool2);
		
		Jedis jedis = null;
		try {
			
			//��jedis�ػ�ȡjedis����
			jedis = jedisPool.getResource();
			jedis.set("aa","bb");
			
			//��ȡ
			System.out.println(jedis.get("aa"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JedisPoolUtil.release(jedisPool, jedis);
		}
	}
}	
