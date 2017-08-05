package com.nocol.jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * redis��������
 * 
 * @author Nocol
 *
 */
public class apiTest {

	/**
	 * String/Key ���api
	 */
	@Test
	public void testString() {
		// ��ȡ����
		Jedis jedis = new Jedis("192.168.44.129", 6379);

		jedis.set("key1", "v1");
		jedis.set("key2", "v2");
		jedis.append("key1", "_mykey1");

		System.out.println("--------------------" + jedis.get("key1") + "--" + jedis.get("key2"));
		System.out.println("�Ƿ����key3:" + jedis.exists("key3"));

		jedis.mset("key3", "v3", "key4", "v4");
		System.out.println("ͬʱ��ȡ���ֵ��" + jedis.mget("key3", "key4"));

		Set<String> keys = jedis.keys("*");
		for (String string : keys) {
			System.out.println("����keyֵ��" + string + " ");
		}
		jedis.close();
	}

	/**
	 * ����list���api
	 */
	@Test
	public void testList() {

		System.out.println("---------------------------------------------------");

		// ��ȡ����
		Jedis jedis = new Jedis("192.168.44.129", 6379);

		// rpush��lpush�����෴
		jedis.lpush("list1", "1", "2", "3", "4", "5");// ��ȥ����54321����(������ջ,��ʱ5��ջ��)
		// ��ջ��ջ���ȳ���
		String s = jedis.lpop("list1");
		System.out.println("��ջ���ǣ�" + s); // 5

		// ����list������Ԫ��
		List<String> list = jedis.lrange("list1", 0, -1);
		for (String string : list) {
			System.out.println(string);
		}

		// list���ϵĳ���
		System.out.println("list���ϳ��ȣ�" + jedis.llen("list"));

		// ��ĳֵǰ���ֵ
		// jedis.linsert("list", be, pivot, value);

		jedis.close();
	}

	/**
	 * ����set���api
	 */
	@Test
	public void testSet() {
		System.out.println("------------------------------------------");
		// ��ȡ����
		Jedis jedis = new Jedis("192.168.44.129", 6379);

		// ʼ��keyΪuser����key��value��

		jedis.sadd("user", "001");
		jedis.sadd("user", "001");// �ظ��Ĳ����
		// һ������Ӷ��
		jedis.sadd("user", "001", "002", "003", "004");

		// ��ȡԪ�ظ���
		System.out.println("set����һ����" + jedis.scard("user"));

		// �鿴set���������г�Ա
		Set<String> set = jedis.smembers("user");
		for (String string : set) {
			System.out.println("set������Ԫ�أ�" + string);
		}

		// ������set�еļ���Ԫ��
		List<String> list = jedis.srandmember("user", 2);
		for (String string : list) {
			System.out.println("����������Ϊ��" + string);
		}

		// ɾ��������ĳԪ��
		Long srem = jedis.srem("user", "001");
		System.out.println("����1��ʾɾ���ɹ���" + srem);

		jedis.close();
	}

	/**
	 * ����hash���api KVģʽ���䣬��V��һ����ֵ��
	 */
	@Test
	public void testHash() {

		System.out.println("--------------------------------------");

		// ��ȡ����
		Jedis jedis = new Jedis("192.168.44.129", 6379);

		// v��һ����ֵ��
		jedis.hset("hash1", "userName", "lisi");
		System.out.println("������" + jedis.hget("hash1", "userName"));

		// ����map���ϴ洢����Ӽ���
		Map<String, String> map = new HashMap<String, String>();
		map.put("telphone", "13811814763");
		map.put("address", "kunshan");
		map.put("email", "abc@163.com");

		jedis.hmset("hash2", map);
		List<String> result = jedis.hmget("hash2", "telphone", "email");
		for (String element : result) {
			System.out.println("hash2�е�Ԫ�أ�" + element);
		}

		// �ж�hash2֪�����ĳ����
		System.out.println("�Ƿ���ڣ�" + jedis.hexists("hash2", "name"));

		// ����hash2�����е�key/value
		// jedis.values("hash2");
		Set<String> keys = jedis.keys("hash2");
		for (String string : keys) {
			System.out.println("hash2�����е�keyֵ��" + string);
		}

		// ����ĳ��v��ֵ
		// jedis.incrBy("telphone",2);//����2

		jedis.close();
	}

	/**
	 * ����zset���api ��set�����ϣ���һ��scoreֵ��֮ǰset��k1 v1 v2 v3������zset��k1 score1 v1 score2 v2
	 * score2 v2
	 */
	@Test
	public void testZset() {

		System.out.println("--------------------------------------");

		// ��ȡ����
		Jedis jedis = new Jedis("192.168.44.129", 6379);

		jedis.zadd("zset01", 60d, "v1");
		jedis.zadd("zset01", 70d, "v2");
		jedis.zadd("zset01", 80d, "v3");
		jedis.zadd("zset01", 90d, "v4");

		Set<String> zset = jedis.zrange("zset01", 0, -1);
		for (String string : zset) {
			System.out.println("zset����������ֵ��"+string);
		}

		jedis.close();
	}
}
