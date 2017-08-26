package com.nocol_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * Map集合的遍历。
 * Map -- 夫妻对
 * 思路：
 * 		A:把所有的丈夫给集中起来。
 * 		B:遍历丈夫的集合，获取得到每一个丈夫。
 * 		C:让丈夫去找自己的妻子。
 * 
 * 转换：
 * 		A:获取所有的键
 * 		B:遍历键的集合，获取得到每一个键
 * 		C:根据键去找值
 */
public class MapBianLi {
	public static void main(String[] args) {
		//创建集合对象
		Map<String, String> map=new HashMap<String,String>();
		//创建并添加元素对象
		map.put("邓超", "孙俪");
		map.put("黄晓明", "杨颖");
		map.put("周杰伦", "昆凌");
		map.put("刘恺威", "杨幂");
		//获取所有的键
		Set<String> set=map.keySet();
		// 遍历键的集合，获取得到每一个键
		for(String key:set){
			String value=map.get(key);
			System.out.println(key+"-----"+value);
		}
	}
}
