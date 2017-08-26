package com.nocol_01;

import java.util.HashMap;
import java.util.Map;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * Map集合的特点：
 * 		将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值。 
 * 
 * Map集合和Collection集合的区别?
 * 		Map集合存储元素是成对出现的，Map集合的键是唯一的，值是可重复的。可以把这个理解为：夫妻对
 * 		Collection集合存储元素是单独出现的，Collection的儿子Set是唯一的，List是可重复的。
 * 
 * 注意：
 * 		Map集合的数据结构值针对键有效，跟值无关（遍历输出时无序）
 * 			HashMap，TreeMap
 *		Collection集合的数据结构是针对元素有效
 * 
 * Map集合的功能概述：
 * 1:添加功能
 * 		V put(K key,V value):添加元素。这个其实还有另一个功能?先不告诉你，等会讲
 * 			如果键是第一次存储，就直接存储元素，返回null
 * 			如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
 * 2:删除功能
 * 		void clear():移除所有的键值对元素
 * 		V remove(Object key)：根据键删除键值对元素，并把值返回
 * 3:判断功能
 * 		boolean containsKey(Object key)：判断集合是否包含指定的键
 * 		boolean containsValue(Object value):判断集合是否包含指定的值
 * 		boolean isEmpty()：判断集合是否为空
 * 4:获取功能
 * 		Set<Map.Entry<K,V>> entrySet():???
 * 		V get(Object key):根据键获取值
 * 		Set<K> keySet():获取集合中所有键的集合
 * 		Collection<V> values():获取集合中所有值的集合
 * 5：长度功能
 * 		int size()：返回集合中的键值对的对数
 */
public class MapDemo {
	public static void main(String[] args) {
		// 创建集合对象
		Map<String, String> map = new HashMap<String, String>();

		// 添加元素
		// V put(K key,V value):添加元素。这个其实还有另一个功能?先不告诉你，等会讲
		// System.out.println("put:" + map.put("文章", "马伊俐"));
		// System.out.println("put:" + map.put("文章", "姚笛"));

		map.put("邓超", "孙俪");
		map.put("黄晓明", "杨颖");
		map.put("周杰伦", "昆凌");
		map.put("刘恺威", "杨幂");

		// void clear():移除所有的键值对元素
		// map.clear();

		// V remove(Object key)：根据键删除键值对元素，并把值返回
		// System.out.println("remove:" + map.remove("黄晓明"));
		// System.out.println("remove:" + map.remove("黄晓波"));

		// boolean containsKey(Object key)：判断集合是否包含指定的键
		// System.out.println("containsKey:" + map.containsKey("黄晓明"));
		// System.out.println("containsKey:" + map.containsKey("黄晓波"));

		// boolean isEmpty()：判断集合是否为空
		// System.out.println("isEmpty:"+map.isEmpty());
		
		//int size()：返回集合中的键值对的对数
		System.out.println("size:"+map.size());

		// 输出集合名称
		System.out.println("map:" + map);
	}
}
