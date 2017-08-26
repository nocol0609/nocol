package com.nocol.jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * redis常用命令
 * 
 * @author Nocol
 *
 */
public class apiTest {

	/**
	 * String/Key 相关api
	 */
	@Test
	public void testString() {
		// 获取连接
		Jedis jedis = new Jedis("192.168.44.129", 6379);

		jedis.set("key1", "v1");
		jedis.set("key2", "v2");
		jedis.append("key1", "_mykey1");

		System.out.println("--------------------" + jedis.get("key1") + "--" + jedis.get("key2"));
		System.out.println("是否存在key3:" + jedis.exists("key3"));

		jedis.mset("key3", "v3", "key4", "v4");
		System.out.println("同时获取多个值：" + jedis.mget("key3", "key4"));

		Set<String> keys = jedis.keys("*");
		for (String string : keys) {
			System.out.println("所有key值：" + string + " ");
		}
		jedis.close();
	}

	/**
	 * 测试list相关api
	 */
	@Test
	public void testList() {

		System.out.println("---------------------------------------------------");

		// 获取连接
		Jedis jedis = new Jedis("192.168.44.129", 6379);

		// rpush与lpush正好相反
		jedis.lpush("list1", "1", "2", "3", "4", "5");// 进去将是54321排列(类似入栈,此时5在栈顶)
		// 出栈（栈顶先出）
		String s = jedis.lpop("list1");
		System.out.println("出栈的是：" + s); // 5

		// 遍历list中所有元素
		List<String> list = jedis.lrange("list1", 0, -1);
		for (String string : list) {
			System.out.println(string);
		}

		// list集合的长度
		System.out.println("list集合长度：" + jedis.llen("list"));

		// 在某值前后插值
		// jedis.linsert("list", be, pivot, value);

		jedis.close();
	}

	/**
	 * 测试set相关api
	 */
	@Test
	public void testSet() {
		System.out.println("------------------------------------------");
		// 获取连接
		Jedis jedis = new Jedis("192.168.44.129", 6379);

		// 始终key为user（单key多value）

		jedis.sadd("user", "001");
		jedis.sadd("user", "001");// 重复的不添加
		// 一次性添加多个
		jedis.sadd("user", "001", "002", "003", "004");

		// 获取元素个数
		System.out.println("set集合一共：" + jedis.scard("user"));

		// 查看set集合中所有成员
		Set<String> set = jedis.smembers("user");
		for (String string : set) {
			System.out.println("set中所有元素：" + string);
		}

		// 随机输出set中的几个元素
		List<String> list = jedis.srandmember("user", 2);
		for (String string : list) {
			System.out.println("随机输出的数为：" + string);
		}

		// 删除集合中某元素
		Long srem = jedis.srem("user", "001");
		System.out.println("返回1表示删除成功：" + srem);

		jedis.close();
	}

	/**
	 * 测试hash相关api KV模式不变，但V是一个键值对
	 */
	@Test
	public void testHash() {

		System.out.println("--------------------------------------");

		// 获取连接
		Jedis jedis = new Jedis("192.168.44.129", 6379);

		// v是一个键值对
		jedis.hset("hash1", "userName", "lisi");
		System.out.println("姓名：" + jedis.hget("hash1", "userName"));

		// 创建map集合存储载添加集合
		Map<String, String> map = new HashMap<String, String>();
		map.put("telphone", "13811814763");
		map.put("address", "kunshan");
		map.put("email", "abc@163.com");

		jedis.hmset("hash2", map);
		List<String> result = jedis.hmget("hash2", "telphone", "email");
		for (String element : result) {
			System.out.println("hash2中的元素：" + element);
		}

		// 判断hash2知否存在某个键
		System.out.println("是否存在？" + jedis.hexists("hash2", "name"));

		// 遍历hash2中所有的key/value
		// jedis.values("hash2");
		Set<String> keys = jedis.keys("hash2");
		for (String string : keys) {
			System.out.println("hash2中所有的key值：" + string);
		}

		// 增加某个v的值
		// jedis.incrBy("telphone",2);//增加2

		jedis.close();
	}

	/**
	 * 测试zset相关api 在set基础上，加一个score值。之前set是k1 v1 v2 v3，现在zset是k1 score1 v1 score2 v2
	 * score2 v2
	 */
	@Test
	public void testZset() {

		System.out.println("--------------------------------------");

		// 获取连接
		Jedis jedis = new Jedis("192.168.44.129", 6379);

		jedis.zadd("zset01", 60d, "v1");
		jedis.zadd("zset01", 70d, "v2");
		jedis.zadd("zset01", 80d, "v3");
		jedis.zadd("zset01", 90d, "v4");

		Set<String> zset = jedis.zrange("zset01", 0, -1);
		for (String string : zset) {
			System.out.println("zset集合中所有值："+string);
		}

		jedis.close();
	}
}
