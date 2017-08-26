package com.nocol.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import net.sf.json.JSONArray;

public class JsonTest {
	@Test
	public void JavaBeanToJson() {
		City city = new City(1, "南昌");
		JSONArray array = JSONArray.fromObject(city);
		String json = array.toString();
		System.out.println(json);
		// [{"id":1,"name":"南昌"}]
	}

	@Test
	public void listToJson() {
		List<City> cityList = new ArrayList<City>();
		cityList.add(new City(1, "南昌"));
		cityList.add(new City(2, "上海"));
		JSONArray array = JSONArray.fromObject(cityList);
		String json = array.toString();
		System.out.println(json);
		// [{"id":1,"name":"南昌"},{"id":2,"name":"上海"}]

	}

	@Test
	public void setToJson() {
		Set<City> citySet = new HashSet<City>();
		citySet.add(new City(1, "南昌"));
		citySet.add(new City(2, "上海"));
		JSONArray array = JSONArray.fromObject(citySet);
		String json = array.toString();
		System.out.println(json);
		// [{"id":1,"name":"南昌"},{"id":2,"name":"上海"}]
	}
	
	@Test
	public void JavaBeanListToJson(){
		List<City> cityList = new ArrayList<City>();
		cityList.add(new City(1,"南昌"));
		cityList.add(new City(2,"九江"));
		Province province = new Province(1,"江西",cityList);
		JSONArray array = JSONArray.fromObject(province);
		String json = array.toString();
		System.out.println(json);
		//[{"id":1,"name":"江西","cityList":[{"id":1,"name":"南昌"},{"id":2,"name":"九江"}]}]
	}
	
	@Test
	public  void mapToJson() {
		
		List<City> cityList = new ArrayList<City>();
		cityList.add(new City(1,"南昌"));
		cityList.add(new City(2,"九江"));
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total",cityList.size());//表示集合的长度
		map.put("rows",cityList);//rows表示集合
		
		JSONArray jSONArray = JSONArray.fromObject(map);
		String jsonJAVA = jSONArray.toString();
		System.out.println(jsonJAVA);
		//[{"total":2,"rows":[{"id":1,"name":"南昌"},{"id":2,"name":"九江"}]}]
		
		jsonJAVA = jsonJAVA.substring(1,jsonJAVA.length()-1);
		System.out.println(jsonJAVA);
		//{"total":2,"rows":[{"id":1,"name":"南昌"},{"id":2,"name":"九江"}]}
	}
}
