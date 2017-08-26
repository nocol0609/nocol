package com.utils;

import net.sf.json.JSONObject;


/**
 *  定义工具类，将Json数据转换成字符串
 * @author Nocol
 *
 */
public class JsonTools {
	//key表示Json数据的头信息，value表示解析的类型
	public  static String getJsonString(String key,Object value){
		
		JSONObject object=new JSONObject();
		object.put(key, value);
		
		return object.toString();   
	}
}
