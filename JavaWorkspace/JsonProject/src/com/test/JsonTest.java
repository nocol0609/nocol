package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.bean.Person;
import com.creatjson.CreatJson;
import com.utils.JsonTools;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
public class JsonTest {
	public static void main(String[] args) {
		
		CreatJson creatJson=new CreatJson();
		//Json第一种数据格式
//		Person person=creatJson.getPerson();
//		String mString=JsonTools.getJsonString("Person", person);
//		System.out.println(mString);
		//{"Person":{"name":"nocol","id":1,"age":20}}
		
		//Json第二种数据格式
//		List<Person> list=creatJson.getPersonList();
//		String mString=JsonTools.getJsonString("Persons", list);
//		System.out.println(mString);
//		//{"Persons":[{"name":"jack","id":101,"age":25},{"name":"rose","id":102,"age":26}]}
		
		//Json的第三种数据格式
//		List<String> list=creatJson.getStringList();
//		String mString=JsonTools.getJsonString("String", list);
//		System.out.println(mString);
//		//{"String":["nokia","daisy"]}
		
		//Json的第四种数据格式
		List<Map<String, Object>> list=creatJson.getListMap();
		String mString=JsonTools.getJsonString("Persons", list);
		System.out.println(mString);
		//{"Persons":[{"name":"jack","id":7,"age":25},{"name":"rose","id":6,"age":26}]}
	}
}
