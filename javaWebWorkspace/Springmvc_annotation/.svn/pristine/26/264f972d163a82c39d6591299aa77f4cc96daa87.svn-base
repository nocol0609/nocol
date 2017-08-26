package com.springmvc.json;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 控制器-----异步发送表单数据到Bean，并响应Json文本返回
 * 
 * @author Nocol
 *
 */
@Controller
@RequestMapping("/emp2")
public class EmpAction2 {
	
	/**
	 * @ResponseBody Emp 表示让springmvc将Emp对象转成json文本
	 */
	@RequestMapping("/bean2json")
	public @ResponseBody Emp bean2Json() {
		Emp emp = new Emp();
		emp.setId(1);
		emp.setUsername("tom");
		emp.setSalary(5000D);
		emp.setHiredate(new Date());
		return emp;
	}
	
	/**
	 * @ResponseBody List<Emp> 表示让springmvc将Emp对象的集合转成json文本
	 */
	@RequestMapping("/listbean2json")
	public @ResponseBody List<Emp> listBean2Json(){
		
		List<Emp> listEmp=new ArrayList<Emp>();
		listEmp.add(new Emp(1,"tom",5000D,new Date()));
		listEmp.add(new Emp(2,"jack",6000D,new Date()));
		listEmp.add(new Emp(3,"rose",7000D,new Date()));
		//返回需要转成json文本的对象
		return listEmp;
	}
	
	/**
	 * @ResponseBody List<Emp> 表示让springmvc将Emp对象的集合转成json文本
	 */
	@RequestMapping("/map2json")
	public @ResponseBody Map<String , Object> map2Json(){
		//创建list集合
		List<Emp> listEmp=new ArrayList<Emp>();
		listEmp.add(new Emp(1,"tom",5000D,new Date()));
		listEmp.add(new Emp(2,"jack",6000D,new Date()));
		listEmp.add(new Emp(3,"rose",7000D,new Date()));
		
		//创建map集合
		Map<String, Object> map=new LinkedHashMap<String ,Object>();
		map.put("total", listEmp.size());
		map.put("rows", listEmp);
		//返回需要转成json文本的对象
		return map;
	}
}
