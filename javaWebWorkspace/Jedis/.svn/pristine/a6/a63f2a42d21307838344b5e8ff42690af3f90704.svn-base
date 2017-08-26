package com.nocol.jedispool;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * jedis池
 * 
 * @author Nocol
 *
 */
public class JedisPoolUtil {

	private static JedisPool jedisPool = null;

	public static JedisPool getJedisPoolInstance() {
		if (null == jedisPool) {
			synchronized (JedisPoolUtil.class) {
				if (null == jedisPool) {
					JedisPoolConfig poolConfig = new JedisPoolConfig();
					//设置一个pool可分配多少个jedis实例
					poolConfig.setMaxTotal(1000);
					
					//控制一个pool最多有多少个状态为idle(空闲)的jedis实例
					poolConfig.setMaxIdle(32); 
					
					//表示当borrow一个jedis实例时，最大的等待时间，如果超过等待时间，则直接抛JedisConnectionException
					poolConfig.setMaxWaitMillis(100 * 1000);
					
					//获得一个jedis实例的时候是否检查连接可用性（ping()）；如果为true，则得到的jedis实例均是可用                                                                                   
					poolConfig.setTestOnBorrow(true);
					
					jedisPool = new JedisPool(poolConfig, "192.168.44.129", 6379);
				}
			}
		}
		return jedisPool;
	}

	public static void release(JedisPool jedisPool, Jedis jedis) {
		if (null != jedis) {
			jedisPool.returnResourceObject(jedis);
		}
	}
}
