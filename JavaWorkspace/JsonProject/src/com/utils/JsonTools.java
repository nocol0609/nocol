package com.utils;

import net.sf.json.JSONObject;


/**
 *  ���幤���࣬��Json����ת�����ַ���
 * @author Nocol
 *
 */
public class JsonTools {
	//key��ʾJson���ݵ�ͷ��Ϣ��value��ʾ����������
	public  static String getJsonString(String key,Object value){
		
		JSONObject object=new JSONObject();
		object.put(key, value);
		
		return object.toString();   
	}
}
